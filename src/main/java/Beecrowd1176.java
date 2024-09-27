
import java.util.Scanner;

public class Beecrowd1176 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        //declarar array de Fibonacci
        long Fib[] = new long[61];
        Fib[0] = 0;
        Fib[1] = 1;
        for (int i = 2; i <= 60; i++) {
            Fib[i] = Fib[i - 2] + Fib[i - 1];
        }

        //declarar variável
        int T;

        //ler variável
        T = scanner.nextInt();

        //criar array com o valor lido
        int N[] = new int[T];

        //buscar os valores inseridos no array de Fibonacci
        for (int i = 0; i < T; i++) {
            N[i] = scanner.nextInt();
            System.out.printf("Fib(%d) = %d%n", N[i], Fib[N[i]]);
        }
    }
}
