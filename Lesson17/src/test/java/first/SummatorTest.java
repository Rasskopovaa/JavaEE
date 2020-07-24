package first;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SummatorTest {
    private Summator summator;

    @BeforeAll
    static void beforeAll() {
        System.out.println("This is @BeforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("This is BeforeEach");
        summator = new Summator();
    }
    @Test
    public void sumTest(){
        int sum=this.summator.summ(1,3);
        assertEquals(4,sum);
    }
    @Test
    public void doSomeTest(){
        assertThrows(RuntimeException.class,()->this.summator.doSome(5));
    }
    public void doSomeTestNoException(){
        assertDoesNotThrow(()->this.summator.doSome(4));
    }
}

