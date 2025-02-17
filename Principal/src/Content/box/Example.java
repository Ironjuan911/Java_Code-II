package Content.box;
import iron_package.F_System;

public class Example {
    public static void main(String[] args) {
        F_System.clean_terminal();
        Box box = new Box();
        box.setWidth(7.5f);
        box.setHeight(6.97f);
        box.setLength(2.0f);

        System.out.println(
            "El volumen de la caja es: " + box.getVolume()
        );
    }
}
