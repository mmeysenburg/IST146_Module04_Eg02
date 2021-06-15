/**
 * Class representing a pet fish. 
 */
public class Fish extends Pet {
  /**
   * Default constructor -- create a pet fish with the
   * default name.
   */
  public Fish() {

  }
  
  /**
   * Initializing constructor -- create a pet fish with
   * the specified name.
   *
   * @param name String containing the name of the fish.
   */
  public Fish(String name) {
    super(name);
  }

  @Override
  public String getNoise() {
    return "glub";
  }
}