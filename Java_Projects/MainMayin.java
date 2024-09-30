import java.util.Scanner;

public class MainMayin {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        int row,column;
        System.out.println("Mayın Tarlasına Hoşgeldiniz");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz !:  ");
        System.out.print("Satır Sayısı: ");
        row = s.nextInt();
        System.out.print("Sütun Sayısı: ");
        column = s.nextInt();

        Mayin_Tarlasi mayin = new Mayin_Tarlasi(row,column);
        mayin.run();
        s.close();
    }
}
