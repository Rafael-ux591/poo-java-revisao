public class VolumeCone {
    public static void main(String[] args) {
        var raio = Float.parseFloat(args[0]);
        var altura = Float.parseFloat(args[1]);
        var r = Math.pow(raio, 2);
        var volume = ((3.14 * r) * altura) / 3;

        System.out.println("O volume do Cone é " + Math.round(volume));
        
    }
}