import java.util.*;

/**
 * Client class to exercise the Pet hierarchy.
 */
class Main {
  /**
   * Application entry point.
   *
   * @param args Command-line parameters; ignored by
   * this application.
   */
  public static void main(String[] args) {
    // list of pets
    List<Pet> pets = new ArrayList<>();

    // populate the list
    pets.add(new Cat("Tipper"));
    pets.add(new Dog("Scooby"));
    // adding a default fish -- what will the name be?
    pets.add(new Fish()); 
    pets.add(new Hamster("Flash"));

    // display list contents. Note polymorphism working
    // in getNoise() calls. 
    for(Pet p : pets) {
      System.out.println(p + " and I say " + 
        p.getNoise());
    }
  }
}