package Reto1;

 /*El famoso FizzBuzz
 Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de
 línea entre cada impresión), sustituyendo los siguientes:
         * - Múltiplos de 3 por la palabra "fizz".
         * - Múltiplos de 5 por la palabra "buzz".
         * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".*/

public class FizzBuzz {
    public static void main(String[] args) {
        int i, fizz, buzz;

        for (i = 1; i <= 100; i++){
            fizz = i % 3;
            buzz = i % 5;

            if (fizz == 0 && buzz == 0){
                System.out.println("FizzBuzz");
            } else if (fizz == 0) {
                System.out.println("Fizz");
            } else if (buzz == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
