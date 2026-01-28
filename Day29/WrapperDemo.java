public class WrapperDemo {

    static Integer num; // Wrapper default value = null

    public static void main(String[] args) {

        int a = 10;              // primitive
        Integer b = a;           // auto-boxing
        int c = b;               // auto-unboxing

        System.out.println(num); // prints null

        String s = "20";
        int n = Integer.parseInt(s); // String → int
        System.out.println(n + 2);

        System.out.println(Integer.max(10, 15));
        System.out.println(Integer.min(5, 3));

        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isUpperCase('A'));
    }
}
