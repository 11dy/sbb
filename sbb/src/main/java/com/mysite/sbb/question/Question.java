package com.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

import com.mysite.sbb.user.SiteUser;
import java.util.Set;
import javax.persistence.ManyToMany;

import com.mysite.sbb.answer.Answer;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity // 엔티티란 데이터베이스 테이블과 매핑되는 자바 클래스 (모델 or 도메인 모델)
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // strategy: 고유번호 생성 옵션
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

    @ManyToOne
    private SiteUser author;

    private LocalDateTime modifyDate;

    @ManyToMany
    Set<SiteUser> voter;
}
