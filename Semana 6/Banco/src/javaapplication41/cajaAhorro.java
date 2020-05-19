
package javaapplication41;


public class cajaAhorro extends cuenta
{

    public cajaAhorro(int numeroCuenta, String nombreCuenta) {
        super(numeroCuenta, nombreCuenta);
    }
    
    @Override
    public void extraer(double importe) 
    {
        if (importe <= saldo) 
        {
            saldo -= importe;
        }
    }

}
