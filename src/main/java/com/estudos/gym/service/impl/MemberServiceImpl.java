package com.estudos.gym.service.impl;

import com.estudos.gym.entity.Member;
import com.estudos.gym.respository.MemberRepository;
import com.estudos.gym.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Iterable<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    @Override
    public Member getMemberById(Long id) {
        return memberRepository.findById(id).orElse(null);
    }

    @Override
    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member updateMember(Long id, Member member) {

        member.setId(id);

        return memberRepository.save(member);
    }

    @Override
    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }
}
