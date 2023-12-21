
import java.util.Scanner;

import controller.ApkControl;

public class Apk {
    public static void main(String[] args) {
        ApkControl baru = new ApkControl();
        baru.dataPengguna();
        baru.Login();
        boolean lanjut = true;
        Scanner input = new Scanner(System.in);
        while (lanjut) {
            baru.Menu();
            String pilihan = input.nextLine();
            switch (pilihan) {
                case "1":
                    baru.cekPaket();
                    
                    break;
                case "2":
                    baru.belanjaPulsa();
                    
                    break;
                case "3":
                    baru.belanjaPaketData();
                    
                    break;
                case "4":
                    lanjut = false;
                    break;
                case "5":
                    baru.transaksiSebelumnya();
                    break;
                default:    
                    System.out.println("tolong Masukan angka yang tertera");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
        System.out.println();
        System.out.println("            TERIMAKASIH TELAH BERKUNJUNG!            ");
        System.out.println();
    }
}