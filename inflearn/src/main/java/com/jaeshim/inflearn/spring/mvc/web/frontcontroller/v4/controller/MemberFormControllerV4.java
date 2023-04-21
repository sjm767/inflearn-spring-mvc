package com.jaeshim.inflearn.spring.mvc.web.frontcontroller.v4.controller;

import com.jaeshim.inflearn.spring.mvc.web.frontcontroller.ModelView;
import com.jaeshim.inflearn.spring.mvc.web.frontcontroller.v3.ControllerV3;
import com.jaeshim.inflearn.spring.mvc.web.frontcontroller.v4.ControllerV4;
import java.util.Map;

public class MemberFormControllerV4 implements ControllerV4 {

  @Override
  public String process(Map<String, String> paramMap, Map<String, Object> model) {
    return "new-form";
  }
}