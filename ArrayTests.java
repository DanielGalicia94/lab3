import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    // This one will work
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    // This one will fail the test
    int[] input2 = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals( new int[]{5,4,3,2,1}, input2);
    /*int[] input3 = {1,2,3,4};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{4,3,2,1}, input3);
    int[] input4 = {};
    ArrayExamples.reverseInPlace(input4);
    assertArrayEquals(new int[]{}, input4);
    */
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] input2 = {1,2,3};
    assertArrayEquals( new int[]{3,2,1}, ArrayExamples.reversed(input2));
    int[] input3 = {1,2,3,4};
    assertArrayEquals( new int[]{4,3,2,1}, ArrayExamples.reversed(input3));
  }

  @Test
  public void testWMAverage(){
    double[] input1= {2,1,3}; 
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input1),0.001);
  }
}
