/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.MovieSoapWebService;
import services.MovieSoapWebService_Service;
import services.Movies1;

/**
 *
 * @author Tatva
 */
public class AdminApplicationServlet extends HttpServlet {
    
    MovieSoapWebService_Service mswss;
    MovieSoapWebService msws;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

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
        if(request.getParameter("movieList")!=null){
            mswss = new MovieSoapWebService_Service();
            msws = mswss.getMovieSoapWebServicePort();
            
            request.setAttribute("movieList", msws.listAllMovies());
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }
        else if(request.getParameter("update")!=null){
             mswss = new MovieSoapWebService_Service();
            msws = mswss.getMovieSoapWebServicePort();
            String id = request.getParameter("id");
            request.setAttribute("movieList", msws.getMovieById(id));
            
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }
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
        
        
        if(request.getParameter("ADD")!= null){
            String id = request.getParameter("id");
            String title = request.getParameter("title");
            String genre = request.getParameter("genre");
            Double rating = Double.parseDouble(request.getParameter("rating"));
            String releaseDate = request.getParameter("releaseDate");
            
            Movies1 movie = new Movies1();
            movie.setMoiveid(BigDecimal.valueOf(Double.parseDouble(id)));
            movie.setMovietitle(title);
            movie.setMoviegenre(genre);
            movie.setMovierating(rating);
            movie.setMoviereleasedate(releaseDate);
            
            mswss = new MovieSoapWebService_Service();
            msws = mswss.getMovieSoapWebServicePort();
            
            msws.addMovie(movie);
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }
        else if(request.getParameter("UPDATE")!= null){
            Movies1 movie = new Movies1();
            
            mswss = new MovieSoapWebService_Service();
            msws = mswss.getMovieSoapWebServicePort();
            
            request.setAttribute("movieData", msws.listAllMovies());
            RequestDispatcher rd = request.getRequestDispatcher("updateMovie.jsp");
            rd.forward(request, response);
        }
        else if(request.getParameter("DELETE")!= null){
            mswss = new MovieSoapWebService_Service();
            msws = mswss.getMovieSoapWebServicePort();
            String id = request.getParameter("id");
            msws.deleteMovie(id);
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response); 
       }
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
