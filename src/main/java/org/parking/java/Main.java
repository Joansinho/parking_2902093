package org.parking.java;

import javax.sound.sampled.CompoundControl;

import org.parking.java.entities.Cliente;
import org.parking.java.entities.Cupo;
import org.parking.java.entities.Empleado;
import org.parking.java.entities.Pago;
import org.parking.java.entities.TipoVehiculo;
import org.parking.java.entities.Vehiculo;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


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
   
   
   //instanciar cupos
   Cupo cupito1 = new Cupo('A');
   Cupo cupito2 = new Cupo('B');
   
   //crear fechas

   LocalDateTime fechaHoraInicio = LocalDateTime.of(2024, Month.FEBRUARY, 1, 15, 30, 0);
   LocalDateTime fechaHoraFin = LocalDateTime.of(2024, Month.FEBRUARY, 10, 6, 15, 0);
   
   //empleado
   Empleado empleado = new Empleado("Andres", "Garcia", "101010");
      empleado.nombre = "Andres";
      empleado.apellido = "Garcia";
      empleado.codigo = "101010";
      

   //hacer registros (pagos)de entrada y salida de vehiculos
      
      Pago pago1 = new Pago(fechaHoraInicio , fechaHoraFin , 5000.0 , cliente1.misVehiculos.get(0), cupito1 , empleado);
      Pago pago2 = new Pago(fechaHoraInicio, fechaHoraFin, 10000.0, cliente1.misVehiculos.get(1),cupito2 , empleado);

    
    //lista pagos
        
    List<Pago> misPagos = new ArrayList<Pago>();
    misPagos.add(pago1);
    misPagos.add(pago2);

    //recorrer los pagos para mostrar informcacion

    for (Pago p : misPagos){
        //evidencia:
        //mostrar:
        //- Placa del vehiculo 
        /* -valor pagado
         * -fecha hora de inicio
         * -fecha hora de fin 
         * -cupo (nombre)
         */
    System.out.println("Pago:|Placa:" + p.vehiculo.placa + "|");
    System.out.println("|valor:" + p.valor + "|");
    System.out.println("fecha y hora entrada :" + p.fechaHoraInicio.toString());
    System.out.println("fecha hora fin:"+ p.fechaHoraFin.toString());
    System.out.println("|Cupo:" + p.cupo.nombre +"|");
    System.out.println("|codigo empleado:" + p.empleado.codigo + "|");




}

    

    
    
    }


 
    }
