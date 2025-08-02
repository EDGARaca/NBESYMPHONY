<%-- 
    Document   : Estudiantes
    Created on : 2/08/2025, 12:21:28 p. m.
    Author     : Spiri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Información Academica SYMPHONY - SIAS</title>
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
    </head>
    <body>
        <!--Aplicando boostrap creamos un contenedor -->
        <div id="container">
            <!-- mediante boostrap vamos a trabajar usando las cards que normalmente se usan para mostrar informacion -->
            <div id="card mt=5">
                <!-- vamos a usar mt-5 para darle un margin-top 5 osea un espacio en la vertical para nuestro elemento -->
                <h2 class="text-center mt-3"> Gestion y Registro de Estudiantes SYMPHONY</h2>
                <!-- Creamos un card-body o el cuerpo de la tarjeta donde vamos a crear nuestra tabla con los datos que vamos a mostrar -->
                <!-- Antes de crear nuestra table vamos a crear nuestro formulario a travez del form -->
                <form>
                    <table class="table table*-bordered table-striped mt-4">
                        <!-- Aqui estamos trabajando con la tabla y estamos dando estilo mediante boostrap a nuestra tabla al igual que espaciado a traves de margin --> 
                        <thead>
                            <tr class="text-center">
                                <th>Id</th>
                                <th>Nombre</th>
                                <th>Apellido</th>
                                <th>Telefono</th>
                                <th>Direccion</th>
                                <th>Genero</th>
                                <th>Acciones</th>
                                <!-- Acciones es donde vamos a tener editar, eliminar -->
                            </tr>
                        </thead>
                        <!-- Creamos el tbody -->
                        <tbody>
                            <tr>
                                <td></td>
                            </tr>    
                        </tbody>
                    </table>
                </form>

            </div>
        </div>
    </body>
</html>
