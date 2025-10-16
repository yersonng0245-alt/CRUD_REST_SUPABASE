package co.edu.poli.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.poli.example.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, String> {

}
