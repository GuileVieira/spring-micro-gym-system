package com.estudos.gym.service;

import com.estudos.gym.entity.Member;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
    Iterable<Member> getAllMembers();
    Member getMemberById(Long id);
    Member createMember(Member member);
    Member updateMember(Long id, Member member);
    void deleteMember(Long id);
}
