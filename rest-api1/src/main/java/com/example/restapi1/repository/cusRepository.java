/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restapi1.repository;

import com.example.restapi1.entity.Cus;
import com.example.restapi1.entity.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author ThinkPad
 */
public interface cusRepository extends JpaRepository<Cus, Integer>{
    @Query(value="select * from customer a where id=?1",nativeQuery = true)
   public List<Cus> findById2(Integer id);
}
