
public class Cat extends Animal {

  @Override
  public void eat() {
    System.out.println("Cat eating");
  }

  @Override
  public void sleep() {
    System.out.println("Cat sleeping");
  }

  @Override
  public void sing() {
    System.out.println("Meow, meow");
  }
}
