package teste12025;

import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
     //questão 4
    	Scanner scanner = new Scanner(System.in);
    	
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        boolean ePositivo = numero > 0;
        System.out.println("O número " + numero + (ePositivo ? " é positivo." : " não é positivo."));

    	  
    	    }
    	}

