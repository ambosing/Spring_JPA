package jpabasic.ex1hellojpa.hellojpa;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Transactional
public class MemberRepository {
    private final EntityManager em;
    private static long sequence = 0;

    void save(String name) {
        Members member = new Members();
        member.setId(++sequence);
        member.setName(name);
        em.persist(member);
    }

    Optional<Members> findById(Long id) {
        Members member = em.find(Members.class, id);
        return Optional.of(member);
    }

    List<Members> findAll() {
        return em.createQuery("select m from Members m", Members.class).getResultList();
    }

}
