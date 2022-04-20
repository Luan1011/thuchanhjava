package Package;

public class TaxiCar implements Car {
  public void Move(){
    System.out.println("The taxi is moving");
  }
  public void Stop(){
    System.out.println("The taxi is stopping");
  }
  public void TurnRight(){
    System.out.println("The taxi is turning right");
  }
  public void TurnLeft(){
    System.out.println("The taxi is turning left");
  }
  public void Reverse(){
    System.out.println("The taxi are reversing");
  }
}