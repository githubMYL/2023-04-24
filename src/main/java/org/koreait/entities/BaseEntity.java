package org.koreait.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter @Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {


    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(updatable = false)  // 수정 불가
    private LocalDateTime regDt;


    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @Column(insertable = false) // 추가 불가
    private LocalDateTime modDt;
}
