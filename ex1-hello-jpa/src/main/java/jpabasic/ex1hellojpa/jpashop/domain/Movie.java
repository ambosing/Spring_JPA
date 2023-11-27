package jpabasic.ex1hellojpa.jpashop.domain;

import jakarta.persistence.Entity;
import jpabasic.ex1hellojpa.hellojpa.Items;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Movie extends Items {
    private String director;
    private String actor;
}
