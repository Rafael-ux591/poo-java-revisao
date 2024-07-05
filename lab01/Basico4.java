package lab01;

public class Basico4 {
    // Executando no terminal:
    // java lab01/Basico4.java
    public static void main(String[] args) {

        /**
         * A classe Math em Java fornece métodos estáticos para realizar operações
         * matemáticas básicas como logaritmos, exponenciais, raízes quadradas e
         * trigonometria. Aqui estão alguns dos métodos mais comuns:
         */
       
         // Métodos Trigonométricos

         double resultado1 = Math.sin(Math.PI / 2); // resultado1 é 1.0
         double resultado2 = Math.cos(0); // resultado2 é 1.0
         double resultado3 = Math.tan(Math.PI / 4); // resultado3 é 1.0

         // Métodos Exponenciais e Logarítmicos

         //exp(double a): Retorna Euler elevado à potência de um valor.
         double resultado4 = Math.exp(1); // resultado4 é aproximadamente 2.71828
         //log(double a): Retorna o logaritmo natural (base 2) de um valor.
         double resultado5 = Math.log(Math.E); // resultado5 é 1.0
         //log10(double a): Retorna o logaritmo de base 10 de um valor.
         double resultado6 = Math.log10(100); // resultado6 é 2.0


         // Métodos de Potência e Raiz

         //pow(double a, double b): Retorna o valor de a elevado à potência de b.
         double resultado7 = Math.pow(2, 3); // resultado7 é 8.0
         //sqrt(double a): Retorna a raiz quadrada de um valor.
         double resultado8 = Math.sqrt(16); // resultado8 é 4.0

         // Métodos de Arredondamento


         //ceil(double a): Retorna o menor valor inteiro maior ou igual a a
         double resultado9 = Math.ceil(4.3); // resultado9 é 5.0
         //floor(double a): Retorna o maior valor inteiro menor ou igual a a.
         double resultado10 = Math.floor(4.7); // resultado10 é 4.0
         //round(double a): Retorna o valor de a arredondado para o inteiro mais próximo.
         long resultado11 = Math.round(4.5); // resultado11 é 5

         // Constantes
         double pi = Math.PI; // pi é aproximadamente 3.14159
         double e = Math.E; // e é aproximadamente 2.71828




    }
}