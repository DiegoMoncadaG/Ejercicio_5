package Ejercicio_10;

import java.util.Scanner;

public class main_PagoMatricula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de inscripcion: ");
        String numeroInscripcion = scanner.nextLine();
        System.out.print("Ingrese los nombres del estudiante: ");
        String nombres = scanner.nextLine();
        System.out.print("Ingrese el patrimonio del estudiante: ");
        double patrimonio = scanner.nextDouble();
        System.out.print("Ingrese el estrato social del estudiante: ");
        int estrato = scanner.nextInt();

        PagoMatricula estudiante = new PagoMatricula(numeroInscripcion, nombres, patrimonio, estrato);

        System.out.println("\nResultado:");
        System.out.println(estudiante.obtenerInformacion());
    }
}
