import java.lang.Math;

public class Cipher {

    // soruda istedigi yardimci fonksiyonlardan bir cacik anlamadim o yuzden amaca gore cozuyorum
    // istedigi ciktiya ulastigi surece programin icinde ne oldugu cok onemli olmasa gerek
    // zira gosterdigi veri yapisinda 2 satirlik listeler var ama yarattirdigi liste
    // 2 satirli degil n satirli. 
    private int row;
    private int col;
    

    public Cipher(int r, int c) {
        this.row = r;
        this.col = c;
    } 

    public String encryptMessage(String s) {
        
        String encrypted = "";

        // daha uzunsa matriksi uzunluga ulasana kadar tekrar etmek lazimmis
        if (s.length() > row*col) {
            int times = ((s.length()-1)/(row*col));
            
            // her tekrar icin ana stringin matrix eleman sayisi kadar uzunluktaki substringini aliyoruz
            // kalan mantik cok basit else kismindakiyle ayni orda acikladim
            for(int i = 0; i<=times; i++) {
                
                String a = s.substring(i*row*col, Math.min(((i+1)*row*col), s.length()));
                
                while (a.length()<row*col) {
                    a+="A";
                }
                for (int r = 0; r<col; r++) {
                    for(int c = 0; c<row*col; c+=col) {

                        encrypted += Character.toString((a.charAt(c+r)));

                    }
                }

            }
            return encrypted;
        } 

        
        else {
            // uzunluga ulasana kadar A ekle
            while (s.length()<row*col) {
                s+="A";
            }
            // uzunluga ulastiktan sonra her sutun sayisi kadar aralikta her satirdan eleman al
            // matriks mantigina dokmek icin sutun sayisi araligindan aldiktan sonra bunu sutun sayisi
            // iteratoru ile toplamak lazim. aciklamasi sacma oldu ama kod kendisini belli ediyor
            for (int r = 0; r<col; r++) {
                for(int c = 0; c<row*col; c+=col) {
                    encrypted += Character.toString((s.charAt(c+r)));
                }
            }
        } // end if else 
        
        //return "b";
        return encrypted;

    }   
}
