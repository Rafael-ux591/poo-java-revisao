public class VolumeCilindro {
    public static void main(String[] args) {
        var raio = Float.parseFloat(args[0]);
        var altura = Float.parseFloat(args[1]);
        var r = Math.pow(raio, 2);
        var volume = (3.14 * r) * altura;

        System.out.println("O volume do Cilindro é " + volume);
        
    }
}