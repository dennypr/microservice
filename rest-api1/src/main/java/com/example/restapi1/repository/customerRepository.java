/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restapi1.repository;

import com.example.restapi1.entity.Customer;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ThinkPad
 */

public interface customerRepository extends JpaRepository<Customer, Integer>{ 
   
     @Query(value="select a.cp_fkku from customer a where id=?1",nativeQuery = true)
     public String findCpfkk(Integer id);   
   
}
