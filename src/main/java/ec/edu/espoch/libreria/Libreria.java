

package ec.edu.espoch.libreria;

import ec.edu.espoch.libreria.clases.Cliente;
import ec.edu.espoch.libreria.clases.Compras;
import ec.edu.espoch.libreria.clases.Libro;
import ec.edu.espoch.libreria.clases.enumeraciones.Genero;


public class Libreria {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente ("Eddy Laje", 001);
        Cliente cliente2 = new Cliente ("Anahi Andi", 002);
        
        Libro libro1 = new Libro ("El amor en los tiempos del colera", "Gabriel García Márquez",15.0,Genero.Ficcion);
        Libro libro2 = new Libro ("Sapiens: De animales a dioses", "Yuval Noah Harari",18.0,Genero.NoFiccion);
        
        
        Compras compra = new Compras();
        
        compra.mostrarDetalleLibro(libro1);
        compra.mostrarDetalleLibro(libro2);
        
        compra.mostrarClienteYProducto(cliente, libro1);
        compra.mostrarClienteYProducto(cliente2, libro1);
    }
}
