package packagename;

// Imported packages
import com.Test2;
import com.pradeep.*;

public class Test {
    // Variables
    int a = 10;
    int b = 20;

    // Main Method
    public static void main(String[] args) {
        Test obj = new Test();
        obj.sum();
    }

    // user-defined method 
    public void sum() {
        // Logic goes here
        int result = a + b;
        System.out.println("Sum = " + result);
    }
}
