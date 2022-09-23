import java.util.Scanner;

public class Calculadora {

    Scanner scanner = new Scanner("Insira os numeros");



    public static void soma(float numero1, float numero2) {
        float resultado = numero1 + numero2;

        System.out.println("A soma dos numeros "+ numero1 +" mais " + numero2 + " é igual a " + resultado);

    }

    public static void subtracao( float numero1, float numero2) {
        float resultado = numero1 - numero2;

        System.out.println("A subtracao dos numeros "+ numero1 +" menos " + numero2 + " é igual a " + resultado);

    }
    public static void multiplicacao( float numero1, float numero2) {
        float resultado = numero1 * numero2;

        System.out.println("A multiplicacao dos numeros "+ numero1 +" vezes " + numero2 + " é igual a " + resultado);

    }
    public static void divisao( float numero1, float numero2) {
        float resultado = numero1 / numero2;

        System.out.println("A divisao dos numeros "+ numero1 +" por " + numero2 + " é igual a " + resultado);

    }
    public static void restoDivisao( float numero1, float numero2) {
        float resultado = numero1 % numero2;

        System.out.println("O resto da divisao dos numeros " + numero1 + " por " + numero2 + " é igual a " + resultado);
    }


}
