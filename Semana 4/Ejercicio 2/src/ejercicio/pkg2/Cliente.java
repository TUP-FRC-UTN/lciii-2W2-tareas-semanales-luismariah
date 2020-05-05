
package ejercicio.pkg2;


class Cliente 
{
    private int nroCliente;
    private String nomCliente;
    private int antCliente;
    private String nomMascota;
    private int edadMascota;

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public int getAntCliente() {
        return antCliente;
    }

    public void setAntCliente(int antCliente) {
        this.antCliente = antCliente;
    }

    public String getNomMascota() {
        return nomMascota;
    }

    public void setNomMascota(String nomMascota) {
        this.nomMascota = nomMascota;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public Cliente(int nroCliente, String nomCliente, int antCliente, String nomMascota, int edadMascota) {
        this.nroCliente = nroCliente;
        this.nomCliente = nomCliente;
        this.antCliente = antCliente;
        this.nomMascota = nomMascota;
        this.edadMascota = edadMascota;
    }

    @Override
    public String toString() 
    {
        return "Cliente:"+"\n"+
               "Número de Cliente = "+ nroCliente + "\n"+ 
               "Nombre Clientes = " + nomCliente + "\n"+
               "Antigüedad = " + antCliente + "\n"+
               "Nombre de Mascota = " + nomMascota + "\n"+
               "Edad Mascota = " + edadMascota+"\n";
    }
    
}
