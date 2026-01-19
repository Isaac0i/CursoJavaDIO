import java.sql.SQLOutput;
import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;


        System.out.println("Bem vinda(o) a calculadora.\nEstas são as opções: \nAdição.1 \nSubtração.2 \nDivisão.3 \nMultiplicação.4 \nSair.5");
        do {
            System.out.println("Escolha uma opcao: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.print("Informe o primeiro número: ");
                    int n1 = scan.nextInt();
                    System.out.print("Informe o segundo número: ");
                    int n2 = scan.nextInt();
                    System.out.println("O resultado é: " + somar(n1, n2));
                    break;
                }
                case 2: {
                    System.out.print("Informe o primeiro número: ");
                    int n1 = scan.nextInt();
                    System.out.print("Informe o segundo número: ");
                    int n2 = scan.nextInt();
                    System.out.println("O resultado é: " + subtrair(n1, n2));
                    break;
                }
                case 3: {
                    System.out.print("Informe o primeiro número: ");
                    int n1 = scan.nextInt();
                    System.out.print("Informe o segundo número: ");
                    int n2 = scan.nextInt();
                    System.out.println("O resultado é: " + dividir(n1, n2));
                    break;
                }
                case 4: {
                    System.out.print("Informe o primeiro número: ");
                    int n1 = scan.nextInt();
                    System.out.print("Informe o segundo número: ");
                    int n2 = scan.nextInt();
                    System.out.println("O resultado é: " + multiplicar(n1, n2));
                    break;
                }
                case 5: {
                    System.out.println("Saindo...");
                    break;
                }
                default: {
                    System.out.println("Oção invalida!");
                    break;
                }
            }

        }while (opcao != 5);
    }

    public static int somar (int a, int b){
        int resultado = a+b;
        return resultado;
    }

    public static int subtrair (int a, int b){
        return a-b;
    }

    public static int multiplicar (int a, int b){
        return a*b;
    }

    public static int dividir (int a, int b){
        return a/b;
    }
}
