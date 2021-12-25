package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.moduls.employe;

@Repository
public interface employerepository extends JpaRepository<employe,Integer>{

}
