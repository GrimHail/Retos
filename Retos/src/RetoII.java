//Importamos la libreria de scanner
import java.util.Scanner;
public class RetoII {
    public static void main(String[] args) {
        //Declaracionde variables
        double pesoBebe, mesesBebe, dosisVacuna;
        String nombreEnfermera, nombreBebe, nombrePapaBebe, nombreMamaBebe;
        
        //Creamos la clase de scanner con el metodo new y campo System.in
        Scanner sc = new Scanner(System.in);
        
        //Imprimimos mensaje
        System.out.println("----------------------------------------------------------");
        System.out.println("Bienvenido al Programa");
        System.out.print("Digite el peso del bebe:");
        //Capturtamos variable
        //El next() asegura que el cursor de la consola haga un salto
        pesoBebe = sc.nextDouble();
        
        //Pedimos y capturamos las variables necesarias
        System.out.print("Digite los meses del bebe:");
        mesesBebe = sc.nextDouble();
        
        System.out.print("Digite el nombre del bebe:");
        nombreBebe = sc.nextLine();
        
        System.out.print("Digite el nombre del padre del bebe:");
        nombrePapaBebe = sc.nextLine();
        
        System.out.print("Digite el nombre de la mama del bebe:");
        nombreMamaBebe = sc.nextLine();
        
        System.out.print("Digite el nombre de la enfermera que atendera al bebe:");
        nombreEnfermera = sc.nextLine();
        
        System.out.println("----------------------------------------------------------");
        
        //Operacion o formula para conocer la cantidad de dosis de vacuna teniendo en cuenta el peso y meses del bebe
        dosisVacuna = ((pesoBebe + 10)/(mesesBebe * 10));
        
        //Imprimimos mensajes con System.out.println()
        //Mostramos los la informacion de los resultados
        System.out.println("Enfermera " + nombreEnfermera + ". Debe vacunar al bebe " + nombreBebe + " con una dosis de la vacuna, cantidad de" + dosisVacuna);
        System.out.println("La información personal del bebe es: ");
        System.out.println("Nombre del padre del bebe es: " + nombrePapaBebe);
        System.out.println("Nombre de la madre del bebe es: " + nombreMamaBebe);
        System.out.println("El peso del bebe es: " + pesoBebe);
        System.out.println("Los meses del bebe (edad) son: " + pesoBebe);
        System.out.println("----------------------------------------------------------");
        
        sc.close();
                
    }
    
}
