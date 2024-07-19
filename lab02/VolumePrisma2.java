import java.util.Scanner;

public class VolumePrisma2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Informe qual o valor da base: ");
        var base = input.nextInt();
        System.out.println("Informe qual o valor da altura: ");
        var altura = input.nextInt();
        var volume = base * altura;

        System.out.println("O volume do Prisma é " + volume);

        input.close();
    }
}