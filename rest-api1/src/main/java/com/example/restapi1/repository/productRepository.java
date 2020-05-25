/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restapi1.repository;

import com.example.restapi1.entity.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author ThinkPad
 */
public interface productRepository extends JpaRepository<Product, Integer>{
   @Query(value="select * from product a where pid=?1",nativeQuery = true)
   public Product findByPid(Integer id);
}
