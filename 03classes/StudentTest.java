public class StudentTest
{
    public static void main(String[] args)
    {
        int pupilAge = 0;
        Student s = new Student();
        pupilAge = s.getAge();
        System.out.println("Age: " + pupilAge);
    
        s.setAge(19);
        pupilAge = s.getAge();
        System.out.println("Age: " + pupilAge);
    }
}