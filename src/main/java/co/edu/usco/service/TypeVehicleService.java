package co.edu.usco.service;

import co.edu.usco.entity.VehicleTypeEntity;
import co.edu.usco.repository.VehicleTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TypeVehicleService {
    private final VehicleTypeRepository typeRepository;

    public List<VehicleTypeEntity> getAllTypes() {
        return typeRepository.findAll();
    }
}
