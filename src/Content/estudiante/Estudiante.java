package Content.estudiante;

public class Estudiante {
    private int codigoAcademico;
    public String nombre;
    public String programaAcademico;
    public float promedioAcademico;


    public void setCodigoAcademico(int codigoAcademico) {
        this.codigoAcademico = codigoAcademico;
    }

    public float calcularNotaFinal(float parcial1, float parcial2, float nota3, float parcialfinal) {
        this.promedioAcademico = (parcial1 + parcial2 + nota3)*(70.01f/300.0f) + parcialfinal*(0.3f);
        return this.promedioAcademico;
    }

    public void imprimirEstudiante() {
        System.out.println(
            "Codigo: " + codigoAcademico + '\n' +
            "Nombre: " + nombre + '\n' +
            "Programa: " + programaAcademico + '\n' +
            "Promedio: " + promedioAcademico + '\n'

        );

    }
}
