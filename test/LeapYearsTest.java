import org.junit.Assert;
import org.junit.Test;

import java.security.KeyStore;

public class LeapYearsTest {

    LeapYears leapYears = new LeapYears();

    //years divisible by 400
    @Test
    public void isDivisibleBy400(){
        Assert.assertEquals(true, leapYears.isDivisibleBy400(2000));
    }

    //years divisible by 100
    @Test
    public void isDivisibleBy100(){
        Assert.assertEquals(true, leapYears.isDivisibleBy100(1700));
    }


}