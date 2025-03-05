/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;
import java.util.Scanner;

public class Menu {
    Scanner sc = null;
    Tienda tienda = null;
    final String RESET = "\u001B[0m";   // Restablecer color
    final String NEGRO = "\u001B[30m";  // Negro
    final String ROJO = "\u001B[31m";   // Rojo
    final String VERDE = "\u001B[32m";  // Verde
    final String AMARILLO = "\u001B[33m"; // Amarillo
    final String AZUL = "\u001B[34m";   // Azul
    final String MAGENTA = "\u001B[35m"; // Magenta
    final String CYAN = "\u001B[36m";   // Cian
    final String BLANCO = "\u001B[37m";  // Blanco
  
    
    public Menu(){
        sc = new Scanner(System.in);
        sc.useDelimiter("\n");
    }
    
    public void menuPrincipal(){
        boolean salir = false;
        int opt = -1;
        while(salir == false){
            System.out.println(AZUL + "######MENU######");
            System.out.println(AZUL + "1. Gestionar Tienda");
            System.out.println(AZUL + "2. Gestionar Computador");
            System.out.println(AZUL + "3. Salir");
            System.out.println(AZUL + "################" + RESET);
            opt = sc.nextInt();
            switch(opt){
                case 1:
                    this.menuTienda();
                    break;
                case 2:
                    if(this.tienda != null){
                        this.menuComputador();
                    }else{
                        System.out.println("Primero debe existir un objeto de tipo tienda");
                    }    
                    break;                    
                default:
                    salir = true;
            }
    
        }
    }
    
    private void menuComputador(){
        boolean salir = false;
        int opt = -1; 
        boolean exito = false;
        while(salir == false){
           System.out.println(VERDE + "######MENU COMPUTADOR#####"+RESET);     
           System.out.println("#1. Agregar computador   #");
           System.out.println("#2. Modificar computador #");
           System.out.println("#3. Consultar computador #");
           System.out.println("#4. Eliminar computador  #");
           System.out.println("#5. Listar computador  #");
           System.out.println("#6. Salir                #");
           System.out.println(VERDE +"##########################"+RESET);
           opt = this.sc.nextInt();
           switch(opt){
               case 1:
                   exito = this.agregarComputador();
                   if(exito){
                       System.out.println("El computador pudo ser agregado");
                   }else{
                       System.out.println("El computador no pudo ser agregado");
                   }
                break;   
               case 2:
                   exito = this.modificarComputador();
                   if(exito){
                       System.out.println("El computador pudo ser modificado");
                   }else{
                       System.out.println("El computador no pudo ser modificado");
                   }
                break;     
               case 3:
                   this.consultarComputador();
                break;   
               case 4:
                   exito = this.eliminarComputador();
                   if(exito){
                       System.out.println("El computador pudo ser eliminado");
                   }else{
                       System.out.println("El computador no pudo ser eliminado");
                   }
                break;    
               case 5:
                   this.listarComputador();
                break;                   
               default:
                   salir = true;
           }
        }
    
    }
    
    private boolean agregarComputador(){
        boolean exito = false;
        if(tienda != null){
            System.out.println("Indique la marca del computador");
            String marca = this.sc.next();
            System.out.println("Indique la cantidad de memoria del computador");
            String cantidadMemoria = this.sc.next();
            System.out.println("Indique las caracteristicas del procesador del computador");
            String caracteristricasProcesador = this.sc.next();
            System.out.println("Indique el sistema operativo del computador");
            String sistemaOperativo = this.sc.next();
            System.out.println("Indique el precio del computador");
            double precio = this.sc.nextDouble();
            Computador computador = new Computador(marca, cantidadMemoria, caracteristricasProcesador, sistemaOperativo, precio);
            exito = tienda.añadir(computador);
        }else{
            System.out.println("No existe un objeto de tipo tienda creado");
        }        
        return exito;
    }
    
    
    private boolean modificarComputador(){
        boolean exito = false;
        if(tienda != null){
            System.out.println("Indique la marca del computador");
            String marca = this.sc.next();
            Computador computador = tienda.buscar(marca);
            if(computador != null){
                computador.setMarca(marca);
                System.out.println("Indique la cantidad de memoria del computador");
                computador.setCantidadMemoria(this.sc.next());
                System.out.println("Indique las caracteristicas del procesador del computador");
                computador.setCaracteristricasProcesador(this.sc.next());
                System.out.println("Indique el sistema operativo del computador");
                computador.setSistemaOperativo(this.sc.next());
                System.out.println("Indique el precio del computador");
                computador.setPrecio(this.sc.nextDouble());
                exito = tienda.modificar(computador);
            }    
        }else{
            System.out.println("No existe un objeto de tipo tienda creado");
        }        
        return exito;
    }   
    
    
    private void listarComputador(){
        if(tienda != null){
            tienda.imprimir();
        }else{
            System.out.println("No existe un objeto de tipo tienda creado");
        }        
    }    
    
