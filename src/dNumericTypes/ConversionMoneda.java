package dNumericTypes;

import libs.Input;

public class ConversionMoneda {

    public static void main(String[] args) {
        double dolar;
        double pesos;
        double cambio;
        double constante;

        constante= 20.48;

        dolar= Input.get_double(" Cuando deseas convertir ");
        cambio= dolar * constante;
        System.out.println(dolar + " Dolares es = " + cambio+ " pesos");

    }

}
