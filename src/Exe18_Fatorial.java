/* Nome do Aluno: José Vitor Cunha Barboza
* RA: 12523171336
* Nome do Programa: Fatorial
* Data: 21/05/2023
*/
import java.util.Scanner;

public class Exe18_Fatorial {
    
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        System.out.println("Vamos calcular o fatorial do seu numero, pode inseri-lo:");
        int num = input.nextInt();

        int fat = 1;

        for(int i = 1; i <= num; i++){
            fat *= i;
        }

        System.out.println("O Fatorial de "+ num +" é: "+ fat);

        input.close();
    
    }
}
