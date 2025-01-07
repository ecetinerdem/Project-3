package com.workintech.s19d2.service;

import com.workintech.s19d2.entity.Member;

import java.util.List;

public interface MemberService {
    List<Member> findAll();
    Member findById(Long id);
    Member findByEmail(String email);
    Member save(Member member);
    Member delete(Long id);
}
