//Driver class
import java.util.Scanner;
public class Tes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah objek (max 10): ");
        int jumlah = scanner.nextInt();
        
        System.out.print("Anda memilih CD atau DVD? ");
        String pilihan = scanner.next();

        //Kondisi
        for (int i = 1; i <= jumlah; i++) {
            System.out.println(i);

            if (pilihan.equals("CD")){
                CD c1 = new CD();
                c1.print();
            } else if (pilihan.equals("DVD")){
                DVD d1 = new DVD();
                d1.print();
            } else {
                System.out.println("Pilihan yang anda masukkan salah.");
            }
        }
    }

}