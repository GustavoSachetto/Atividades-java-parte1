package pct;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, r1, r2;
        
        System.out.println("Digite um numero: ");
        n1 = entrada.nextInt();
        
        System.out.println("Digite outro numero: ");
        n2 = entrada.nextInt();
        
        r1 = n1 + n2;
        r2 = n1 - n2;
        
        System.out.println("Soma dos numeros:" +r1+  "\n Subtração dos numeros: " +r2);
    }
}
