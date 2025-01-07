package com.workintech.s19d2.repository;

import com.workintech.s19d2.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
