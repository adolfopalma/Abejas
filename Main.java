import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Panal panalAbejas = new Panal();

        int opcion;
        do {
            opcion = menu();

            switch (opcion) {

                case 1:
                    nuevaAbeja(panalAbejas);
                    break;

                case 2:
                    nuevoAbejorro(panalAbejas);
                    break;

                case 3:
                    visualizaAbejas(panalAbejas);
                    break;

                default:
                    System.out.println("Hasta pronto ");
            }

        } while (opcion != 4);
    }

    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n1 Añadir Abeja");
            System.out.println("2 Añadir Abejorro");
            System.out.println("3 Visualizar Panal ");
            System.out.println("4 Salir ");
            opcion = entrada.nextInt();
            if (opcion < 1 || opcion > 4) {
                System.out.println("Introduzca una opción válida ");
            }

        } while (opcion < 1 || opcion > 4);
        return opcion;
    }

    public static void nuevaAbeja(Panal panal) {
        Scanner entrada = new Scanner(System.in);
        String nombre;

        System.out.println("Introducir Nombre ");
        nombre = entrada.nextLine();

        panal.nuevaAbeja(nombre);
    }

    public static void nuevoAbejorro(Panal panal) {
        Scanner entrada = new Scanner(System.in);
        String nombre, color;

        System.out.println("Introducir Nombre ");
        nombre = entrada.nextLine();
        System.out.println("Introducir Color ");
        color = entrada.nextLine();

        panal.nuevoAbejorro(nombre, color);
    }

    public static void visualizaAbejas(Panal panal) {
        panal.visualizaAbejas();
    }
}
