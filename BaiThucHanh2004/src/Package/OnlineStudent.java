package Package;

public class OnlineStudent extends Student{
  public String devices;
  public void addDevices(){
    System.out.println("Devices");
    devices = sc.nextLine();
  }
  public void displayDevices(){
    System.out.println("Devices: "+devices);
  }
  public void placeToStudy(){
    System.out.println(" Learn on Teams");
  }
}