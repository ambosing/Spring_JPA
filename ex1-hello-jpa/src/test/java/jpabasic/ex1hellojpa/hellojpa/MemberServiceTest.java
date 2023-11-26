package jpabasic.ex1hellojpa.hellojpa;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Test
    void save() {
        memberService.save("A");
    }

    @Test
    void findAll() {
        memberService.save("A");
        memberService.save("B");

        List<Members> members = memberService.findAll();
        for (Members member : members) {
            log.info("member : {}", member);
        }
    }
}