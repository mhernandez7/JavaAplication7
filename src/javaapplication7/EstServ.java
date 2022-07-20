
package javaapplication7;

/**
 *
 * @author Miguel
 */
public class EstServ {

    private double galon;
   
    private double tipoGaso;
    
    public EstServ(double galon, double valor, double tipoGaso) {
        
        this.galon = galon;
        
        this.tipoGaso = tipoGaso;
    }
    public EstServ()
    {
        this.galon = 0;
       
        this.tipoGaso = 0;
    }

    public double getGalon() {
        return galon;
    }

    public void setGalon(double galon) {
        this.galon = galon;
    }

    public double getTipoGaso() {
        return tipoGaso;
    }

    public void setTipoGaso(double tipoGaso) {
        this.tipoGaso = tipoGaso;
    }
    public double galonAlitros ()
    {
        this.galon = this.galon * 3.78541;
        
        return galon;
    }
    public double valorPagar()
    {
       double valor = 0;
        if(this.tipoGaso == 1)
        {
            valor = this.galon * 5.000;
        }
        else if(this.tipoGaso == 2)
        {
            valor = this.galon * 3.900;
        }
        else if(this.tipoGaso == 3)
        {
            valor = this.galon * 3.200;
        }
        else
        {
        System.out.println("No se ingresaron las opciones correctas");
        }
        
        return valor;
    }
    
    
}
