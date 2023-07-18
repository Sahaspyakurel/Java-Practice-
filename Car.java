public class Car extends Vehicle{

    public void speedUp(){

        System.out.println("Car is speeding up");
 }
 public void applyBrake(){

 }
 public static void main(String[] args) {
     Car c1=new Car();
     c1.speedUp();
     c1.move();
 }

 
}
