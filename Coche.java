public class Coche {
    int numeroPuertas;
    private  int puerta(){
        return numeroPuertas++;
    }
    public static void main(String[]args){
        Coche miCoche = new Coche();
        miCoche.puerta();
        System.out.println(miCoche.numeroPuertas);
    }
}



