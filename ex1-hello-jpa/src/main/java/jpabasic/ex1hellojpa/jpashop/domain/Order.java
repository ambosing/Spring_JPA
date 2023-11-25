package jpabasic.ex1hellojpa.jpashop.domain;

import jakarta.persistence.*;
import jpabasic.ex1hellojpa.hellojpa.Member;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;
//    @Column(name = "MEMBER_ID") // 객체지향적인 설계가 아님!
//    private Long memberId;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member; // 가급적 단방향

    private LocalDateTime orderDate;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}