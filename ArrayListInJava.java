import java.util.ArrayList;

public class ArrayListInJava {
     public static void main(String[] args) {
    
    ArrayList<String> fruits = new ArrayList<String>( );
    fruits.add("Apple") ;  
    fruits.add("Banana") ;
    fruits.add("Orange") ;
    fruits.add("Mango") ;
    fruits.add("Grapes") ;
    fruits.add("Papaya") ;

    fruits.add(4, "Cherry");      // adding the value 
    

    System.out.println(fruits);      // printing array list whole

    for (String name:fruits){
    System.out.println(name);      // each array print 

    }
    for (String name:fruits){
        System.out.println(name.toUpperCase());      // each array print // printing in Upper case
    }

    System.out.println(fruits.get(3));        // print according to index. In this case in 3 position there is mango so it will be printed 


    fruits.set(2, "Pineapple");         // changes the value according to index  // replacing with new value

    System.out.println(fruits);   
    
    fruits.remove(2);
    System.out.println(fruits);         // removing the value with index or position 



}
}
