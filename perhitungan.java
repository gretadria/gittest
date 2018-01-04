import java.util.Scanner;
public class perhitungan {
public static void main(String[] args){
        int panjang;
        int lebar;
        double luas;

                Scanner a = new Scanner(System.in);
                System.out.println("menghitung luas persegi panjang");
                System.out.println("Masukan Panjang : ");
                panjang = a.nextInt();
                System.out.println("Masukan Lebar : ");
                lebar = a.nextInt();

                luas = (panjang*lebar);
                System.out.println("Luas persegi panjang = "+luas);
                }
}
