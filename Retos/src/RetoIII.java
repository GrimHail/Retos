//Instanciamos la libreria de Scanner
import java.util.Scanner;

public class RetoIII {
    public static void main(String[] args) {
        //Declaramos las Variables que utilizamos
        String lado, preg, ladoMoneda = null ;
        int numRandom;

        //Instanciamos la clase de Scanner creando un objeto para capturar los datos
        Scanner sc = new Scanner(System.in);
         
        //Imprimimos un mensaje para solicitar al usuario su eleccion de piedra, papel o tijera
        System.out.println("Bienvenido al Videojuego de Carisellazo." );
        

        //Usamos la condicion de switch
        System.out.println("¿Quieres jugar?");
        //Capturamos el dato
        preg = sc.next();
        //Ciclo para saber si quiere jugar
        switch (preg.toLowerCase()){
            case "si":

                //Imprimimos mensajes de buienvenida
                System.out.println("¡VAMOS A JUGAR!");
                System.out.print(" Digita el lado de la moneda (cara, sello) que quieres elegir: ");
                //Capturamos el lado de la moneda que quiere el usuario
                lado = sc.next();

                //Generamos el numero random con la clase de MATH y el metodo random()
                numRandom = (int)(Math.random()*2+1);

                //Condicionales para que el sistema escoga un lado
                if (numRandom == 1){
                    ladoMoneda = "cara";
                }else if (numRandom == 2){
                    ladoMoneda = "sello";
                }

                if (lado.toLowerCase().equals(ladoMoneda)){
                    System.out.println("!Bien hecho! Acertaste que el lado de la moneda que cayo es " + ladoMoneda );
                }else{
                    System.out.println("Lastima! No acertaste. El lado de la moneda que cayo es " + ladoMoneda );
                }
                break;
            case "no":
                System.out.println("Lastima, sera en otro momento");
                System.out.println("Vuelve cuando quieras");  
                break;
            default:
                System.out.println("El dato ingresado no es valido.");
                System.out.println("VUELVE A INTENTAR");
                break;
        }
        
        
        sc.close();
    }
}

/*
 * Tarea
 * Utilizando los metodos mejorar la calculadora
 * 
 * Hacer un programa  para jugar ahorcados usando condicionales anidados o multiplie
 * 
 * Un diagrama de flujo con ciclo definifdo y d un ciclo indefinido
 * 
 * Hacer un piedra papel o tijeras con condicionales y otro de bucles
 * 
 
 EJERCICIO CON DO-
 
  //Instanciamos la libreria de Scanner
import java.util.Scanner;

public class RetoIII {
    public static void main(String[] args) {
        //Declaramos las Variables que utilizamos
        String lado, ladoMinuscula, preg, pregMinuscula, ladoMoneda = null ;
        int numRandom;

        //Instanciamos la clase de Scanner creando un objeto para capturar los datos
        Scanner sc = new Scanner(System.in);
         
        //Imprimimos un mensaje para solicitar al usuario su eleccion de piedra, papel o tijera
        System.out.println("Bienvenido al Videojuego de Carisellazo." );
        

        //Usamos ciclo do-while para hacer iteracion indefinida
        do {
            System.out.println("¿Quieres jugar?");
            //Capturamos el dato
            preg = sc.next();
            //Convertimos la pregunta a minuscula con el metodo de toLowerCase()
            pregMinuscula = preg.toLowerCase();
            //Ciclo para saber si quiere jugar
            switch (pregMinuscula){
                case "si":
                    System.out.println("¡VAMOS A JUGAR!");
                    System.out.print(" Digita el lado de la moneda (cara, sello) que quieres elegir: ");
                    lado = sc.next();
                    ladoMinuscula = lado.toLowerCase();
                    numRandom = (int) (Math.random()*2+1);

                    if (numRandom == 1){
                        ladoMoneda = "cara";
                    }else if (numRandom == 2){                        
                        ladoMoneda = "sello";
                    }

                    if (ladoMinuscula.equals(ladoMoneda)){
                        System.out.println("!Bien hecho! Acertaste que el lado de la moneda es " + ladoMoneda );
                    }else{
                        System.out.println("Lastima! No acertaste. El lado de la moneda es " + ladoMoneda );
                    }
                    break;
                case "no":
                    System.out.println("Lastima, sera en otro momento");
                    System.out.println("Vuelve cuando quieras");  
                    break;
                default:
                    System.out.println("El dato ingresado no es valido.");
                    System.out.println("VUELVE A INTENTAR");
                    pregMinuscula = "si";
                    break;
            }
            
        } while (pregMinuscula == "si");
        
        sc.close();
    }
}
 */


