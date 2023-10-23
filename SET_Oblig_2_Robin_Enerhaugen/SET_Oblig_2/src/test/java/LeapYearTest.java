import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    LeapYear leapYear = new LeapYear();
    @Test
    void isYearALeapYear(){

        assertTrue(leapYear.isLeapYear(1600));
        assertTrue(leapYear.isLeapYear(2000));
        assertTrue(leapYear.isLeapYear(2400));
        assertTrue(leapYear.isLeapYear(2800));

        assertFalse(leapYear.isLeapYear(1700));
        assertFalse(leapYear.isLeapYear(1800));
        assertFalse(leapYear.isLeapYear(1900));
        assertFalse(leapYear.isLeapYear(2100));
    }
    @Test
    void leapYearDividableBy400(){
        assertTrue(leapYear.isLeapYear(2000));
    }
    @Test
    void leapYearDividableBy4Not100(){

        assertTrue(leapYear.isLeapYear(2024));
    }

    @Test
    void yearNotDividableBy4(){
        assertFalse(leapYear.isLeapYear(1999));
    }

    @Test
    void yearDividableBy100ButNot400(){
        assertFalse(leapYear.isLeapYear(1700));
    }
}