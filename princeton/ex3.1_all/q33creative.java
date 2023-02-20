import java.awt.Color;

public class q33creative {

    // cannot generate perfect whites from hsb but is decent
    public static void main(String[] args) {

        StdDraw.setXscale(-1, 16);
        StdDraw.setYscale(-1, 16);

        // I later realized that the inner loop is the row but didnt bother to change the letters
        for (int r = 0; r<16; r++) {
            for (int c = 0; c<16; c++) {
                // get the color from the column
                Color gray = new Color(r*16, r*16, r*16);
                // get the saturation from the row
                Color blue = Color.getHSBColor(0.60f, (float)(10+c*6)/100.0f, 0.70f);

                // draw the square
                StdDraw.setPenColor(blue);
                StdDraw.filledSquare(r, c, 0.5);
                StdDraw.setPenColor(gray);
                StdDraw.filledSquare(r, c, 0.25);
            }
        }
    }   
}
