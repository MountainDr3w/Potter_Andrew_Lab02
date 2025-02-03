import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker p1, p2;

    @BeforeEach
    void setUp(){
        p1 = new SalaryWorker("A","A","A","A",1,10,100000);
        p2 = new SalaryWorker("B","B","B","B",2,12,80000);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1923.076923076923,p1.calculateWeeklyPay(0));
    }

    @Test
    void displayWeeklyPay() {
        p1.displayWeeklyPay(0);
    }

}