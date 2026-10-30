import java.util.Scanner;
public class array {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Masukkan Jumlah Buah yang Ingin Dimasukkan: ");
    int jumlah = scan.nextInt();
    String[] buah = new String[jumlah];
    for (int i = 0; i < jumlah; i++) {
        System.out.println("Masukkan Nama Buah ke-" + (i + 1) + ": ");
        buah[i] = scan.next();
    }
    System.out.println("Masukkan Nomor Buah yang Ingin Dicari " + "(1 - " + jumlah + ")" + ":");
    int no = scan.nextInt();
    if (no >= 1 && no <= jumlah) {
        System.out.println("Buah yang Anda Pilih: " + buah[no - 1]);
    } else {
        System.out.println("Indeks tidak valid!");
    }

    scan.close();
    }    
}
