package tienda;

public class Tienda {

  private String nombre;

  private String propietario;

  private int identificadorTributario;

  private Computador[] listaComputadores;
  
  public Tienda(){
      listaComputadores = new Computador[10];
  }

  public Tienda(String nombre, String propietario, int identificadorTributario) {
      listaComputadores = new Computador[10];
      this.nombre = nombre;
      this.propietario = propietario;
      this.identificadorTributario = identificadorTributario;
  }

  public boolean añadir(Computador computador) {
      boolean exito = false;
      for(int i=0;i<listaComputadores.length;i++){
          if(listaComputadores[i] == null){
              listaComputadores[i] = computador;
              exito = true;
              break;
          }
      }
    return exito;  
  }

  
  public boolean modificar(Computador computador) {
      boolean exito = false;
      for(int i=0;i<listaComputadores.length;i++){
          if(listaComputadores[i] != null){
              if(listaComputadores[i].getMarca().equalsIgnoreCase(computador.getMarca())){
                listaComputadores[i] = computador; 
                exito = true; 
                break;
              }
                 
          }
      }
    return exito; 
  }  
  
  
  public boolean eliminar(String marcaComputador) {
      boolean exito = false;
      for(int i=0;i<listaComputadores.length;i++){
          if(listaComputadores[i] != null){
              if(listaComputadores[i].getMarca().equalsIgnoreCase(marcaComputador)){
                listaComputadores[i] = null; 
                exito = true; 
              }
                 
          }
      }
    return exito; 
  }

  public Computador buscar(String marcaComputador) {
      Computador computador = null;
      for(int i=0;i<listaComputadores.length;i++){
          if(listaComputadores[i] != null){
              if(listaComputadores[i].getMarca().equalsIgnoreCase(marcaComputador)){
                computador = listaComputadores[i];
                break;
              }
                 
          }
      }
    return computador;  
  }

    @Override
    public String toString() {
        return "Tienda{" + "nombre=" + nombre + ", propietario=" + propietario + ", identificadorTributario=" + identificadorTributario + '}';
    }

  public void imprimir() {
      System.out.println(toString());
      for(int i=0;i<listaComputadores.length;i++){
          if(listaComputadores[i] != null){
              System.out.println(listaComputadores[i].toString());
          }  
      }    
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
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     * @return the identificadorTributario
     */
    public int getIdentificadorTributario() {
        return identificadorTributario;
    }

    /**
     * @param identificadorTributario the identificadorTributario to set
     */
    public void setIdentificadorTributario(int identificadorTributario) {
        this.identificadorTributario = identificadorTributario;
    }

}