import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class ListTests {

    @Test
    public void testFilter(){
        
        ListExamples myList = new ListExamples();
        String match = "b";

        List<String>checkExpected = new ArrayList<>();
        checkExpected.add("banana");
        checkExpected.add("bandana");
        checkExpected.add("bandaid");

        List<String>input1 = new ArrayList<>();
        input1.add("banana");
        input1.add("bandana");
        input1.add("bandaid");
        input1.add("crash");

        assertEquals(checkExpected, ListExamples.filter(input1, myList, match));

    }

    @Test
    public void testMerge(){
        List<String>firstArray = new ArrayList<>();
        firstArray.add("apple");
        firstArray.add("banana");
        firstArray.add("crab");
        firstArray.add("error");

        List<String>secondArray = new ArrayList<>();
        secondArray.add("atlanta");
        secondArray.add("ball");
        secondArray.add("crab");
        secondArray.add("dream");

        List<String>finalArray = new ArrayList<>();
        finalArray.add("apple");
        finalArray.add("atlanta");
        finalArray.add("ball");
        finalArray.add("banana");
        finalArray.add("crab");
        finalArray.add("crab");
        finalArray.add("dream");
        finalArray.add("error");

        assertEquals(finalArray, ListExamples.merge(firstArray, secondArray));
    }
}
