package teste12025;

import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
     //questão 2
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Digite dois numeros: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
       

    }
}
