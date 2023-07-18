public class Continue1to5 {
    
    public static void main(String[] args) {
        int i;
        for (i=1;i<=5;i++)
        {
            if (i==2 || i==3)
            {
                continue;
            }
        
            System.out.println(i);
        }
    }
    
}
