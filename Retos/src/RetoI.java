
//Creamos la clase RetoI
public class RetoI {

    //Creamos la clase principal con el metodo de main
    public static void main (String[] args) {

        //Declaramos variables
        //Asignamos que tipo de variable se puebe guardar
        double temp, centi;

        //Imprimimos mensaje para informar la utilidad del programa
        System.out.println("Bienvenido al programa Abuela.");
        System.out.println("Este programa te permitira convertir de grados Farenheit a Centigrados.");

        //Asiganamos e valor de la temperatura
        temp = 350;

        //Con ayuda de la formula para convertir de grados Farenheit a Centigrado
        centi = (temp - 32) / 1.8;
    
        //Mostramos los grados en Farenheit y los cenrigrados necesarios para el horno
        System.out.println("El grado Farenheit es: " + temp);
        System.out.println("Este es el grado en centigrados que dees poner en tu nuevo horno: " + centi);

    }
}
