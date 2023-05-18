/* Nome do Aluno: José Vitor Cunha Barboza
* RA: 12523171336
* Nome do Programa: Carga máxima do elevador
* Data: 21/05/2023
*/
import java.util.Scanner;

public class Exe20_CargaElevador {

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a carga máxima do elevador em kg: ");
        int cargaMaxima = input.nextInt();

        System.out.print("Digite a quantidade máxima de pessoas: ");
        int quantidadeMaxima = input.nextInt();

        int pesoTotal = 0;
        int quantidadePessoas = 0;

        do {
            System.out.print("Digite o peso da pessoa em kg: ");
            int pesoPessoa = input.nextInt();

            pesoTotal += pesoPessoa;
            quantidadePessoas++;

        } while (pesoTotal <= cargaMaxima && quantidadePessoas < quantidadeMaxima);

        System.out.println("O elevador atingiu a carga máxima ou o número máximo de pessoas.");
        System.out.println("Total de pessoas: " + quantidadePessoas);
        System.out.println("Peso total: " + pesoTotal + " kg");

        input.close();
    }
}