
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double galon;
        double tipoGa;
        Scanner read = new Scanner(System.in);
        EstServ numeroG = new EstServ();
        
        System.out.println("ingrese la cantidad de galones a comprar: ");
        galon = read.nextDouble();
        
        System.out.println("Seleccione el tipo de gasolina. Para "
                + "Gasolina Premium extra ingrese (1), Premium (2)"
                + "o corriente(3)");
        tipoGa = read.nextDouble();
        
        numeroG.setGalon(galon);
        numeroG.setTipoGaso(tipoGa);
        
        
        System.out.println("la cantidad de galones solicitada es: "+numeroG.getGalon());
        System.out.println("la cantidad convertida a  litros es: "+numeroG.galonAlitros());
        System.out.println("el valor a pagar es: "+numeroG.valorPagar());
        
    }
    
}
