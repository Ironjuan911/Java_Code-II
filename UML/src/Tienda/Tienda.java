package Tienda;

import java.util.ArrayList;

public class Tienda {

  private String nombre;
  private String propietario;
  private Integer identificadorTributario;
  private ArrayList<Computador> listaComputadores;

  // Inicio encapsulado
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getPropietario() {
    return propietario;
  }

  public void setPropietario(String propietario) {
    this.propietario = propietario;
  }

  public Integer getIdentificadorTributario() {
    return identificadorTributario;
  }

  public void setIdentificadorTributario(Integer identificadorTributario) {
    this.identificadorTributario = identificadorTributario;
  }
  // Fin encapsulado



  public Tienda() {
    listaComputadores = new ArrayList<Computador>();
  }


  public Tienda(String nombre, String propietario, Integer identificadorTributario) {
    listaComputadores = new ArrayList<Computador>();

    this.nombre = nombre;
    this.propietario = propietario;
    this.identificadorTributario = identificadorTributario;
  }


  public void añadir(Computador computador) {
    listaComputadores.add(computador);
  }

  public Boolean eliminar(String marcaComputador) {

    for (int i = 0; i < listaComputadores.size(); i++){
      if (listaComputadores.get(i).getMarca().equals(marcaComputador)){
        listaComputadores.remove(i);
        return true;
      }
    }
    return false;
  }

  public Computador buscar(String marcaComputador) {
    for (int i = 0; i < listaComputadores.size(); i++){
      if (listaComputadores.get(i).getMarca().equals(marcaComputador)){
        return listaComputadores.get(i);
      }
    }
    return null;
  }



  @Override
  public String toString() {
    return "Tienda [nombre=" + nombre + ", propietario=" + propietario + ", identificadorTributario="
        + identificadorTributario + "]";
  }

  public void inprimir() {
    System.out.println(toString());

    for (int i = 0; i < listaComputadores.size(); i++){
      System.out.println(listaComputadores.get(i).toString());
    }
    
  }

}