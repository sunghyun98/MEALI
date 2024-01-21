package ddongle.meali.wep.frontcontroller.v1.controller;

import ddongle.meali.domain.member.Member;
import ddongle.meali.domain.member.MemberRepository;
import ddongle.meali.wep.frontcontroller.MyView;
import ddongle.meali.wep.frontcontroller.v1.ControllerV1;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class MemberListControllerV1 implements ControllerV1 {
    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException, ServletException {
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        Member member = new Member(username,age);
        memberRepository.save(member);

        //모델에 데이터를 보관한다
        request.setAttribute("member", member);

        return new MyView("/WEB-INF/views/save-result.jsp");
    }
}
