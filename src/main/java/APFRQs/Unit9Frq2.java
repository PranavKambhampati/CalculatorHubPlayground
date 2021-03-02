package APFRQs;

// Total score: 2/3, see comments for grading below.

class Animal {

    public String animaltype;
    public String animalspecies;
    public String animalname;

    public Animal(String type, String species, String name) {
        animaltype = type;
        animalspecies = species;
        animalname = name;
    }

    public String toString() {
        return animalname + " the " + animalspecies + " is a " + animaltype;
    }

}

class Herbivore extends Animal {

    public Herbivore(String species, String name){
        super("herbivore", species,name);
    }
    // 1/1. Correctly creates the Herbivore subclass of animal.
}

class Elephant extends Herbivore {

    public double tusklength;

    public Elephant(String name, double len){
        super("elephant",name);
        tusklength = len;
    }

    // 1/1 correctly initializes the Elephant subclass of herbivore. Correctly uses the super call.

    public String toString() {
        return animalname + " the " + animalspecies + " is a " + animaltype + " with tusks " + tusklength + " meters long";
    }
    // 0/1, toString needs an override to correctly function.
}

public class Unit9Frq2 {

    public static void main(String[] args) {
        Animal lisa = new Animal("carnivore", "lion", "Lisa");
        System.out.println(lisa);
        Herbivore gary = new Herbivore("giraffe","Gary");
        System.out.println(gary);
        Elephant percy = new Elephant("Percy", 2.0);
        System.out.println(percy);
    }
}

