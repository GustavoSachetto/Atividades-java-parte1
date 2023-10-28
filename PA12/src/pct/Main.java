package pct;
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float peso, altura, imc;       
        
        System.out.println("========================================");
        System.out.println("Bem vindo ao programa IMC!!");
        System.out.println("Este programa calcula seu IMC,Índice de Massa Corporal (IMC).");
        System.out.println("===================================");
        
        System.out.println("Digite sua altura:");
        altura = entrada.nextFloat();
        
        System.out.println("Digite seu peso:");
        peso = entrada.nextFloat();
        
        imc = peso / (altura * altura);
        
        if (imc < 18.5) {
            System.out.println("Você está desnutrido");
        } else if ((imc >= 18.5) && (imc < 25)) {
            System.out.println("Você está com o peso ideal");
        } else if ((imc >= 25) && (imc < 40)) {
            System.out.println("Você esta com sobrepeso,procure um nutricionitsa");
        } else {
            System.out.println("PROCURE UM MÉDICO!!!, você está com imc exorbitante!");
        }  
    }     
} 



