import javax.swing.JOptionPane;
/**
 * Esta clase define la raiz tanto positiva como negativa de dado 3 números de una ecuación aplicando la formula general 
 * @author Parada Martinez Erwin Eli
 * @version 29/11/2019
 */
public class RaizCuadrada
{
    /**
     * Este método calcula uno de los dos valores valores que puede tener una ecuacion cuadratica dados sus abc
     * @param abc a,b,c son los números a los que vamos a aplicar la formula general
     */
    public static void x1(int a,int b,int c ){
        double discriminante=Math.pow(b,2)+(4*a*c);/**declaro el discriminate */
        if(discriminante>=0){ /**inicio del if que verifica que sea real*/
            System.out.println((-b+discriminante)/(2*a)); /** impresión de pantalla de el resultado*/
        }else{/** else en caso de que el discrimante no sea real*/
            System.out.println("x1 no existe"); /** impresión de pantalla de que no existe*/   
        }
    }//cierre del método
    /**
     * Este método calcula uno de los dos valores valores que puede tener una ecuacion cuadratica dados sus abc 
     * @param abc a,b,c son los números a los que vamos a aplicar la formula general
     */
    public static void x2(int a,int b,int c ){
        double discriminante=Math.pow(b,2)+(4*a*c);/**declaro el discriminate */
        if(discriminante>=0){ /**inicio del if que verifica que sea real*/
            System.out.println((-b-discriminante)/(2*a)); /** impresión de pantalla de el resultado*/
        }else{/** else en caso de que el discrimante no sea real*/
            System.out.println("x1 no existe"); /** impresión de pantalla de que no existe*/   
        }
    }//cierre del método
    /**
     * Este método main es para probar que funcionan los métodos de la clase 
     * @param Array String de argumentos
     */
    public static void main(String []args){
        int a=Integer.parseInt(JOptionPane.showInputDialog("a")); /** asignacion de valor a la variable desde el teclado*/
        int b=Integer.parseInt(JOptionPane.showInputDialog("b")); /** asignacion de valor a la variable desde el teclado*/
        int c=Integer.parseInt(JOptionPane.showInputDialog("c")); /** asignacion de valor a la variable desde el teclado*/
        x1(a,b,c); /** prueba del método x1*/
        x2(a,b,c); /** prueba del método x2*/
    }//cierre del método
}//cierre de la clase
