import java.util.LinkedList;
import java.util.Scanner;

import javafx.scene.control.Slider;
public class App110 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    LinkedList<Student> listStudent = new LinkedList<Student>();

    Student student1 = new Student("A", 9);
    Student student2 = new Student("B", 4);
    Student student3 = new Student("C", 5);
    Student student4 = new Student("D", 8); 
    Student student5 = new Student("E", 10); 

    listStudent.add(student1);
    listStudent.add(student2);
    listStudent.add(student3);
    listStudent.add(student4);   
    listStudent.add(student5);   

    for(int i=0; i<listStudent.size();i ++){
        System.out.println(listStudent.get(i));
    }

    System.out.println("---Danh sach sinh vien phai thi lai---");
    for(int i=0; i<listStudent.size();i ++){
      if(listStudent.get(i).getPoint() <= 5){
        System.out.println("Sinh vien: " + (i+1));
        listStudent.get(i).displayStudent();
      }
    }

    System.out.println("---Danh sach sinh vien co diem cao nhat---");
    int max = listStudent.get(0).getPoint();    
    for (int i = 1; i < listStudent.size(); i++) {
        if (listStudent.get(i).getPoint() > max) {
            max = listStudent.get(i).getPoint();
        }
    }
    for(int i=0; i< listStudent.size(); i++){
        if(listStudent.get(i).getPoint() == max){
          listStudent.get(i).displayStudent();
        }
    }

    String  nameForSearch;
    System.out.println("Nhap ten sinh vien can tim");
    nameForSearch = scanner.nextLine();
    for(int i = 0; i<listStudent.size(); i++){
      if(listStudent.get(i).getName().equals(nameForSearch)){
        listStudent.get(i).displayStudent();
      }
    }
  }
}
class Student {
  Scanner scanner = new Scanner(System.in);
  private String name;
  private int point;
  public Student(){};
  public Student(String name, int point) {
      super();
      this.name = name;
      this.point = point;
  }
  public String getName() {
      return name;
  }
  public void setName(String name) {
      this.name = name;
  }
  public int getPoint() {
      return point;
  }
  public void setPoint(int point) {
      this.point = point;
  }
  public void displayStudent(){
    System.out.println("Name: " + name);
    System.out.println("Point: " + point);
  }
  @Override
  public String toString() {
      return "Student@[name=" + name + ", point=" + point + "]";
  }
}