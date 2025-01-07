package com.workintech.s19d2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Member", schema = "fsweb")
public class Member {
    private Long id;
    private String email;
    private String password;
}
