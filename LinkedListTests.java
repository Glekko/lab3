import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTests {
    @Test
    public void testPrepend(){
        LinkedList myList = new LinkedList();
        myList.root = new Node(5, null);
        LinkedList expectedList = new LinkedList();
        expectedList.root = new Node(10, new Node(5, null ));
        assertEquals(expectedList, myList.prepend(10));
        
    }

    @Test
    public void testAppend(){

    }

    @Test
    public void testFirst(){

    }

    @Test
    public void testLast(){

    }

    @Test
    public void testToString(){

    }

    @Test 
    public void testLength(){

    }
}
