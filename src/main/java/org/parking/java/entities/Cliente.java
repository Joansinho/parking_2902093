package org.parking.java.entities;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private Long numeroIdentificacion;
    private List<Vehiculo> misVehiculos = new ArrayList<Vehiculo>();

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
        
    //utilizando setter de placa para asignar valor de placa al nuevo vehiculo
        
        v.setPlaca(placa);
        v.setTipoVehiculo(tv);
        this.misVehiculos.add(v);
    }

    public Cliente() {
    }
    public Cliente(String nombre, String apellido, Long numeroIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    public void setNumeroIdentificacion(Long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
    public List<Vehiculo> getMisVehiculos() {
        return misVehiculos;
    }
    public void setMisVehiculos(List<Vehiculo> misVehiculos) {
        this.misVehiculos = misVehiculos;
    }

    
    
    
}
