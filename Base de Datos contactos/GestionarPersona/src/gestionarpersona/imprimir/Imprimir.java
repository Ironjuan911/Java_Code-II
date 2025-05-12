package gestionarpersona.imprimir;

public class Imprimir {
    
    public static void impEncabezado(){
      System.out.println("P. Nombre\t\tS. Nombre\t\tP. Apellido\t\tS. Apellido"+
              "\t\tEdad\t\tProfesion\t\tSueldo\t\tDocumento");
      System.out.println("=============================================================================================");
    }
    
    public static void imprimirFila(String[][] tabla, int fila){
      for(int col=0;col<tabla[fila].length;col++){
         System.out.print(tabla[fila][col]+"\t\t");
      }
      System.out.println("");
    }
    
    
}
