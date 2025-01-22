
//importaciones
//import java.util.Random;
import java.util.Scanner;


//Clase Principal
public class Main {

    //metodo Main
    public static void main(String[] args) {

/*        comentarios
                de varias lineas*/

//        2. cadenas con Java

/*        System.out.println("Hello, Ivan Isay!");
        String cadenas = "ivan" + "guerra" + "lopez";

        System.out.println(cadenas);

        System.out.println(cadenas.length());

        System.out.println(cadenas.substring(2,5));
        System.out.println(cadenas.substring(2));
        System.out.println(cadenas.substring(0,5));*/



//        3. Variables


        int entero1=5 ,entero2,entero3;
        double decimal1=1.25,decimal2,decimal3;
        String cadena1= "204", cadena2,cadena3;

        //Conversion de cadena a int
        entero2= Integer.parseInt(cadena1);
        //Conversion de cadena a double
        decimal2= Double.parseDouble(cadena1);

        //Conversion de double a int
        entero3= (int)decimal1;

        //Conversion de double a cadena
        cadena2 = String.valueOf(y);

        //Conversion de int a double
        decimal2= Double.valueOf(x);

        //Conversion Implicita
        int num= 12;
        double numD= num;
        System.out.println("Conversion Implicita"+numD);



        System.out.println(x2);
        System.out.println(cadena2);
        System.out.println(asd);


        //creamos un objeto rdn de clase Random
        Random rdn= new Random();

        //generamos numeros y los guardamos
        int numAleatorio=  rdn.nextInt();
        double numDouble= rdn.nextDouble();

        System.out.println("Aleatorio entero: "+numAleatorio);
        System.out.println("Aleatorio double: "+numDouble);

        /*
        //4. Solicitud de datos

        Scanner scn=new Scanner(System.in);

        System.out.println("Introduce cualquier dato");
        String dato= scn.nextLine();

        System.out.println("Introduce dato entero");
        int datoentero= scn.nextInt();

        System.out.println("Introduce dato con decimales");
        double datodecimal= scn.nextDouble();

        System.out.println("Cualquier dato"+ dato);
        System.out.println("Dato entero"+ datoentero);
        System.out.println("Dato decimal "+ datodecimal);

        */


/*
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
        System.out.println(!(x< 5 || x>10));//false*/


    }


}