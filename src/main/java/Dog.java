
public class Dog extends Animal {

  @Override
  public void eat() {
    System.out.println("Dog eating");
  }

  @Override
  public void sleep() {
    System.out.println("Dog sleeping");
  }

  @Override
  public void sing() {
    System.out.println("Woof, woof");
  }
}
