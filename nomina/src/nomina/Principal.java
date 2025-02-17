package nomina;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        Persona persona = null;
        Nomina nomina = new Nomina();
        int opt = -1;
        while(salir == false){
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Calcular Nomina");
            System.out.println("3. Imprimir Nomina");
            System.out.println("4. Salir");
            opt = sc.nextInt();
                switch(opt){
                    case 1:
                        System.out.println("Indique el nombre");
                        String nombre = sc.next();
                        System.out.println("Indique el cargo");
                        String cargo = sc.next();
                        System.out.println("Indique el numero de horas");
                        int numeroHora = sc.nextInt();
                        System.out.println("Indique el valor hora");
                        double valorHora = sc.nextDouble();
                        persona = new Persona(nombre, cargo, numeroHora, valorHora);
                        
                        break;
                    case 2:
                        persona.setSalario(nomina.calcularSalario(persona));
                        break;
                    case 3:
                        nomina.imprimirNomina(persona);
                        break;
                    default:
                        System.out.println("Seleccion no valida"); 
                        salir = true;
                }
        }
        sc.close();
    }
    
}
