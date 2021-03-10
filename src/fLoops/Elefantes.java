package fLoops;

public class Elefantes {

    public static void main(String[] args) throws InterruptedException {

        int numeroElefantes=1;

        while (numeroElefantes<=20)

        {


            if (numeroElefantes==1){

                System.out.println(numeroElefantes+ " elefante se columpiaba sobre la tela de una araña,\n" +
                        "como veia que resistia, fue a llamar a otro elefante");
            }
                else {
                System.out.println(numeroElefantes + " elefantes se columpiaban sobre la tela de una araña,\n" +
                        "como veian que resistian, fueron a llamar a otro elefante");
            }
            numeroElefantes+=1;
            Thread.sleep(1000);
        }
    }
}
