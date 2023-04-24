public class thewitcher {
    public static void main( String [] args ) {

        int thewitcher = 25;                    // On démarre avec une variable initialisée à 25;
        ++thewitcher;                           // J'incrémenter value de 1;
        System.out.println( thewitcher );       // Affiche 11

        --thewitcher;                           // Cette instruction se contente de décrémenter value de 1
        System.out.println( thewitcher );       // Affiche 25
        //la boucle va jusqu' a 10.
        for( int i=0; i<10; ++i ){
            System.out.println( "i == " + i );
        }
    }
}