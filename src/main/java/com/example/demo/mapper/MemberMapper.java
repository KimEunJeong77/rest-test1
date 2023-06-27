package com.example.demo.mapper;

import com.example.demo.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberMapper {
    List<MemberDTO> selectMemberList();
    MemberDTO selectMemberDetail(@Param("paramId") String id);
    void updateMember(MemberDTO memberDTO);
    void insertMember(MemberDTO memberDTO);
    void deleteMember(String id);
}
