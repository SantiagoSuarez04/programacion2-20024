import java.util.Scanner;

public class PiramideInvertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("El número ingresado no es válido. Debe ser un entero positivo.");
        } else {
            for (int i = n; i >= 1; i--) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }
        
        scanner.close();
    }
}
