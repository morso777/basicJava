package jStrings;

public class Encriptar {

    public static void main(String[] args) {
        //declarar el mensaje, la clave, y el mensajeEncriptado
        String mensaje= "hola mundo";
        int clave=15;
        String mensajeEncriptado = "";

        //encriptarlo

        //coger cada letra, sumarle la clave, y guardarlo en un String 'encriptado'

        for (int i=0; i<mensaje.length(); i++)
        {
            char actual;
            if(mensaje.charAt(i) >= 'a' && mensaje.charAt(i) <= 'z') {
                actual= (char) (mensaje.charAt(i)+ clave);
                if(actual < 'a') {
                    actual = (char) (actual + 26);
                }
            } else {
                actual = mensaje.charAt(i);
            }
            mensajeEncriptado= mensajeEncriptado + actual;
        }
        //imprimirlo
        System.out.println("El mensaje encriptado es  " + mensajeEncriptado);
    }
}

