package ecobridge.EcologyMap.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Creature_Activity_Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name="Creature_id")
    private Long creature_id;

    @JoinColumn(name="Season_id")
    private Long season_id;
}
