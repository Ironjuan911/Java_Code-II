package tienda;

class Computador {

  private String marca;

  private String cantidadMemoria;

  private String caracteristricasProcesador;

  private String sistemaOperativo;

  private double precio;

    @Override
    public String toString() {
        return "Computador{" + "marca=" + marca + ", cantidadMemoria=" + cantidadMemoria + ", caracteristricasProcesador=" + caracteristricasProcesador + ", sistemaOperativo=" + sistemaOperativo + ", precio=" + precio + '}';
    }

  public Computador(String marca, String cantidadMemoria, String caracteristicasProcesador, String sistemaOperativo, double precio) {
    this.marca =marca;
    this.cantidadMemoria =cantidadMemoria;
    this.caracteristricasProcesador =caracteristicasProcesador;
    this.sistemaOperativo =sistemaOperativo;
    this.precio = precio;    
  
  }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the cantidadMemoria
     */
    public String getCantidadMemoria() {
        return cantidadMemoria;
    }

    /**
     * @param cantidadMemoria the cantidadMemoria to set
     */
    public void setCantidadMemoria(String cantidadMemoria) {
        this.cantidadMemoria = cantidadMemoria;
    }

    /**
     * @return the caracteristricasProcesador
     */
    public String getCaracteristricasProcesador() {
        return caracteristricasProcesador;
    }

    /**
     * @param caracteristricasProcesador the caracteristricasProcesador to set
     */
    public void setCaracteristricasProcesador(String caracteristricasProcesador) {
        this.caracteristricasProcesador = caracteristricasProcesador;
    }

    /**
     * @return the sistemaOperativo
     */
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    /**
     * @param sistemaOperativo the sistemaOperativo to set
     */
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}