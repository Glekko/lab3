import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

interface StringChecker { boolean checkString(String s); }

public class ListTests {
    @Test
    public void testFilter(){
        StringChecker input2;

        List<String>checkExpedcted = new ArrayList<>();
        checkExpedcted.add("crash");

        List<String>input1 = new ArrayList<>();
        input1.add("banana");
        input1.add("bandana");
        input1.add("bandaid");
        input1.add("crash");

        assertArrayEquals(checkExpedcted, ListExamples.filter(input1, input2));

    }
}
