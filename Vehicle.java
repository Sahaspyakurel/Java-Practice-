public abstract class Vehicle {
    
    Vehicle(){
        System.out.println("I am from vehicle class constructor");
    }
    
    public void move(){
        System.out.println("It is moving");

    }

    public abstract void speedUp();

    public abstract void applyBrake();

    public final void fly(){

    }

}

