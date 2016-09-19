public class GradeSelection
{
    public static String displayGrade(double score)
    {
        String grade = "";
        if (score >= 0.9)
        {
            grade = "A";
        }
        else if (score >= 0.8)
        {
            grade = "B";
        }
        else if (score >= 0.7)
        {
            grade = "C";
        }
        else if (score >= 0.6)
        {
            grade = "D";
        }
        else
        {
            grade = "F";
        }
        return grade;
    }
    
    public static void main(String[] args)
    {
        System.out.println(displayGrade(0.95));
        System.out.println(displayGrade(0.75));
        System.out.println(displayGrade(0.5));
    }
}