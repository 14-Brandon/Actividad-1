import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos números primos desea ver? ");
        int cantidad = scanner.nextInt();
        int contador = 0;
        int numero = 2;

        while (contador < cantidad) {
            if (esPrimo(numero)) {
                System.out.println("#" + (contador + 1) + " = " + numero);
                contador++;
            }
            numero++;
        }
        scanner.close();
    }

    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
