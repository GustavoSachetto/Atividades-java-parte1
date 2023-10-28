package pacote;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        int quantidade ;
        float valorunitario;
        float total ; 
        float totaldesconto=0 ;
        float porcentagem ;
        float desconto;

        System.out.print("informe o nome do produto: ");
        nome = entrada.nextLine();

        System.out.print("insira a quantidade de produto: \n");
        quantidade = entrada.nextInt();

        System.out.print("insira o valor do produto: \n");
        valorunitario = entrada.nextFloat();

        total = valorunitario*quantidade;  
        System.out.println("seu total é" + total);

        System.out.println(nome);
        
        if ((total>100) && (total<=250)) { 
            porcentagem = (total/100)*5 ; 
            totaldesconto = total-porcentagem ;
            System.out.println("seu valor com desconto é" + totaldesconto);
        }

        else if ((total>250) && (total<= 500)) { 
            porcentagem = (total/100)*7; 
            totaldesconto = total-porcentagem ;
            System.out.println("seu valor com desconto é" + totaldesconto);
        } else if  (total>500) { 
            porcentagem = (total/100)*10 ; 
            totaldesconto = total-porcentagem ;
            System.out.println("seu valor com desconto é" + totaldesconto);
        }
        desconto = total-totaldesconto ;
        System.out.println("seu desconto é de"+ desconto);
    
    } 
}
