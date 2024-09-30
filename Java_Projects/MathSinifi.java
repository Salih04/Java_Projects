public class MathSinifi {
    public static void main(String[]args){
        /*Math sınfı metotları
        Math.ceil(x) => Bir büyük tam sayıya yuvarlama yapar.
        Math.cos(x) => cos değerine döner
        Math.sin(x) => sin değerine döner
        Math.floor(x) => küçük tam sayıya yuvarlar
        Math.max(x,y) => Büyük sayıyı verir.
        Math.min(x,y) => Küçük sayıyı verir.
        Math.pow(x,y) => x^y üs alır.
        Math.random() => 1 ve 0 arasında rastgele deüer verir.
        Math.round(x) => yakın olan tam sayıya yuvarlar.
        Math.abs(x) => Mutlak değer
         */ 

         System.out.println((int)Math.pow(3, 2)); // Type Casting Double'ı Integer'a zorlama
         System.out.println(Math.cos(30));
         System.out.println((double)Math.round(1.3)); // Burada da int çıkan değeri "double"'a zorladık.
         System.out.println(Math.abs(-3));
         System.out.println(Math.sqrt(16));
    }
    
}
