
package programa10numeroprimo;

import java.util.Scanner;

/**
 *
 * @author Fabinhu
 */
public class Programa10NumeroPrimo {

 
    public static void main(String[] args) {
     /*
        Faça um programa que receba um número inteiro maior que 1, verifique se o
número fornecido é primo ou não. Um número é primo quando é divisível
apenas por 1 e por ele mesmo.
        */
    System.out.println("se um número é primo, basta dividirmos ele \n"
                + "por ele mesmo e todos os seus antecessores.\n\n");
     Scanner in = new Scanner(System.in);

         int numero = 0, contador=0, primo =0;   

     System.out.println("========> Numeros Primos <========");

        do{
        System.out.print("Digite o numero: ");
        numero=in.nextInt();
        
            for (contador; numero > contador ;contador++) {
            if((numero%contador)== 0 ||(numero%contador) ==1 ) {
                primo++;
               if(primo <= 2){ 
                    System.out.println("Este numero é primo!");
                } else {
                    System.out.println("Este numero não é primo!");
                       }
            }
        }    
    }while(numero != 1);
        in.close();
        System.out.println("Digite numero maior que 1\n"
                + "Numero Digitado => "+numero);
    }    
    }

