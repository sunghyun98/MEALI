package ddongle.meali.wep.servletmvc;

import ddongle.meali.domain.member.Member;
import ddongle.meali.domain.member.MemberRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "mvcMemberSaveServlet" , urlPatterns = "/WEB-INT/views/save")
public class MvcMemberSaveServlet extends HttpServlet {
    MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        Member member = new Member(username,age);
        System.out.println("member = " + member);
        memberRepository.save(member);

        //모델에 데이터를 보관한다
        request.setAttribute("member", member);

        String viewPath = "/WEB-INT/views/save-result.jsp";

    }
}
