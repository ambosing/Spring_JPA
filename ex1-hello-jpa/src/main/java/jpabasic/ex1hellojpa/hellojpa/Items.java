package jpabasic.ex1hellojpa.hellojpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Items {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int price;
}
