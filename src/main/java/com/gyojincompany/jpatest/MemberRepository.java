package com.gyojincompany.jpatest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberDto, Long>{
	
	//public List<MemberDto> findById(String id);
}
