package jStrings;

public class DesencriptarLoop {
    public static void main(String[] args) {
        //declarar el mensaje, la clave, y el mensajeEncriptado
        String mensajeEncriptado = "rfsfsf jx ozjajx? t anjwsjx";
        //fjt dcsph wxgpc?
        //rqpvg c jcegt nc vctgc!
        //rfsfsf jx ozjajx? t anjwsjx?
        String mensajePlano = "Hola Mundo!";
        int clave = 1;
        int claveFinal = 15;

        String mensaje2 = encriptar(mensajePlano, 7);
        System.out.println("El mensaje encriptado es " + mensaje2);


        for (int clavecont = 1; clavecont <= claveFinal; clavecont++) {


            clave = clavecont;


            String candidato = desencriptar(mensaje2, clave);
            System.out.println("El posible mensaje desencriptado es " + candidato);

        }
    }

    private static String encriptar(String mensajePlano, int clave) {

        String mensajeEncriptado="";
        for (int i=0; i<mensajePlano.length(); i++)
        {
            char actual;
            if(mensajePlano.charAt(i) >= 'a' && mensajePlano.charAt(i) <= 'z') {
                actual= (char) (mensajePlano.charAt(i)+ clave);
                if(actual > 'z') {
                    actual = (char) (actual - 26);
                }
            } else {
                actual = mensajePlano.charAt(i);
            }
            mensajeEncriptado = mensajeEncriptado + actual;
        }
        //imprimirlo
        return mensajeEncriptado;


    }

    private static String desencriptar(String mensaje, int clave) {
        String mensajeDesencriptado = "";
        for (int i = 0; i < mensaje.length(); i++) {
            char actual;
            if (mensaje.charAt(i) >= 'a' && mensaje.charAt(i) <= 'z') {
                actual = (char) (mensaje.charAt(i) - clave);
                if (actual < 'a') {
                    actual = (char) (actual + 26);
                }
            } else {
                actual = mensaje.charAt(i);
            }
            mensajeDesencriptado = mensajeDesencriptado + actual;
        }
        //imprimirlo
       return  mensajeDesencriptado;
    }
    
}
