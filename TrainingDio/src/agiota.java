import java.util.Scanner;

public class agiota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double resultado = 0;
        System.out.print("Informe o valor do emprestimo: ");
        double emprestimo = scan.nextInt();

        System.out.print("\nInforme o número de parcelas: ");
        int parcelas = scan.nextInt();

        if (parcelas <= 3){
            resultado = emprestimo * Math.pow(1 + 0.05, parcelas);
        } else if (parcelas <= 6){
            resultado = emprestimo * Math.pow(1 + 0.10, parcelas);
        }else if (parcelas <= 12){
            resultado = emprestimo * Math.pow(1 + 0.25, parcelas);
        }else {
            System.out.println("Quantidade de parcelas não aceita!");
        }

        System.out.println("O valor a pagar é: " + resultado);
    }
}
