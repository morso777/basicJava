package fLoops;

public class FuncionPiramide {
    public static void main(String[] args) {
        int altura = 5;
        dibujarPiramide(altura);
    }
//reenglones
    private static void dibujarPiramide(int altura) {
        for(int numRenglon = 1; numRenglon <= altura; numRenglon++) {
            dibujarRenglon(numRenglon,altura);
        }
    }


    private static void dibujarRenglon(int numRenglon, int altura) {
//dibujar espacios
        for(int i = 0; i < altura-numRenglon; i++) {
            System.out.print(" ");
        }


// dibujar gatos
        for(int i = 0; i < numRenglon; i++) {
            System.out.print("#");
        }
        System.out.println();
    }

}