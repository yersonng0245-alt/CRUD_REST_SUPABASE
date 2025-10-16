package co.edu.poli.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "motos")
public class Moto extends Vehiculo {

    private int cilindraje;

}
