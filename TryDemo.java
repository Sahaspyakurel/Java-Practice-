public class TryDemo {
    public static void main(String[] args) {
        int a[] = new int[3];
        try {
            a[3] = 100;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("Hello World");
    }
}
