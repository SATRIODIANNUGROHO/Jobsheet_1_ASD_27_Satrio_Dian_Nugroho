import java.util.*;
public class Perulangan27 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner (System.in);
        System.out.println("==============================================");
        System.out.println("\nProgram Menampilkan Deret Bilangan");
        System.out.println("\n==============================================");
        System.out.print("\nMasukkan NIM Anda\t\t : ");
        long NIM = inputUser.nextLong();
        int duaAngkaTerakhir = (int)(NIM % 100);
        int n = duaAngkaTerakhir;
        if (n < 10) {
            n += 10;
            System.out.println("\n----------------------------------------------");
            System.out.println("\nDua Digit Angka Terakhir\t : 1" + (duaAngkaTerakhir));
            System.out.println("\n----------------------------------------------\n");
        }else {
            System.out.println("\n----------------------------------------------");
            System.out.println("\nDua Digit Angka Terakhir\t : " + (duaAngkaTerakhir));
            System.out.println("\n----------------------------------------------\n");
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 || i == 6 || i == 10) {
                System.out.print(" * ");
            }else {
                System.out.print(i);
            }
        }
        System.out.println("\n\n==============================================\n");
        inputUser.close();
    }
}