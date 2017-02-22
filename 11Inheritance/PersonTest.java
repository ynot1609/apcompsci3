public class PersonTest
{
    public static void main(String[] args)
    {
        Person bob = new Person("Bob", "BNDS", "9238745");
        System.out.println(bob);
        
        System.out.println();
        
        Student alice = new Student("Alice", "BNDS", "3298763", "SN323", 4);
        System.out.println(alice);
        System.out.println(alice.getName());
        System.out.println(alice.getFirstLetterOfAddress());
    }
}