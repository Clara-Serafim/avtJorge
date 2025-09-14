package teste12025;

import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
     //questão 3
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Digite uma frase:");
    	   char c = scanner.next().charAt(0);
           System.out.println("Unicode: " + (int) c);
    }
}

