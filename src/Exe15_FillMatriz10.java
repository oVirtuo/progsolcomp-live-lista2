/* Nome do Aluno: José Vitor Cunha Barboza
* RA: 12523171336
* Nome do Programa: Preencher matriz de 10 por 10
* Data: 21/05/2023
*/

public class Exe15_FillMatriz10 {

    public static void main(String[] args) throws Exception{
        int[][] matriz = new int[10][10];
        int n = matriz.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                matriz [i][j] = 0;    
                System.out.print(matriz[i][j]+" ");       
            }
            System.out.println(); 
        }
        

    }
    
}
