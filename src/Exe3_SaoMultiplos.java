/* Nome do Aluno: José Vitor Cunha Barboza
* RA: 12523171336
* Nome do Programa: São multiplos?
* Data: 21/05/2023
*/
import java.util.Scanner;

public class Exe3_SaoMultiplos {

    public static void main (String[] args) throws Exception{
        
        int a,b;

        System.out.println("Vejamos se os números são múltiplos...");
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        a = input.nextInt();

        System.out.println("Insira o segundo número:");
        b = input.nextInt();

        //verificando se são multiplos
        if (a % b == 0) {
            System.out.println(a + " é múltiplo de " + b);
        } else if (b % a == 0) {
            System.out.println(b + " é múltiplo de " + a);
        } else {
            System.out.println("Os números não são múltiplos um do outro.");
        }
        input.close();

    }
    
}
