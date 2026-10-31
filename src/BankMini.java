import java.util.Scanner;
public class BankMini {
    public static void main(String[] args) {
        Scanner bankMini = new Scanner(System.in);

        //Membuat objek rekening
        Rekening rekening = new Rekening("001", "Ani", 100000);

        int menu;
        int jumlah;

        System.out.println("============ BANK MINI ============");
        System.out.println("Rekening 001 a.n. Ani");

        do {
            System.out.print("Menu (1 setor, 2 tarik, 3 info, 0 keluar): ");
            menu = bankMini.nextInt();

        switch (menu) {
            case 1:
            System.out.print("Jumlah: ");
            jumlah = bankMini.nextInt();

            if (rekening.setor(jumlah)) {
            System.out.println("  Berhasil");
            }
            else {
            System.out.println("  Ditolak");
            }
            break;

            case 2:
            System.out.print("Jumlah: ");
            jumlah = bankMini.nextInt();

            if (rekening.tarik(jumlah)) {
            System.out.println("  Berhasil");
            }
            else {
            System.out.println("  Ditolak");
            }
            break;

            case 3:
            rekening.cetakInfo();
            break;

            case 0:
            break;

            default:
            System.out.println("Menu tidak dikenal");
            }

        } while (menu != 0);

        // Menguji akses saldo private
        // rekening.saldo = 1000000;
        // Error: saldo has private access in Rekening

        // Menampilkan saldo akhir
        System.out.println("\n========== SALDO AKHIR ==========");
        rekening.cetakInfo();

        bankMini.close();
    }
    }
