package jpabasic.ex1hellojpa.hellojpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Members extends BaseEntity {

    @Id
    @Column(name = "MEMBERS_ID")
    private Long id;
    @Column(name = "USERNAME")
    private String name;

    @OneToOne
    @JoinColumn(name = "LOCKER_ID")
    private Locker locker;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

//    @Column(name = "TEAM_ID")
//    private Long teamId;
}
