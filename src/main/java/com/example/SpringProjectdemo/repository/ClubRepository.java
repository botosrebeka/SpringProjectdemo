package com.example.SpringProjectdemo.repository;

import com.example.SpringProjectdemo.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends JpaRepository<Club, Integer>{
 }
