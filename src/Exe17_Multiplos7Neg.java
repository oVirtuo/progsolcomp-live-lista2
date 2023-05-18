/* Nome do Aluno: José Vitor Cunha Barboza
* RA: 12523171336
* Nome do Programa: Multiplos de -7 negativos ate -1000
* Data: 21/05/2023
*/

public class Exe17_Multiplos7Neg {
    public static void main(String[] args) {
        int numero = -7;

        //optei por fazer uma verificação extra dos multiplos de -7
        do {
            if(numero%-7 == 0){
                System.out.print(numero + " ");
            }
            numero -= 7;
        } while (numero > -1000);
    }
}
