public class AssignmentTest
{
    public static void main(String[] args)
    {
        Assignment test = new Assignment("Ch.1 Test", "Test", 95);
        System.out.println(test);
        
        Assignment quiz = new Assignment();
        quiz.setName("Ch.1 Quiz");
        quiz.setType("Quiz");
        quiz.setScore(83);
        System.out.println(quiz);
    }
}