package com.smhrd.myapp.repo;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smhrd.myapp.domain.Member;

@Repository
public interface Repo extends JpaRepository<Member, String>{

	@Query("SELECT m FROM Member m WHERE m.id = :id")
	Optional<Member> findById(@Param("id") String id);
	find
}
