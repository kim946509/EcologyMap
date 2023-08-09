package ecobridge.EcologyMap.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Creature_location {

    //고유 ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", updatable = false)
    private Long id;

    //위도
    @Column(name="creature_latitude")
    private Long creature_latitude;

    //경도
    @Column(name="creature_longitude")
    private Long creature_longitude;

    //생물 ID
    @ManyToOne //Creation_location 엔티티가 하나의 Creature 엔티티와 관계를 맺을 수 있음을 나타냄.
    @JoinColumn(name="creature_id")
    private Creature creature;

    //장소 이름
    @Column(name="location_name", nullable = false)
    private String location_name;

}


