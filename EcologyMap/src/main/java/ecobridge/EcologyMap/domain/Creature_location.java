package EcologyMap.src.main.java.ecobridge.EcologyMap.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Creature_location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", updatable = false)
    private Long id;

    //생물 보호등급
    @Column(name="creature_latitude", nullable = false)
    private Long creature_latitude;

    @Column(name="creature_longitude", nullable = false)
    private Long creature_longitude;



    @ManyToOne
    @JoinColumn(name="creature_id") //
    private Creature creature;

    //장소 이름
    @Column(name="location_name", nullable = false)
    private String location_name;
}
