//Importamos la libreria de Scanner y de Random
import java.util.Scanner;
public class RetoVI {
    public static void main(String[] args) {
        //Creamos el objeto de la clase scanner instanciando la clase scanner
        Scanner sc = new Scanner(System.in);
        
        //Declaramos Variables
        int prec, precTotal = 0, numProducto, i;
        
        System.out.println("Bienvenido al Programa para saber el total de la compra");
        System.out.print("Digita el numero de productos que van a ser comprados: ");
        numProducto = sc.nextInt();
        System.out.println("Digita el precio de los productos.");
        
        for (i = 0; i < numProducto; i+=1){
            System.out.print("Producto N°"+(i+1)+": ");
            prec = sc.nextInt();
            precTotal = precTotal + prec;
        }
        
        System.out.println("Total a Pagar por los "+i+ " productos: $"+ precTotal);
        System.out.println("Gracias por comprar");
        sc.close();
        
    }
}
