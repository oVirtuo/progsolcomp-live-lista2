/* Nome do Aluno: José Vitor Cunha Barboza
* RA: 12523171336
* Nome do Programa: Fazer a tabuada
* Data: 21/05/2023
*/
import java.util.Scanner;

public class Exe21_Tabuada {
    
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        int num;

        do{
            System.out.println("Vamos fazer a tabuada. Insira um número inteiro positivo: ");
            num = input.nextInt();

            if(num < 0){
                System.out.println("\nValor incorreto. tente novamente.\n ");
            }
        }while(num < 0);

        int prod;
        for(int i = 1; i <= num; i++){
            prod = num*i;
            System.out.println(i+" * "+num+" = "+prod);
        }


    }
}
