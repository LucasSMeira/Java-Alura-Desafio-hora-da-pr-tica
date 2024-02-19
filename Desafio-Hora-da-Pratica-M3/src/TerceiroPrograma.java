import java.util.Scanner;

public class TerceiroPrograma {

    private Scanner entrada;

    public TerceiroPrograma(){
        entrada = new Scanner(System.in);
    }

    public void executar(){
        int escolha;
        do{
            exibirMenu();
            System.out.println("Escolha sua opção:");
    
            escolha = Integer.parseInt(entrada.nextLine());
            tratarMenu(escolha);
        }while(escolha  != 3);
        
        entrada.close();
    }

    public void exibirMenu(){
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.println("3. sair");
    }

    private void tratarMenu(int opcao){
        switch (opcao) {
            case 1:
                calcularAreaQuadrado();
                break;
            case 2:
                calcularAreaTriangulo();
                break;
            case 3:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        if (opcao != 3) {
            System.out.println("\nDigite ENTER para continuar!");
            entrada.nextLine();
        }
    }

    public void calcularAreaQuadrado(){
        System.out.println("Digite o valor de um dos lados do quadrado:");
        int num =  Integer.parseInt(entrada.nextLine());
        System.out.println("A área do quadrado é: "+num*num);
        
    }

    public void calcularAreaTriangulo(){
        System.out.println("Digite o valor da base e da altura do triangulo:");
        int base =  Integer.parseInt(entrada.nextLine());
        int altura =  Integer.parseInt(entrada.nextLine());
        System.out.println("A área  do triangulo é: " +((base*altura)/2) );
    }

}
