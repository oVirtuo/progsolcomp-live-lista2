/* Nome do Aluno: José Vitor Cunha Barboza
* RA: 12523171336
* Nome do Programa: Ordem Crescente
* Data: 21/05/2023
*/
import java.util.Scanner;

public class Exe2_OrdCresc {

    //metodo de ordenação bubbleSort(eu ja conheço esse metodo de ordenação de cursos)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // troca os elementos arr[j] e arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main (String[] args) throws Exception{
        int[] arr = new int[3];

        System.out.println("\nVamos botar ordem!!!");
        Scanner input = new Scanner(System.in);

        //coletando os dados
        System.out.println("Insira o primeiro número inteiro: ");
        arr[0] = input.nextInt();

        System.out.println("Insira o segundo número inteiro: ");
        arr[1] = input.nextInt();

        System.out.println("Insira o terceiro número inteiro: ");
        arr[2] = input.nextInt();

        //chamando a função que ordena, preferi fazer o mais simples, um bubblesort
        bubbleSort(arr);
        
        System.out.println("\nOs valores em ordem crescente são:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        input.close();
    }
    
}
