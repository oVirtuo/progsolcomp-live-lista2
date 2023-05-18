/* Nome do Aluno: José Vitor Cunha Barboza
* RA: 12523171336
* Nome do Programa: Valor menor que zero
* Data: 21/05/2023
*/
import java.util.Scanner;

public class Exe16_MenorZero {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        int num = 0;
        while(num >= 0){
            System.out.println("Digite um número menor que zero: ");
            num = input.nextInt();

            if(num >= 0){
                System.out.println("Valor digitado incorreto. Tente novamente.\n");
            }
        
        }

        System.out.println("Fim!");

        input.close();
    }

}
