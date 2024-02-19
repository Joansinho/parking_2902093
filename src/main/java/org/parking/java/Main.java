package org.parking.java;

import org.parking.java.entities.Cliente;
import org.parking.java.entities.TipoVehiculo;
import org.parking.java.entities.Vehiculo;

public class Main {
    public static void main(String[] args) {
        //sistema de gestion de entradas y salidas de vehiculos en un parking
        //1. dos carritos: 
        //Objetos(instancias)
        //tipo de clase 
        //nombre del objeto 
        //asignacion y new
        //constructor del objeto
        Vehiculo carrito1 = new Vehiculo("ASD 789", TipoVehiculo.PARTICULAR);
        carrito1.placa = "ASD 789";
        carrito1.tipoVehiculo = TipoVehiculo.PARTICULAR;

        Vehiculo carrito2 = new Vehiculo("QWE 456", TipoVehiculo.TAXI);
        carrito2.placa = "QWE 456";
        carrito2.tipoVehiculo = TipoVehiculo.TAXI;

        //crear un cliente 
        Cliente cliente1 = new Cliente("Joan", "Fonctecha Leiton", 1028482746L);
        cliente1.nombre = "Joan";
        cliente1.apellido = "Fonctecha Leiton";
        cliente1.numeroIdentificacion = 1028482736L;
    //invocar el metodo addCar
    cliente1.addVehicle(carrito1);
    cliente1.addVehicle(carrito2);
    cliente1.addVehicle ("WWW ERT", TipoVehiculo.MOTO);
    //recorrer la lista de vehiculos del cliente 
    for(Vehiculo v:cliente1.misVehiculos){
        System.out.println(v.placa);
        System.out.println(v.tipoVehiculo);
        System.out.println("---------");
       
        
    }

    
 
    }
}