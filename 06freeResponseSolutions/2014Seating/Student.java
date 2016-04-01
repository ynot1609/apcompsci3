public class Student
{
    private String name;
    private int absences;

    public Student(String sName, int sAbsences)
    {
        name = sName;
        absences = sAbsences;
    }

    public String getName()
    {
        return name;
    }

    public int getAbsenceCount()
    {
        return absences;
    }
}