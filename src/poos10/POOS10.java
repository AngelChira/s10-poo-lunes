package poos10;

import java.util.HashMap;
import java.util.Scanner;

public class POOS10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto producto;
        String codigo;
        HashMap<String, Producto> listaProductos = new HashMap<>();
        boolean f = true;
        while (f) {            
        System.out.println("1. Agregar Producto");
        System.out.println("2. Modificar Producto");
        System.out.println("3. Mostrar Producto");
        System.out.println("4. Eliminar Producto");
        System.out.println("5. Salir");
        System.out.println("Ingrese una opción: ");
        String op = sc.next();
        switch (op) {
            case "1":
                System.out.print("Codigo: ");
                String cod = sc.next();
                System.out.print("Nombre: ");
                String nom = sc.next();
                System.out.print("Precio: ");
                float price = sc.nextFloat();
                System.out.print("Stock: ");
                int stock = sc.nextInt();
                Producto.guardar(new Producto(cod, nom, price, stock), listaProductos);
                break;
            case "2":
                System.out.print("Ingrese el codigo del producto a modificar: ");
                codigo = sc.next();
                Producto.modificar(codigo, listaProductos);
                break;
            case "3":
                Producto.mostrar(listaProductos);
                break;
            case "4":
                System.out.println("Ingresar codigo del producto a elininar");
                codigo = sc.next();
                Producto.eliminar(codigo, listaProductos);
                break;
            case "5":
                f = false;
                break;
            default:
                throw new AssertionError();
        }
        
        }
    }
    
}
