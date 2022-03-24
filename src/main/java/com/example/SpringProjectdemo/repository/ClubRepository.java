package com.example.SpringProjectdemo.repository;

import com.example.SpringProjectdemo.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends JpaRepository<Club, Integer>{
 }
