// Logic: create a queue of Process (objects). then dequeue each and calculate total time of all processes.

class Process {
    int index;
    int time;

    Process(int index, int time) {
        this.index = index;
        this.time = time;
    };

    void print() {
        System.out.println("Process Index: " + index + "Process Time: " + time);
    }
}

// Driver Class
class _03_ProcessScheduling {
    public static void main(String[] args) {
        Process p1 = new Process(1, 5);
        Process p2 = new Process(2, 7);
        Process p3 = new Process(3, 10);
        Process p4 = new Process(4, 13);
        Process done;
        int total_time;

        // Defining Queue of Processes
        Process[] p_array = new Process[10];
        _01_SimpleQueue<Process> procQueue = new _01_SimpleQueue<Process>(p_array);
        procQueue.enque(p1);
        procQueue.enque(p2);
        procQueue.enque(p3);
        procQueue.enque(p4);
        System.out.println("Job Entering Complete.");
        done = procQueue.dequeue();
        total_time = done.time;
        done = procQueue.dequeue();
        total_time += done.time;
        done = procQueue.dequeue();
        total_time += done.time;
        done = procQueue.dequeue();
        total_time += done.time;
        System.out.println("Total Time Taken: "+total_time);
    }
}