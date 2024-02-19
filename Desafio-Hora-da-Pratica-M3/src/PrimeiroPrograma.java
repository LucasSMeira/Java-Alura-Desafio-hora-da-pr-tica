import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor de um número qualquer e te direi se ele é positivo ou negativo!");
        int num = Integer.parseInt(entrada.nextLine());

        if(num > 0){
            System.out.println("Número positivo");
        }
        else if(num < 0){
            System.out.println("Número negativo");
        }
        else{
            System.out.println("Número inexistente!");
        }
    
        entrada.close();
    }
}
