package co.edu.poli.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.example.model.Vehiculo;
import co.edu.poli.example.services.VehiculoService;


@RestController
@RequestMapping("/api/v1/")
public class VehiculoController {

    @Autowired
    VehiculoService vehiculoService;

    @PostMapping
    public Iterable<Vehiculo> createVehiculo(@RequestBody List<Vehiculo> listentity) {        
        return vehiculoService.createVehiculo(listentity);
    }
    
    @GetMapping
    public Iterable<Vehiculo> getAllVehiculos() {
        return vehiculoService.getAllVehiculos();
    }
    
    @GetMapping("/{id}")
    public Vehiculo getVehiculoById(@PathVariable String id) {
        return vehiculoService.getVehiculoById(id);
    }

    @PutMapping("/{id}")
    public Vehiculo updateVehiculo(@PathVariable String id, @RequestBody Vehiculo entity) {    
        return vehiculoService.updateVehiculo(entity);
    }
    
    @DeleteMapping("/{id}")
    public Vehiculo deleteVehiculo(@PathVariable String id) {
        return vehiculoService.deleteVehiculo(id);
    }

}
