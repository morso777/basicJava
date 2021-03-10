package fLoops;

public class PiramideNumeros {

    public static void main(String[] args) {
        int numeroRenglones = 10;
        int numeroEspacios;

        
        for(int numRenglonActual = 1;numRenglonActual <= numeroRenglones; numRenglonActual++) {
            //imprimir renglon por renglon.

            //para imprimir columnas y espacio
            numeroEspacios= numeroRenglones-numRenglonActual;
            for(int contador = 1;contador <= numeroEspacios; contador++) {
                System.out.print(" ");
            }

           // imprime columna y gato
            int numeroMaximo = numRenglonActual;
            for(int contador = 1;contador <= numeroMaximo; contador++) {
                System.out.print("#");
            }
            System.out.println();
    
        }
    }
    
}
