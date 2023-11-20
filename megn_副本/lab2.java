package edu.neu.megn;

public class lab2 {
    public static void main(String[] args) {
        Bird owl = new Bird("Owl", "Medium", 5.0, true, "Snowy owl", 1.5);
        LandAnimal tiger = new LandAnimal("Tiger", "Large", 180.0, true, 4);
        Fish shark = new Fish("Shark", "Large", 600.0, true, 5);

        owl.displayInfo();
        System.out.println();
        tiger.displayInfo();
        System.out.println();
        shark.displayInfo();
    }
    
}
class Animal {
    String name;
    String size;
    double weight;
    boolean predator;

    public Animal(String name, String size, double weight, boolean predator) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.predator = predator;
    }

    public void displayInfo() {
        System.out.println(name + "  Size: " + size + ", Weight: " + weight + ", Predator: " + predator);
    }
}

class Bird extends Animal {
    String speciesName;
    double wingspan;

    public Bird(String name, String size, double weight, boolean predator, String speciesName, double wingspan) {
        super(name, size, weight, predator);
        this.speciesName = speciesName;
        this.wingspan = wingspan;
    }

   
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Species Name: " + speciesName + ", Wingspan: " + wingspan);
    }
}

class LandAnimal extends Animal {
    int numLegs;

    public LandAnimal(String name, String size, double weight, boolean predator, int numLegs) {
        super(name, size, weight, predator);
        this.numLegs = numLegs;
    }

  
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Legs: " + numLegs);
    }
}

class Fish extends Animal {
    int numFins;

    public Fish(String name, String size, double weight, boolean predator, int numFins) {
        super(name, size, weight, predator);
        this.numFins = numFins;
    }

 
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Fins: " + numFins);
    }
}

