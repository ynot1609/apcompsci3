import java.util.List;
import java.util.ArrayList;

public class SeatingChart
{
    private Student[][] seats;

    public SeatingChart(List<Student> studentList, int rows, int cols)
    {
        // YOUR CODE HERE
        int i = 0;
        int end = studentList.size();
        seats = new Student[rows][cols];
        for (int col = 0; col < seats[0].length; col++)
        {
            for (int row = 0; row < seats.length; row++)
            {
                if (i < end)
                {
                    System.out.println("(" + row + ", " + col + ")");
                    seats[row][col] = studentList.get(i);
                    i++;
                }
            }
        }
    }

    public int removeAbsentStudents(int allowedAbsences)
    {
        // YOUR CODE HERE
        int total = 0;
        for (int row = 0; row < seats.length; row++)
        {
            for (int col = 0; col < seats[0].length; col++)
            {
                Student pupil = seats[row][col];
                if (pupil != null && pupil.getAbsenceCount() > allowedAbsences)
                {
                    seats[row][col] = null;
                    total++;
                }
            }
        }
        return total;
    }

    public String toString()
    {
        String result = "";
        for (Student[] row : seats)
        {
            for (Student element : row)
            {
                if (element == null)
                {
                    result += "null ";
                }
                else
                {
                    result += "(" + element.getName() + element.getAbsenceCount() + ") ";
                }
            }
            result += "\n";
        }
        return result;
    }
}