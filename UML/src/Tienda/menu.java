package Tienda;
import iron_package.*;

public class menu {
    public void menuPrincipal() {
        boolean salir = false;
        String Warning = "";

        while (!salir) {
            F_System.clean_terminal();
            System.out.println(
                "Menu Principal\n" + 
                "1: Gestión de Tienda\n" +
                "2: Gestión de Computadores\n" +
                "3: Salir\n" + 
                Warning
            );

            switch (F_Input.Int_mode()) {
                case 1 -> menuTienda();
                case 2 -> System.out.println("Gestión de Computadores");
                case 3 -> salir = true;
                default -> Warning = "[Opción no válida]";

            }

        }
    }

    public void menuTienda() {
        boolean salir = false;

        while (!salir) {
            F_System.clean_terminal();
            System.out.println(

            );


        }
    }

}
