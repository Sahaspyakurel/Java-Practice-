import java.lang.Math;
public class Triangle {
    public static void main (String []args)
    {
       double s, a=5,b=7,c=8, preArea, area;
       s=(a+b+c)/2;
       preArea= s*(s-a)*(s-b)*(s-c);
       area= Math.pow(preArea, 0.5);
       System.out.println(area);
    }


}
