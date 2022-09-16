public class eulerp6 {

    public static void main(String[] args) {
        solution sol = new solution();
        System.out.println(sol.solve());
        
    }

    public static class solution{

        public solution() {

            solve();
        }

        private int solve() {
            int n = 0;
            int m = 0;
            for (int i=1; i<101; i++) { // burada 1'den 100e kadar olan sayilarin her birinin karesi tek tek
                n = n+i*i;              // alinip toplaniyor
            }
            for (int i =1; i<101; i++) {  // burada ise 1'den 100e kadar olan sayilar birbirine ekleniyor
                m = m+i;            
            }

            m = m*m; // toplamin karesi istendigi icin ikinci dongudeki netice burada kendisiyle carpiliyor
            return m-n;
        }
    }
}