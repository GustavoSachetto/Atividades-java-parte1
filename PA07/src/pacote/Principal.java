package pacote;
import java.util.Scanner; 

public class Principal {

    public static void main(String[] args) {
 
        /* Tipos de dados primitivos
        Valores Alfanumerico: VisualG --> caractere
        Ex: A / a / B / b / C / c / 1 / 2 / 3 / ...
        Valores alfanumericos:  JAVA --> String
        
        Valores Numericos Inteiros: VisualG --> inteiro
        Ex: 1 / 2 / 3 / 85694894 / ...
        Valores Numericos inteiros: JAVA --> integer 
        
        Valores Numericos Fracionados: VisualG --> Real
        Ex: 1,5 / 2,43 / 3,0 / 45,007 / ...
        Valroes Numericos Fracionados: JAVA --> Double
        Valores Numericos Fracionados: JAVA --> Float*/
        
        float n1, n2, area, per;
        Scanner entrada = new Scanner(System.in);       
        
        System.out.println("====== Bem Vindo ======");
        System.out.println("Digite a altura do retangulo:");
        n1 = entrada.nextFloat();
        
        System.out.println("Digite a largura do retangulo:");
        n2 = entrada.nextFloat();
        
        per = (n1+n2)*2;
        area = n1*n2;
        
        System.out.println("A area do retangulo é: "+area+"\nO perimetro do retangulo "+ 
        "é: "+per);
    }  
}
