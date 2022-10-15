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
}
