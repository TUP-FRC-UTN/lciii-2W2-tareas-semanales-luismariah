
package javaapplication41;


public class cuentaCorriente extends cuenta
{
    private double acuerdo;
    
    public cuentaCorriente(int numeroCuenta, String nombreCuenta) 
    { 
        super(numeroCuenta, nombreCuenta);
        this.acuerdo = acuerdo;
    }

    @Override
    public void extraer(double importe) 
    {
        if (importe <= (saldo + acuerdo)) 
        {
            saldo -= importe;
        }
    }
    
}
