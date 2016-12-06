public class PassingObjects
{
    public static void outputResult()
    {
        Digit item = new Digit();
        outputSolution(item);
        System.out.println(item.getNum());
    }
    
    public static void outputSolution(Digit element)
    {
        element.setNum(75);
        System.out.println(element.getNum());
    }
    
    public static void main(String[] args)
    {
        outputResult();
    }
}