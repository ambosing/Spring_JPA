package jpabasic.ex1hellojpa.hellojpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Locker {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

//    @OneToOne(mappedBy = "locker") 양방향일 경우
//    private Member member;
}
