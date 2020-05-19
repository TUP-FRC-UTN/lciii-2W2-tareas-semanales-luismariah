
package javaapplication41;


public abstract class cuenta 
{
    protected int numeroCuenta;
    protected String nombreCuenta;
    protected double saldo;

    public cuenta(int numeroCuenta, String nombreCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCuenta = nombreCuenta;
        this.saldo = 0;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }
    
    

    
    public void depositar(double importe) 
    {   
        saldo += importe;
    }
    
    public abstract void extraer(double importe);

    @Override
    public String toString() 
    {
        return "cuenta{" + "numeroCuenta=" + numeroCuenta + ", nombreCuenta=" + nombreCuenta + ", saldo=" + saldo + '}';
    }
    

}
