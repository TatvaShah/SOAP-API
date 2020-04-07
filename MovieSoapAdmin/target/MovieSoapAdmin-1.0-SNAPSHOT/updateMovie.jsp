<%-- 
    Document   : update-movie
    Created on : Apr 4, 2020, 6:29:11 PM
    Author     : Tatva
--%>

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
            <legend>Update movie record:</legend><br>
            <form action="AdminApplicationServlet" method="post">
                Movie ID: <input type="text" name="id" id="id" value="${movieList.moiveid}"/><br>
                Movie Title: <input type="text" name="title" id="title" value="${movieList.movietitle}"/><br>
                Movie Genre: <input type="text" name="genre" id="genre" value="${movieList.moviegenre}"/><br>
                Movie Rating: <input type="text" name="rating" id="rating" value="${movieList.movierating}"/><br>
                Movie Release Date: <input type="text" name="releaseDate" id="releaseDate" value="${movieList.moviereleasedate}"/><br><br>

                <input type="submit" name="UPDATE" value="Make Changes" id="updateMovie"/>
            </form>
        </fieldset>
    </body>
</html>
