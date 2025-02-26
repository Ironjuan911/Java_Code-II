package Tienda;


public class Computador {

  private String Marca;

  private Integer CantMemoria;

  private String CaracteristicasProcesador;

  private String SistemaOperativo;

  private Integer precio;

  //Inicio encapsulado

  public String getMarca() {
    return Marca;
  }

  public Integer getCantMemoria() {
    return CantMemoria;
  }

  public String getCaracteristicasProcesador() {
    return CaracteristicasProcesador;
  }

  public String getSistemaOperativo() {
    return SistemaOperativo;
  }

  public Integer getPrecio() {
    return precio;
  }
  
  //Fin encapsulado

  

  public Computador(String marca, Integer CantMemoria, String CaracteristicasProcesador, String SistemaOperativo, Integer precio) {
    this.Marca = marca;
    this.CantMemoria = CantMemoria;
    this.CaracteristicasProcesador = CaracteristicasProcesador;
    this.SistemaOperativo = SistemaOperativo;
    this.precio = precio;
  }

  @Override
  public String toString() {
    return "Computador [Marca=" + Marca + ", CantMemoria=" + CantMemoria + ", CaracteristicasProcesador="
        + CaracteristicasProcesador + ", SistemaOperativo=" + SistemaOperativo + ", precio=" + precio + "]";
  }

}