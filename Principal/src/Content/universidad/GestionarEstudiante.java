package Content.universidad;

import java.util.ArrayList;

public class GestionarEstudiante {
    private ArrayList<Estudiante> ArrayEstudiante = new ArrayList<Estudiante>();

    public ArrayList<Estudiante> getArrayEstudiante() {
        return ArrayEstudiante;
    }

    public void addEstudiante(Estudiante estudiante){
        ArrayEstudiante.add(estudiante);
    }

    public int modificarEstudiante(int codigo, Estudiante InputEstudiante){
        if (codigo == 0) {
            System.out.println("Codigo invalido");
            return 0;
        }

        //Paso comprobaciones

        for (Estudiante estudiante : ArrayEstudiante) {
            if (estudiante.getCodigo() == codigo) {
                estudiante = InputEstudiante;
                estudiante.setCodigo(codigo);
            }
        }

        return 0;
    }

    public int eliminarEstudiante(int codigo){
        if (codigo == 0) {
            System.out.println("Codigo invalido");
            return 0;
        }

        for (Estudiante estudiante : ArrayEstudiante) {
            if (estudiante.getCodigo() == codigo) {
                ArrayEstudiante.remove(estudiante);
            }
        }

        return 0;
    }

}
