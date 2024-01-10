package ddongle.meali.domain;


import ddongle.meali.domain.member.Member;
import ddongle.meali.domain.member.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    //모든 테스트 코드 실행후 실행됨
    @AfterEach
    void afterEach(){
        memberRepository.clearStore();
    }
    @Test
    void save(){
        //given
        Member member = new Member("hello", 20);

        Member saveMember = memberRepository.save(member);

        Member findMember = memberRepository.findById(saveMember.getId());

        assertThat(findMember).isEqualTo(saveMember);

    }

    @Test
    void findAll(){
        Member member = new Member("1", 23);
        Member member1 = new Member("2", 24);

        Member saveMember1 = memberRepository.save(member);
        Member saveMember2 = memberRepository.save(member1);

        List<Member> result = memberRepository.findAll();


        //결과가 두개이면 통과
        assertThat(result.size()).isEqualTo(2);

        //member,member1 가 포함되면 통과
        assertThat(result).contains(member,member1);
    }

}
