/**
 * Class representing a pet cat. 
 */
public class Cat extends Pet {
  /**
   * Default constructor -- create a pet cat with the
   * default name.
   */
  public Cat() {

  }
  
  /**
   * Initializing constructor -- create a pet cat with
   * the specified name.
   *
   * @param name String containing the name of the cat.
   */
  public Cat(String name) {
    super(name);
  }

  @Override
  public String getNoise() {
    return "meow";
  }
}