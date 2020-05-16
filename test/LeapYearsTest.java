import org.junit.Assert;
import org.junit.Test;

import java.security.KeyStore;

public class LeapYearsTest {

    LeapYears leapYears = new LeapYears();

    //All years divisible by 400 ARE leap years
    @Test
    public void isDivisibleBy400(){
        Assert.assertEquals(true, leapYears.isDivisibleBy400(2000));

    }



}