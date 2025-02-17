package nomina;

public class Persona {
    private String nombre;
    private String cargo;
    private int numeroHora;
    private double valorHora;
    private double salario;

    public Persona(){
        System.out.println("Se ha creado una persona");
    }

    public Persona(String nombre, String cargo, int numeroHora, double valorHora){ 
        this.nombre = nombre;
        this.cargo = cargo;
        this.numeroHora = numeroHora;
        this.valorHora = valorHora;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the numeroHora
     */
    public int getNumeroHora() {
        return numeroHora;
    }

    /**
     * @param numeroHora the numeroHora to set
     */
    public void setNumeroHora(int numeroHora) {
        this.numeroHora = numeroHora;
    }

    /**
     * @return the valorHora
     */
    public double getValorHora() {
        return valorHora;
    }

    /**
     * @param valorHora the valorHora to set
     */
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
