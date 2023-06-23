<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bolsillo</title>
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
                <li><a  href="#recarga1">Primera Recarga</a></li>
                <li><a  href="#consulta">Consulta Recarga</a></li>

            </ul>
        </nav>
    </header>
<main>
    <a name="recarga1"><section class="section"></a>
        <h3>Primera recarga</h3>
        <form action="bolsillo" method="post">
            <input class="controls" type="text" name="nombre" value="" placeholder="Nombre del Bolsillo">
            <input class="controls" type="number" name="saldo" value="" placeholder="Saldo del bolsillo">
            <input type="checkbox" name="estado" id="estado" checked >
            <label for="estado"> Activo</label>        
        <input class="buttons" type="submit" name="action" value="Recargar">
        </form>
    </section>
    <a name="consulta"><section class="section">
        <h3>Consulta aquí tu bolsillo</h3>
        <table class="table">
            <tr>
                <th class="td">Id del bolsillo</th>
                <th class="td">Nombre del bolsillo</th>
                <th class="td">Saldo del bolsillo</th>
                <th class="td">Estado del bolsillo</th>
            </tr>
            <c:forEach var="saldo" items="${saldos}">
            <tr>
                <td class="td">${saldo.getId()}</td>
                <td class="td">${saldo.getNombre()}</td>
                <td class="td">${saldo.getSaldo()}</td>
                <td class="td">${saldo.getEstado()}</td>
            </tr>
        </c:forEach>
    </table>
    
    </section></a>
</main>
</body>
</html>