import java.util.Scanner;
import java.util.Random;
import java.util.zip.ZipEntry;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int nombreAttendu = random.nextInt(100) + 1 ;
        int nombreImaginer = 0;
        int essai = 0;
        int essaiMax = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("deviner un nombre entre 1 et 100 . vous avez 10 essais \n");
        while (essai <essaiMax){
            System.out.print("Entrez votre nombre: ");
            nombreImaginer = scanner.nextInt();
            essai++;
            if(nombreImaginer==nombreAttendu){
                System.out.println("vous avez deviné le nombre en " + essai + "essai.");
                break;
            } else if (nombreImaginer <nombreAttendu){
            }else {
                System.out.println("plus petit ! ");
            }
        }
        if (essai == essaiMax && nombreImaginer != nombreAttendu){
            System.out.println("perdu,le nombre est :" + nombreAttendu);
        }
        scanner.close();
    }
}