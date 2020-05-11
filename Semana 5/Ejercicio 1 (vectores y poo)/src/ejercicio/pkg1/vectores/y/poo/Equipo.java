
package ejercicio.pkg1.vectores.y.poo;

public class Equipo 
{
    private String nombreEquipo;
    private int puntos;
    private int cantPartGanados;
    private int cantPartEmpatados;
    private int cantPartPerdidos;
    private int cantGolesRealizados;
    private int cantGolesRecibidos;
    private int posicion;
    private Jugadores [] j;

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getCantPartGanados() {
        return cantPartGanados;
    }

    public void setCantPartGanados(int cantPartGanados) {
        this.cantPartGanados = cantPartGanados;
    }

    public int getCantPartEmpatados() {
        return cantPartEmpatados;
    }

    public void setCantPartEmpatados(int cantPartEmpatados) {
        this.cantPartEmpatados = cantPartEmpatados;
    }

    public int getCantPartPerdidos() {
        return cantPartPerdidos;
    }

    public void setCantPartPerdidos(int cantPartPerdidos) {
        this.cantPartPerdidos = cantPartPerdidos;
    }

    public int getCantGolesRealizados() {
        return cantGolesRealizados;
    }

    public void setCantGolesRealizados(int cantGolesRealizados) {
        this.cantGolesRealizados = cantGolesRealizados;
    }

    public int getCantGolesRecibidos() {
        return cantGolesRecibidos;
    }

    public void setCantGolesRecibidos(int cantGolesRecibidos) {
        this.cantGolesRecibidos = cantGolesRecibidos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Equipo(String nombreEquipo, int puntos, int cantPartGanados, int cantPartEmpatados, int cantPartPerdidos, int cantGolesRealizados, int cantGolesRecibidos, int posicion, int cantidadJugadores) {
        this.nombreEquipo = nombreEquipo;
        this.puntos = puntos;
        this.cantPartGanados = cantPartGanados;
        this.cantPartEmpatados = cantPartEmpatados;
        this.cantPartPerdidos = cantPartPerdidos;
        this.cantGolesRealizados = cantGolesRealizados;
        this.cantGolesRecibidos = cantGolesRecibidos;
        this.posicion = posicion;
        Jugadores [] j = new Jugadores [cantidadJugadores];
    }
    
    
    
    public void agregarJugador (Jugadores jug)
    {
        for (int i = 0; i < j.length; i++) 
        {
            if(j[i] == null)
            {
                j[i] = jug;
                
                break;
            }    
        }
    }
    
    public int cantidadJugadores()
    {
        int cant = 0;
        
        for (int i = 0; i < j.length; i++) 
        {
            if (j[i] != null && j[i].getCantPartJugados() < 10)
            {
                cant++;
            }
        }
        return cant;
    }
    
    public String nombreJugador() 
    {
        String nombreJugador = "";
        Jugadores aux = j[0];
        
        for (int i = 0; i < j.length; i++) 
        {
            if (j[i] != null && j[i].getCantPartJugados() < j[0].getCantPartJugados())
            {
                 nombreJugador = j[0].getNombreJugador();
            }
        }
        return nombreJugador;
    }
    
    public double promedioEstadoFisico() 
    {
        double promedio;
        double acu = 0;
        int cant = 0;
        
        for (int i = 0; i < j.length; i++) 
        {
            if (j[i] != null)
            {
                acu += j[i].getPorcEstadoFisico();
                cant++;        
            } 
        }
        return promedio = acu/cant;
    }
    
    public double estadoFisico (int nroCamiseta) 
    {
        double estadoFisico = 0;
        
        for (int i = 0; i < j.length; i++) 
        {
            if (j[i] != null && nroCamiseta == j[i].getNroCamiseta()) 
            {
                estadoFisico = j[i].getPorcEstadoFisico();
            }            
        }
        return estadoFisico;
    }
    
    
    public double promedioPosUno() 
    {
        double promedioPosUno;
        double acuUno = 0;
        int cantUno = 0;
        
        for (int i = 0; i < j.length; i++) 
        {
            if(j[i] != null && j[i].getPosicion() == 1) 
            {
                acuUno += j[i].getCantPartJugados();
                cantUno++;
            }
        }
        return promedioPosUno = acuUno / cantUno;
    }
    
    public double promedioPosDos() 
    {
        double promedioPosDos;
        double acuDos = 0;
        int cantDos = 0;
        
        for (int i = 0; i < j.length; i++) 
        {
            if(j[i] != null && j[i].getPosicion() == 2) 
            {
                acuDos += j[i].getCantPartJugados();
                cantDos++;
            }
        }
        return promedioPosDos = acuDos/cantDos;
    }
    
    public double promedioPosTres() 
    {
        double promedioPosTres;
        double acuTres = 0;
        int cantTres = 0;
        
        for (int i = 0; i < j.length; i++) 
        {
            if(j[i] != null && j[i].getPosicion() == 3) 
            {
                acuTres += j[i].getCantPartJugados();
                cantTres++;
            }
        }
        return promedioPosTres = acuTres/cantTres;
    }
    
    public double promedioPosCuatro() 
    {
        double promedioPosCuatro;
        double acuCuatro = 0;
        int cantCuatro = 0;
        
        for (int i = 0; i < j.length; i++) 
        {
            if(j[i] != null && j[i].getPosicion() == 2) 
            {
                acuCuatro += j[i].getCantPartJugados();
                cantCuatro++;
            }
        }
        return promedioPosCuatro = acuCuatro/cantCuatro;
    }
}   

