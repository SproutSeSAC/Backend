package sprout.sesac.sprout.store.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 2024.08.18
 * ERD가 모두 작성된 것은 아니니 최소한으로 필요한 데이터만 담아서 진행했습니다
 */
@Entity
@Table(name="store")
@Data
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="created_date", nullable = false)
    private LocalDateTime createdDate;

    @Column(name="modified_date", nullable = true)
    private LocalDateTime modifiedDate;
}
