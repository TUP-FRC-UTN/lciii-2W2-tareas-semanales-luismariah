
package ejercicio.pkg2;

import java.util.Scanner;

public class Ejercicio2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de clientes: ");
        int cantidad = sc.nextInt();
        
        Cliente [] c = new Cliente[cantidad];
        
        for (int i = 0; i < c.length; i++) 
        {
            System.out.println("Introudzca el número de cliente "+(i+1));
            int nroCliente = sc.nextInt();
            
            System.out.println("Introduzca el nombre del cliente "+(i+1));
            sc.nextLine();
            String nomCliente = sc.nextLine();
           
            System.out.println("Introduzca la antigüedad del cliente "+(i+1));
            int antCliente = sc.nextInt();
            
            System.out.println("Introduzca el nombre de la mascota "+(i+1));
            sc.nextLine();
            String nomMascota = sc.nextLine();
                    
            System.out.println("Introduzca la edad de la mascota "+(i+1));
            int edadMascota = sc.nextInt();
            
            c[i] = new Cliente(nroCliente,nomCliente,antCliente,nomMascota,edadMascota);       
        }
        
        //MOSTRAR LA CANTIDAD DE CLIENTES
        
        System.out.println("La cantidad de clientes son: "+c.length);
        
        //MOSTRAR EL PROMEDIO DE EDAD DE MASCOTAS
        
        int acuEdad = 0;
        double promedio;
        
        for (int i = 0; i < c.length; i++) 
        {
            acuEdad += c[i].getEdadMascota();
        }
        
        promedio = (double)acuEdad / c.length;
        
        //CLIENTE CON ANTIGÜEDAD MAYOR A CINCO AÑOS
        
        int cantAnt = 0;
        
        for (int i = 0; i < c.length; i++) 
        {
            if (c[i].getAntCliente() > 5) 
            {
                cantAnt++;
            }
        }
        
        //SALIDAS
        
        System.out.println("El promedio de la edad de las mascotas es "+promedio);
        System.out.println("La cantidad de clientes con antigüedad mayo a cinco años es "+cantAnt);
    }
    
}
