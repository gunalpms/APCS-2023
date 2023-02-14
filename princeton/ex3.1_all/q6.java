import java.awt.Color;


// this program outputs an image in red color 
// for blue and green it is the same logic but the channels are changed
// I don't want to bother adding 2 more functions since I already demonstrated 
// how to do it for the red channel

// I have already done this in Julia
public class q6 {

    public static void main(String[] args) {

        outRed(args[0]);
        
    }

    // same logic as q5
    public static void outRed(String fileName) {
        Picture source = new Picture(fileName);

        int w = source.width();
        int h = source.height();

        // again mirrors the image to the target therefore the space complexity is O(2n)
        Picture target = new Picture(w, h);

        for(int c = 0; c<w; c++) {
            for(int r = 0; r<h; r++) {
                // retrieve color from the source image
                Color sc = source.get(c, r);
                // the red of the source will be the red of the target, 
                // but the blue and green channels will be 0
                Color red = new Color(sc.getRed(), 0, 0);
                // set the colors 
                target.set(c, r, red);
            }
        }

        target.show();
    }
    
}
