import java.util.*;

public class CollegeTest
{
    public static void main(String[] args)
    {
        CollegeGroup cluster = new CollegeGroup();
        cluster.addCollege(new Colgate(27025));
        cluster.addCollege(new Duke(26000));
        cluster.addCollege(new Kalamazoo(19764));
        cluster.addCollege(new Stanford(25917));
        cluster.addCollege(new FloridaInternational(10800));
        cluster.addCollege(new Dartmouth(27764));
        cluster.addCollege(new Spelman(11455));
        
        cluster.updateTuition("Colgate University", 27500);
        
        System.out.println("Part a: updateTuition");
        System.out.println("---------------------");
        ArrayList<College> schools = cluster.getColleges();
        for (College item : schools)
        {
            System.out.println(item.getName());
            System.out.println(item.getRegion());
            System.out.println(item.getTuition() + "\n");
        }
        
        System.out.println("Part b: getCollegeList");
        System.out.println("----------------------");
        ArrayList<College> institutions = cluster.getCollegeList("Southeast", 10000, 20000);
        for (College item : institutions)
        {
            System.out.println(item.getName());
            System.out.println(item.getRegion());
            System.out.println(item.getTuition() + "\n");
        }
    }
}