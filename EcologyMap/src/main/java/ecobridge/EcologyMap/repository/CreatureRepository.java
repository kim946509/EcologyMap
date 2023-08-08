package ecobridge.EcologyMap.repository;

import ecobridge.EcologyMap.domain.Creature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatureRepository extends JpaRepository<Creature, Long> {

}
