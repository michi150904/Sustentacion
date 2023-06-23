<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Iniciar Sesión</title>
    <link rel="stylesheet" href="assets\css\style_header.css">
    <link rel="stylesheet" href="assets\css\style_login.css">
    <link rel="stylesheet" href="assets\css\style_main.css">
</head>
<body>
    <header>
        <nav>
            <input type="checkbox" id="checkbox">
            <label for="checkbox" class="checkbtn">
                <i class="fas fa-bars"></i>
            </label>
            <a href="" class="enlace"></a>
            <ul>
                <li><a class="active" href="usuario?action=iniciar">Iniciar Sesión</a></li>
                <li><a  href="usuario?action=regis">Registrate</a></li>
            </ul>
        </nav>
    </header>
    <main>
        <section class="form-login">
            <form action="usuario" method="post">
                <h5>INICIAR SESIÓN</h5>
                <input class="controls" type="text" name="usuario" value="" placeholder="Usuario">
                <input class="controls" type="password" name="contraseña" value="" placeholder="Contraseña">
                <input class="buttons" type="submit" name="action" value="Ingresar">
            </form>
        </section>
    </main>
    <footer>
        <p>Creado por Michel Oriana Mateus Ayure</p>
    </footer>


</body>
</html>
