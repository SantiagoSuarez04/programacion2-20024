import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAdivinar = random.nextInt(100) + 1;
        int intento;
        
        System.out.println("¡Adivina el número, Está entre 1 y 100.");
        
        while (true) {
            System.out.print("Ingresa tu número: ");
            intento = scanner.nextInt();
            
            if (intento == numeroAdivinar) {
                System.out.println("Adivinaste el número");
                break;
            } else if (intento < numeroAdivinar) {
                System.out.println("El número es mayor que " + intento);
            } else {
                System.out.println("El número es menor que " + intento);
            }
        }
        
        scanner.close();
    }
}
