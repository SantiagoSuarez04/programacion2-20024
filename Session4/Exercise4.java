package Session4;
import java.util.ArrayList;
import java.util.Scanner;

class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    // Métodos para acceder y modificar los atributos del contacto
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + telefono + ", Email: " + email;
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<Contacto> listaContactos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto por nombre");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("5. Actualizar información de contacto");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de nextInt()

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el teléfono del contacto: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese el email del contacto: ");
                    String email = scanner.nextLine();
                    Contacto nuevoContacto = new Contacto(nombre, telefono, email);
                    listaContactos.add(nuevoContacto);
                    System.out.println("Contacto agregado correctamente.");
                    break;
                case 2:
                    if (listaContactos.isEmpty()) {
                        System.out.println("La lista de contactos está vacía.");
                    } else {
                        System.out.print("Ingrese el nombre del contacto a eliminar: ");
                        String nombreEliminar = scanner.nextLine();
                        boolean eliminado = false;
                        for (Contacto contacto : listaContactos) {
                            if (contacto.getNombre().equalsIgnoreCase(nombreEliminar)) {
                                listaContactos.remove(contacto);
                                System.out.println("Contacto eliminado correctamente.");
                                eliminado = true;
                                break;
                            }
                        }
                        if (!eliminado) {
                            System.out.println("El contacto no se encontró en la lista.");
                        }
                    }
                    break;
                case 3:
                    if (listaContactos.isEmpty()) {
                        System.out.println("La lista de contactos está vacía.");
                    } else {
                        System.out.print("Ingrese el nombre del contacto a buscar: ");
                        String nombreBuscar = scanner.nextLine();
                        boolean encontrado = false;
                        for (Contacto contacto : listaContactos) {
                            if (contacto.getNombre().equalsIgnoreCase(nombreBuscar)) {
                                System.out.println("Contacto encontrado:");
                                System.out.println(contacto);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("El contacto no se encontró en la lista.");
                        }
                    }
                    break;
                case 4:
                    if (listaContactos.isEmpty()) {
                        System.out.println("La lista de contactos está vacía.");
                    } else {
                        System.out.println("Lista de contactos:");
                        for (Contacto contacto : listaContactos) {
                            System.out.println(contacto);
                        }
                    }
                    break;
                case 5:
                    if (listaContactos.isEmpty()) {
                        System.out.println("La lista de contactos está vacía.");
                    } else {
                        System.out.print("Ingrese el nombre del contacto a actualizar: ");
                        String nombreActualizar = scanner.nextLine();
                        boolean actualizado = false;
                        for (Contacto contacto : listaContactos) {
                            if (contacto.getNombre().equalsIgnoreCase(nombreActualizar)) {
                                System.out.print("Ingrese el nuevo número de teléfono: ");
                                String nuevoTelefono = scanner.nextLine();
                                System.out.print("Ingrese el nuevo email: ");
                                String nuevoEmail = scanner.nextLine();
                                contacto.setTelefono(nuevoTelefono);
                                contacto.setEmail(nuevoEmail);
                                System.out.println("Contacto actualizado correctamente.");
                                actualizado = true;
                                break;
                            }
                        }
                        if (!actualizado) {
                            System.out.println("El contacto no se encontró en la lista.");
                        }
                    }
                    break;
                case 6:
                    continuar = false;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }

        // Cerramos el scanner al salir del bucle
        scanner.close();
    }
}
