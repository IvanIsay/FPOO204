public class Main {


    public static void main(String[] args) {

        //creamos Objeto = Instanciar objeto
        Spartan jefeMaestro = new Spartan("John 117",100,90,"Rifle de asalto");
        Spartan reach= new Spartan("Emile",0,0,"Aguijoneador");


        //Usar sus metodos de Jefe maestro
        jefeMaestro.mostrarInfo();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recargarArma(65);
        jefeMaestro.correr(true);


        //Usar sus metodos de reach
        reach.mostrarInfo();
        reach.atacar("Grunt");
        reach.recargarArma(10);
        reach.correr(false);

        //ejemplo de Get & Set con el objeto jefeMaestro
        jefeMaestro.setNombre("Ivan Isay");
        jefeMaestro.mostrarInfo();
        System.out.println(jefeMaestro.getNombre());

        //jefeMaestro.consultaCortana();


    }



}//lave de la clase