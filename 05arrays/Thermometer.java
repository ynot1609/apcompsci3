public class Thermometer
{
    public static void main(String[] args)
    {
        double[] temps = new double[6];
        temps[0] = 19.3;
        temps[1] = 23.6;
        temps[2] = 21.4;
        
        // display the values
        for (int i = 0; i < temps.length; i++)
        {
            System.out.println(temps[i]);
        }
        
        // for-each loop
        for (double item : temps)
        {
            System.out.println(item);
        }
    }
}