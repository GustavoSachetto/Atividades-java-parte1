package Atividade;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nome;
        String nome1;

        System.out.println("Digite um nome:" );
        nome = entrada.nextLine();
        
        System.out.println("Digite outro nome:" );
        nome1 = entrada.nextLine();
        
        System.out.println("Você digitou esses nomes:" +nome+", " +nome1);    
    }  
}
