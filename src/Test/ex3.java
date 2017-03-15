package Test;

import Main.Rectangle;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by gjm19_000 on 3/15/2017.
 */
public class ex3 {
    @Test
    public void testCondition(){
        Rectangle rectangle = new Rectangle(4,3);

        double area = rectangle.getArea();

        // assertEquals is a static method used to compare the expected result and true result
        // the method could be overloaded to compare different types. int, String...
        // also can be used to compare two objects, as long as a ".equals" method is defined (overrided) in object

        assertEquals(area,12,0);
    }
}
