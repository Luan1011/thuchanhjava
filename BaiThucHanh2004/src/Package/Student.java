package Package;
public class Student extends Person {
  protected String studentID;
  public void addStudentID(){
    System.out.println("Type studentID");
    studentID = sc.nextLine();
  }
  public void displayStudentID(){
    System.out.println("StudentID: "+ studentID);
  }
}