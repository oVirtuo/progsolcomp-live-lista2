/* Nome do Aluno: José Vitor Cunha Barboza
* RA: 12523171336
* Nome do Programa: Conceito Aluno
* Data: 21/05/2023
*/
import java.util.Scanner;

public class Exe6_ConceitoAluno {
    public static void main(String[] args) {

        String conceito = "";
        int nota;

        Scanner input = new Scanner(System.in);

        do{

            System.out.println("Digite a nota do aluno (0 a 100): ");
            nota = input.nextInt();


            if (nota >= 0 && nota <= 49) {
                conceito = "Insuficiente";
            } else if (nota >= 50 && nota <= 64) {
                conceito = "Regular";
            } else if (nota >= 65 && nota <= 84) {
                conceito = "Bom";
            } else if (nota >= 85 && nota <= 100) {
                conceito = "Ótimo";
            } else {
                System.out.println("Nota inválida. Por favor, digite uma nota entre 0 e 100.");
            }

        }while(nota < 0 || nota > 100);

        System.out.println("O conceito do aluno é: " + conceito);

        input.close();
    }
    
}
