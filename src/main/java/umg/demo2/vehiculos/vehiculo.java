package umg.demo2.vehiculos;

public class vehiculo {

    private String marca;
    private String modelo;
    private int anio;

   public vehiculo(String marca, String modelo, int anio) {
       this.marca = marca;
       this.modelo = modelo;
       this.anio = anio;
   }
 public void mostrar(){
     System.out.println("Marca: " + marca+"Modelo: " + modelo+"Anio: " + anio);
 }






}
