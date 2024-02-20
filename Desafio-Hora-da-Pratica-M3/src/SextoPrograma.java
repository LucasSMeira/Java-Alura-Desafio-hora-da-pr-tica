import java.util.Scanner;

public class SextoPrograma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite qualquer número e descubra o fatorial do mesmo");
        int  num = Integer.parseInt(entrada.nextLine());

        long fatorial = 1;
        for(int i=1; i <= num; i++){
            fatorial*=  i;
        }


        System.out.println(fatorial);
        entrada.close();
    }
}
