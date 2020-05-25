/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restapi1.controller;

import com.example.restapi1.entity.Cus;
import com.example.restapi1.entity.Customer;
import com.example.restapi1.entity.Product;
import com.example.restapi1.repository.cusRepository;
import com.example.restapi1.repository.customerRepository;
import com.example.restapi1.repository.productRepository;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ThinkPad
 */

@RestController
public class mainController {
    
    @Autowired
    private cusRepository CusRepository;
    
    @Autowired
    private customerRepository CustomerRepository;
    
    @Autowired
    private productRepository ProductRepository;
    
    @PostMapping("/insert")
    public Customer insertdf(@Valid @RequestBody Customer request){
        return CustomerRepository.save(request);
    }
    
    // one Table
   
    @PostMapping("/insertCus")
    public Cus insertcus(@Valid @RequestBody Cus cus){
        return CusRepository.save(cus);        
    }
    
    @PostMapping("/updateCus")
    public Cus updatecus(@Valid @RequestBody Cus cus , @PathVariable(value="id") int id){
        cus.setId(id);
        cus.setName(cus.getName());
        cus.setAge(cus.getAge());
        cus.setEmail(cus.getEmail());
        cus.setAddress(cus.getAddress());
        return CusRepository.save(cus);        
    }
    
    @GetMapping("/findAllCus")
    public List<Cus> finddfcus(){
        return CusRepository.findAll();        
    }
    
    @GetMapping("/findAllCus/{id}")
    public List<Cus> finddfcusid(@PathVariable(value="id") Integer id){
        return CusRepository.findById2(id);
        
    }
    
    @DeleteMapping("/deleteCus/{id}")
    public List<Cus> deletecusid(@PathVariable(value="id") Integer id){
        CusRepository.deleteById(id);        
        return CusRepository.findAll();        
    }
    // one Table
    
    @GetMapping("/findAll")
    public List<Customer> finddf(){
        return CustomerRepository.findAll();        
    }
    
    @GetMapping("/findAll/{id}")
    public Optional<Customer> finddfa(@PathVariable(value="id") Integer id){        
        return CustomerRepository.findById(id);
    }
    
    @DeleteMapping("/delete/{id}")
    public List<Customer> deletefa(@PathVariable(value="id") Integer id){
        CustomerRepository.deleteById(id);
        return CustomerRepository.findAll();
    }
    
    @PutMapping("/update/{id}")
    public Optional<Customer> updatefa(@Valid @RequestBody Customer request, @PathVariable(value="id") Integer id){
        String cpkku = CustomerRepository.findCpfkk(id);
        Customer cs = new Customer();
        cs.setId(id);
        cs.setName(request.getName());
        cs.setAge(request.getAge());
        cs.setEmail(request.getEmail());
        cs.setAddress(request.getAddress());        
        Product prod = ProductRepository.findByPid(Integer.valueOf(cpkku));
        cs.setProducts(prod);
        CustomerRepository.save(cs);    
    
        Product pr = new Product();
        pr.setPid(Integer.valueOf(cpkku));
        pr.setName_product(request.getProducts().getName_product());
        pr.setQty(request.getProducts().getQty());
        pr.setPrice(request.getProducts().getPrice());        
        ProductRepository.save(pr);       
       
        return CustomerRepository.findById(id);
    }
}
