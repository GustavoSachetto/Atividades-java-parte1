package pct;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nasc, ano, idade, anoatual, idadeatual;
        String nome;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        nome = entrada.nextLine();
        
        System.out.println("Digite o ano que deseja descobrir sua idade: ");
        ano = entrada.nextInt ();
                    
        System.out.println("Digite o ano de nascimento: ");
        nasc = entrada.nextInt ();
           
        System.out.println("Ano atual:");
        anoatual = entrada.nextInt();
      
        idade = ano - nasc;
        idadeatual =   anoatual - nasc; 
        
        System.out.println(" \n \n");
        
        System.out.println("Seu nome é: " +nome+
        "\nA sua idade será: " +idade+
        "\n No ano de:" +ano+
        "\nSua idade atual é: " +idadeatual);
    }
}
