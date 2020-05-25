<%-- 
    Document   : index
    Created on : Apr 15, 2020, 7:01:58 PM
    Author     : Denny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AddSoal</title>        
        <!-- FIlter -->
     
    </head>
    <body>

       <table border="1" >
            <thead>
                <tr>             
                    <th >ID</th>
                    <th >Name</th>   
                    <th >Age</th>
                    <th >Email</th>  
                    
                     <th >Address</th>
                    <th >Pid</th>   
                     <th >Name Product</th>
                    <th >QTY</th>   
                    <th >Price</th>   
                   
                </tr>
            </thead>
            <tbody  >
	    <c:forEach var="tabel" items="${tbl}" >
                <tr>
                    <td width="5%"><c:out value="${tabel.id}" /></td>
                    <td width="10%"><c:out value="${tabel.name}" /></td>   
                     <td width="5%"><c:out value="${tabel.age}" /></td>
                    <td width="10%"><c:out value="${tabel.email}" /></td>  
                    <td width="10%"><c:out value="${tabel.address}" /></td>  
                     <td width="5%"><c:out value="${tabel.products.pid}" /></td>
                     <td width="10%"><c:out value="${tabel.products.name_product}" /></td>  
                    <td width="3%"><c:out value="${tabel.products.qty}" /></td>  
                     <td width="5%"><c:out value="${tabel.products.price}" /></td>
             
                </tr>
            </c:forEach>
            <tbody>
        </table>         
    <br>
    <div align="right">
    <a href="/add" ><input type="button" name="add" value="Add"></a>
    </div>
    </body>
</html>