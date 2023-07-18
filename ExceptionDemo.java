class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10, res;
        try {
            res = a / 0;
            System.out.println("Result= " + res);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("Hello World");
    }
}