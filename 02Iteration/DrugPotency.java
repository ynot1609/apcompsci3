public class DrugPotency
{
    public static void main(String[] args)
    {
        double effect = 100.0;
        double reduce = 0.04;
        int month = 0;
        while (effect > 50)
        {
            effect = effect - effect*reduce;
            month = month + 1;
            System.out.println("Month: " + month + "\t" + "Effect: " + effect);
        }
    }
}