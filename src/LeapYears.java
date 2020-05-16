public class LeapYears {

    public String isLeapYear(int year) {

    String result = null;

        if (isDivisibleBy400(year)){
            result= "Leap Year:"+year;
        }

        if (isDivisibleBy100(year) && !isDivisibleBy400(year)){
            result= "Non-Leap Year:"+year;
        }

        if (isDivisibleBy4(year) && !isDivisibleBy100(year)){
            result= "Leap Year:"+year;
        }

        if (!isDivisibleBy4(year)){
            result= "Non-Leap Year:"+year;
        }

    return result;
}

    public boolean isDivisibleBy400(int year){
        return year % 400 == 0;
    }

    public boolean isDivisibleBy100(int year){
        return year % 100 == 0;
    }

    public boolean isDivisibleBy4(int year){
        return year % 4 == 0;
    }
}
