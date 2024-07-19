package lab04;
import java.util.Scanner;

public class Repeticoes1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Digite um número para fazermos a tabuada: ");
        int numero = input.nextInt();
        var contador = 0;

        while (contador < 10) {
            contador += 1;
            System.out.println (numero + "x" + contador + "=" + (numero * contador));
        }

        input.close();
    }
}
