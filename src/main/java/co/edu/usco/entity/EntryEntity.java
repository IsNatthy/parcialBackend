package co.edu.usco.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "entries_vehicles")
public class EntryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 6)
    private String plate;

    private String location;

    @Column(name = "entry_time")
    private Integer entryTime;

    @Column(name = "exit_time")
    private Integer exitTime;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", referencedColumnName = "id")
    private VehicleTypeEntity vehicle;
}
