
package ejercicio.pkg1.vectores.y.poo;


class Jugadores 
{
    private String nombreJugador;
    private int posicion;
    private int nroCamiseta;
    private int cantPartJugados;
    private double porcEstadoFisico;

    public Jugadores(String nombreJugador, int posicion, int nroCamiseta, int cantPartJugados, double porcEstadoFisico) {
        this.nombreJugador = nombreJugador;
        this.posicion = posicion;
        this.nroCamiseta = nroCamiseta;
        this.cantPartJugados = cantPartJugados;
        this.porcEstadoFisico = porcEstadoFisico;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public int getCantPartJugados() {
        return cantPartJugados;
    }

    public void setCantPartJugados(int cantPartJugados) {
        this.cantPartJugados = cantPartJugados;
    }

    public double getPorcEstadoFisico() {
        return porcEstadoFisico;
    }

    public void setPorcEstadoFisico(double porcEstadoFisico) {
        this.porcEstadoFisico = porcEstadoFisico;
    }
    
    
}
