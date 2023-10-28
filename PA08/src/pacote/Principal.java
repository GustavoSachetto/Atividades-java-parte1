package pacote;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String aluno, disc;
        Float n1, n2, n3, media;

        System.out.println("==== Bem vindo ====");
        System.out.println("\nSistema de calculo de média\n");
        System.out.println("Digite o nome do aluno: ");
        aluno = entrada.nextLine();
        
        System.out.println("Digite a disciplina: ");
        disc = entrada.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        n2 = entrada.nextFloat();
        
        System.out.println("Digite a terceira nota nota: ");
        n3 = entrada.nextFloat();
                   
        media = (n1+n2+n3)/3;
        
        System.out.println("===Informações===");
        System.out.println("\n\n\nNome do aluno : "+aluno+"\n" +
        "Disciplina: "+disc+"\n" +
        "Media: "+media);
    }  
}
