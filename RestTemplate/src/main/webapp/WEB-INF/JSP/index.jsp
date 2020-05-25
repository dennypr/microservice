<%-- 
    Document   : index
    Created on : May 11, 2020, 2:18:58 PM
    Author     : ThinkPad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>       
        <table border="1" >
            <tr>
                <td>1. View</td>
                <td><a href="/v1/view"> view</a></td>
            </tr>
            <tr>
                <td>2. View by Id </td>
                <td>
                    <form action="/v1/viewById" method="POST" >
                         <label for="id">Input an id:</label>
                        <input type="text" name="id"/>
                        <input type="submit" value="submit" />
                    </form>
                </td>
            </tr>
            
            <tr>
                <td>3. Delete by Id </td>
                <td>
                    <form action="/v1/deleteById" method="POST" >
                        <label for="id">Input an id:</label>
                        <input type="text" name="id"/>
                        <input type="submit" value="submit" />
                    </form>
                </td>
            </tr>
            <tr>
                <td>4. Insert All </td>
                <td>
                    <form action="/v1/insertCus" method="POST" >
                        <table>
                            
                            <tr><td>Name :</td><td><input type="text" name="name" required/></td></tr>
                            <tr><td>Age :</td><td><input type="text" name="age" required/></td></tr>
                            <tr><td> Email :</td><td><input type="text" name="email" required/></td></tr>
                            <tr><td>Address :</td><td><input type="text" name="address" required/></td></tr>
<!--                            <tr><td>CPFKKU :</td><td><input type="text" name="cpfkku"/></td></tr>-->
                        </table>
                        <input type="submit" value="submit" />
                    </form>
                </td>
            </tr>
            
            <tr>
                <td>5. Update All </td>
                <td>
                    <form action="/v1/getupdateCus" method="POST" >
                        Id :<input type="text" name="id" required/>
                        <input type="submit" value="submit" />
                    </form>
                </td>
            </tr>
       
        </table>
    </body>
</html>
