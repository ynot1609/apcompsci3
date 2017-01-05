public class WordListTest
{
    public static void main(String[] args)
    {
        WordList phrase = new WordList();
        phrase.add("cat");
        phrase.add("mouse");
        phrase.add("frog");
        phrase.add("dog");
        phrase.add("dog");
        
        System.out.println(phrase);
        System.out.println("Words of length 4(Should be 1): " + phrase.numWordsOfLength(4));
        System.out.println("Words of length 3(Should be 3): " + phrase.numWordsOfLength(3));
        System.out.println("Words of length 2(Should be 0): " + phrase.numWordsOfLength(2));
        System.out.println();
        
        phrase.removeWordsOfLength(4);
        System.out.println("Removed words of length 4(Should be [cat, mouse, dog, dog]): " + phrase);
        phrase.removeWordsOfLength(3);
        System.out.println("Removed words of length 3(Should be [mouse]): " + phrase);
        phrase.removeWordsOfLength(2);
        System.out.println("Removed words of length 2(Should be [mouse]): " + phrase);
    }
}