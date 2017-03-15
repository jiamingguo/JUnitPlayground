package Test;

import Main.Rectangle;
import org.junit.Test;

/**
 * Created by gjm19_000 on 3/15/2017.
 */
public class Ex2 {
    @Test
    public void testFunction(){
        // step 1: create the object that you want to test
        Rectangle rectangle = new Rectangle(4,3);
        // step 2: call the method to be tested
        double area = rectangle.getArea();
        // step 3: assertion. check the actual value and expected value
        assert area == 12;

        System.out.println("ex2: Rectangle area method works");
    }
}
