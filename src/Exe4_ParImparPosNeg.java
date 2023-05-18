/* Nome do Aluno: José Vitor Cunha Barboza
* RA: 12523171336
* Nome do Programa: É par ou ímpar, positivo ou negativo?
* Data: 21/05/2023
*/
import java.util.Scanner;
    

public class Exe4_ParImparPosNeg {


    public static void main (String[] args) throws Exception{
        int a;

        System.out.println("Vejamos se número é par ou ímpar, positivo ou negativo.");
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        a = input.nextInt();

        if ((a/2)==1 && a >= 0){
            System.out.println("O número "+ a +" é par e positivo.");
        }
        else if (a==0){
            System.out.println("O número "+ a +" é par e positivo.");
        }
        else if((a/2)==1 && a <= 0){
            System.out.println("O número "+ a +" é par e negativo.");
        }
        else if((a/2)!=1 && a > 0){
            System.out.println("O número "+ a +" é ímpar e positivo.");
        }
        else{
            System.out.println("O número "+ a +" é ímpar e negativo.");
        }


        input.close();
    }
}
