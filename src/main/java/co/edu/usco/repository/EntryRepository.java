package co.edu.usco.repository;

import co.edu.usco.entity.EntryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EntryRepository extends JpaRepository<EntryEntity, Long> {}
