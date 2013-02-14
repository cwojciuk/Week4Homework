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
    public static final String PAGE = "checkout.jsp";
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
        String action = request.getParameter("action");
        response.setContentType("text/html");
        ToCondimentListService tcls = new ToCondimentListService();
        
        if(action.equals( "addHam" )){
            foods.add( new Hamburger(tcls.stringsToList( request.getParameterValues("cond") )));
        }else if(action.equals("subHam") && foods.size()>0){
            
        }
        if(action.equals( "addChicSand" ) ){
            foods.add( new ChickenSandwich(tcls.stringsToList( request.getParameterValues("cond") )) );
        }
        if(action.equals( "addFries" ) ){
            foods.add( new Fries(tcls.stringsToList( request.getParameterValues("cond") )) );
        }
        if(action.equals( "addSalad" ) ){
            foods.add( new Salad(tcls.stringsToList( request.getParameterValues("cond") )) );
        }
        tcs  = new TotalCostService();
        total = tcs.getTotal(foods);
        
        if(session==null){
            session = request.getSession();
        }
        session.setAttribute( "foods" , foods);
        session.setAttribute( "totalCost" , total);
        
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

