import org.junit.Assert;
import org.junit.Test;

import java.security.KeyStore;

public class LeapYearsTest {

    LeapYears leapYears = new LeapYears();

    //To test the isLeapYear method with random number
    @Test
    public void isLeapYear(){
        int year=2020;
        System.out.println(leapYears.isLeapYear(year));
    }

    //All years divisible by 400 ARE leap years
    @Test
    public void yearsDivisibleBy400(){

        int year=2000;
        String expectedResult="Leap Year:"+year;

        Assert.assertEquals(expectedResult,leapYears.isLeapYear(year));
    }

    //All years divisible by 100 but not by 400 are NOT leap years
    @Test
    public void yearsDivisibleBy100ButNotBy400(){

        int year=1700;
        String expectedResult="Non-Leap Year:"+year;

        Assert.assertEquals(expectedResult,leapYears.isLeapYear(year));
    }

    //All years divisible by 4 but not by 100 ARE leap years
    @Test
    public void yearsDivisibleBy4ButNotBy400(){

        int year=2008;
        String expectedResult="Leap Year:"+year;

        Assert.assertEquals(expectedResult,leapYears.isLeapYear(year));
    }

    //All years not divisible by 4 are NOT leap years
    @Test
    public void yearsDivisibleNotBy4(){

        int year=2017;
        String expectedResult="Non-Leap Year:"+year;

        Assert.assertEquals(expectedResult,leapYears.isLeapYear(year));
    }

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