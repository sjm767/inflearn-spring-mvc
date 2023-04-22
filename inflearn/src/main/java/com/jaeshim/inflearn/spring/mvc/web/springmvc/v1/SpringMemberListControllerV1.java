package com.jaeshim.inflearn.spring.mvc.web.springmvc.v1;

import com.jaeshim.inflearn.spring.mvc.domain.member.Member;
import com.jaeshim.inflearn.spring.mvc.domain.member.MemberRepository;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMemberListControllerV1 {

  private final MemberRepository memberRepository = MemberRepository.getInstance();
  @RequestMapping("/springmvc/v1/members")
  public ModelAndView process() {
    List<Member> members = memberRepository.findAll();

    ModelAndView mv = new ModelAndView("members");
    mv.getModel().put("members", members);
    return mv;
  }



}
