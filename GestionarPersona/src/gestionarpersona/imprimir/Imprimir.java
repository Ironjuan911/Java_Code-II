package gestionarpersona.imprimir;
import gestionarpersona.Persona;

public class Imprimir {
    
    public static void impEncabezado(){
      System.out.println("P. Nombre\t\tS. Nombre\t\tP. Apellido\t\tS. Apellido"+
              "\t\tEdad\t\tProfesion\t\tSueldo\t\tDocumento");
      System.out.println("=============================================================================================");
    }
    
    public static void imprimirFila(Persona[] tabla, int fila){
      Persona persona = tabla[fila];
      if (persona == null){
         System.out.println("No hay datos en la fila "+fila);
         return;
      }

      System.out.println(persona.toString());
    }
    
    
}
