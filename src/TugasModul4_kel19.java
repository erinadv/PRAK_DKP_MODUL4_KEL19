import java.util.Scanner;

public class TugasModul4_kel19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BBM obj = new BBM();
        while (true){
        System.out.println("=====KONSUMSI BBM=====");
        System.out.println("SELAMAT DATANG DI PERTAMANI");
        System.out.println("Apakah Anda ingin menghitung BBM yang dibutuhkan kendaraan Anda?");
        System.out.println("1. YA");
        System.out.println("2. TIDAK");
        int pilihan = sc.nextInt();
            if (pilihan == 1) {
                obj.literBBM();
            } else {
                System.exit(0);
            }
        }
    }
}