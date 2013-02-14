<%-- 
    Document   : receipt
    Created on : Feb 11, 2013, 2:28:26 PM
    Author     : Chuck Wojciuk
--%>

<%@page import="model.Condiment"%>
<%@page import="java.util.List"%>
<%@page import="model.Food"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="receiptStyleSheet.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <div class="thereceiptarea">
            <form name="orderForm" method="POST" action="rs">
                <%
                    if((Double.parseDouble(session.getAttribute( "totalCost").toString())!= 0.0 )){
                        out.println("<table class='receipttable'>");
                        out.println("<tr>");
                        out.println("<td colspan='3'><h1>Thank You for Ordering!</h1></td>");
                        out.println("</tr>");
                        if(session.getAttribute( "foods" )!=null ){
                            List<Food> foods = (List)request.getSession().getAttribute( "foods" );
                            int counter = 0;
                            for(Food food: foods){
                                out.println("<tr><td>"+food.getFoodType()+ "</td>" + "<td> $" + food.getCost()+"</td>" + "<td><button type='submit' id='item"+counter+"' formaction='rs.do?i="+ counter +"'>-</button></td></tr>");
                                 for(Condiment c: food.getCondiments()){
                                     out.println("<tr class='condRow'><td><p>"+c.getCondimentType()+"</p></td><td></td></tr>");
                                 }
                            }
                        }
                        out.println("<tr>");
                        out.println("<td>");
                        out.println("Total Cost:</td>" + "<td>$"+ session.getAttribute( "totalCost" ) );
                        out.println("</td>");
                        out.println("</tr>");
                        out.println("<tr>");
                        out.println("<td>");
                        out.println("Thank You!");
                        out.println("</td>");
                        out.println("</tr>");
                        out.println("</table>");
                    }
                %>
            </form>              
        </div>
    </body>
</html>
