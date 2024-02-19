import java.util.Scanner;

public class SegundoPrograma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois números inteiros");

        int num1 = Integer.parseInt(entrada.nextLine());
        int num2 = Integer.parseInt(entrada.nextLine());

        int compare = Integer.compare(num1, num2);

        switch (compare) {
            case 0:
                System.out.println("Os números são iguais");
                break;
            case 1:
                System.out.println("Os números são diferentes e o primeiro é maior");
                break;
            case -1:
                System.out.println("Os números são diferentes e o segundo é maior");
                break;
        }
        entrada.close();
    }
}
