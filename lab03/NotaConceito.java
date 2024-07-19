package lab03;
import java.util.Scanner;
//converte nota para conceito;
//Digite uma nota e converta para conceito (A, B, C, etc);

public class NotaConceito {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Digite a Nota: ");
        int nota = input.nextInt();

        if (nota > 90) {
            System.out.println("Nota A");
        }
        else if (nota > 80 & nota < 90) {
            System.out.println("Nota B");
        }
        else if (nota > 70 & nota < 80) {
            System.out.println("Nota C");
        }
        else if (nota > 60 & nota < 70) {
            System.out.println("Nota D");
        }
        else if (nota > 50 & nota < 70) {
            System.out.println("Nota E");
        }
        else {
            System.out.println("Nota F");
        }

        input.close();
    }
    
}