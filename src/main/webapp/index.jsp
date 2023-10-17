<%-- 
    Document   : index
    Created on : 15 oct 2023, 21:38:47
    Author     : Erik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Peliculas Erik</title>
    </head>
    <body>
        <h1>Buque su pelicula aqui:</h1>
        <form action="GeneroPeliculaRegistration" method="post" onsubmit="return valida()"> 
            <br> Datos de la pelicula: <br>
        Nombre:
        <input type="text" id="N" name="nombre">
        Genero:
        <input type="number" id="G" name="genero">
            <button type="submit"> Enviar </button>
        </form>
    </body>
</html>
