
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetMovieByIdResponse_QNAME = new QName("http://services/", "getMovieByIdResponse");
    private final static QName _AddMovie_QNAME = new QName("http://services/", "addMovie");
    private final static QName _AddMovieResponse_QNAME = new QName("http://services/", "addMovieResponse");
    private final static QName _ListAllMovies_QNAME = new QName("http://services/", "listAllMovies");
    private final static QName _DeleteMovieResponse_QNAME = new QName("http://services/", "deleteMovieResponse");
    private final static QName _GetMovieById_QNAME = new QName("http://services/", "getMovieById");
    private final static QName _UpdateMovieResponse_QNAME = new QName("http://services/", "updateMovieResponse");
    private final static QName _ListAllMoviesResponse_QNAME = new QName("http://services/", "listAllMoviesResponse");
    private final static QName _DeleteMovie_QNAME = new QName("http://services/", "deleteMovie");
    private final static QName _UpdateMovie_QNAME = new QName("http://services/", "updateMovie");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateMovieResponse }
     * 
     */
    public UpdateMovieResponse createUpdateMovieResponse() {
        return new UpdateMovieResponse();
    }

    /**
     * Create an instance of {@link ListAllMoviesResponse }
     * 
     */
    public ListAllMoviesResponse createListAllMoviesResponse() {
        return new ListAllMoviesResponse();
    }

    /**
     * Create an instance of {@link GetMovieById }
     * 
     */
    public GetMovieById createGetMovieById() {
        return new GetMovieById();
    }

    /**
     * Create an instance of {@link UpdateMovie }
     * 
     */
    public UpdateMovie createUpdateMovie() {
        return new UpdateMovie();
    }

    /**
     * Create an instance of {@link DeleteMovie }
     * 
     */
    public DeleteMovie createDeleteMovie() {
        return new DeleteMovie();
    }

    /**
     * Create an instance of {@link AddMovie }
     * 
     */
    public AddMovie createAddMovie() {
        return new AddMovie();
    }

    /**
     * Create an instance of {@link AddMovieResponse }
     * 
     */
    public AddMovieResponse createAddMovieResponse() {
        return new AddMovieResponse();
    }

    /**
     * Create an instance of {@link ListAllMovies }
     * 
     */
    public ListAllMovies createListAllMovies() {
        return new ListAllMovies();
    }

    /**
     * Create an instance of {@link GetMovieByIdResponse }
     * 
     */
    public GetMovieByIdResponse createGetMovieByIdResponse() {
        return new GetMovieByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteMovieResponse }
     * 
     */
    public DeleteMovieResponse createDeleteMovieResponse() {
        return new DeleteMovieResponse();
    }

    /**
     * Create an instance of {@link Movies1 }
     * 
     */
    public Movies1 createMovies1() {
        return new Movies1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getMovieByIdResponse")
    public JAXBElement<GetMovieByIdResponse> createGetMovieByIdResponse(GetMovieByIdResponse value) {
        return new JAXBElement<GetMovieByIdResponse>(_GetMovieByIdResponse_QNAME, GetMovieByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "addMovie")
    public JAXBElement<AddMovie> createAddMovie(AddMovie value) {
        return new JAXBElement<AddMovie>(_AddMovie_QNAME, AddMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "addMovieResponse")
    public JAXBElement<AddMovieResponse> createAddMovieResponse(AddMovieResponse value) {
        return new JAXBElement<AddMovieResponse>(_AddMovieResponse_QNAME, AddMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "listAllMovies")
    public JAXBElement<ListAllMovies> createListAllMovies(ListAllMovies value) {
        return new JAXBElement<ListAllMovies>(_ListAllMovies_QNAME, ListAllMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteMovieResponse")
    public JAXBElement<DeleteMovieResponse> createDeleteMovieResponse(DeleteMovieResponse value) {
        return new JAXBElement<DeleteMovieResponse>(_DeleteMovieResponse_QNAME, DeleteMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getMovieById")
    public JAXBElement<GetMovieById> createGetMovieById(GetMovieById value) {
        return new JAXBElement<GetMovieById>(_GetMovieById_QNAME, GetMovieById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateMovieResponse")
    public JAXBElement<UpdateMovieResponse> createUpdateMovieResponse(UpdateMovieResponse value) {
        return new JAXBElement<UpdateMovieResponse>(_UpdateMovieResponse_QNAME, UpdateMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "listAllMoviesResponse")
    public JAXBElement<ListAllMoviesResponse> createListAllMoviesResponse(ListAllMoviesResponse value) {
        return new JAXBElement<ListAllMoviesResponse>(_ListAllMoviesResponse_QNAME, ListAllMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteMovie")
    public JAXBElement<DeleteMovie> createDeleteMovie(DeleteMovie value) {
        return new JAXBElement<DeleteMovie>(_DeleteMovie_QNAME, DeleteMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateMovie")
    public JAXBElement<UpdateMovie> createUpdateMovie(UpdateMovie value) {
        return new JAXBElement<UpdateMovie>(_UpdateMovie_QNAME, UpdateMovie.class, null, value);
    }

}
