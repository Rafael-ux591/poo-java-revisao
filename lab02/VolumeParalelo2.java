import java.util.Scanner;

public class VolumeParalelo2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Informe o valor de a: ");
        var a = input.nextInt();
        System.out.println("Informe o valor de b: ");
        var b = input.nextInt();
        System.out.println("Informe o valor de c: ");
        var c = input.nextInt();
        var volume = a*b*c;

        System.out.println("O volume do Paralelepípedo é " + volume);

        input.close();
    }
}