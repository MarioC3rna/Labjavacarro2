package umg.demo2.vehiculos;

public class carro extends vehiculo {

    private int numerodePuertas;



    public carro(String marca, String modelo,int anio, int numerodePuertas) {
        super(marca, modelo,anio);
        this.numerodePuertas = numerodePuertas;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Numero de Puertas: " + numerodePuertas);
    }

}
