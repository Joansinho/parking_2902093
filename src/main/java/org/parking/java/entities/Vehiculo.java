package org.parking.java.entities;

public class Vehiculo {
    //los atributos de una clase para cumplir con encapsulamiento deben ser privador
    //1. modificador de acceso 
    //2. Tipo de dato del atrubuto
    //3. nombre del atributo
 private String placa;
private TipoVehiculo tipoVehiculo;


//constructor 
//sin parametros: constructor por defecto 
public Vehiculo() {
}

//constructo parametrizado
public Vehiculo(String placa, TipoVehiculo tipoVehiculo) {
    this.placa = placa;
    this.tipoVehiculo = tipoVehiculo;
}

public String getPlaca() {
    return placa;
}

public void setPlaca(String placa) {
    this.placa = placa;
}

public TipoVehiculo getTipoVehiculo() {
    return tipoVehiculo;
}

public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
    this.tipoVehiculo = tipoVehiculo;
} 




}
