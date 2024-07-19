public class VolumeEsfera {
    public static void main(String[] args) {
        var raio = Float.parseFloat(args[0]);
        var volume = Math.PI * Math.pow(raio, 3) * 4 / 3;

        System.out.println("O volume da Esfera é " + Math.round(volume));
        
    }
}