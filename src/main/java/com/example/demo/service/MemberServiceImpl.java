package com.example.demo.service;

import com.example.demo.dto.MemberDTO;
import com.example.demo.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{
    @Autowired
    private MemberMapper memberMapper;
    @Override
    public List<MemberDTO> findMemberList() {
        return memberMapper.selectMemberList();
    }

    @Override
    public MemberDTO findMemberDetail(String id) {
        return memberMapper.selectMemberDetail(id);
    }

    @Override
    public void modifyMember(MemberDTO memberDTO) {
        memberMapper.updateMember(memberDTO);
    }

    @Override
    public void registerMember(MemberDTO memberDTO) {
        memberMapper.insertMember(memberDTO);
    }

    @Override
    public void removeMember(String id) {
        memberMapper.deleteMember(id);
    }

}