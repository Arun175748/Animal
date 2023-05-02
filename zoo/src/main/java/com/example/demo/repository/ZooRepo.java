package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ZooModel;

public interface ZooRepo extends JpaRepository<ZooModel,Integer> { 

}
