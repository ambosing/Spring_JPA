package jpabasic.ex1hellojpa.hellojpa;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Movies extends Items {
    private String director;
    private String actor;
}
