package com.SpringRest.SpringRest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringRest.SpringRest.Entities.Students;

public interface StudentDao extends JpaRepository<Students, Long> {

}
