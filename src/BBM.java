import java.util.Scanner;

public class BBM {
    public void literBBM() {
        int liter, jarak, kpl, pilih;
        double tarifBBM;

        Scanner sc = new Scanner(System.in);
        System.out.println("Jarak yang akan ditempuh (km)");
        jarak = sc.nextInt();
        System.out.println("Konsumsi BBM kilometer per liter");
        kpl = sc.nextInt();
        liter = add(jarak, kpl);
        System.out.println("Jumlah bensin yang diperlukan adalah " + liter +" liter");
        System.out.println();
        System.out.println("Silakan pilih jenis BBM");
        System.out.println("[1]Premium");
        System.out.println("[2]Pertalite");
        System.out.println("[3]Pertamax");
        pilih = sc.nextInt();
        switch (pilih) {
            case 1 -> {
                tarifBBM = liter * 6460;
                System.out.printf("BBM yang diperlukan %d liter dan total biaya Rp %3.2f", liter, tarifBBM);
                baris();
            }
            case 2 -> {
                tarifBBM = liter * 7650;
                System.out.printf("BBM yang diperlukan %d liter dan total biaya Rp %3.2f", liter, tarifBBM);
                baris();
            }
            case 3 -> {
                tarifBBM = liter * 9000;
                System.out.printf("BBM yang diperlukan %d liter dan total biaya Rp %3.2f", liter, tarifBBM);
                baris();
            }
            default -> {
                System.out.println("Pilihan tidak sesuai, silakan coba kembali");
                System.exit(0);
            }
        }
    }

    int add(int a, int b) {
        int c;
        c = a / b;
        return c;
    }

    void baris(){
        System.out.println();
        System.out.println();
    }
}