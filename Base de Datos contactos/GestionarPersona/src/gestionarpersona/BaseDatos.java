package gestionarpersona;

import gestionarpersona.imprimir.Imprimir;
import java.util.Scanner;
import java.util.ArrayList;

public class BaseDatos {
     private Scanner sc;
     private String[][] tabla;
     private Imprimir imp = null;
     
     public void inicializarAtributos(int filas){
        sc = new Scanner(System.in);
        tabla = new String[filas][8];
        imp = new Imprimir();
     }
     private int buscarLibre(){
        int pos = -1;
        for(int i=0;i<tabla.length;i++){
           if(tabla[i][0] == null){
              pos = i;
              break;
           }
        }
        return pos;
     }
     
     public boolean agregar(){
       boolean exito = false;  
       int pos = buscarLibre();
       if(pos != -1){
          gestionar(pos);
          exito = true;
       }
     return exito;
     }
     
     private int buscarDocumento(){
       int pos = -1;
       System.out.println("Escriba el numero de documento");
       String documento = sc.next();
       for(int f=0;f<tabla.length;f++){
         if(documento.equals(tabla[f][7])){
            pos = f;
            break;
         }
       }
       return pos; 
     }
    public boolean modificar(){
      boolean exito = false;
      int pos = buscarDocumento();
      if(pos != -1){
         gestionar(pos);
         exito = true;
      }
      return exito;
    }
     
     
     
     private void gestionar(int pos){
          System.out.println("Escriba el primer nombre");
          tabla[pos][0] = sc.next();
          System.out.println("Escriba el segundo nombre");
          tabla[pos][1] = sc.next(); 
          System.out.println("Escriba el primer apellido");
          tabla[pos][2] = sc.next();
          System.out.println("Escriba el segundo apellido");
          tabla[pos][3] = sc.next();  
          System.out.println("Escriba la edad");
          tabla[pos][4] = sc.next(); 
          System.out.println("Escriba la Profesion");
          tabla[pos][5] = sc.next();   
          System.out.println("Escriba el salario");
          tabla[pos][6] = sc.next(); 
          System.out.println("El numero de documento");
          tabla[pos][7] = sc.next();    
     }
     
    public boolean eliminar(){
      boolean exito = false;
      int pos = buscarDocumento();
      if(pos != -1){
         for(int col =0;col<tabla[pos].length;col++){
           tabla[pos][col] = null;
         }
         exito = true;
      }
      return exito;
    }     
    
    public void buscar(){
       int pos = buscarDocumento();
       if(pos != -1){
          imp.impEncabezado();
          imp.imprimirFila(tabla, pos);
       }
    }
    
    public void listar(){
      imp.impEncabezado();
      for(int i=0;i<tabla.length;i++){
         if(tabla[i][0] != null){ 
           imp.imprimirFila(tabla, i);
         }
      }
    }
    
     
}
