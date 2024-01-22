package ddongle.meali.wep.frontcontroller.v3.controller;

import ddongle.meali.domain.member.Member;
import ddongle.meali.domain.member.MemberRepository;
import ddongle.meali.wep.frontcontroller.ModelView;
import ddongle.meali.wep.frontcontroller.v3.ControllerV3;

import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {
    MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public ModelView process(Map<String, String> paramMap) {

        List<Member> members = memberRepository.findAll();
        ModelView mv = new ModelView("members");
        mv.getModel().put("member",members);
        return mv;
    }
}
