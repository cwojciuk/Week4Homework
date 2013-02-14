/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import model.*;
import services.ToCondimentListService;
import services.TotalCostService;


/**
 *
 * @author Chuck Wojciuk
 */
@WebServlet(name = "foodServlet", urlPatterns = { "/fs.do" })

public class foodServlet extends HttpServlet {
    /**
     *
     */
    public static final String PAGE = "checkout.jsp";
    /**
     *
     */
    public static final String CHPAGE = "cos";
    private TotalCostService tcs;
    private List<Food> foods = new ArrayList<Food>();
    
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
        
        HttpSession session = request.getSession(true);
        
        double total = 0;
        String action = request.getParameter(FloatingValues.ACTION.getValue());
        response.setContentType("text/html");
        ToCondimentListService tcls = new ToCondimentListService();
        
        if(action.equals( FloatingValues.HAM.getValue() )){
            foods.add( new Hamburger(tcls.stringsToList( request.getParameterValues(FloatingValues.COND.getValue()) )));
        }
        if(action.equals( FloatingValues.CHICSAND.getValue() ) ){
            foods.add( new ChickenSandwich(tcls.stringsToList( request.getParameterValues(FloatingValues.COND.getValue()) )) );
        }
        if(action.equals( FloatingValues.FRIES.getValue() ) ){
            foods.add( new Fries(tcls.stringsToList( request.getParameterValues(FloatingValues.COND.getValue()) )) );
        }
        if(action.equals( FloatingValues.SALAD.getValue() ) ){
            foods.add( new Salad(tcls.stringsToList( request.getParameterValues(FloatingValues.COND.getValue()) )) );
        }
        tcs  = new TotalCostService();
        total = tcs.getTotal(foods);
        if(session != null){
            session.setAttribute( FloatingValues.FOODS.getValue() , foods);
            session.setAttribute( FloatingValues.TOTAL.getValue() , total);
        }
        if(action.equals( FloatingValues.COUT.getValue()) ){
            request.getSession().setAttribute( FloatingValues.TOTAL.getValue(),0);
            request.getSession().setAttribute( FloatingValues.FOODS.getValue(), null);
        
            request.getSession().invalidate();
            RequestDispatcher view = request.getRequestDispatcher(CHPAGE);
            view.forward(request, response);
        }
        

        
        
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

