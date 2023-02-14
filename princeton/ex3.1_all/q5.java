import java.awt.Color;

// This program flips a given image with respect to the y axis
public class q5 {

    public static void main(String[] args) {

        flipHorizontal(args[0]);
        
    }

    // takes the filename as an argument
    public static void flipHorizontal(String fileName) {

        Picture source = new Picture(fileName);

        int w = source.width();
        int h = source.height();

        // mirrors the image to the target therefore the space complexity is O(2n)
        // I'm not good enough to reduce it to a single image
        Picture target = new Picture(w, h);

        // indexes from the right side of the image to set the color to the target
        for (int c = w-1; c>=0; c--) {
            for (int r = 0; r<h; r++) {

                // gets the color from the reverse in the x axis
                Color col = source.get(w-c-1, r);
                // sets the color
                target.set(c, r, col);
            }
        }
        target.show();
    }    
}
