/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.jms.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import model.Condiment;
import model.Food;
import services.TotalCostService;

/**
 *
 * @author Chuck Wojciuk
 */
@WebServlet(name = "ReceiptServlet", urlPatterns = { "/rs.do" })
public class ReceiptServlet extends HttpServlet {
    /**
     *
     */
    public static final String PAGE = "receipt.jsp";
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     *
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet( HttpServletRequest request,
                          HttpServletResponse response )
            throws ServletException, IOException {
        
    }


    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     *
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost( HttpServletRequest request,
                           HttpServletResponse response )
            throws ServletException, IOException {
        List<Food> list = ( List<Food> ) request.getSession().getAttribute( FloatingValues.FOODS.getValue());
        int index =  Integer.parseInt( request.getParameter( FloatingValues.I.getValue()));
        list.remove( index );
        TotalCostService tcs  = new TotalCostService();
        double total = tcs.getTotal(list);
        request.getSession().setAttribute( FloatingValues.FOODS.getValue() , list);
        request.getSession().setAttribute( FloatingValues.TOTAL.getValue() , total);
        RequestDispatcher view = request.getRequestDispatcher(PAGE);
        view.forward(request, response);
    }


    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


}

