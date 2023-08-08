package ecobridge.EcologyMap.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Season_id")
    private Long season_id;

    @Column(name="Season_name")
    private String season_name;
}