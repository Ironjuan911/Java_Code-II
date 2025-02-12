package Content.estudiante;

import iron_package.*;

public class Principal {
    public static void main(String[] args) {
    F_System.clean_terminal();

        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Juan";
        estudiante.programaAcademico = "Ingenieria de sistemas";
        estudiante.setCodigoAcademico(123456);
        estudiante.calcularNotaFinal(3.5f, 4.0f, 3.0f, 4.5f);
        estudiante.imprimirEstudiante();
    }
}
