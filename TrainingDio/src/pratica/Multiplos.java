package pratica;

public class Multiplos {

    public static void main(String[] args) {

        int menor = 0, maior = 0;

        menor = 1;
        maior = 1;
        for(int i = 2; i <= 100; i++){
            if(i > maior){
                maior = i;
            } else if(i < menor) {
                menor = i;
            }
        }
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
    }
}
