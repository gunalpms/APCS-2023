public class q38 {
    public static void main(String[] args) {

        // bu soruda bizden istenen hayali bir odada iki kişinin aynı doğum gününü paylaşması durumu gerçekleşene kadar
        // ne kadar kişi girmesi gerektiğini bulmaktır. %100 garanti olması için 365 kişinin girmesi lazımdır ancak
        // sorunun esas sorduğu giren her n. kişi için bu olasılığın kaç olduğudur. odada önceden 1 kişi olduğu varsayılacaktır.

        // soruda istenen yöntem bunu bir "deney" ile yapmamız ama bu yöntem daha isabetli olacaktır.

        // soruda 29 şubat olasılığı değerlendirilmemiştir. 
        double prob = 364.0/365.0; // bu iki kişinin doğum gününün aynı olmama olasılığıdır.
        for (int i = 0; i < 365; i++) {
            // pascal taktiği ile giren her i. kişi için kaç kişi ile kıyaslanacaığını
            // bulabiliriz. aslında burada hesaplanan i sayısına kadar olan tamsayıların toplamıdır (i dahil)
            int combinations = i*(i+1)/2; 
            // System.out.println(combinations + " "+ Integer.toString(i));
            
            // 100 olasılığı ile olmama olasılığının kombinasyon sayısına olan üssünü çarpmak 
            // bize odada bulunan n-1. kişiye kadar olan doğum günü paylaşma olasılığını verir.
            // i yerine i-1. kişiyi alıyoruz çünkü biz giren i. kişiye bakıyoruz, odada bulunan i. kişiye değil
            double prob_not_same_birthday = 100 * Math.pow(prob, combinations); 
            // paylaşmama olasılığını tam olasılıktan çıkardığımızda paylaşma olasılığını buluruz.
            double prob_same_birthday = 100 - prob_not_same_birthday;   
            System.out.println("for " + i + " new people having entered the room the chance of sharing birthdays is: " + prob_same_birthday);
            // odaya giren 22. kişide bu olasılığın yaklaşık %50 olduğunu görürüz.
            // bu da bize içinde 1 kişi olan bir odaya ortalama 22 kişi girdiğinde odada herhangi iki kişinin doğum gününün
            // aynı olabileceğini gösterir. 165'ten sonra bu olasılık Java tarafından 100 diye hesaplansa da bu bir
            // yuvarlama hatasıdır. odaya 365. kişi girmeden asla kesinlikle 2 kişi aynı doğum gününü paylaşıyor diyemeyiz.
            // çünkü odada 365 kişi varken her birinin doğum günü yılın başka bir gününe denk gelebilir. ancak 366. kişi
            // paylaşma olasılığını garantiler.
        }
    } 
}