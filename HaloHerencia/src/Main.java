public class Main {
    public static void main(String[] args) {

        SpartanII jefeMaestro = new SpartanII("Jonh",100,"Rifle de asalto",0);
        jefeMaestro.mostrarInfo();
        jefeMaestro.usarManejoAvanzado();
        jefeMaestro.atacar("Covenant");
        jefeMaestro.recibirDano(50);
        jefeMaestro.recargarEscudo();

        System.out.println("----------------------------------------------------------------------" );

        SpartanIII NobleSix= new SpartanIII("Emile",100,"Rifle de asalto",0);

        SpartanIV Locke= new SpartanIV("Locke",100,"Rifle de asalto",0);
    }
}