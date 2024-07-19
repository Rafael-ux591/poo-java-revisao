public class VolumePiramide {
    public static void main(String[] args) {
        var base = Float.parseFloat(args[0]);
        var altura = Float.parseFloat(args[1]);
        var volume = ((lado * lado) * altura) / 3;

        System.out.println("O volume da pirâmide é " + volume);
    }
}