public class DateTest
{
    public static void main(String[] args)
    {
        Date d = new Date();
        int mymonth = 0;
        mymonth = d.getMonth();
        System.out.println(mymonth);
        
        Date e = new Date(10, 27, 2015);
        System.out.println(e);
        e.changeDate(8, 16, 2008);
        System.out.println(e);
        System.out.println(e.toString());
    }
}