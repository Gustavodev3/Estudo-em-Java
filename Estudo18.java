import java.util.Scanner;

public class Estudo18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero ");
            vect[i] = sc.nextInt();
        }

        int maior = vect[0];
        for (int i = 0; i < n; i++) {
            if (vect[i] > 0) {
                maior = vect[i];
            }
        }

        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }
        int resultado = soma;

        int pares = 0;
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("O maior número digitado: " + maior);
        System.out.println("A soma de todos os números são: " + resultado);
        System.out.println("Números pares: " + pares);

        sc.close();
    }
}