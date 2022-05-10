import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k,total = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Lüften Sayi Giriniz :");
            k =inp.nextInt();
            if (k %2 == 0 && k %4 == 0){
                total +=k;
            }

        }while (k%2 != 1 && k%4 != 1);
        System.out.println("İkinin ve Dördün katları :" + total);


    }
}
