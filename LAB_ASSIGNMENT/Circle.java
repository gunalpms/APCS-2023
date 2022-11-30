public class Circle {

    private int cx;
    private int cy;
    private int rad;
    
    public Circle(int cx_arg, int cy_arg, int rad_arg) { // merkez x, merkez y ve yaricap ozelliklerine sahip bir daire yarat
        cx = cx_arg;
        cy = cy_arg;
        rad = rad_arg;
    }

    public double getArea(){ // pi sabitini kullanmak 3.14 yazmaktan daha dogru
        return Math.PI*rad*rad;
    }

    public boolean isInCircle(int px, int py) {
        // merkez notka ile verilen nokta arasindaki farkin karesi (asla negatif cikamaz)
        // iki kordinatta da alinip toplaninca yaricapin karesinden kucukse
        // verilen noktanin o dairenin icinde oldugunu soylemek mumkundur
        if ((px - cx)*(px - cx) + (py - cy)*(py - cy) < rad * rad) {
            return true;
        }
        else {
            return false;
        }
    }

    // dx ve dy argumanlari kadar x ve y noktalarini degistir
    public void translate(int dx, int dy) {
        cx += dx;
        cy += dy;
    }

    // radiusu 3le carp
    public void tripleTheRadius() {
        rad *= 3;
    }

}
