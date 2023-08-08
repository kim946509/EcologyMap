package ecobridge.EcologyMap.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter //자동으로 GET메서드를 통해 필드 접근 가능
@NoArgsConstructor(access = AccessLevel.PROTECTED) //접근제어자가 protected인 기본생성자 코드없이 생성
public class MainCategory {
    //카테고리 ID
    @Id
    @Column(name="main_category_id", updatable = false)
    private Long category_id;

    @Column(name="main_category_name", updatable=false)
    private String category_name;
}

