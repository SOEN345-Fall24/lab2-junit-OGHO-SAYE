import org.junit.Test;
import static org.junit.Assert.*;


public class ExampleTest {
    @Test public void testFunction_A(){
        Example ex = new Example(2,3);

        assertEquals("Examples are not correct",5,ex.Function_A(3));

    }
    @Test public void testFunction_A2(){

        Example ex = new Example(2,3);
        assertEquals("Examples are not correct",-2,ex.Function_A(0));

    }
    @Test public void testFunction_B(){
        Example ex = new Example(2,3);

        assertEquals("Examples are not correct",6,ex.Function_B(3));
    }
    @Test public void testFunction_B2(){
        Example ex = new Example(2,3);

        assertEquals("Examples are not correct",5,ex.Function_B(8));
    }
}
