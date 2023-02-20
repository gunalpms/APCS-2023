import java.awt.Color;


// generate a tiled image with width m and height n for a given image
public class q35creative {

    public static void main(String[] args) {
        
        // take args and run solver
        String fnm = args[0];

        int m = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);

        tile(fnm, m , n);
        

    }

    public static void tile(String filename, int m, int n) {

        Picture source = new Picture(filename);

        int w = source.width();
        int h = source.height();

        // dimensions set according to args
        Picture target = new Picture(w*m, h*n);

        // for every column and row mirror the pixel to its nth and mth factor in the target image
        for (int c = 0; c<w; c++) {
            for (int r = 0; r<h; r++) {
                Color color = source.get(c, r);
                // i is columns and m is width so they go together, similar for j and n
                for (int i = 0; i<m; i++) {
                    for (int j = 0; j<n; j++) {
                        // if the iterators are 0 then the orijinal will be copied however it is also
                        // mirrored for all nonzero iterations
                        target.set(c+ w*i, r+h*j, color);
                    }
                }
            }
        }

        target.save("sol.jpg");


    }
}