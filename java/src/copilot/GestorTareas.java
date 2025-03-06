package copilot;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorTareas {
    private static ArrayList<String> tareas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (opcion) {
                case 1:
                    agregarTarea(scanner);
                    break;
                case 2:
                    eliminarTarea(scanner);
                    break;
                case 3:
                    listarTareas();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    // Muestra el menú de opciones
    private static void mostrarMenu() {
        System.out.println("\nGestor de Tareas");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Eliminar tarea");
        System.out.println("3. Listar tareas");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Agrega una nueva tarea a la lista
    private static void agregarTarea(Scanner scanner) {
        System.out.print("Ingrese la descripción de la tarea: ");
        String tarea = scanner.nextLine();
        tareas.add(tarea);
        System.out.println("Tarea agregada.");
    }

    // Elimina una tarea de la lista por su índice
    private static void eliminarTarea(Scanner scanner) {
        listarTareas();
        System.out.print("Ingrese el número de la tarea a eliminar: ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < tareas.size()) {
            tareas.remove(indice);
            System.out.println("Tarea eliminada.");
        } else {
            System.out.println("Índice no válido.");
        }
    }

    // Lista todas las tareas
    private static void listarTareas() {
        System.out.println("\nLista de Tareas:");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println(i + ". " + tareas.get(i));
        }
    }
}