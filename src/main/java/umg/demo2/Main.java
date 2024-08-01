package umg.demo2;

import umg.demo2.vehiculos.carro;
import umg.demo2.vehiculos.motocicleta;
import umg.demo.conductores.conductor;
import umg.demo.conductores.conductordemotos;
import umg.demo.conductores.conductordecoche;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
     carro mazda= new carro("mazda ","cx-60 ",2010,5);
     mazda.mostrar();

     motocicleta honda =new motocicleta("Honda ","cbr ",2013,true);
     honda.mostrar();

     conductordemotos conductordemots= new conductordemotos("Rudito","434631",true);
        conductordemots.mostrarInfo();


















    }
}
