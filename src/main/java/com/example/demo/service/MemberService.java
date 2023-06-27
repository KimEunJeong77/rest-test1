package com.example.demo.service;

import com.example.demo.dto.MemberDTO;
import java.util.List;

public interface MemberService {
    List<MemberDTO> findMemberList();
    MemberDTO findMemberDetail(String id);
    void modifyMember(MemberDTO memberDTO);
    void registerMember(MemberDTO memberDTO);
    void removeMember(String id);
}