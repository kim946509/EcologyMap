package ecobridge.EcologyMap.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter //자동으로 GET 메서드를 통해 필드 접근 가능
@NoArgsConstructor(access = AccessLevel.PROTECTED) //접근제어자가 protected 인 기본생성자 코드없이 생성
public class DetailCategory {

    //생물 ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="creature_id", updatable = false)
    private Long creature_id;

    //생물 이름
    @Column(name = "creature_name", nullable = false)
    private String creature_name;

}
