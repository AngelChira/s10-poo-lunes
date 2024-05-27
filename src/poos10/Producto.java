package poos10;

import java.util.HashMap;
import java.util.Scanner;

public class Producto {
    private String codigo, nombre;
    private float precio;
    private int stock;

    public Producto(String codigo, String nombre, float precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public static void guardar(Producto producto, HashMap<String, Producto> listaProductos) {
        if (listaProductos.containsKey(producto.codigo)){
            System.out.println("Error, no se puede agregar producto");
        } else {
            listaProductos.put(producto.codigo, producto);
        }
    }
    
    public static void modificar(String codigo, HashMap<String, Producto> listaProductos){
        Scanner sc = new Scanner(System.in);
        if (listaProductos.containsKey(codigo)){
            Producto producto = listaProductos.get(codigo);
            System.out.println("1. Nombre: ");
            System.out.println("2. Precio: ");
            System.out.println("3. Stock: ");
            System.out.println("Seleccionar el atributo a modificar: ");
            byte opc = sc.nextByte();
            switch (opc) {
                case 1:
                    System.out.print("Nombre: ");
                    producto.nombre = sc.next();
                    break;
                case 2:
                    System.out.print("Precio: ");
                    producto.precio = sc.nextFloat();
                    break;
                case 3:
                    System.out.print("Stock: ");
                    producto.stock = sc.nextInt();
                    break;
                default:
                    System.out.println("Ingrese una opción valida.");;
            }
            listaProductos.put(codigo, producto);
        } else {
            System.out.println("El codigo ingresado no existe.");
        }
        
    }
    
    public static void mostrar(HashMap<String, Producto> listaProductos){
        for(Producto producto: listaProductos.values()) {
            
        }
    }
    
    public static void eliminar(String codigo, HashMap<String, Producto> listaProductos) {
        if (listaProductos.containsKey(codigo)) {
            listaProductos.remove(codigo);
            System.out.println("El producto se elimino correctamente.");
        } else {
            System.out.println("El codigo del producto no existe");
        }
    }
    
    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
    
}
