import org.junit.Assert;
import org.junit.Test;

import java.security.KeyStore;

public class LeapYearsTest {

    LeapYears leapYears = new LeapYears();

    //year divisible by 400
    @Test
    public void isDivisibleBy400(){
        Assert.assertEquals(true, leapYears.isDivisibleBy400(2000));
    }

    //year not divisible by 400
    @Test
    public void isNotDivisibleBy400(){
        Assert.assertEquals(false, leapYears.isDivisibleBy400(2001));
    }

    //year divisible by 100
    @Test
    public void isDivisibleBy100(){
        Assert.assertEquals(true, leapYears.isDivisibleBy100(1700));
    }


    //year not divisible by 100
    @Test
    public void isNotDivisibleBy100(){
        Assert.assertEquals(false, leapYears.isDivisibleBy100(1701));
    }

    //years divisible by 4
    @Test
    public void isDivisibleBy4(){
        Assert.assertEquals(true, leapYears.isDivisibleBy4(2008));
    }

    //years not divisible by 4
    @Test
    public void isNotDivisibleBy4(){
        Assert.assertEquals(false, leapYears.isDivisibleBy4(2009));
    }
}