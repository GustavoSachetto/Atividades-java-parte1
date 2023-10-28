
package Pct;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

/*Usar scanners diferentes pra evitar problemas com bugs no futuro
    System.out.printLn e System.out.print , o ln quebra linha 
    Comando  DecimalFormat frmt = new DecimalFormat("#0.00"); serve para 
    aredondar os numeros decimais
    O else nunca aver condição apenas o if*/
    
    public static void main(String[] args) {
         
         Scanner entrada = new Scanner(System.in);
         Scanner leitor = new Scanner (System.in);
        
        String aluno,disc;
        Float n1,n2,n3,media;
        
        
         System.out.println("==== Bem vindo ====");
         System.out.println("\nSistema de calculo de média\n");
        System.out.println("Digite o nome do aluno: ");
        aluno = leitor.nextLine();
        
        System.out.println("Digite a disciplina: ");
        disc = leitor.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        n2 = entrada.nextFloat();
        
        System.out.println("Digite a terceira nota nota: ");
        n3 = entrada.nextFloat();
        
        DecimalFormat frmt = new DecimalFormat("#0.00");
        media = (n1+n2+n3)/3;
        
        System.out.println("===Informações===");
        System.out.println("Nome do aluno : "+aluno+"\n"
                + "Disciplina: "+disc+"\n"
                + "Media: "+frmt.format(media));
        
        if (media>=7) {
            System.out.println ("APROVADO");
        }
        else        
            if ((media>3) & (media <7)) {
                media = media + 1;
                System.out.println ("Acrescentado o ponto de atividade, sua nova media "+media);
            }  
        
            else
                System.out.println ("REPROVADO");
         System.out.println("Você está de recuperação!!" +media);
           
    } 
    
}
