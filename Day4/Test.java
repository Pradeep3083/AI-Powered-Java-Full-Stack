package packagename;

import com.Test2;
import com.pradeep.*;

public class Test {

    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        Test obj = new Test();
        obj.sum();
    }

    public void sum() {
        int result = a + b;
        System.out.println("Sum = " + result);
    }
}
