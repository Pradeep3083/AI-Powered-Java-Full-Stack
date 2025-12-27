public class ExplicitTypeCasting {
    public static void main(String[] args) {

        short s = 128;
        byte b = (byte) s;   // Data loss occurs

        System.out.println("Short value: " + s);
        System.out.println("Byte value after casting: " + b);
    }
}
