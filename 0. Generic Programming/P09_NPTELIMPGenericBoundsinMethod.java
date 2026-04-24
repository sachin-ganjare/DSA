// Example 5.5: Definition of all the classes of animals

//FORMING THE HIERARCHY FIRST
class Animal {
    long lifespan;
    float weight;

    Animal(long years, float kg) {
        lifespan = years;
        weight = kg;
    }

    public void print() {
        System.out.println("Maximum longevity: " + lifespan + " years");
        System.out.println("Maximum weight: " + weight + " kgs");
    }
}

class Aquatic extends Animal {
    boolean scale; // true: has scale, false: no scale

    Aquatic(long years, float kg, boolean skin) {
        super(years, kg); // Super class constructor
        scale = skin;
    }

    public void print() {
        super.print(); // Call the super class method
        System.out.println("Has scale? " + scale);
    }
}

class Land extends Animal {
    short vision; // 0 = nocturnal, 1 = only day light, 2 = both

    Land(long years, float kg, short vision) {
        super(years, kg);
        this.vision = vision;
    }
}

class Pet extends Land {
    String name;

    Pet(long years, float kg, short vision, String name) {
        super(years, kg, vision);
        this.name = name;
    }
}

class Wild extends Land {
    float speed;

    Wild(long years, float kg, short vision, float speed) {
        super(years, kg, vision);
        this.speed = speed;
    }
}

//NOW DEFINING THE GENERIC CLASS TO MAINTAIN LIST TO ALL ANIMALS
class AnimalWorld<T extends Animal> {
    // Type parameter is limited to Animal and its sub classes
    T[] listOfAnimals;

    AnimalWorld(T[] list) { // Generic constructor
        listOfAnimals = list;
    }
}

// Defining different methods with different bounds of arguments
class BoundedWildcards {

    // Case 1: Unbound wildcard
    static void vitality(AnimalWorld<?> animals) {
        for (Animal a : animals.listOfAnimals)
            a.print();
        System.out.println();
    }

    // Case 2: Lower bounded wildcard (Animal or Aquatic)
    static void showSea(AnimalWorld<? super Aquatic> animals) {
        for (Object obj : animals.listOfAnimals) {
            if (obj instanceof Animal)
                ((Animal) obj).print();
        }
        System.out.println();
    }

    // Case 3a: Upper bounded wildcard (Land or subclasses)
    static void showLand(AnimalWorld<? extends Land> animals) {
        for (Land l : animals.listOfAnimals) {
            l.print();
            System.out.println("Vision: " + l.vision);
        }
        System.out.println();
    }

    // Case 3b: Only Pet
    static void showPet(AnimalWorld<? extends Pet> animals) {
        for (Pet p : animals.listOfAnimals) {
            System.out.println("Pet’s name: " + p.name);
            p.print();
            System.out.println("Vision: " + p.vision);
        }
        System.out.println();
    }

    // Case 3c: Only Wild
    static void showWild(AnimalWorld<? extends Wild> animals) {
        for (Wild w : animals.listOfAnimals) {
            w.print();
            System.out.println("Maximum running speed: " + w.speed + " mph");
            System.out.println("Vision: " + w.vision);
        }
        System.out.println();
    }
}

class P09_NPTELIMPGenericBoundsinMethod {
    public static void main(String args[]) {

        // Create a list of unknown animals
        Animal unknown = new Animal(40, 720);
        Animal[] u = { unknown };
        AnimalWorld<Animal> uList = new AnimalWorld<>(u);

        // Create a list of aquatic animals
        Aquatic whale = new Aquatic(90, 150000, true);
        Aquatic shark = new Aquatic(40, 2150, true);
        Aquatic[] q = { whale, shark };
        AnimalWorld<Aquatic> qList = new AnimalWorld<>(q);

        // Create a list of land animals
        Land owl = new Land(3, 1, (short) 0);
        Land[] l = { owl };
        AnimalWorld<Land> lList = new AnimalWorld<>(l);

        // Create a list of pet animals
        Pet dog = new Pet(15, 75, (short) 2, "Prince");
        Pet[] p = { dog };
        AnimalWorld<Pet> pList = new AnimalWorld<>(p);

        // Create a list of wild animals
        Wild cheetah = new Wild(15, 75, (short) 2, 70);
        Wild deer = new Wild(10, 50, (short) 1, 40);
        Wild[] w = { cheetah, deer };
        AnimalWorld<Wild> wList = new AnimalWorld<>(w);

        // Call the methods
        BoundedWildcards.vitality(uList);
        BoundedWildcards.vitality(qList);
        BoundedWildcards.vitality(lList);
        BoundedWildcards.vitality(pList);
        BoundedWildcards.vitality(wList);

        BoundedWildcards.showSea(uList);
        BoundedWildcards.showSea(qList);

        BoundedWildcards.showLand(lList);
        BoundedWildcards.showLand(pList);
        BoundedWildcards.showLand(wList);

        BoundedWildcards.showPet(pList);

        BoundedWildcards.showWild(wList);
    }
}
