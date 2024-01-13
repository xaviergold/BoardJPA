package com.board.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name="member")
@Table(name="tbl_member")
public class MemberEntity {
	
	@Id
	@Column(name="email",length=50,nullable=false)
	private String email;
	
	@Column(name="username",length=50,nullable=false)
	private String username;
	
	@Column(name="password",length=200,nullable=false)
	private String password;
	
	@Column(name="gender",length=20,nullable=true)
	private String gender;
	
	@Column(name="hobby",length=50,nullable=true)
	private String hobby;
	
	@Column(name="job",length=20,nullable=true)
	private String job;
	
	@Column(name="description",length=2000,nullable=true)
	private String description;
	
	@Column(name="zipcode",length=20,nullable=true)
	private String zipcode;
	
	@Column(name="address",length=200,nullable=true)
	private String address;
	
	@Column(name="telno",length=20,nullable=true)
	private String telno;
	
	@Column(name="nickname",length=20,nullable=true)
	private String nickname;
	
	@Column(name="role",length=20,nullable=false)
	private String role;
	
	@Column(name="org_filename",length=200,nullable=true)
	private String org_filename;
	
	@Column(name="stored_filename",length=200,nullable=true)
	private String stored_filename;
	
	@Column(name="filesize",nullable=true)
	private Long filesize;
	
	@Column(name="regdate",nullable=false)
	private LocalDateTime regdate;
	
	@Column(name="fromsocial",length=2, nullable=false)
	private String FromSocial;
	
	@Column(name="authkey",length=200, nullable=true)
	private String authkey;
	
	@Column(name="lastlogindate", nullable=true)
	private LocalDateTime lastlogindate;
	
	@Column(name="lastlogoutdate", nullable=true)
	private LocalDateTime lastlogoutdate;
	
	@Column(name="lastpwdate", nullable=true)
	private LocalDateTime lastpwdate;
	
	@Column(name="pwcheck", nullable=true)
	private int pwcheck;
	
}
