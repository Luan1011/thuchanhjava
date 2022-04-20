package Package;

public class Employee extends Person {
  protected String position;
  public void addPosition(){
    System.out.println("Type position");
    position = sc.nextLine();
  }
  public void displayPosition(){
    System.out.println("Position: "+ position);
  }
}