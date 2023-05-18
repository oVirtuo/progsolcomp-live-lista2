/* Nome do Aluno: José Vitor Cunha Barboza
* RA: 12523171336
* Nome do Programa: Calcular o tamanho do gas
* Data: 21/05/2023
*/
import java.util.Scanner;

public class Exe19_TamanhoGas {

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o volume inicial do Gás em centímetros cúbicos?");
        double volGas = input.nextDouble();

        int tempo = 1;

        while(volGas <= 1000){
            volGas *= 2;
            tempo++;   
        }

        System.out.println("O tempo necessário para que o gás seja maior que 1000 cm^3 é de "+ tempo + " segundos, e seu volume final é "+ volGas);

        input.close();
    }
    
}
