public class Kennel
{
    // instance variables
    private Dog[] dogs;
    
    // constructors
    public Kennel()
    {
        dogs = new Dog[5];
    }
    
    // mutator methods
    public void addDogs(int i, Dog d)
    {
        dogs[i] = d;
    }
    
    // toString() method
    public String toString()
    {
        String result = "";
        for (int i = 0; i < dogs.length; i++)
        {
            if (dogs[i] != null)
            {
                result += "Name: " + dogs[i].getName() + "\n";
                result += "Breed: " + dogs[i].getBreed() + "\n";
            }
        }
        return result;
    }
}