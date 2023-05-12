//Importamos la libreria de Scanner y de Random
import java.util.Scanner;
public class RetoV {
    //Creamos el metodo main o metodo principal
    public static void main(String[] args) {
        //Creamos el objeto de la clase scanner instanciando la clase scanner
        Scanner sc = new Scanner(System.in);

        //Declaramos variables
        String mes;
        int dia; 
        System.out.println("Bienvenido al Programa para mostrar tus caracteristicas segun el signo Zodiacal");
        System.out.print("Ingresa el nombre del mes en el cual naciste: ");
        mes = sc.next().toLowerCase();
        System.out.print("Ingresa el numero del dia en que naciste: ");
        dia = sc.nextInt();
        
        switch(mes){        
            case "enero":
                if (dia > 0 && dia <= 20){
                    System.out.println("Segun tu mes de Enero y tu dia " + dia + " eres Crapicornio. Estas son tus caracteristicas: ");
                    System.out.println("Es un signo que siempre tiende a exigirse mucho. Son adictos a la responsabilidad y el trabajo. \nQuizá el problema sea que exigen a los demás lo mismo que se exigen a sí mismos, por lo que pueden llegar a parecer algo duros. Capricornio tiene mucha tendencia a la melancolía y el pesimismo, por lo que necesita a su lado a \nalguien que le ayude a relajarse y a disfrutar de los frutos de todos sus esfuerzos.");
                } else if (dia >= 21 && dia <= 31){
                    System.out.println("Segun tu mes de Enero y tu dia " + dia + " eres Acuario.");
                    System.out.println("Es el signo más libre y rebelde de la rueda. Son los típicos que tienen una lista eterna de mensajes \nde WhatsApp sin contestar, y así puede seguir. Pero Acuario es también el signo más honesto del zodiaco. Son capaces de reconocer sus errores y cambiar de opinión si se dan cuenta de que se han equivocado. Si necesitas una \nopinión sincera, no dudes en preguntarle a Acuario.");
                }
                break;
                
            case "febrero":
                if (dia > 0 && dia <= 19){
                    System.out.println("Segun tu mes de Febrero y tu dia " + dia + " eres Acuario.");
                    System.out.println("Es el signo más libre y rebelde de la rueda. Son los típicos que tienen una lista eterna \nde mensajes de WhatsApp sin contestar, y así puede seguir. Pero Acuario es también el signo más honesto del zodiaco. Son capaces de reconocer sus errores y cambiar de opinión si se dan cuenta de que se han equivocado. Si necesitas una \nopinión sincera, no dudes en preguntarle a Acuario.");

                } else if (dia >= 20 && dia <= 29){
                    System.out.println("Segun tu mes de Febrero y tu dia " + dia + " eres Piscis.");
                    System.out.println("Son creativos e imaginativos. Suelen vivir en las nubes y, a veces, su imaginación les \njuega malas pasadas y acaban montándose películas. Pero también son sensibles y empáticos. Piscis es la mejor persona a la que puedes contarle tus problemas, ya que son tranquilos, pacientes y amables. Aunque a veces absorben tanto lo que \nviene de fuera que acaban pareciendo confusos y desorganizados.");
                }
                break;
                
            case "marzo":
                if (dia > 0 && dia <= 20){
                    System.out.println("Segun tu mes de Marzo y tu dia " + dia + " eres Piscis.");
                    System.out.println("Son creativos e imaginativos. Suelen vivir en las nubes y, a veces, su imaginación les \njuega malas pasadas y acaban montándose películas. Pero también son sensibles y empáticos. Piscis es la mejor persona a la que puedes contarle tus problemas, ya que son tranquilos, pacientes y amables. Aunque a veces absorben tanto lo que \nviene de fuera que acaban pareciendo confusos y desorganizados.");

                } else if (dia >= 21 && dia <= 31){
                    System.out.println("Segun tu mes de Marzo y tu dia " + dia + " eres Aries.");
                    System.out.println("La rueda del zodíaco comienza con aries, razón por la cual este signo representa la \niniciativa. Un Aries es aquella persona que siempre quiere ir un paso por delante, que intenta animar a los demás a seguir sus pasos y que procura que siempre haya algo nuevo que hacer. Es, sin duda, uno de los signos en los que más puedes \nconfiar de toda la rueda. Sin embargo, como todos, tienen un lado negativo que refleja impulsividad, egoísmo e impaciencia ante quienes no pueden seguirles el ritmo.");
                }
                break;
                
            case "abril":
                if (dia > 0 && dia <= 20){
                    System.out.println("Segun tu mes de Abril y tu dia " + dia + " eres Aries.");
                    System.out.println("La rueda del zodíaco comienza con aries, razón por la cual este signo representa la \niniciativa. Un Aries es aquella persona que siempre quiere ir un paso por delante, que intenta animar a los demás a seguir sus pasos y que procura que siempre haya algo nuevo que hacer. Es, sin duda, uno de los signos en los que más puedes \nconfiar de toda la rueda. Sin embargo, como todos, tienen un lado negativo que refleja impulsividad, egoísmo e impaciencia ante quienes no pueden seguirles el ritmo.");

                    
                } else if (dia >= 21 && dia <= 30){
                    System.out.println("Segun tu mes de Abril y tu dia " + dia + " eres Tauro.");
                    System.out.print("Es uno de los más centrados. Suelen ser personas calmadas,que difícilmente pierden los papeles. \nAunque cuando comienzan a discutir, no paran hasta que se les dé la razón, ya que su lado más negativo es la tozudez. Te costará conseguir la lealtad de un Tauro, pero una vez que la logres puedes confiar en que \nestará contigo para siempre.");
                }
                break;
                
            case "mayo":
                if (dia > 0 && dia <= 20){
                    System.out.println("Segun tu mes de Mayo y tu dia " + dia + " eres Tauro.");
                    System.out.print("Es uno de los más centrados. Suelen ser personas calmadas,que difícilmente pierden los \npapeles. Aunque cuando comienzan a discutir, no paran hasta que se les dé la razón, ya que su lado más negativo es la tozudez. Te costará conseguir la lealtad de un Tauro, pero una vez que la logres puedes confiar en que \nestará contigo para siempre.");
                } else if (dia >= 21 && dia <= 31){
                    System.out.println("Segun tu mes de Mayo y tu dia " + dia + " eres Geminis.");
                    System.out.println("Nos advierten de la personalidad cambiante de este signo. De hecho, existen distintos tipos de \ngéminis. Tienen dos caras, una mucho más seria y otra más informal y aniñada. De este signo te creerás lo que diga, ya que su fuerte es sin duda la oratoria. Como punto negativo, los Géminis suelen tener mucho miedo al compromiso. \nEsto se debe a que sus decisiones suelen ser poco estables, duran poco debido a su cambiante personalidad.");
                }
                break;
                
            case "junio":
                if (dia > 0 && dia <= 20){
                    System.out.println("Segun tu mes de Junio y tu dia " + dia + " eres Geminis.");
                    System.out.println("Nos advierten de la personalidad cambiante de este signo. De hecho, existen distintos tipos de \ngéminis. Tienen dos caras, una mucho más seria y otra más informal y aniñada. De este signo te creerás lo que diga, ya que su fuerte es sin duda la oratoria. Como punto negativo, los Géminis suelen tener mucho miedo al compromiso. \nEsto se debe a que sus decisiones suelen ser poco estables, duran poco debido a su cambiante personalidad.");

                } else if (dia >= 21 && dia <= 30){
                    System.out.println("Segun tu mes de Junio y tu dia " + dia + " eres Cancer.");
                    System.out.println(" Los Cáncer son, sin duda, los más sensibles del zodíaco. Puede que parezca que “montan drama” \npor pequeñas nimiedades, pero si Cáncer te ha dejado ver ese lado de sí mismo es porque ha bajado su caparazón de cangrejo, valóralo. Son empáticos y solidarios con quienes les rodean, así que su torrente de emociones es solo un pequeño \nprecio a pagar por tener a tu lado a una de los amigos más leales que encontrarás en el zodíaco.");
                }
                break;
                
            case "julio":
                if (dia > 0 && dia <= 22){
                    System.out.println("Segun tu mes de Julio y tu dia " + dia + " eres Cancer.");
                    System.out.println(" Los Cáncer son, sin duda, los más sensibles del zodíaco. Puede que parezca que “montan drama” \npor pequeñas nimiedades, pero si Cáncer te ha dejado ver ese lado de sí mismo es porque ha bajado su caparazón de cangrejo, valóralo. Son empáticos y solidarios con quienes les rodean, así que su torrente de emociones es solo un pequeño \nprecio a pagar por tener a tu lado a una de los amigos más leales que encontrarás en el zodíaco.");

                } else if (dia >= 23 && dia <= 31){
                    System.out.println("Segun tu mes de Julio y tu dia " + dia + " eres Leo.");
                    System.out.println("Son personas con presencia. Cuando llegan a cualquier lugar, en seguida se hacen notar. Ellos \nlo saben, y les encanta. La principal categoría negativa de este signo es que tienden a ser algo egocéntricos, pero solo si se dejan llevar demasiado por su presencia incandescente. Por otro lado, si tienes a tu lado a un buen Leo \npuedes estar seguro de que te ayudará a sacar siempre lo mejor de ti.");     
                }
                break;
                
            case "agosto":
                if (dia > 0 && dia <= 23){
                    System.out.println("Segun tu mes de Agosto y tu dia " + dia + " eres Leo.");
                    System.out.println("Son personas con presencia. Cuando llegan a cualquier lugar, en seguida se hacen notar. Ellos \nlo saben, y les encanta. La principal categoría negativa de este signo es que tienden a ser algo egocéntricos, pero solo si se dejan llevar demasiado por su presencia incandescente. Por otro lado, si tienes a tu lado a un buen Leo puedes estar seguro de que te ayudará a sacar siempre lo mejor de ti.");     

                } else if (dia >= 24 && dia <= 31){
                    System.out.println("Segun tu mes de Agosto y tu dia " + dia + " eres Virgo.");
                    System.out.println("Es el signo del análisis y el orden. Pueden llegar a parecer fríos, pero en el fondo tienen \nun gran corazón que vela por aquellas \npersonas que más le importan. A Virgo no se le escapa ningún detalle, aunque creas que no se da cuenta de lo que sucede, sabe perfectamente de qué va cada asunto. Quizá su gran problema es que \nesto le impide dejarse fluir. Siempre reflexivo, siempre analítico, Virgo piensa en qué pasará después y controla sus acciones, impidiéndole vivir en el presente tanto como debería.");   

                }
                break;
                
            case "septiembre":
                if (dia > 0 && dia <= 22){
                    System.out.println("Segun tu mes de Septiembre y tu dia " + dia + " eres Virgo.");
                    System.out.println("Es el signo del análisis y el orden. Pueden llegar a parecer fríos, pero en el fondo tienen un gran corazón que vela \npor aquellas personas que más le importan. A Virgo no se le escapa ningún detalle, aunque creas que no se da cuenta de lo que sucede, sabe perfectamente de qué va cada asunto. Quizá su gran problema es que \nesto le impide dejarse fluir. Siempre reflexivo, siempre analítico, Virgo piensa en qué pasará después y controla sus acciones, impidiéndole vivir en el presente tanto como debería.");   
                } else if (dia >= 23 && dia <= 30){
                    System.out.println("Segun tu mes de Septiembre y tu dia " + dia + " eres Libra.");
                    System.out.println("Es que es un signo que no deja de pelear por un equilibrio que le cuesta alcanzar. Son los más románticos del zodiaco,\n pero también los más indecisos y dudosos. Algo que no siempre sale bien, ya que los Libra tienen que pensar y repensar todas sus decisiones más de mil veces. Por otro lado, nunca verás a un Libra perder los papeles. \nSu elegancia va siempre por delante de la rabia, la ira o el enfado.");
                }
                break;
                
            case "octubre":
                if (dia > 0 && dia <= 23){
                    System.out.println("Segun tu mes de Octubre y tu dia " + dia + " eres Libra.");
                    System.out.println("Es que es un signo que no deja de pelear por un equilibrio que le cuesta alcanzar. Son los más románticos del zodiaco, \npero también los más indecisos y dudosos. Algo que no siempre sale bien, ya que los Libra tienen que pensar y repensar todas sus decisiones más de mil veces. Por otro lado, nunca verás a un Libra perder los papeles. \nSu elegancia va siempre por delante de la rabia, la ira o el enfado.");

                } else if (dia >= 24 && dia <= 31){
                    System.out.println("Segun tu mes de Octubre y tu dia " + dia + " eres Escorpio.");
                    System.out.println("Los Escorpio se implican al máximo en sus relaciones y lo viven todo con una intensidad descomunal, \naunque eso les hace sentirse heridos más de una vez. Es entonces cuando aparece el lado más amargo de Escorpio, se cierran en banda y sacan a relucir un mal carácter que también los representa. A veces se confunden con personas bordes, \npero en realidad solo están dañados por haber dado tanto sin recibir lo que esperaban a cambio.");
                }
                break;
                
            case "noviembre":
                if (dia > 0 && dia <= 22){
                    System.out.println("Segun tu mes de Noviembre y tu dia " + dia + " eres Escorpio.");
                    System.out.println("Los Escorpio se implican al máximo en sus relaciones y lo viven todo con una intensidad descomunal, \naunque eso les hace sentirse heridos más de una vez. Es entonces cuando aparece el lado más amargo de Escorpio, se cierran en banda y sacan a relucir un mal carácter que también los representa. A veces se confunden con personas bordes, \npero en realidad solo están dañados por haber dado tanto sin recibir lo que esperaban a cambio.");
  
                } else if (dia >= 23 && dia <= 30){
                    System.out.println("Segun tu mes de Noviembre y tu dia " + dia + " eres Sagitario.");
                    System.out.println("Se cree que Sagitario es el signo con más suerte del zodiaco, pero esto se debe en gran medida a que \nson los más positivos de la rueda. Si tienes un amigo Sagitario, puedes estar seguro de que no vas a aburrirte nunca, ya que les encantan las aventuras. Son personas emprendedoras y de mente abierta, que disfrutan de conocer personas \nnuevas y vivir experiencias emocionantes.");
                }
                break;
                
            case "diciembre":
                if (dia > 0 && dia <= 21){
                    System.out.println("Segun tu mes de Diciembre y tu dia " + dia + " eres Sagitario.");
                    System.out.println("Se cree que Sagitario es el signo con más suerte del zodiaco, pero esto se debe en gran medida \na que son los más positivos de la rueda. Si tienes un amigo Sagitario, puedes estar seguro de que no vas a aburrirte nunca, ya que les encantan las aventuras. Son personas emprendedoras y de mente abierta, que disfrutan de conocer personas \nnuevas y vivir experiencias emocionantes.");

                } else if (dia >= 22 && dia <= 31){
                    System.out.println("Segun tu mes de Diciembre y tu dia " + dia + " eres Capricornio.");
                    System.out.println("Es un signo que siempre tiende a exigirse mucho. Son adictos a la responsabilidad y el trabajo. \nQuizá el problema sea que exigen a los demás lo mismo que se exigen a sí mismos, por lo que pueden llegar a parecer algo duros. Capricornio tiene mucha tendencia a la melancolía y el pesimismo, por lo que necesita a su lado a alguien que le \nayude a relajarse y a disfrutar de los frutos de todos sus esfuerzos.");

                }
                break;
        }

        sc.close();
    }
}
