/**
 * Abstract superclass for the Pet hierarchy.
 */
abstract public class Pet {
  /** Name of the pet. */
  private String name;

  /**
   * Default constructor - create a pet
   * named "Pet".
   */
  public Pet() {
    setName("Pet");
  }

  /**
   * Initializing constructor -- create a pet
   * with the given name.
   * 
   * @param name Pet's name.
   */
  public Pet(String name) {
    setName(name);
  }

  /**
   * Name mutator.
   *
   * @param name New name for the pet.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Name accessor.
   *
   * @return String containing pet's name.
   */
  public String getName() {
    return name;
  }

  /**
   * Get the sound the pet makes.
   *
   * @return String containing the sound the pet makes.
   */
  abstract public String getNoise();

  @Override
  public String toString() {
    return "My name is " + getName();
  }
}