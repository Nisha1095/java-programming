class leap_year
{
    public static void main(String[] args) {
        int year = 2003;
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Leap year");
        else
            System.out.println("Not a Leap Year");
    }
}