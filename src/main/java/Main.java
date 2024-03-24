import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N para calcular H: ");
        int N = scanner.nextInt();

        double valorH = calcularH(N);

        System.out.println("O valor de H com " + N + " termos é: " + valorH);

        scanner.close();
    }

    public static double calcularH(int N) {
        double soma = 0.0;
        for (int i = 1; i <= N; i++) {
            soma += 1.0 / i;
        }
        return soma;
    }
}
