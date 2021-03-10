package eConditionals;

public class MinimoMonedas {

    public static void main(String[] args) {
        double cambio=1.23;
        int numeroCentavos = (int) (cambio * 100);
        int numeroMonedas=0;
        int moneda25;
        int div1;
        int div2;
        int div3;
        int div4;
        int res1;
        int res2;
        int res3;

          div1= numeroCentavos / 25;
          res1= numeroCentavos % 25;
          div2= res1/ 10;
          res2= res1%10;
          div3= res2 / 5;
          res3= res2% 5;
          div4=res3;

          numeroMonedas= div1+div2+div3+div4;
        System.out.println("el numero de monedas es " +numeroMonedas);



    }
}
