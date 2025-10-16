package co.edu.poli.example.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "tipo"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Auto.class, name = "auto"),
    @JsonSubTypes.Type(value = Moto.class, name = "moto")
})
@Entity
@Table(name = "vehiculos")
@Inheritance(strategy = jakarta.persistence.InheritanceType.JOINED)
public abstract class Vehiculo {

    @Id
    private String placa;
    private String marca;
    private int modelo;

}
