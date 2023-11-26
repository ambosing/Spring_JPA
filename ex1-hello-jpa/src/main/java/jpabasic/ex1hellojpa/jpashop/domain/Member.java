package jpabasic.ex1hellojpa.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
public class Member {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "USERNAME")
    private String name;
    private String city;
    private String street;
    private String zipcode;

    @OneToMany()
    @JoinColumn(name = "ORDER_ID")
    private List<Order> orders = new ArrayList<>();

}
