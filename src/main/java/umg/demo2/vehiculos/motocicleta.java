package umg.demo2.vehiculos;

public class motocicleta extends vehiculo {
    private boolean tieneSidecar;


    public motocicleta(String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Tiene sidecar: " + tieneSidecar);
    }







}
