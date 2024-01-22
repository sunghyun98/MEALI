package ddongle.meali.wep.frontcontroller.v2.controller;

import ddongle.meali.domain.member.Member;
import ddongle.meali.domain.member.MemberRepository;
import ddongle.meali.wep.frontcontroller.MyView;
import ddongle.meali.wep.frontcontroller.v2.ControllerV2;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class MemberListControllerV2 implements ControllerV2 {
    MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException, ServletException {
        List<Member> members = memberRepository.findAll();
        request.setAttribute("member", members);
        return new MyView( "/WEB-INF/views/members.jsp");
    }
}
