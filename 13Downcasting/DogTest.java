public class DogTest
{
    public static void display(Pet animal)
    {
        System.out.println(animal.getName());
        ((Dog) animal).bark();
    }
    
    public static void main(String[] args)
    {
        Dog canine = new Dog("Fido");
        display(canine);
    }
}