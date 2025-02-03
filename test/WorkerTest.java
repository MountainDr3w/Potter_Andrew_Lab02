import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker p1,p2;

    @BeforeEach
    void setUp(){
        p1 = new Worker("A","A","A","A",1,20.00);
        p2 = new Worker("B","B","B","B",2,23.00);
    }

    @Test
    void calculateWeeklyPay(){
        assertEquals(600.00,p1.calculateWeeklyPay(30));
    }

    @Test
    void calculateWeeklyPay40Plus() {
        assertEquals(1495.00,p2.calculateWeeklyPay(50));
    }

    @Test
    void displayWeeklyPay(){
        p1.displayWeeklyPay(30);
    }

    @Test
    void displayWeeklyPay40Plus() {
        p2.displayWeeklyPay(50);
    }
}