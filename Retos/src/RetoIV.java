//Instanciamos la libreria de Scanner y de Random
import java.util.Scanner;
import java.util.Random;
public class RetoIV {
    public static void main(String[] args) {

        //Declaramos variables
        String eleccion = null, eleccionUsuario;

        //Creamos los objetos de la clase Random y Scanner
        Random num =new Random();
        Scanner sc = new Scanner(System.in);

        //Obtenemos el numero aleatorio
        int numRandom = num.nextInt(3)+1;

        //Imprimimos un mensaje

        System.out.println("===============================================================================");
        System.out.println("|                                                                             |");
        System.out.println("|                 Bienvenido al Juego de Piedra, Papel o Tijera               |");
        System.out.println("|                                                                             |");
        System.out.println("===============================================================================");
        System.out.println("|                                                                             |");
        System.out.println("|                               Opciones Validas                              |");
        System.out.println("|                                                                             |");
        System.out.println("|                                  1. PAPEL                                   |");
        System.out.println("|                                  2. PIEDRA                                  |");
        System.out.println("|                                  3. TIJERA                                  |");
        System.out.println("|                                                                             |");
        System.out.println("===============================================================================");
        System.out.println("|                                                                             |");
        System.out.println("|   Ingresa la opción que quieras elegir: ");
        //Capturamos el dato dentro de elleccionUsuario y trnasformamos a minuscula
        eleccionUsuario = sc.next().toLowerCase();
        System.out.println("|                                                                             |");
        System.out.println("===============================================================================");

        //Asignamos la eleccion del sistema con un numero random
        switch (numRandom){
            case 1:
                eleccion = "papel";
                break;
            case 2:
                eleccion = "piedra";
                break;
            case 3:
                eleccion = "tijera";
                break;
        }

        //Mostramos lo que eligio el sistema
        System.out.println("===============================================================================");
        System.out.println("|                                                                             |");
        System.out.println("|                         El sistema eligio " + eleccion + "                      |" );
        System.out.println("|                                                                             |");
        System.out.println("===============================================================================");

        //Mostramos en caso de que la eleccion del usuario y sel sistema sean iguales
        if (eleccionUsuario.equals(eleccion)){
            System.out.println("===============================================================================");
            System.out.println("|                                                                             |");
            System.out.println("|                                    EMPATE                                   |" );
            System.out.println("|                                                                             |");
            System.out.println("===============================================================================");
        } else {
            //Condicional teniendo en cuenta la eleccion del usuario
            switch (eleccionUsuario){
                case "papel":

                    //Enfrentamos las opciones para saber si se pierde o se gana
                    if (eleccion.equalsIgnoreCase("piedra")){
                        System.out.println("===============================================================================");
                        System.out.println("|                                                                             |");
                        System.out.println("|                                  GANASTE                                    |" );
                        System.out.println("|                                                                             |");
                        System.out.println("===============================================================================");
                    } else if (eleccion.equalsIgnoreCase("tijera")){
                        System.out.println("===============================================================================");
                        System.out.println("|                                                                             |");
                        System.out.println("|                                  PERDISTE                                   |" );
                        System.out.println("|                                                                             |");
                        System.out.println("===============================================================================");
                    }
                    break;
                    
                case "piedra":
                    if (eleccion.equalsIgnoreCase("tijera")){
                        System.out.println("===============================================================================");
                        System.out.println("|                                                                             |");
                        System.out.println("|                                  GANASTE                                    |" );
                        System.out.println("|                                                                             |");
                        System.out.println("===============================================================================");
                    } else if (eleccion.equalsIgnoreCase("papel")){
                        System.out.println("===============================================================================");
                        System.out.println("|                                                                             |");
                        System.out.println("|                                  PERDISTE                                   |" );
                        System.out.println("|                                                                             |");
                        System.out.println("===============================================================================");
                    }
                    break;
                
                case "tijera":
                    if (eleccion.equalsIgnoreCase("papel")){
                        System.out.println("===============================================================================");
                        System.out.println("|                                                                             |");
                        System.out.println("|                                  GANASTE                                    |" );
                        System.out.println("|                                                                             |");
                        System.out.println("===============================================================================");
                    } else if (eleccion.equalsIgnoreCase("piedra")){
                        System.out.println("===============================================================================");
                        System.out.println("|                                                                             |");
                        System.out.println("|                                  PERDISTE                                   |" );
                        System.out.println("|                                                                             |");
                        System.out.println("===============================================================================");
                    }
                    break;
                default:    
                    System.out.println("===============================================================================");
                    System.out.println("|                                                                             |");
                    System.out.println("|                             ERROR: DATO INVALIDO                            |" );
                    System.out.println("|                                                                             |");
                    System.out.println("===============================================================================");
                    break;
            }
        }
        sc.close();
    }
}