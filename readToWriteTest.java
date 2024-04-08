import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class readToWriteTest {

    @Test
    public void testReverse(){
      readToWrite rw = new readToWrite();
      StringBuilder testInput = new StringBuilder("abcd");
      String expected = "dcba";
      assertEquals(expected,rw.reverse(testInput));
    }
}
