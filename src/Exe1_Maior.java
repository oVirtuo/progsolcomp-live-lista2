/* Nome do Aluno: José Vitor Cunha Barboza
* RA: 12523171336
* Nome do Programa: Maior entre 2
* Data: 21/05/2023
*/
import java.util.Scanner;

public class Exe1_Maior {
    public static void main(String[] args) throws Exception {
        //supondo que sejam dois números inteiros
        int a, b, x;
        Scanner input = new Scanner(System.in);
        
        //coletando os numeros
        System.out.println("Insira um número inteiro: ");
        a = input.nextInt();
        System.out.println("Insira outro número inteiro: ");
        b = input.nextInt();
    
        if (a > b){
            x = a;
        }
        else {
            x = b;
        }

        System.out.println("O maior número entre os dois inseridos é o "+ x);

        input.close();

    }
}
