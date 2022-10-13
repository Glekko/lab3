import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3, 5, 10, 4, 2 };
    ArrayExamples.reverseInPlace(input1);
    
    assertArrayEquals(new int[]{ 2, 4, 10, 5, 3}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {1, 3, 5 };
    assertArrayEquals(new int[]{5, 3, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutScore(){
    double[] input1 = {2, 2, 8, 3, 9, 6};
    assertEquals(6.5, ArrayExamples.averageWithoutLowest(input1),0);
  }
}
