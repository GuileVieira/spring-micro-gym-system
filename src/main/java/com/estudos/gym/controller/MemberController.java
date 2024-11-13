package com.estudos.gym.controller;


import com.estudos.gym.entity.Member;
import com.estudos.gym.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public ResponseEntity<Iterable<Member>> getAllMembers() {
        return ResponseEntity.ok().body(memberService.getAllMembers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Member> getMemberById(@PathVariable Long id) {
        return ResponseEntity.ok().body(memberService.getMemberById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Member> createMember(@RequestBody Member member) {
        return ResponseEntity.ok().body(memberService.createMember(member));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Member> updateMember(@PathVariable Long id, @RequestBody Member member) {
        return ResponseEntity.ok().body(memberService.updateMember(id, member));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMember(@PathVariable Long id) {
        memberService.deleteMember(id);
        return ResponseEntity.noContent().build();
    }

}
