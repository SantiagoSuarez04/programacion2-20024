package Session4;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaTareas {
    ArrayList<Tarea> tareas = new ArrayList<Tarea>();
    Scanner sc = new Scanner(System.in);

    public void addTarea() {
        System.out.println("cuantas tareas deseas agregar?");
        int Task_number = sc.nextInt();

        for (int i = 0; i < Task_number; i++) {
            System.out.println("nombre de la tarea:");
            String task_name = sc.next();
            System.out.println("duracion de la atrea:");
            int time_tarea = sc.nextInt();
            System.out.println("responsable:");
            String name_responsable = sc.next();
            System.out.println("estado de la tarea");
            String state = sc.next();

        }
    }
}
