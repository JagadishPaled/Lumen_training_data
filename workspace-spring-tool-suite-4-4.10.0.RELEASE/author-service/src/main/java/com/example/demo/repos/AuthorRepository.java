package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
	public List<Author> findByFirstName(String srchString);
	public List<Author> findByAddress(String srchString);
	
	@Query(value="update authors set firstName=:newAmount where phoneNumber=:id",nativeQuery = true)
	@Modifying
	@Transactional
	public int updateAmount(@Param("newAmount") String amtToUpdate,@Param("id") long id);
}
