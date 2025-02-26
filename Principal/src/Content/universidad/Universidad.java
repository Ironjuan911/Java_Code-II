package Content.universidad;

import iron_package.*;

public class Universidad {

    // public static F_Input F_Input = new F_Input();
    // public static F_System F_System = new F_System();


    public static Estudiante setEstudiante(){
        F_System.Output("Ingrese el codigo del estudiante", 0);
        return setEstudiante(F_Input.Int_mode());
    }

    public static Estudiante setEstudiante(int codigo){
        Estudiante estudiante = new Estudiante();
        estudiante.setCodigo(codigo);

        F_System.Output("Ingrese el nombre del estudiante", 0);
        estudiante.setNombre(F_Input.String_mode());
        F_System.Output("Ingrese la carrera del estudiante", 0);
        estudiante.setCarrera(F_Input.String_mode());
        F_System.Output("Ingrese la nota 1 del estudiante", 0);
        estudiante.setNota1(F_Input.Int_mode());
        F_System.Output("Ingrese la nota 2 del estudiante", 0);
        estudiante.setNota2(F_Input.Int_mode());
        F_System.Output("Ingrese la nota 3 del estudiante", 0);
        estudiante.setNota3(F_Input.Int_mode());

        return estudiante;
    }

    public static void main(String[] args) {
        GestionarEstudiante gestionarEstudiante = new GestionarEstudiante();

        while(true){
            F_System.Output(
                "1: Agregar Estrudiante",
                "2: Modificar Estudiante",
                "3: Eliminar Estudiante",
                "4: Mostrar Estudiantes",

                "",
                9
            );

            switch(F_Input.String_mode()){
                case "1" -> {
                    gestionarEstudiante.addEstudiante(setEstudiante());
                }

                case "2" -> {
                    F_System.Output("Ingrese el codigo del estudiante a modificar", 0);
                    int codigo = F_Input.Int_mode();
                    gestionarEstudiante.modificarEstudiante(codigo, setEstudiante(codigo));
                }

                case "3" -> {
                    F_System.Output("Ingrese el codigo del estudiante a eliminar", 0);
                    gestionarEstudiante.eliminarEstudiante(F_Input.Int_mode());
                }

                default -> {
                   F_System.Output("Opcion invalida", 9); 
                }
            }
        }

    }
}
