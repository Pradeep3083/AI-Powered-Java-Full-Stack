class Test {
    public static void main(String[] args) {

        System.out.println("Welcome to AI Powered JFS");
        System.out.println("By FLM");

        int a = 10;
        try {
            a = 11 / 0; // Causes ArithmeticException
        } catch(Exception e) {
            // Exception handled here
        }
        System.out.println(a);

        a = 11; // Updating value
        System.out.println(a);

        String b = "Pradeep";
        b = "FLM"; // Updating string value
        System.out.println(b);
    }
}
