public class keygen {

    static String generate_key(String in) { // okunan her satir buraya gelir
        String[] args = in.split(" "); // boslukla ayri oldugunu varsayiyoruz

        // uzunluktan veya sacma sapan special characterlardan olusabilecek hatalari goz ardi ediyoruz
        // asagidaki stringlerden cekilen substringler sorunun kendisinde var aciklamaya gerek duymuyorum
        String a = args[2].substring(args[2].length() - 2); 
        String b = args[1].substring(args[1].length() - 3);
        String c = args[3].substring(2 ,4);
        String d = args[0].substring(2 ,3) + args[0].substring(1,2) + args[0].substring(0,1);
        // kucuk harf olmasi lazimmis sonradan fark ettim ben de
        return (a+b+c+d).toLowerCase();
    }
}