     private void consultarComputador(){
        if(tienda != null){
            System.out.println("Indique la marca del computador");
            String marca = this.sc.next();
            Computador computador = tienda.buscar(marca);
            if(computador != null){
              System.out.println(computador.toString());
            }else{
              System.out.println("El computador con marca " + marca + " no fue encontrado");
            }    
        }else{
            System.out.println("No existe un objeto de tipo tienda creado");
        }        
    }     
    
     private boolean eliminarComputador(){
        boolean exito = false;
        if(tienda != null){
            System.out.println("Indique la marca del computador");
            String marca = this.sc.next();
            Computador computador = tienda.buscar(marca);
            if(computador != null){
              exito = tienda.eliminar(marca);
            }else{
              System.out.println("El computador con marca " + marca + " no fue encontrado");
            }    
        }else{
            System.out.println("No existe un objeto de tipo tienda creado");
        }        
        return exito;
    }     
    
    
    private void menuTienda(){
      int opt = -1;
      boolean salir = false;
      while(salir == false){
        System.out.println(MAGENTA + "######MENU TIENDA######" + RESET);
        System.out.println("#1. Agregar tienda    #");
        System.out.println("#2. Modificar tienda  #");
        System.out.println("#3. Consultar tienda  #");
        System.out.println("#4. Salir             #");
        System.out.println(MAGENTA + "#######################" + RESET);    
        opt = this.sc.nextInt();
        switch(opt){
            case 1:
                tienda = this.agregarTienda();
                if(tienda != null){
                    System.out.println("La tienda fue creada");
                }else{
                    System.out.println("La tienda no fue creada");
                }   
            break; 
            case 2:
                tienda = this.modificarTienda();
                if(tienda != null){
                    System.out.println("La tienda fue modificada");
                }else{
                    System.out.println("La tienda no fue modificada");
                }   
            break;      
            case 3:
                tienda = this.consultarTienda();
                break;
            default:
                salir = true;
        }
      }
      
    }
    
    
    private Tienda agregarTienda(){
        System.out.println("Escriba el nombre de la tienda");
        String nombre = this.sc.next();
        System.out.println("Escriba el nombre del propietario");
        String propietario = this.sc.next();
        System.out.println("Escriba el identificador tributario de la tienda");
        int identificadorTributario = this.sc.nextInt();        
        Tienda tienda = new Tienda(nombre, propietario, identificadorTributario);
        return tienda;
    }

    private Tienda modificarTienda(){
        if(tienda != null){
            System.out.println("Escriba el nombre de la tienda");
            tienda.setNombre(this.sc.next());
            System.out.println("Escriba el nombre del propietario");
            tienda.setPropietario(this.sc.next());
            System.out.println("Escriba el identificador tributario de la tienda");
            tienda.setIdentificadorTributario(this.sc.nextInt());        
        }else{
            System.out.println("No existe un objeto de tipo tienda creada");
        }
        return tienda;
    }   
    
    private Tienda consultarTienda(){
        if(tienda != null){
            System.out.println(tienda.toString());
        }else{
            System.out.println("No existe un objeto de tipo tienda creada");
        }
        return tienda;
    }      
    
 
    
}
