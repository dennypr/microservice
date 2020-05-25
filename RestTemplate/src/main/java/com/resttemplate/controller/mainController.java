/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resttemplate.controller;

import com.resttemplate.model.Customer;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;


/**
 *
 * @author ThinkPad
 */

@Controller
public class mainController {
   
    
    @RequestMapping(value="/v1/view", method = RequestMethod.GET)
    public String main(Map<String, Object> model){
        String uri = "http://localhost:8080/findAllCus";
        RestTemplate restTemplate = new RestTemplate();
        List result = restTemplate.getForObject(uri, List.class);

        model.put("tbl", result);
        
        return "view";
    }
    
    @RequestMapping(value="/v1/viewById", method = RequestMethod.POST)
    public String mainById(Map<String, Object> model, HttpServletRequest hsr){
        String uri = "http://localhost:8080/findAllCus/{id}";
        String id = hsr.getParameter("id");
        Map < String, String > params = new HashMap <> ();
        params.put("id", id);
 
        RestTemplate restTemplate = new RestTemplate();
        List result = restTemplate.getForObject(uri, List.class, params);

        model.put("tbl", result);
        
        return "view";
    }
    
    @RequestMapping(value="/v1/deleteById", method = RequestMethod.POST)
    public void deleteById(Map<String, Object> model, HttpServletRequest hsr, HttpServletResponse hsr1) throws IOException{
        String uri = "http://localhost:8080/deleteCus/{id}";
        String id = hsr.getParameter("id");
        Map<String, String> params = new HashMap<>();
        params.put("id", id);
 
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(uri, params);
        hsr1.sendRedirect("/v1/view");        
        
        
    }
     
    @RequestMapping(value="/v1/insertCus", method = RequestMethod.POST)
    public  void insert( Map<String, Object> model, HttpServletRequest hsr, HttpServletResponse hsr1) throws IOException {
        String uri = "http://localhost:8080/insertCus";         
        Map <String,Object> params = new HashMap<String,Object>();      
        params.put("name", hsr.getParameter("name"));
        params.put("age", Integer.parseInt(hsr.getParameter("age")));
        params.put("email", hsr.getParameter("email"));
        params.put("address", hsr.getParameter("address"));      
        RestTemplate restTemplate = new RestTemplate();  
        restTemplate.postForObject(uri, params, Customer.class);
        hsr1.sendRedirect("/v1/view");
        

    }
    
    @RequestMapping(value="/v1/getupdateCus", method = RequestMethod.POST)
    public  String getupdateview( Map<String, Object> model, HttpServletRequest hsr, HttpServletResponse hsr1) throws IOException {
        
        String uri = "http://localhost:8080/findAllCus/{id}";
        String id = hsr.getParameter("id");
        Map < String, String > params = new HashMap <> ();
        params.put("id", id);
 
        RestTemplate restTemplate = new RestTemplate();
        List result = restTemplate.getForObject(uri, List.class, params);

        model.put("tblresult", result);
        return "update";
        

    }
    
    @RequestMapping(value="/v1/updateCus", method = RequestMethod.POST)
    public  void update( Map<String, Object> model, HttpServletRequest hsr, HttpServletResponse hsr1) throws IOException {
        String uri = "http://localhost:8080/insertCus";         
        Map <String,Object> params = new HashMap<String,Object>(); 
        params.put("id", hsr.getParameter("id"));
        params.put("name", hsr.getParameter("name"));
        params.put("age", Integer.parseInt(hsr.getParameter("age")));
        params.put("email", hsr.getParameter("email"));
        params.put("address", hsr.getParameter("address"));      
        RestTemplate restTemplate = new RestTemplate();  
        restTemplate.postForObject(uri, params, Customer.class);
        hsr1.sendRedirect("/v1/view");
        

    }
  
}
