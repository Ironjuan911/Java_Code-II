package gestionarpersona;
import java.util.Scanner;
public class GestionarPersona {

    public static void main(String[] args) {
        int opt = 6;
        boolean salir = false;
        BaseDatos bd = new BaseDatos();
        bd.inicializarAtributos(3);
        while(salir == false){
           opt = menuPrincipal();
           if(opt == 1){
               bd.agregar();
           }else if(opt == 2){
               bd.modificar();
           }else if(opt == 3){
               bd.eliminar();
           }else if(opt == 4){
               bd.buscar();
           }else if(opt == 5){
               bd.listar();            
           }else{
              salir = true;
           }
        }      
    }
    
    private static int menuPrincipal(){
      Scanner leer = new Scanner(System.in);
      int opt = 6; 
      System.out.println("########MENU########");
      System.out.println("# 1. Agregar       #");
      System.out.println("# 2. Modificar     #");
      System.out.println("# 3. Eliminar      #");
      System.out.println("# 4. Buscar        #");
      System.out.println("# 5. Listar        #");
      System.out.println("# 6. Salir         #");
      System.out.println("####################");
      opt = leer.nextInt();
      //leer.close();
      return opt;
    }
    
}
