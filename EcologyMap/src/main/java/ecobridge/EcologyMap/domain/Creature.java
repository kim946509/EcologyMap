package ecobridge.EcologyMap.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter //자동으로 GET메서드를 통해 필드 접근 가능
@NoArgsConstructor(access = AccessLevel.PROTECTED) //접근제어자가 protected인 기본생성자 코드없이 생성
public class Creature {

    //생물 ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "creature_id", updatable = false)
    private Long creature_id;

    //생물 보호등급
    @Column(name = "creature_protection_class", nullable = false)
    private Long creature_protection_class;

    //생물 정보


    @Column(name = "creature_information", nullable = false)
    private String creature_information;

    //이미지 URL
    @Column(name = "image_url", nullable = false)
    private String image_url;

    //카테고리 ID
    @ManyToOne
    @JoinColumn(name = "main_category_id")
    private Main_Category category;

    @JoinColumn(name = "category_id")
    private Long category_id;


    //생물 이름
    @Column(name = "creature_name", nullable = false)
    private String creature_name;

}