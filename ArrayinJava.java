public class ArrayinJava {
    public static void main (String[]args){
int[] myarray;  //Declaration of array
myarray = new int[5];    //instantiation of an array
myarray[0]= 5;
myarray[1]= 10;
myarray[2]= 20;
System.out.println(myarray);
for(int i =0; i<5;i++){
    System.out.println(myarray[i]);
}

for (int num:myarray){
    System.out.println(num);      // enhanced for loop
}

}
}
