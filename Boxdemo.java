class Box {
    // member variables
    double length;
    double breadth;
    double height;

    double Volume() {
        double vol;
        vol = length * breadth * height;
        return vol;
    }
        double Area() {
            double ar;
            ar=length * breadth;
            return ar;
        }
    }


public class Boxdemo {
    public static void main(String[] args) {
        Box a = new Box(); // creating box objects
        // initializing box objects
        a.length = 10;
        a.breadth = 20;
        a.height = 5;
        double r = a.Volume();
        double p=a.Area();
        System.out.println("The box has following dimensions: ");
        System.out.println();
        System.out.println("Length = " + a.length);
        System.out.println("Breadth = " + a.breadth);
        System.out.println("Height = " + a.height);
        //Calculate volume of box
        System.out.println("The volume of the box is " + r);
        //calculate area of box
        
        System.out.println("The area of the box is " + p);
    }
}