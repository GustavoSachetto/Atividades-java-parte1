package Pct;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1,n2;
        
        System.out.println("===== Bem Vindo =====");
        System.out.println("Esse programa faz a multiplicação do numero digitado se for\nmaior que 100, ele ira calcular o dobro");
        System.out.println("Digite um número:");
        n1 = entrada.nextInt();

        if(n1 >100){
            n2 =  n1 * 2;
            System.out.println("\nO seu calculo é: " +n2);
            System.out.println("Seu numero digitado: " +n1);
        } else {
            System.out.println("\nSeu numero é abaixo de 100, infelizmente não poderemos calcular ");
            System.out.println("Seu número é: " +n1);
        }
        
        System.out.println("Exercicio 2");
        
        int ex2;
        ex2 = n1 *3;
        
        if (ex2 >232) {
            System.out.println (" como o numero é >232, foi aplicado a multiplicação:\n" + n1 + " * 3 = "+ex2);
        } else {
            ex2 = (n1/2);
            System.out.println ("foi dividido o valor"+ ex2);
        }
    } 
}
