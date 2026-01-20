package demo;

public class SamePackage {

    public static void main(String[] args) {

        Demo obj = new Demo();

        System.out.println(obj.a); // public ✔
        System.out.println(obj.c); // protected ✔
        System.out.println(obj.d); // default ✔
        // System.out.println(obj.b); // private ❌
    }
}
