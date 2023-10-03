import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 0, y = 0;

        System.out.println("Digite o número inicial: ");
        x = input.nextInt();

        System.out.println("Digite o número final: ");
        y = input.nextInt();

        try {
            contar(x, y);
        } catch (ParametrosInvalidosException e) {
            System.err.println("O número inicial deve ser menor que o número final para iniciar a contagem.");
        } finally {
            input.close();
        }
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2)
            throw new ParametrosInvalidosException();

        System.out.println("Iniciando contagem...");

        for (int x = num1; x <= num2; x++) {
            System.out.print(x + " ");
        }

        System.out.println("\nFim da contagem.");
    }
}
