/* Nome do Aluno: José Vitor Cunha Barboza
* RA: 12523171336
* Nome do Programa: Valor total da venda
* Data: 21/05/2023
*/
import java.util.Scanner;

public class Exe9_ValorTotal {
     public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da venda: ");
        double valorVenda = input.nextDouble();

        int opcao;

        do{
            System.out.println("Escolha a condição de pagamento:");
            System.out.println("1. Venda à vista");
            System.out.println("2. Venda a prazo 30 dias");
            System.out.println("3. Venda a prazo 60 dias");
            System.out.println("4. Venda a prazo 90 dias");
            System.out.println("5. Venda com cartão de débito");
            System.out.println("6. Venda com cartão de crédito");

            opcao = input.nextInt();
            if(opcao < 1 || opcao > 6){
                System.out.println("\nOpção inválida.\n");
            }

        }while(opcao < 1 || opcao > 6);
        
        double totalVenda = 0.0;

        switch (opcao) {
            case 1:
                totalVenda = valorVenda * 0.9;
                break;
            case 2:
                totalVenda = valorVenda * 0.95;
                break;
            case 3:
                totalVenda = valorVenda;
                break;
            case 4:
                totalVenda = valorVenda * 1.05;
                break;
            case 5:
                totalVenda = valorVenda * 0.92;
                break;
            case 6:
                totalVenda = valorVenda * 0.93;
                break;
        }

        System.out.println("O total da venda é: R$ " + totalVenda);

        input.close();
    }




}
    

