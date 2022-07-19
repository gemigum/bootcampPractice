import java.util.Scanner;

/*En este ejercicio practicarás las estructuras de control, para ello deberás crear:

1. Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

2. Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile 
sea inferior a 3, el bloque de código que tendrá el bucle deberá:
    Incrementar el valor de la variable en uno cada vez que se ejecute.
    Mostrarlo por pantalla cada vez que se ejecute.

3. Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe 
ejecutar una vez.

4. Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición
será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute 
y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. 
Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
También habrá que poner un default para cuando el valor de la variable no sea una estación.
*/

public class Leccion4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numeroIf = scan.nextInt();
         

        if (numeroIf > 0)
            System.out.println("Es Par");
        else if (numeroIf < 0)
            System.out.println("Es Impar");
        else if (numeroIf == 0)
            System.out.println("Es Cero");

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);

            System.out.println("¿Desea volver a ejecutar?: (Y/N)");
            scan = new Scanner(System.in);
            String valor = scan.nextLine();
            if (valor != "Y" && valor != "y") {
                break;
            }
        }

        int conteo = 0;
        System.out.println("Ingrese un valor: ");
        scan = new Scanner(System.in);
        numeroWhile = scan.nextInt();

        do {

            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);

            conteo = conteo + 1;
        } while (conteo == 0);
        
        /* FOR */
        System.out.println("****** CONDICIONAL FOR ******");
        int numeroFor;
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        /* SWITCH */
        System.out.println("****** CONDICIONAL SWITCH ******");
        System.out.println("Ingrese una estación del año:");
        scan = new Scanner(System.in);
        String estacion = scan.nextLine();

        switch (estacion) {
            case "invierno": {
                System.out.println("Es Invierno");
            }
                break;
            case "verano": {
                System.out.println("Es Verano");
            }
                break;
            case "otoño": {
                System.out.println("Es Otoño");
            }
                break;
            case "primavera": {
                System.out.println("Es Primavera");
            }
                break;
            default: {
                System.out.println("No es una estación");
            }
                break;

        }
       
        scan.close();
    }


}