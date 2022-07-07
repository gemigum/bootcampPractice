/*Primera parte:
Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores. 
*/
 
public class Inicio
{
    public static void main(String[] args) throws Exception {
        System.out.println(sumarValores(10,15,2));

        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();
        System.out.println( String.valueOf(miCoche.cantidadPuertas));
    }
    //Primera parte
    private static int sumarValores(int val1, int val2, int val3)
    {
        int resultado = val1 + val2 +  val3; 
        return resultado;
    }

}



