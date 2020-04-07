<%-- 
    Document   : index
    Created on : Apr 4, 2020, 8:54:09 PM
    Author     : Tatva
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            form{
                margin-left: 10px;
            }
            #id, #rating, #releaseDate, #genre, #title, #addMovie{
                margin-bottom: 10px;
            }
            
            #id{
                margin-left: 70px;
            }
            
            #title{
                margin-left: 58px;
            }
            
            #genre{
                margin-left: 50px;
            }
            #rating{
                margin-left: 45px;
            }
            #releaseDate{
                margin-left: 5px;
            }
        </style>
    </head>
    <body>
        <h1>CRUD Application for Movies</h1>
        <fieldset>
            <legend>Create a movie record:</legend><br>
            <form action="AdminApplicationServlet" method="post">
                Movie ID: <input type="text" name="id" id="id"/><br>
                Movie Title: <input type="text" name="title" id="title"/><br>
                Movie Genre: <input type="text" name="genre" id="genre"/><br>
                Movie Rating: <input type="text" name="rating" id="rating"/><br>
                Movie Release Date: <input type="text" name="releaseDate" id="releaseDate"/><br><br>

                <input type="submit" name="ADD" value="Add Movie" id="addMovie"/>
            </form>

            <form action="AdminApplicationServlet" method="get">
                <input type="submit" name="movieList" value="List All Movies"/>
            </form>
        </fieldset>

        <h3>List Of Movies</h3>
        <c:set var="count" value="1"/>
        <c:forEach items="${movieList}" var="movieList">
            <span>(</span>${count}<span>)</span>
            <span>Movie: </span>${movieList.movietitle}<br>
            <span>Genre: </span>${movieList.moviegenre}<br>
            <form action="AdminApplicationServlet" method="post">
                <input type="hidden" name='id' value="${movieList.moiveid}"/>
                <input type="submit" name="DELETE" value="Delete Movie"/>
            </form>

            <form action="AdminApplicationServlet" method="get">
                <input type="hidden" name='id' value="${movieList.moiveid}"/>
                <input type="submit" name="UPDATE" value="Update Movie"/>
            </form>
                <br>
                <c:set var="count" value="${count+1}" scope="page"/>
        </c:forEach>
    </body>
</html>
