public class GrayImageTest
{
    public static void main(String[] args)
    {
        // Part a
        int[][] picture = { {255, 184, 178, 84, 129},
                            {84, 255, 255, 130, 84},
                            {78, 255, 0, 0, 78},
                            {84, 130, 255, 130, 84} };
        GrayImage gi = new GrayImage(picture);

        int numPix = gi.countWhitePixels();
        System.out.println("White pixels = " + numPix);

        // Part b
        int[][] photo = { {221, 184, 178, 84, 135},
                            {84, 255, 255, 130, 84},
                            {78, 255, 0, 0, 78},
                            {84, 130, 255, 130, 84} };
        GrayImage gray = new GrayImage(photo);

        System.out.println(gray);
        gray.processImage();
        System.out.println(gray);
    }
}
