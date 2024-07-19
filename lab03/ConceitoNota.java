package lab03;
import java.util.Scanner;      
//Converte conceito para nota;
//Digite um conceito e converta para nota (100, 90, 80, etc);

public class ConceitoNota {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Digite um conceito: ");
        String conceito = input.next();

        switch (conceito) {
            case "A" -> System.out.println("Nota 100"); //versão encurtada, sem uso do 'break'
            case "B" -> System.out.println("Nota 90");
            case "C" -> System.out.println("Nota 80");
            case "D" -> System.out.println("Nota 70");
            case "E" -> System.out.println("Nota 60");
            case "F" -> System.out.println("Nota 50");
            default -> System.out.println("Não é um conceito que possa ser convertida");
        } 

        input.close();
    }
    
}
