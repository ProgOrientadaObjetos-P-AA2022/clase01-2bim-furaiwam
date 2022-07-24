package herencia2;

import herencia1.EstudiantePresencial;

import java.util.Locale;
import java.util.Scanner;

public class Ejecutor2 {
    public static void main(String[] args) {

        EstudiantePresencial estPr = new EstudiantePresencial();
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Ingresar Nombre Estudiante:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese Apellido del estudiante:");
        String apellido = sc.nextLine();
        System.out.println("Ingrese la Identificacion: ");
        String identificacion =sc.nextLine();
        System.out.println("Ingrese la edad:");
        int edad = sc.nextInt();
        System.out.println("Ingrese la numero Credito:");
        int credito = sc.nextInt();
        System.out.println("Ingrese la costo Credito: ");
        int costo = sc.nextInt();

        estPr.calcularMatriculaPresencial();
        System.out.printf("%\n",estPr);
    }
}
