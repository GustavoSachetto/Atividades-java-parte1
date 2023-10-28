package pacoteVariavel;
import java.util.Scanner;

public class Principal {  
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        nome = "Maria Eufrasina ";

        System.out.println("O nome dela é " +nome );
        
        System.out.println("Digite um novo nome:" );
        nome = entrada.nextLine();
        
        System.out.println("O nome dele(a) é:" +nome );
    }
}
