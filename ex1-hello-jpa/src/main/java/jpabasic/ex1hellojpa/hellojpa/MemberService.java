package jpabasic.ex1hellojpa.hellojpa;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void save(String name) {
        memberRepository.save(name);
    }

    public void findById(Long id) {
        return;
    }

    public void update(String updatedName) {

    }

    public List<Members> findAll() {
        return memberRepository.findAll();
    }
}
