
//IMPORTACIONES
//import java.util.Random;
import java.util.Scanner;


//Clase Principal
public class Main {

    //Metodo Main
    public static void main(String[] args) {

/*        comentariios
                de varias lineas*/

//        2. cadenas con Java

/*        System.out.println("Hello, Ivan Isay!");
        String cadenas = "ivan" + "guerra" + "lopez";

        System.out.println(cadenas);

        System.out.println(cadenas.length());

        System.out.println(cadenas.substring(2,5));
        System.out.println(cadenas.substring(2));
        System.out.println(cadenas.substring(0,5));*/

/*//        3. Variables

        int x=5,x2;
        double y=1.25,y2;
        String z= "204",z1;

        //Conversion de cadena a int
        x2= Integer.parseInt(z);

        //Conversion de double a cadena
        z1= String.valueOf(y);

        //Conversion de int a double
        double asd= Double.valueOf(x);

        //Conversion Implicita
        int num= 12;
        double numD= num;
        System.out.println("Conversion Implicita"+numD);


        System.out.println(x2);
        System.out.println(z1);
        System.out.println(asd);

        //creamos un objeto rdn de clase Random
        Random rdn= new Random();

        //generamos numeros y los guardamos
        int numAleatorio=  rdn.nextInt();
        double numDouble= rdn.nextDouble();

        System.out.println("Aleatorio entero: "+numAleatorio);
        System.out.println("Aleatorio double: "+numDouble);*/

      /*  //4. Solucitud de datos

        Scanner scn=new Scanner(System.in);

        System.out.println("Introduce cualquier dato");
        String dato= scn.nextLine();

        System.out.println("Introduce dato entero");
        int datoentero= scn.nextInt();

        System.out.println("Introduce dato con decimales");
        double datodecimal= scn.nextDouble();

        System.out.println("Cualquier dato"+ dato);
        System.out.println("Dato entero"+ datoentero);
        System.out.println("Dato decimal "+ datodecimal);*/


//     5. Boolean, operadores logicos y de comparacion

        System.out.println(10 > 9); //true
        System.out.println(10 == 9); //false
        System.out.println(10 < 9); //false
        System.out.println(10 >= 9); //true
        System.out.println(10 <= 9); // false
        System.out.println(10 != 9); //true

        int x= 3;
        System.out.println(x< 5 && x>10); //false
        System.out.println(x< 5 || x>10); //true
        System.out.println(!(x< 5 && x>10)); //true







    }


}