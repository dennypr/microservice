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
        <form action="/v1/updateCus" method="POST">
       <table border="0" >
           
	    <c:forEach var="tabel" items="${tblresult}" >
                <tr>
                    <td width="5%">Id :</td><td width="20%"><input type="text" name="id" value="${tabel.id}" reaonly></td>
                </tr>
                <tr>
                    <td width="5%">Name :</td><td width="20%"><input type="text" name="name" value="${tabel.name}"></td>
                </tr>
                <tr>
                    <td width="5%">Age :</td><td width="20%"><input type="text" name="age" value="${tabel.age}"></td>
                </tr>
                <tr>
                    <td width="5%">Email :</td><td width="20%"><input type="text" name="email" value="${tabel.email}"></td>
                </tr>
                <tr>
                    <td width="5%">Address :</td><td width="20%"><input type="text" name="address" value="${tabel.address}"></td>
                </tr>
                
            </c:forEach>
            <tbody>
        </table>         
    
    <input type="submit"  value="submit">
    </form>
    </body>
</html>