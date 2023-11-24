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
        Member member = new Member();
        member.setId(++sequence);
        member.setName(name);
        em.persist(member);
    }

    Optional<Member> findById(Long id) {
        Member member = em.find(Member.class, id);
        return Optional.of(member);
    }

    List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class).getResultList();
    }
    
}
