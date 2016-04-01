import java.util.List;
import java.util.ArrayList;

public class SeatingChartTest
{
    public static void main(String[] args)
    {
        List<Student> roster = new ArrayList<Student>();
        Student karen = new Student("Karen", 3);
        Student liz = new Student("Liz", 1);
        Student paul = new Student("Paul", 4);
        Student lester = new Student("Lester", 1);
        Student henry = new Student("Henry", 5);
        Student renee = new Student("Renee", 9);
        Student glen = new Student("Glen", 2);
        Student fran = new Student("Fran", 6);
        Student david = new Student("David", 1);
        Student danny = new Student("Danny", 3);
        
        roster.add(karen);
        roster.add(liz);
        roster.add(paul);
        roster.add(lester);
        roster.add(henry);
        roster.add(renee);
        roster.add(glen);
        roster.add(fran);
        roster.add(david);
        roster.add(danny);

        SeatingChart introCS = new SeatingChart(roster, 3, 4);
        System.out.println(introCS);
        introCS.removeAbsentStudents(4);
        System.out.println(introCS);
    }
}