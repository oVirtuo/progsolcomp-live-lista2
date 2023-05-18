/* Nome do Aluno: José Vitor Cunha Barboza
* RA: 12523171336
* Nome do Programa: Calcular Hospedagem
* Data: 21/05/2023
*/
import java.util.Scanner;

public class Exe7_CalcHospedagem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valorDiaria = 60.00;

        System.out.println("Digite o número de diárias: ");
        int numeroDiarias = input.nextInt();

        double taxaServico;

        if (numeroDiarias > 15) {
            taxaServico = 5.50;
        } else if (numeroDiarias == 15) {
            taxaServico = 6.00;
        } else {
            taxaServico = 8.00;
        }

        double total = (valorDiaria + taxaServico) * numeroDiarias;

        System.out.println("O total da hospedagem é: R$ " + total);

        input.close();
    }
}
