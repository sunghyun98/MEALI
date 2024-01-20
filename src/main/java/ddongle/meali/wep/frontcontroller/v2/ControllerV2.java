package ddongle.meali.wep.frontcontroller.v2;

import ddongle.meali.wep.frontcontroller.MyView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface ControllerV2 {
    MyView process(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException, ServletException;

}

