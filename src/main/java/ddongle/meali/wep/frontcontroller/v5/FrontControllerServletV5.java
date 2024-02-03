package ddongle.meali.wep.frontcontroller.v5;

import ddongle.meali.wep.frontcontroller.v4.ControllerV4;
import ddongle.meali.wep.frontcontroller.v4.controller.MemberFormControllerV4;
import ddongle.meali.wep.frontcontroller.v4.controller.MemberListControllerV4;
import ddongle.meali.wep.frontcontroller.v4.controller.MemberSaveControllerV4;
import ddongle.meali.wep.frontcontroller.v5.adapter.ControllerV3HandlerAdapter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "frontControllerServletV5", urlPatterns = "/front-controller/v5/*")
public class FrontControllerServletV5 extends HttpServlet {

    private final Map<String, Object> handlerMappingMap = new HashMap<>();
    private final List<MyHandlerAdapter> handlerAdapters = new ArrayList<>();

    public FrontControllerServletV5() {
        initHandlerMappingMap();
        initHandlerAdapters();
    }

    private void initHandlerAdapters() {
        handlerAdapters.add(new ControllerV3HandlerAdapter());
    }

    private void initHandlerMappingMap() {
        handlerMappingMap.put("/front-controller/v4/members/new-form", new MemberFormControllerV4());
        handlerMappingMap.put("/front-controller/v4/members/save", new MemberSaveControllerV4());
        handlerMappingMap.put("/front-controller/v4/members", new MemberListControllerV4());
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object handler = getHander
    }

    private Object getHander(HttpServletRequest request){
        String requestURI = request.getRequestURI();
        return handlerMappingMap.get(requestURI);
    }

    private MyHandlerAdapter getHandlerAdapter(Object hander){
        for (MyHandlerAdapter adapter : handlerAdapters) {
            if ()
        }
    }
}
