import java.util.*;

class KruskalMST {

    static class Edge implements Comparable<Edge> {
        int src, dest, weight;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            weight = w;
        }

        public int compareTo(Edge other) {
            return this.weight - other.weight;
        }
    }

    static class DisjointSet {
        int[] parent, rank;

        DisjointSet(int n) {
            parent = new int[n];
            rank = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        int find(int x) {
            if (parent[x] != x)
                parent[x] = find(parent[x]); // Path compression
            return parent[x];
        }

        void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX == rootY) return;

            // Union by rank
            if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }

    public static void kruskal(int vertices, List<Edge> edges) {
        Collections.sort(edges);

        DisjointSet ds = new DisjointSet(vertices);

        List<Edge> mst = new ArrayList<>();
        int totalWeight = 0;

        for (Edge edge : edges) {
            int root1 = ds.find(edge.src);
            int root2 = ds.find(edge.dest);

            if (root1 != root2) {
                mst.add(edge);
                totalWeight += edge.weight;
                ds.union(root1, root2);
            }
        }

        System.out.println("Edges in MST:");
        for (Edge e : mst) {
            System.out.println(e.src + " - " + e.dest + " : " + e.weight);
        }
        System.out.println("Total Weight: " + totalWeight);
    }

    public static void main(String[] args) {
        int vertices = 4;

        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 6));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));

        kruskal(vertices, edges);
    }
}