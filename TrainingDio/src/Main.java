import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.print("Digite uma letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")) ) {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;
        } while (count < consoantes.length);

        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            if(consoante != null) {
                System.out.print(consoante + " ");
            }
        }

        System.out.println("\nquantidade de consoantes: " + quantidadeConsoantes);

        System.out.println("Exercício quadrilátero: ");
        double areaQuadrado = sobrecarga.area(2);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areRetangulo = sobrecarga.area(3d, 6d);
        System.out.println("Area do Retângulo: " + areRetangulo);

        double areaTrapezio = sobrecarga.area(3,5,8);
        System.out.println("Area do Trapézio: " + areaTrapezio);

        double areaDiagonal = sobrecarga.area(4f,6f);
        System.out.println("Area da forma: " + areaDiagonal);

    }
}