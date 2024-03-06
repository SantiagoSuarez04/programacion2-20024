package Session4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    String elementoAgregar = scanner.nextLine();
                    lista.add(elementoAgregar);
                    System.out.println("Elemento agregado correctamente.");
                    break;
                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("La lista está vacía, no se puede eliminar ningún elemento.");
                    } else {
                        System.out.print("Ingrese el índice del elemento a eliminar (0 - " + (lista.size() - 1) + "): ");
                        int indiceEliminar = scanner.nextInt();
                        if (indiceEliminar >= 0 && indiceEliminar < lista.size()) {
                            String elementoEliminado = lista.remove(indiceEliminar);
                            System.out.println("Elemento '" + elementoEliminado + "' eliminado correctamente.");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Elementos en la lista:");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(i + ": " + lista.get(i));
                    }
                    break;
                case 4:
                    continuar = false;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
        scanner.close();
    }
}
