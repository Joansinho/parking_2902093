
import java.time.LocalDateTime;

import org.parking.java.entities.Cupo;
import org.parking.java.entities.Vehiculo;


  public class Pago { 
    
  // Atríbutos Intrsínsecos
   
    public LocalDateTime fechaHoraInicio;
    public LocalDateTime fechaHoraFin;
    public Double valor;
     
    //Atributos de relación

    public Vehiculo vehiculo; 
    public Cupo cupo;
   

    //constructor por defecto 
    public Pago() {
    }
   //Constructor parametrizado

    public Pago(LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin, Double valor, Vehiculo vehiculo, Cupo cupo) {
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.valor = valor;
        this.vehiculo = vehiculo;
        this.cupo = cupo;
    }
    
    


}
