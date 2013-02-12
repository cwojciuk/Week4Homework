<%-- 
    Document   : receipt
    Created on : Feb 11, 2013, 2:28:26 PM
    Author     : Chuck Wojciuk
--%>

<%@page import="java.util.List"%>
<%@page import="model.Food"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="foodcheckout.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <div class="thereceiptarea">
                                
                                <%
                                    out.println("<table class='receipttable'>");
                                    out.println("<tr>");
                                    out.println("<td colspan='2'><h1>Thank You for Ordering!</h1></td>");
                                    out.println("</tr>");
                                    if(session.getAttribute( "foods" )!=null ){
                                        List<Food> foods = (List)request.getSession().getAttribute( "foods" );
                                        for(Food food: foods){
                                            out.println("<tr><td>"+food.getFoodType()+ "</td>" + "<td> $" + food.getCost()+"</td></tr>");
                                        }
                                    }
                                    out.println("<tr>");
                                    out.println("<td>");
                                    out.println("Total Cost:</td>" + "<td>$"+ session.getAttribute( "totalCost" ) );
                                    out.println("</td>");
                                    out.println("</tr>");
                                    out.println("</table>");
                                %>
                                Thank You!
                            </div>
    </body>
</html>
