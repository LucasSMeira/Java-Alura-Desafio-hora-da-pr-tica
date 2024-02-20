import java.util.Scanner;

public class QuintoPrograma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número e descubra se ele é par ou ímpar");
        int num = Integer.parseInt(entrada.nextLine());

        int verifica = num%2;

        if(verifica == 1){
            System.out.println(" o número é ímpar");
        }
        else{
            System.out.println(" o número é par");
        }
        
        entrada.close();
    }
}
