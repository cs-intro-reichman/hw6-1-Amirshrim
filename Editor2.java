import java.awt.Color;

/**
 * Demonstrates the scaling (resizing) operation featured by Runigram.java. 
 * The program recieves three command-line arguments: a string representing the name
 * of the PPM file of a source image, and two integers that specify the width and the
 * height of the scaled, output image. For example, to scale/resize ironman.ppm to a width
 * of 100 pixels and a height of 900 pixels, use: java Editor2 ironman.ppm 100 900
 */
public class Editor2 {

    public static void main (String[] args){
        /// Retrieves the image filename and the desired target dimensions
        String fileName = args[0];
        int width = Integer.parseInt(args[1]);
        int height = Integer.parseInt(args[2]);

        /// Reads the source image from the file
        Color[][] imageIn = Runigram.read(fileName);

        /// Creates a new image by scaling the source image to the target dimensions
        Color[][] scaledImage = Runigram.scaled(imageIn, width, height);

        /// Sets the canvas to the new dimensions and displays the scaled image
        Runigram.setCanvas(scaledImage);
        Runigram.display(scaledImage);
    }
}