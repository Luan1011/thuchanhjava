package Package;

public class Customer extends Person {
  protected String customerID;
  public void addCustomerID(){
    System.out.println("Type customerID");
    customerID = sc.nextLine();
  }
  public void displayCustomerID(){
    System.out.println("CustomerID: "+customerID);
  }
  
}