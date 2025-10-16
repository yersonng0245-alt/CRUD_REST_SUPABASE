package co.edu.poli.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "autos")
public class Auto extends Vehiculo {

    private int numeroPuertas; 

}
 