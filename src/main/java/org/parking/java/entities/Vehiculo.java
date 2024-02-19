package org.parking.java.entities;

public class Vehiculo {
    //1. modificador de acceso 
    //2. Tipo de dato del atrubuto
    //3. nombre del atributo
public String placa;
public TipoVehiculo tipoVehiculo;

//constructor 
//sin parametros: constructor por defecto 
public Vehiculo() {
}

//constructo parametrizado
public Vehiculo(String placa, TipoVehiculo tipoVehiculo) {
    this.placa = placa;
    this.tipoVehiculo = tipoVehiculo;
} 



}
