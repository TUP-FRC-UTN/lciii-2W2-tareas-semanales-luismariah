
package ejercicio.pkg3;


public class Producto 
{
    private String descripcion;
    private Material [] m;

    public String getDescripcion() 
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }

    public Producto(String descripcion, int cantidad) 
    {
        this.descripcion = descripcion;
        Material[] m = new Material [cantidad];
    }
    
    public void agregarMaterial(Material mat)
    {
        for (int i = 0; i < m.length; i++) 
        {
            if (m[i] == null) 
            {
                m[i] = mat;
                
                break;
            }
        }
    }
    
    public double costoTotal()
    {
        double costo = 0;
        
        for (int i = 0; i < m.length; i++) 
        {
            if (m[i] != null) 
            {
                costo += m[i].getValorUnitario();
            }   
        }
        return costo;
    }
    
    public boolean formaParte(int codigo) 
    {
        boolean formaParte = false;
        
        for (int i = 0; i < m.length; i++) 
        {
            if(m[i] != null && codigo == m[i].getCodigo())
            {
                formaParte = true;
            }
        }
        return formaParte;
    }
    
    /* EN ESTE CASO NO SE COMO HACER PARA HACER UN MÉTODO QUE DEVUELVA UN ARREGLO
    public String retornarVector(double param)
    {
        Material [] ma = new Material [20];
        
        for (int i = 0; i < ma.length; i++) 
        {
            if (ma[i] == null && param > m[i].getValorUnitario()) 
            {
                ma[i] = m[i];
            } 
        }
    }  
*/
}
