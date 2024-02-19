package org.parking.java.entities;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    public String nombre;
    public String apellido;
    public Long numeroIdentificacion;
    public List<Vehiculo> misVehiculos = new ArrayList<Vehiculo>();

    //definir metodo de clase 
    //addCar: vincular un carrito al cliente
    public void addVehicle (Vehiculo vehiculo){ 
      //Añadir el carrito a la lista 
      //this: para acceder a atributs y metodos al interior del objeto
      //NOTA: usar al interior de metodos
      this.misVehiculos.add(vehiculo);
    }
    //otra sobrecarga del metodo addvehivle
    public void addVehicle(String placa, TipoVehiculo tv){
        Vehiculo v =new Vehiculo();
        v.placa = placa;
        v.tipoVehiculo = tv;
        this.misVehiculos.add(v);
    }

    public Cliente() {
    }
    public Cliente(String nombre, String apellido, Long numeroIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    
    
    
}
