package co.edu.usco.service;

import co.edu.usco.entity.EntryEntity;
import co.edu.usco.repository.EntryRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EntryService {
    private EntryRepository entryRepository;

    public List<EntryEntity> getAllEntries() {
        return entryRepository.findAll();
    }

    public EntryEntity getEntryById(Long id) {
        return entryRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Entry not found!"));
    }

    public void createEntry(EntryEntity entry) {
        entryRepository.save(entry);
    }

    public void updateEntry(EntryEntity entry, Long id) {
        EntryEntity entryDB = entryRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Entry not found"));

        entryDB.setEntryTime(entry.getEntryTime());
        entryDB.setExitTime(entry.getExitTime());
        entryDB.setPlate(entry.getPlate());
        entryDB.setLocation(entry.getLocation());
        entryDB.setVehicle(entry.getVehicle());

        entryRepository.save(entryDB);
    }

    public void deleteEntryById(Long id) {
        entryRepository.deleteById(id);
    }
}
