import java.util.Scanner;

public class VolumeCubo2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Informe o valor dos lados: ");
        var lados = input.nextInt();
        var volume = Math.pow(lados, 3);

        System.out.println("O volume do cubo é " + volume);

        input.close();
    }
}