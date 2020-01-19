# <p align="center">DAM BLINDERS</p>
### <p align="center">DAMB: Gestión de videoclub online</p>

<p align="center">
<img src="/Recursos/portada.jpg" height="450" width="800"/>
</p>


#### Autor  
&nbsp;&nbsp;&nbsp;  Este material ha sido desarrollado por <b>Miguel Rodríguez</b> y <b>Victor Lopez</b> bajo licencia Creative Commons:  <img src="/Recursos/licencia.png" height="25" width="75"/>  

</br>
</br>

# <p align="center">Índice:</p>
> **[Fase 1: Actividad 1](#1)**
>
> **[Fase 1: Actividad 3](#2)**
>
> **[Fase 1: Actividad 4](#3)**
>
> **[Fase 1: Actividad 5](#4)**
>
> **[Fase 2: Actividad 2](#5)**
>
> **[Fase 2: Actividad 3](#6)**
</br>
</br>
<a name="1">
  
# Actividad 1: Definición del problema. Requisitos funcionales.
# Gestión de un videoclub online DAM Blinders

Nuestro proyecto consistirá sobre la gestión de un videoclub. Este programa tendrá las siguientes opciones:
<ul>
  <li>
    <b>Registro de usuarios:</b> Consiste en un formulario que rellenarán los usuarios que quieran registrarse,
    el cual da acceso a las siguientes funcionalidades. En el formulario se requerirán los siguientes datos sobre
    el usuario (nombre,DNI,teléfono,email,dirección,gustos).
  </li>
  <li>
    <b>Iniciar sesión:</b> Para iniciar sesión tiene que haberse registrado previamente e introducir su nombre de usuario y 
    contraseña.
  </li>
  <li>
    <b>Consultar lista:</b> El usuario al presionar en consultar lista accederá a las listas donde haya añadido algo.
  </li>
  <li>
    <b>Ver detalles:</b> Cuando el usuario pulsa en ver detalles se le mostrará una descripción del argumento de la película o
    serie y también los enlaces para verlas
  </li>
  <li>
    <b>Reproducir:</b> La película o serie comienza a reproducirse.
  </li>
  <li>
    <b>Añadir enlaces:</b> Se le abre una ventana que le permite añadir un enlace al usuario.
  </li>
  <li>
    <b>Añadir a lista:</b> Cuando el usuario pulsa en añadir a lista, se añade la película o serie que ha buscado a una lista ya
    existente o se le permite crear una nueva lista.
  </li>
  <li>
    <b>Buscador de películas y/o series:</b> El usuario introduce el nombre de la película o serie que quiere ver y se mostrarán
    los resultados de su búsqueda.
  </li>
  <li>
    <b>Ver enlaces:</b> En este apartado tendremos varios links para ver películas y series online. 
  </li>
  <li>
    <b>Lista de películas y series:</b> Puedes añadir series y película a listas (pendientes,siguiendo,vistas y género)
    a las cuales se podrá acceder. En caso de género saldrán las películas que pertenecen a ese género.
  </li>
  <li>
    <b>Comprobar borradores:</b> El administrador puede consultar los distintos enlaces añadidos por los usuarios y evaluarlos.
    En caso de que la evaluación sea positiva este enlace será añadido al conjunto de enlaces que pueden utilizar los usuarios.
  </li>
  </ul>
  </a>
  <a name="2">
  
  # Actividad 3: Análisis de requisitos funcionales. Casos de uso.
 
<table style="width:100%">
  <tr>
    <td><b>ID: </b></td>
    <td>CU-1</td>
  </tr>
  <tr>
    <td><b>Nombre: </b></td>
    <td>Registro de usuario.</td>
  </tr>
  <tr>
    <td><b>Descripción:</b></td>
    <td>El sistema le solicita datos mediante un formulario que el usuario debe rellenar con datos.</td>
    
  </tr>
  <tr>
    <td><b>Actores:</b></td>
    <td>Usuario.</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>Nada.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>1-El usuario selecciona registrarse.<br>
  2-El sistema le devuelve un formulario(Nombre,Apellidos,Edad,Nombre de usuario y Contraseña) que debe rellenar.<br>
  3-El cliente introduce los datos correctamente.<br>
  </td>
  </tr>
  <tr>
  <td><b>Postcondiciones:</b></td>
  <td>El sistema le muestra un mensaje diciendo que el usuario ha sido registrado.<br>
  </td>
</td>
  </tr>
  <tr>
  <td><b>Alternativas/Excepciones:</b></td>
  <td>Ninguna.</td>
    
</table>
<table style="width:100%">
  <tr>
    <td><b>ID: </b></td>
    <td>CU-2</td>
  </tr>
  <tr>
    <td><b>Nombre: </b></td>
    <td>Inicio de sesión.</td>
  </tr>
  <tr>
    <td><b>Descripción:</b></td>
    <td>El usuario, si ya posee una cuenta, introduce su nombre de usuario y su contraseña y accedera a su perfil previamente   
      personalizado.</td>
  </tr>
  <tr>
    <td><b>Actores:</b></td>
    <td>Usuario.</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>El usuario debe estar registrado en el sistema.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>1- El sistema requerirá del usuario que introduzca su usuario y contraseña.<br>
  2-El sistema recoge la informacion y comprueba que esta esté previamente registrada en la base de datos de usuarios.<br>
 
  </td>
  </tr>
  <tr>
  <td><b>Postcondiciones:</b></td>
  <td>El usuario accede satisfactoriamente al sistema y este le da acceso a Buscar Película y Consulta Lista.<br>
  </td>
</td>
  </tr>
    <tr>
  <td><b>Alternativas/Excepciones:</b></td>
  <td>2.1 El sistema devuele un error al no ser correctos o al no existir los datos introducidos por el usuario y sugiere la opción
    de crear usuario.
 
</td>
  </tr>
</table>
<table style="width:100%">
  <tr>
    <td><b>ID: </b></td>
    <td>CU-3</td>
  </tr>
  <tr>
    <td><b>Nombre: </b></td>
    <td>Consultar listas.</td>
  </tr>
  <tr>
    <td><b>Descripción:</b></td>
    <td>Al usuario se le muestran todas las listas de películas que tiene.</td>
  </tr> 
  <tr>
    <td><b>Actores:</b></td>
    <td>Usuario.</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>El usuario haya iniciado sesión.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>1-El usuario selecciona la opción consultar listas.<br> 
  2-El sistema muestra las listas del usuario. <br>
  3-El usuario selecciona la lista que quiere consultar o añadir.
</td>
  </tr>
    <tr>
  <td><b>Postcondiciones:</b></td>
  <td>El usuario puede consultar la lista que haya seleccionado.</td>
  </tr>
  <tr>
    <td><b>Alternativas/Excepciones</b></td>
    <td>Nada.</td>
  </tr>
    
  </table>

<table style="width:100%">
</table>




  
  <table style="width:100%">
  <tr>
    <td><b>ID: </b></td>
    <td>CU-4</td>
  </tr>
  <tr>
    <td><b>Nombre: </b></td>
    <td>Ver detalles.</td>
  </tr>
  <tr>
    <td><b>Descripción:</b></td>
    <td>Los usuarios que accedan a esta opción podrán ver los distintos detalles de la serie o película que hayan accedido       (Nombre,Dirección,Reparto,etc).</td> 
  </tr>
  <tr>
    <td><b>Actores:</b></td>
    <td>Usuario y administrador</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>El usuario/administrador haya iniciado sesión.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>1-El usuario pulsa en ver detalles.<br>
      2-El sistema le devuelve los detalles de la película(nombre,actores,director y duración).</td>
  </tr>
  <tr>
    <td><b>Postcondiciones</b></td>
    <td>Ninguna</td>
  </tr>
  <tr>
    <td><b>Alternativas/Excepciones:</b></td>
    <td>Ninguna</td>
  </tr>
  
    
   
  </table>
  
  <table style="width:100%">
  <tr>
    <td><b>ID: </b></td>
    <td>CU-5</td>
  </tr>
  <tr>
    <td><b>Nombre: </b></td>
    <td>Reproducir.</td>
  </tr>
  <tr>
    <td><b>Descripción:</b></td>
    <td>El usuario le da al botón y la película o serie comienza a reproducirse.</td> 
  </tr>
  <tr>
    <td><b>Actores:</b></td>
    <td>Usuario</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>El usuario debe haber iniciado sesión.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>1-El usuario pulsa el botón reproducir.<br>
     2-La película o serie comienza a reproducirse</td>
  </tr>
  <tr>
    <td><b>Postcondiciones:</b></td>
    <td>Ninguna.</td>
  </tr>
  <tr>
    <td><b>Alternativas/Excepciones:</b></td>
    <td>Ninguna</td>
    <tr>
  </table>
   <table style="width:100%">
  <tr>
    <td><b>ID: </b></td>
    <td>CU-6</td>
  </tr>
  <tr>
    <td><b>Nombre: </b></td>
    <td>Añadir enlace.</td>
  </tr>
  <tr>
    <td><b>Descripción:</b></td>
    <td>El usuario añade un enlace a la pagina.</td> 
  </tr>
  <tr>
    <td><b>Actores:</b></td>
    <td>Usuario</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>El usuario debe haber iniciado sesión.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>1-El usuario añade un enlace.<br>
  </td>
      
  </tr>
  <tr>
  <td><b>Postcondiciones:</b></td>
  <td>Ninguna.</td>
  </tr>
  <tr>
  <td><b>Alternativas/Excepciones:</b></td>
  <td>Ninguna.</td>
  </tr>
  
  </table>
  
<table style="width:100%">
  <tr>
    <td><b>ID: </b></td>
    <td>CU-7</td>
  </tr>
  <tr>
    <td><b>Nombre: </b></td>
    <td>Añadir a lista.</td>
  </tr>
  <tr>
    <td><b>Descripción:</b></td>
    <td>El usuario selecciona una película y decide introducirla en la lista que desee.</td>
  </tr>
  <tr>
    <td><b>Actores:</b></td>
    <td>Usuario.</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>El usuario debe haber iniciado sesión.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>
    1-El usuario añade la película a una lista existente.<br>
   
</td>
  </tr>
  <td><b>Postcondiciónes:</b></td>
  <td>
    Se añade a las listas de películas/series las cuales tiene almacenadas el usuario la nueva película/serie seleccionada.
</td>
  </tr>
    <tr>
  <td><b>Alternativas/Excepciones:</b></td>
  <td>Ninguna.
</td>
  </tr>
</table>


  <table style="width:100%">
  <tr>
    <td><b>ID: </b></td>
    <td>CU-8</td>
  </tr>
  <tr>
    <td><b>Nombre: </b></td>
    <td>Buscador de películas y/o series.</td>
  </tr>
  <tr>
    <td><b>Descripción:</b></td>
    <td>Menú en el cual el cliente podrá realizar la búsqueda de películas y series por la introducción del nombre.</td>
  </tr>
  <tr>
    <td><b>Actores:</b></td>
    <td>Usuario y administrador.</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>El usuario/administrador debe haber iniciado sesión.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>1-El usuario selecciona la barra de buscador.<br> 
  2-Introduce el nombre de la película en la barra del buscador. <br>
  3- El sistema devuelve una lista con las peliculas o series que coinciden con dicho nombre.<br>
</td>
  </tr>
    <tr>
  <td><b>Postcondiciónes:</b></td>
  <td>Tendras acceso a ver detalles de dicho contenido o añadirlo a una lista con la que cuentes, como podria ser lista de pendientes.</td>
  </tr>
    <tr>
  <td><b>Alternativas/Excepciones:</b></td>
  <td>2.1-El nombre de la película/serie previamente introducido no coincide con ninguna película/serie registrada en el servidor.</td>
  </tr>
  </table>

<table style="width:100%">
  <tr>
    <td><b>ID: </b></td>
    <td>CU-9</td>
  </tr>
  <tr>
    <td><b>Nombre: </b></td>
    <td>Comprobar borradores.</td>
  </tr>
  <tr>
    <td><b>Descripción:</b></td>
    <td>Se muestran una serie de enlaces al administrador que debe ir catalogando.</td> 
  </tr>
  <tr>
    <td><b>Actores:</b></td>
    <td>Administrador.</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>El administrador debe haber iniciado sesión.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>1-El administrador selecciona la opción comprobar borradores.<br>
      2-El sistema le muestra una serie de enlaces que han subido los usuarios.<br>
      3-El administrador clasifica el enlace en función de la calidad de imagen, la pagina de la cual proviene ,el idioma y lo añade.</td>
  </tr>
  <tr>
    <td><b>Postcondiciones:</b></td>
    <td>Ninguna.</td>
  </tr>
  <tr>
    <td><b>Alternativas/Excepciones:</b></td>
    <td>3.1-El administrador considera que el enlace no es apropiado y decide no subirlo.</td>
  </tr>
  </table>
  
  
  <table style="width:100%">
  <tr>
    <td><b>ID: </b></td>
    <td>CU-10</td>
  </tr>
  <tr>
    <td><b>Nombre: </b></td>
    <td>Chat.</td>
  </tr>
  <tr>
    <td><b>Descripción:</b></td>
    <td>El chat permitirá comunicar al cliente con un administrador. Aquí le podrá consultar todo tipo de dudas.</td> 
  </tr>
  <tr>
    <td><b>Actores:</b></td>
    <td>Cliente y Administrador.</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>El administrador y el Cliente deben haber iniciado sesión.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>1-El cliente pulsa el boton "Abrir chat".<br>
      2-El sistema le muestra una ventana con el chat.<br>
      3-Sistema notifica al Administrador para que entre al chat.<br>
      4-El administrador accede al chat pulsando el botón "Abrir chat".<br>
      5-El cliente consultará sus dudas con el administrador.<br>
      6-El cliente cierra el chat.<br></td>
  </tr>
  <tr>
    <td><b>Postcondiciones:</b></td>
    <td>Ninguna.</td>
  </tr>
  <tr>
    <td><b>Alternativas/Excepciones:</b></td>
    <td>Ninguna.</td>
  </tr>
  </table>

<div align="center">
 <img src="./Recursos/unnamed.png">
</div>
</a>
<a name="3">

# Actividad 4

# Diagrama de clases
<div align="center">
  <img src="./Recursos/DC.png">
  </div>
 
# Diagrama de entidad-relación
<div align="center">
  <img src="./Recursos/Entidad-Relacion.png">
  </div>
  </a>
   <a name="4"> 
  
# Actividad 5: Actividad Gráfica
<div align="center">
<img src="./Recursos/VistaBuscarPelicula.PNG">
</div>
<div align="center">
<img src="./Recursos/VistaConsultarLista.PNG">
</div>
<div align="center">
<img src="./Recursos/VistaInicioSesion.PNG">
</div>
<div align="center">
<img src="./Recursos/VistaMenu.PNG">
</div>
<div align="center">
<img src="./Recursos/Pelicula.PNG">
</div>
</a>
<a name="5">

# Fase 2 Actividad 2: Hilos
<p>El hilo que tiene nuestra aplicación se encarga de mostrar un mensaje indicando que usuario ha iniciado sesión<br>
  en nuestra aplicación. Está implementado en la clase AtenderCliente que se encuentra en el paquete controller.<br>
  Este hilo imprime por pantalla un mensaje indicando el nombre de usuario que acaba de iniciar sesión.</p>
  </a>
  <a name="6">
  
# Fase 2 Actividad 3: Hilos
  <table style="width:100%">
  <tr>
    <td><b>Nombre de la Clase</b></td>
    <td>Chat</td>
  </tr>
  <tr>
    <td><b>Descripción</b></td>
    <td>Ventana en la cual entablan una conversación cliente-administrador.</td>
  </tr>
  <tr>
    <td><b>Relaciones</b></td>
    <td></td> 
  </tr>
  
  <table style="width:100%">
  <tr>
    <td><b>Atributos</b></td>
    <td><b>Explicacion</b></td>
  </tr>
  <tr>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td></td> 
  </tr>
  </a>
