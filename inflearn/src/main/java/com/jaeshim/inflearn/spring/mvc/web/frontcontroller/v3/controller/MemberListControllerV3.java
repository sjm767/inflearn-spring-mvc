package com.jaeshim.inflearn.spring.mvc.web.frontcontroller.v3.controller;

import com.jaeshim.inflearn.spring.mvc.domain.member.Member;
import com.jaeshim.inflearn.spring.mvc.domain.member.MemberRepository;
import com.jaeshim.inflearn.spring.mvc.web.frontcontroller.ModelView;
import com.jaeshim.inflearn.spring.mvc.web.frontcontroller.v3.ControllerV3;
import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {
  private final MemberRepository memberRepository = MemberRepository.getInstance();
  @Override
  public ModelView process(Map<String, String> paramMap) {
    List<Member> members = memberRepository.findAll();

    ModelView mv = new ModelView("members");
    mv.getModel().put("members", members);
    return mv;
  }
}
