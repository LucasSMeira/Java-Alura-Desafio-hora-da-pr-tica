import java.util.Scanner;

public class QuartoPrograma {
    public static void main(String[] args) {
        Scanner entrada  =  new Scanner(System.in);
        System.out.println("Digite um número e receba a desse número de 1 a 10");
        int num = Integer.parseInt(entrada.nextLine());
        int[] vetorDeInteriros = {0,1,2,3,4,5,6,7,8,9,10};
        
        for(int i=0;i<vetorDeInteriros.length;i++){
            System.out.println(num*vetorDeInteriros[i]);
        }
        
        entrada.close();
    }
    
}
