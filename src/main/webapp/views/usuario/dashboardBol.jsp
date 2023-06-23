<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
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
                <li><a class="active" href="usuario?action=iniciar">Cerrar Sesión</a></li>
            </ul>
        </nav>
    </header>
    <main>
        <a name="bolsillo"><section></a>
            <h3>Billetera digital</h3>
            <h5>¿QUIERES CONSULTAR TU SALDO?</h5>
            <p>Si quieres consultar tu saldo oprime el siguiente botón
            <a href="bolsillo?action=cons"><input class="buttons2" type="submit" name="" value="Consultar"></a>
            </p>
            <h5>¿QUIERES RETIRAR DINERO?</h5>
            <p>Si quieres retirar dinero oprime el siguiente botón
            <a href="bolsillo?action=cons"><input class="buttons2" type="submit" name="" value="Retirar"></a>
            </p>
            <h5>¿QUIERES REALIZAR RECARGA?</h5>
            <p>Si quieres realizar una recarga oprime el siguiente botón
            <a href="bolsillo?action=cons"><input class="buttons2" type="submit" name="" value="Recarga"></a>
            </p>
        </section>
    </main>
    <footer>
        <p>Creado por Michel Oriana Mateus Ayure</p>
    </footer>
   
</body>
</html>