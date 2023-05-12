import java.util.Scanner;
public class RetoVII {
    public static void main(String[] args) {
        //Declaramos las Variables que utilizamos
        String ladoMinuscula, ladoMoneda = null, preg;
        int numRandom, dine = 0, cont = 0;

        //Declaramos la clase de Scanner creando un objeto para capturar los datos
        Scanner sc = new Scanner(System.in);
         
        //Imprimimos un mensaje para solicitar al usuario su eleccion de piedra, papel o tijera
        System.out.println("Bienvenido al Videojuego de Carisellazo con Apuestas." );
        System.out.print("¿Quieres jugar? (si o no): ");
        preg = sc.next().toLowerCase();
        
        if (preg.equalsIgnoreCase("si")){
            System.out.print("¿Cuanto dinero quieres apostar? : $");
            //Capturamos el dato
            dine = sc.nextInt();
        } else {
            System.out.println("Lastima. Vuelve cuendo quieras jugar");
        }
        
        
        while (preg.equalsIgnoreCase("si")){
            System.out.println("¡VAMOS A JUGAR!");
            System.out.print(" Digita el lado de la moneda (cara, sello) que quieres elegir: ");
            ladoMinuscula = sc.next().toLowerCase();
            System.out.println("                                                                             ");
            System.out.println("=============================================================================");
            numRandom = (int) (Math.random()*2+1);
            if (numRandom == 1){
                ladoMoneda = "cara";
            }else if (numRandom == 2){                        
                ladoMoneda = "sello";
            }
            if (ladoMinuscula.equals(ladoMoneda)){
                System.out.println("!Bien hecho! Acertaste que el lado de la moneda que cayo es " + ladoMoneda );
                System.out.println("Recibes $500 mas por ganar, ahora tienes $" + (dine+=500));
                System.out.println("                                                                             ");
                System.out.println("=============================================================================");               
                System.out.print("¿Quieres seguir jugando? (si o no): ");
                preg = sc.next().toLowerCase();
            }else{
                System.out.println("Lastima! No acertaste. El lado de la moneda que cayo es " + ladoMoneda );
                System.out.println("Pierdes $500, ahora tienes $" + (dine-=500));
                System.out.println("                                                                             ");
                System.out.println("=============================================================================");
                System.out.print("¿Quieres seguir jugando? (si o no): ");
                preg = sc.next().toLowerCase();
            }
            cont+=1;
        }
        
        System.out.println("Jugaste un total de "+ cont + " veces. Y acumulaste un total de $" + dine);
        sc.close();
    }
}

//Programa para mostrar el simbolo del sodiaco