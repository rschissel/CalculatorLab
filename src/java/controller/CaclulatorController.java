/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;

/**
 *
 * @author Ryan Schissel
 */
@WebServlet(name = "CaclulatorController", urlPatterns = {"/result"})
public class CaclulatorController extends HttpServlet {
private static final String RESULT_PAGE = "results.jsp";
private static final String ERR_PAGE = "errorpage.html";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher view = null;
        CalculatorService cs = new CalculatorService();
        try{
        String selection = request.getParameter("selection");
        double result = 0;
        switch (selection){
            case "rectangle":
                result = cs.calculateArea(Double.parseDouble(request.getParameter("base1")), 
                        Double.parseDouble(request.getParameter("height")));
                break;
            case "triangle":
                result = cs.calculateArea(Double.parseDouble(request.getParameter("base1")), 
                        Double.parseDouble(request.getParameter("height")), 
                        Double.parseDouble(request.getParameter("divisor")));
                break;
            case "circle":
                result = cs.calculateArea(Double.parseDouble(request.getParameter("radius")));
                break;
            case "trapezoid":
                result = cs.calculateArea(Double.parseDouble(request.getParameter("base1")),
                        Double.parseDouble(request.getParameter("base2")),
                        Double.parseDouble(request.getParameter("height")),
                        Double.parseDouble(request.getParameter("divisor")));
        }
        request.setAttribute("area", result);
        
        view =
                request.getRequestDispatcher(RESULT_PAGE);
        }
        catch(Exception e){
             view =
                request.getRequestDispatcher(ERR_PAGE);
        }
        finally{
        view.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
