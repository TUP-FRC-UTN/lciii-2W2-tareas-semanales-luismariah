
package ejercicio.pkg1.vectores.y.poo;

import java.util.Scanner;

public class Ejercicio1VectoresYPoo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese el nombre del Equipo: ");
        sc.nextLine();
        String nombreEquipo = sc.nextLine();
        
        System.out.println("Ingrese la cantidad de puntos: ");
        int puntos = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de partidos ganados: ");
        int cantPartGanados = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de partidos empatados: ");
        int cantPartEmpatados = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de partidos perdidos: ");
        int cantPartPerdidos = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de goles realizados: ");
        int cantGolesRealizados = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de goles recibidos: ");
        int cantGolesRecibidos = sc.nextInt();
        
        System.out.println("Ingrese la posición del equipo: ");
        int posicion = sc.nextInt();
        
        System.out.println("Cantidad de Jugadores del equipo: ");
        int cantidadJugadores = sc.nextInt();
        
        Equipo e = new Equipo(nombreEquipo,puntos,cantPartGanados,cantPartEmpatados,cantPartPerdidos,cantGolesRealizados,cantGolesRecibidos,posicion,cantidadJugadores);
        
        for (int i = 0; i < cantidadJugadores; i++) 
        {
            System.out.println("Ingrese nombre del jugador ");
            sc.nextLine();
            String nombre = sc.nextLine();

            System.out.println("Ingrese la posición del jugador ");
            int posicionJugador = sc.nextInt();

            System.out.println("Ingrese la el numero de la camiseta del jugador ");
            int nroCamiseta = sc.nextInt();

            System.out.println("Ingrese la cantidad de partidos jugados del del jugador ");
            int cantJugados = sc.nextInt();

            System.out.println("Ingrese el porcentaje de estado físico del jugador ");
            int porcEstadoFisico = sc.nextInt();
            
            Jugadores jug = new Jugadores(nombre,posicionJugador,nroCamiseta,cantJugados,porcEstadoFisico);
            
            e.agregarJugador(jug);
        }
        
        System.out.println("Ingrese el número de camiseta para conocer su EF: ");
        int nroCamiseta = sc.nextInt();
        
        System.out.println("Cantidad de jugadores con menos de diez partidos jugados: "+e.cantidadJugadores());
        System.out.println("Nombre del jugador con mayor cantidad de partidos jugados: "+e.nombreJugador());
        System.out.println("Promedios del Estado Fisico de todo el equipo: "+e.promedioEstadoFisico());
        System.out.println("Estado fisico del jugador "+nroCamiseta+" es: "+e.estadoFisico(nroCamiseta));
        System.out.println("Promedio de partidos de jugadores de la posicion 1 es: "+e.promedioPosUno());
        System.out.println("Promedio de partidos de jugadores de la posicion 2 es: "+e.promedioPosDos());
        System.out.println("Promedio de partidos de jugadores de la posicion 3 es: "+e.promedioPosTres());
        System.out.println("Promedio de partidos de jugadores de la posicion 4 es: "+e.promedioPosCuatro());
    }    
}
