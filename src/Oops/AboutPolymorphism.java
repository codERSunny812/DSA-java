package Oops;

class CodingNinjas {
    int ninjaID;
    String name;
    int rating = -1; // Default value for uninitialized rating

    /* Parameterized constructor (without rating) */
    CodingNinjas(int ninjaID, String name) {
        this.ninjaID = ninjaID;
        this.name = name;
    }

    /* Constructor overloading (with rating) */
    // Constructor overloading helps streamline object creation by offering
    // multiple ways to initialize an object based on the provided arguments.

    CodingNinjas(int ninjaID, String name, int rating) {
        this.ninjaID = ninjaID;
        this.name = name;
        this.rating = rating;
    }

    /* Display method */
    void display() {
        if (rating == -1) {
            System.out.println(ninjaID + " " + name + " Rating not available");
        } else {
            System.out.println(ninjaID + " " + name + " " + rating);
        }
    }
}

/* Subclass of CodingNinjas */
class AdvancedCodingNinjas extends CodingNinjas {

    // Additional property
    String skillLevel;

    /* Constructor for AdvancedCodingNinjas */
    AdvancedCodingNinjas(int ninjaID, String name, int rating, String skillLevel) {
        super(ninjaID, name, rating); // Call parent class constructor
        this.skillLevel = skillLevel;
    }

    /* Overriding the display method */
    @Override
    void display() {
        System.out.println(ninjaID + " " + name + " " + rating + " Skill Level: " + skillLevel);
    }
}



public class AboutPolymorphism {

    public static void main(String[] args) {

        /* New objects of parent class */
        CodingNinjas ninja = new CodingNinjas(169, "Ankush");
        CodingNinjas ninja2 = new CodingNinjas(69, "Nidhi", 2002);

        /* Displaying parent class objects */
        ninja.display();
        ninja2.display();

        /* New object of subclass */
        AdvancedCodingNinjas advancedNinja = new AdvancedCodingNinjas(101, "Rahul", 1500, "Expert");

        /* Displaying subclass object (overridden method) */
        advancedNinja.display();



    }
}
