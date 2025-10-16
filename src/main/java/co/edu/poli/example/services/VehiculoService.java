package co.edu.poli.example.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.poli.example.model.Vehiculo;
import co.edu.poli.example.repositories.VehiculoRepository;

@Service
public class VehiculoService {

    @Autowired
    VehiculoRepository vehiculoRepository;

    public Iterable<Vehiculo> createVehiculo (List<Vehiculo> listentity) {
        return vehiculoRepository.saveAll(listentity);
    }

    public Iterable<Vehiculo> getAllVehiculos() {
        return vehiculoRepository.findAll();
    }

    public Vehiculo getVehiculoById (String id) {
        return vehiculoRepository.findById(id).orElse(null);
    }

    public Vehiculo updateVehiculo (Vehiculo entity) {
        return vehiculoRepository.save(entity);
    }

    public Vehiculo deleteVehiculo (String id) {
        Vehiculo aux = vehiculoRepository.findById(id).orElse(null);
        vehiculoRepository.deleteById(id);
        return aux;
    }
}
