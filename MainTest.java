/**
 *Lauren Lira - lllira1048
 *CIT 4423 01
 *Sept 25,2022
 *Windows 11
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest extends Main {

    @Test
    public void mainTest() throws Exception {
        assertEquals(4, Main.computeAverage(12, 3), 0.01);
        assertEquals(0.82, Main.computeAverage(2.45, 3), 0.01);
        assertEquals(15.26, Main.computeAverage(45.78, 3), 0.01);

    }//End of method for testing compute average method
    
}//End class MainTest
