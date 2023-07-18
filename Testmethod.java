public class Testmethod {
    String name;
    int value;

    // method creation
    public void sum(int a, int b) { // sum(int a, int b) -- This is meant by Signature
        int z = a + b;
        System.out.println(z);

    }

    public void sum(int a, String b, int c) {
        int v = a + c;
        System.out.println(v);
    } // method overloading --

    public void sum(int x, int y, int z) {
        int u = x + y + z;
        System.out.println(u);

    }

    public void sum() {
    }

    public int sum(int w, int x, int y, int z) {
        int ans = w + x + y + z;
        return ans;
    }

    public static void main(String[] args) {
        Testmethod T1 = new Testmethod();
        T1.sum(5, 9);
        T1.sum(23, 23, 4); // method calling
        T1.sum(10, 20, 30);

    }
}
