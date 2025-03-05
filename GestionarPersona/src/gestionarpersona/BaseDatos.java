package gestionarpersona;
import gestionarpersona.imprimir.Imprimir;
import java.util.Scanner;

public class BaseDatos {
     private Scanner sc;
     private Persona[] tabla;
     private Imprimir imp = null;
     
     public void inicializarAtributos(int filas){
        sc = new Scanner(System.in);
        tabla = new Persona[10];
        imp = new Imprimir();
     }
     private int buscarLibre(){
        int pos = -1;
        for(int i=0;i<tabla.length;i++){
           if(tabla[i] == null){
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
       float documento = sc.nextFloat();
       Persona persona = null;
       for(int f=0;f<tabla.length;f++){
         persona = tabla[f];
         if (persona != null){
            if(documento == (persona.getCedula())){
               pos = f;
               break;
            }
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
      Persona persona = tabla[pos];
      if(persona == null){
         persona = new Persona();

            System.out.println("Escriba el primer nombre");
            persona.setPrimerNombre(sc.next());
            System.out.println("Escriba el segundo nombre");
            persona.setSegundoNombre(sc.next());
            System.out.println("Escriba el primer apellido");
            persona.setPrimerApellido(sc.next());
            System.out.println("Escriba el segundo apellido");
            persona.setSegundoApellido(sc.next());
            System.out.println("Escriba la edad");
            persona.setEdad(sc.nextInt());
            System.out.println("Escriba la Profesion");
            persona.setProfesion(sc.next());
            System.out.println("Escriba el salario");
            persona.setSalario(sc.nextFloat());
            System.out.println("Escriba el numero de documento");
            persona.setCedula(sc.nextInt());

            tabla[pos] = persona;
      }
     }
     
    public boolean eliminar(){
      boolean exito = false;
      int pos = buscarDocumento();
      if(pos != -1){
         tabla[pos] = null;
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
         if(tabla[i] != null){ 
           imp.imprimirFila(tabla, i);
         }
      }
    }
    
     
}
