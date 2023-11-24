package jpabasic.ex1hellojpa.hellojpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    @Column(name = "USERNAME")
    private String name;
    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

//    @Column(name = "TEAM_ID")
//    private Long teamId;
}
