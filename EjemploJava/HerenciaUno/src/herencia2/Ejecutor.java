package herencia2;
import herencia1.EstudianteDistancia;

public class Ejecutor {
    public static void main(String[] args) {


        EstudianteDistancia estudiante = new EstudianteDistancia();
        estudiante.establecerNombresEstudiante("Maria Isaac");
        estudiante.establecerApellidoEstudiante("Rene");
        estudiante.establecerIdentificacionEstudiante("110001");
        estudiante.establecerEdadEstudiante(23);
        estudiante.establecerCostoAsignatura(30);
        estudiante.establecerNumeroAsginaturas(5);

        estudiante.calcularMatriculaDistancia();

        System.out.printf("%s\n", estudiante);
    }
}

