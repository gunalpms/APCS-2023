// bu programda x ve y degerlerine sahip bir point class vardir. 
// classin yapabildikleri x ve y degerlerini degistirebilmek veya orijine olan uzakligi verebilmektir.

public class Point{
    private int x;
    private int y;

    // arguman olmadiginda x ve y degerleri 0 olarak belirlenir
    public Point() {
        x = 0; 
        y = 0;
    }

    public Point(int x_arg, int y_arg) {
        x = x_arg;
        y = y_arg;
    }

    // labda verdigi yonergede fonksiyonda x ve y ayni anda var changey ya da changex yok o yuzden
    // cagirirken 0 olarak girmek lazim argumani degismemesi istenen kordinat icin
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }
}