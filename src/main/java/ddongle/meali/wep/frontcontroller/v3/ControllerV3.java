package ddongle.meali.wep.frontcontroller.v3;

import ddongle.meali.wep.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {
    ModelView process(Map<String, String> paramMap);
}
