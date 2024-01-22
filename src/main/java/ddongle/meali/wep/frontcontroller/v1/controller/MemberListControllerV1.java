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
    MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException, ServletException {
        List<Member> members = memberRepository.findAll();
        request.setAttribute("member", members);

        String viewPath = "/WEB-INF/views/members.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);

    }
}
