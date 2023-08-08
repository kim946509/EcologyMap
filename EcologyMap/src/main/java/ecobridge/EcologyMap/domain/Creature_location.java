
package ecobridge.EcologyMap.domain;

import jakarta.persistence.*;
import jdk.jfr.StackTrace;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) //접근제어자가 protected 인 기본생성자 코드없이 생성
public class Creature_location {

    //고유 ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    //위도
    @Column(name="creature_latitude")
    private double creature_latitude;

    //경도
    @Column(name="creature_longitude")
    private double creature_longitude;

    //생물 ID
    @ManyToOne //Creation_location 엔티티가 하나의 Creature 엔티티와 관계를 맺을 수 있음을 타나냄.
    @JoinColumn(name = "creature_id")
    private Creature creature;


    //장소 이름
    @Column(name="location_name")
    private String location_name;



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
