<%-- 
    Document   : checkout
    Created on : Feb 5, 2013, 9:26:36 AM
    Author     : Chuck Wojciuk
--%>

<%@page import="java.util.List"%>
<%@page import="model.Food"%>
<%@page import="javax.swing.text.Document"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="foodcheckout.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <div>
            <form name="orderForm" method="POST" action="fs">
                <table class="mainTable" >
                    <tr class ="row1">
                        <td class="row1col1" >Food Service Calculator</td>
                        <td class="cashDueWindow">
                            <%
                                if(session.getAttribute( "foods" ) != null){
                                    out.println("$"+session.getAttribute( "totalCost" ) );
                                }else{
                                    out.println("$0.00");
                                }
                            %>
                        </td>

                        
                    </tr>
                    <tr class="row2">
                        <td>
                            <table class="foodTable">
                                <th style="text-align: left;">
                                    Food
                                </th>
                                <tr>
                                    <td id="hamburger" onmouseover="cond()" >
                                        Hamburger
                                        <p>(Meal)</p>
                                        <button type="submit" class="btn" id="hamplus" formaction="fs.do?action=addHam">+</button>
                                        
                                    </td>
                                    <td id="chicksand">
                                        Chicken Sandwich
                                        <p>(Meal)</p>
                                        <button class="btn" id="chicksandplus">+</button>
                                    </td>
                                    <td>
                                        Fries
                                        <p>(Side)</p>
                                        <button class="btn" id="friesplus">+</button>
                                    </td>
                                    <td>
                                        Salad
                                        <p>(Side)</p>
                                        <button class="btn" id="saladplus">+</button>
                                    </td>
                                </tr>
                                <tr>
                                    <td id="con" colspan="4" class="cond">
                                        <table style="width: 100%;">
                                            <tr class="condTable" style="height: 40px; vertical-align: top">
                                                <td>
                                                    <input type="checkbox" name="cond" value="Cheese">Cheese
                                                </td>
                                            
                                                <td>
                                                    <input type="checkbox" name="cond" value="Ketchup">Ketchup
                                                </td>
                                            
                                                <td>
                                                    <input type="checkbox" name="cond" value="Mustard">Mustard
                                                </td>
                                            
                                                <td>
                                                    <input type="checkbox" name="cond" value="Pickles">Pickles
                                                </td>
                                            
                                                <td>
                                                    <input type="checkbox" name="cond" value="Onions">Onions
                                                </td>
                                            </tr>
                                        </table>
                                    </td> 
                                </tr>
                            </table>
                        </td>
                        <td>
                            <div class="thereceiptarea">
                                <%
                                    if(session.getAttribute( "foods" )!=null ){
                                        out.println("<iframe src='receipt.jsp' style='width: 300px; height: 600px;'>");
                                    }
                                %>
                                
                            </div>
                        </td>
                    </tr>
                    
                </table>
            </form>
            
        </div>
    </body>
</html>
