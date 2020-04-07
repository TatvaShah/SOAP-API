
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import services.MovieSoapWebService;
import services.MovieSoapWebService_Service;
import services.Movies1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tatva
 */
@Path("api")
@Produces("text/json")
public class MovieServiceRest implements MessageBodyWriter<Object> {
    
    MovieSoapWebService_Service mswss;
    MovieSoapWebService msws;

    @Override
    public boolean isWriteable(Class<?> arg0, Type arg1, Annotation[] arg2, MediaType arg3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void writeTo(Object arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4, MultivaluedMap<String, Object> arg5, OutputStream arg6) throws IOException, WebApplicationException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Path("listAllMovies")
    @GET
    public List<Movies1> listAllMovies(){
        mswss = new MovieSoapWebService_Service();
            msws = mswss.getMovieSoapWebServicePort();
            return msws.listAllMovies();
    }
    
    @Path("getMovieById/{id}")
    @GET
    public Movies1 getMovieById(@PathParam("id")String id){
        mswss = new MovieSoapWebService_Service();
            msws = mswss.getMovieSoapWebServicePort();
            return msws.getMovieById(id);
    }
    
}
