package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Node;

@Repository
public interface LinkedListRepository extends JpaRepository<Node, Integer>{

}
