package jpabasic.ex1hellojpa.hellojpa;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Book extends Items {
    private String author;
    private String isbn;
}
