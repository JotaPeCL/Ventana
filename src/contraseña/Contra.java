package contraseña;

import java.util.Random;

/**
 *
 * @author Juan Pablo Campos L
 */
public class Contra {

    private String contra, co = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz01234567890-*_@$.!¡?¿";
    private String may = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ", min = "abcdefghijklmnñopqrstuvwxyz", num = "01234567890", car = "-*_@$.!¡?¿";
    private Random ra = new Random();
    private int x, a , b , c , d ;
    private char carac;

    public String Generador() {
        do {
            contra = "";
            for (x = 0; x <= 7; x++) {
                carac += co.charAt(ra.nextInt(co.length()));
                contra =   contra+carac;
            }
        } while (!this.validar(contra));
        return contra;

    }

    private boolean validar(String contra) {
a=0;b=0;c=0;d=0;
        if (contra.length() ==8) {
            for (x = 0; x <= 7; x++) {
                if (may.contains("" + contra.charAt(x))) {
                    a++;
                } else if (min.contains("" + contra.charAt(x))) {
                    b++;
                } else if (num.contains("" + contra.charAt(x))) {
                    c++;
                } else if (car.contains("" + contra.charAt(x))) {
                    d++;
                }
            }
            if (a > 0 && b > 0 && c > 0 && d > 0) 
                return true;
        }
        return false;
//no estoy seguro de que la validacion me este saliendo bien profe 
//ya que me aparecen simbolos extraños cuando genero la contraseña
    }
    
    public void Generador1()
    {
        //generador si validacion
        for(x=0;x<=7;x++)
            contra += co.charAt(ra.nextInt(co.length()));
        System.out.println(contra);
    }
}
