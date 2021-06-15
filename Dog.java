/**
 * Class representing a pet dog. 
 */
public class Dog extends Pet {
  /**
   * Default constructor -- create a pet dog with the
   * default name.
   */
  public Dog() {

  }
  
  /**
   * Initializing constructor -- create a pet dog with
   * the specified name.
   *
   * @param name String containing the name of the dog.
   */
  public Dog(String name) {
    super(name);
  }

  @Override
  public String getNoise() {
    return "woof";
  }
}