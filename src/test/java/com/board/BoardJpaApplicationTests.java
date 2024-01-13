package com.board;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.board.entity.repository.MemberRepository;

@SpringBootTest
class BoardJpaApplicationTests {

	@Autowired
	MemberRepository memberRepository;
	
	@Autowired
	BCryptPasswordEncoder pwEncoder;
	
	@Test
	void contextLoads() {
		System.out.println(pwEncoder.encode("@Ajendbh7!"));
		
	}

}
