/* Nome do Aluno: José Vitor Cunha Barboza
* RA: 12523171336
* Nome do Programa: Dados Pessoa
* Data: 21/05/2023
*/
import java.util.Scanner;

public class Exe5_DadosPessoa {

    public static void main (String[] args) throws Exception{

        String nome, sobrenome, naturalidade;
        char resposta;
        int idade;
        boolean ok = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Vamos coletar seus dados...\n");
        //coleta
        System.out.println("Insira seu primeiro nome:");
        nome = input.nextLine();
        System.out.println("Insira seu sobrenome:");
        sobrenome = input.nextLine();

        System.out.println("Insira sua naturalidade(cidade de nascimento):");
        naturalidade = input.nextLine();

        System.out.println("Insira sua idade:");
        idade = input.nextInt();

        do{
            System.out.println("Certo, gostaria de visualizar seus dados completos?\n[S] ou [N] ?");
            resposta = input.next().charAt(0);


        
            if (resposta == 'S'|| resposta == 's'){
                System.out.println("Nome: "+ nome);
                System.out.println("Sobrenome: "+ sobrenome);
                System.out.println("Idade: "+ idade);
                System.out.println("Naturalidade: "+ naturalidade);
                ok = true;
            }
            else if(resposta == 'N'|| resposta == 'n'){
                System.out.println("Nome: "+ nome);
                System.out.println("Idade: "+ idade);
                ok = true;
            }
            else{
                System.out.println("Digitação errada tente novamente!");
            }
        }while (ok == false);

        input.close();

    }
    
}
