package com.example.demo.controller;

import com.example.demo.dto.MemberDTO;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView("/index");
        return mv;
    }

    @GetMapping("/update-form")
    public ModelAndView updateForm(){
        ModelAndView mv=new ModelAndView("/updateForm");
        return mv;
    }

    @GetMapping("/join-form")
    public ModelAndView joinForm(){
        ModelAndView mv=new ModelAndView("joinForm");
        return mv;
    }

    @GetMapping("/delete-form")
    public ModelAndView deleteForm(){
        ModelAndView mv=new ModelAndView("deleteForm");
        return mv;
    }

    @GetMapping("/list")
    public String findMemberList(){
        return memberService.findMemberList().toString();
    }

    @GetMapping("/{id}")
    public ModelAndView findMemberDetail(@PathVariable String id) {

        //return memberService.findMemberDetail(id).toString();
        ModelAndView mv=new ModelAndView("/updateForm");
        MemberDTO member=memberService.findMemberDetail(id);
        mv.addObject("member", member);
        return mv;
    }

    @PutMapping("")
    public String modifyMember(MemberDTO memberDTO){
        memberService.modifyMember(memberDTO);
        return "회원수정됨";
    }

    @PostMapping("")
    public String regitsterMember(MemberDTO memberDTO){
        memberService.registerMember(memberDTO);
        return "회원가입됨";
    }

    @DeleteMapping ("/{id}")
    public String removeMember(@PathVariable String id) {
        memberService.removeMember(id);
        return "회원삭제됨";
    }
}
