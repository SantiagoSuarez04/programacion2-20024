package Session4;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Cereza");
        lista.add("Damasco");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el elemento a buscar: ");
        String elementoBuscado = scanner.nextLine();

        boolean encontrado = false;
        for (String elemento : lista) {
            if (elemento.equals(elementoBuscado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El elemento '" + elementoBuscado + "' fue encontrado en la lista.");
        } else {
            System.out.println("El elemento '" + elementoBuscado + "' no fue encontrado en la lista.");
        }

        scanner.close();
    }
}
