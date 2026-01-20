package demo;

public class Demo {

    public int a = 10;      // public
    private int b = 20;     // private
    protected int c = 30;   // protected
    int d = 40;             // default

    public void show() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
