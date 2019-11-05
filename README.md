# Actividad 1: Definición del problema. Requisitos funcionales.
# Gestión de un videoclub online DAM Blinders

Nuestro proyecto consistirá sobre la gestión de un videoclub, este programa tendrá las siguientes opciones:
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
  
  # Actividad 3: Análisis de requisitos funcionales. Casos de uso.
 
<table style="width:100%">
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
    <td>Cliente.</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>Ser mayor de edad.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>1-El cliente selecciona registrarse.<br>
  2-El sistema le devuelve un formulario que debe rellenar.<br>
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
  <td>3.1- El cliente es menor de edad.<br>
  3.1.2- El sistema devuelve un error indicando que debe ser mayor de edad para registrarse.
</td>
  </tr>
</table>
<table style="width:100%">
  <tr>
    <td><b>Nombre: </b></td>
    <td>Inicio de sesión.</td>
  </tr>
  <tr>
    <td><b>Descripción:</b></td>
    <td>El cliente, si ya posee una cuenta, introduce su nombre de usuario y su contraseña y accedera a su perfil previamente   
      personalizado.</td>
    
  </tr>
  <tr>
    <td><b>Actores:</b></td>
    <td>Cliente.</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>El cliente debe estar registrado en el sistema.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>1- El sistema requerirá del cliente que introduzca su usuario y contraseña.<br>
  2-El sistema recoge la informacion y comprueba que esta esté previamente registrada en la base de datos de usuarios.<br>
 
  </td>
  </tr>
  <tr>
  <td><b>Postcondiciones:</b></td>
  <td>El usuario accede satisfactoriamente al sistema.<br>
  </td>
</td>
  </tr>
    <tr>
  <td><b>Alternativas/Excepciones:</b></td>
  <td>2.1 El sistema devuele un error al no ser correctos o al no existir los datos introducidos por el cliente y sugiere la opción
    de crear usuario.
 
</td>
  </tr>
</table>
<table style="width:100%">
  <tr>
    <td><b>Nombre: </b></td>
    <td>Consultar listas.</td>
  </tr>
  <tr>
    <td><b>Descripción:</b></td>
    <td>Al cliente se le muestran todas las listas que tiene.</td>
  </tr>
  <tr>
    <td><b>Actores:</b></td>
    <td>Cliente.</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>El cliente haya iniciado sesión.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>1-El cliente selecciona la opción consultar listas.<br> 
  2-El sistema muestra las listas del cliente. 
  3-El cliente selecciona la lista que quiere consultar.
</td>
  </tr>
    <tr>
  <td><b>Postcondiciónes:</b></td>
  <td>El usuario puede consultar la lista que haya seleccionado.</td>
  </tr>
    
  </table>

<table style="width:100%">
</table>




  
  <table style="width:100%">
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
    <td>Cliente y administrador</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>El cliente/administrador haya iniciado sesión.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>1-El usuario pulsa en ver detalles.<br>
      2-El sistema le devuelve los detalles de la película.</td>
  </tr>
  </table>
  
  <table style="width:100%">
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
    <td>Cliente</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>El cliente debe haber iniciado sesión.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>1-El usuario pulsa el botón reproducir.<br>
     2-La película o serie comienza a reproducirse</td>
  </tr>
  </table>
   <table style="width:100%">
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
    <td>Cliente</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>El cliente debe haber iniciado sesión.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>1-El usuario añade un enlace.<br>
  </td>
  </tr>
  </table>
  
<table style="width:100%">
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
    <td>Cliente.</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>El cliente debe haber iniciado sesión.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>
    1-El cliente busca la película o serie.<br>
    2-El cliente añade la película a una lista existente.
</td>
  </tr>
  <td><b>Postcondiciónes:</b></td>
  <td>
    Se añade a las listas de películas/series las cuales tiene almacenadas el cliente la nueva película/serie seleccionada.
</td>
  </tr>
    <tr>
  <td><b>Alternativas/Excepciones:</b></td>
  <td>2.1- El cliente crea una nueva lista para añadir la película.
</td>
  </tr>
</table>


  <table style="width:100%">
  <tr>
    <td><b>Nombre: </b></td>
    <td>Buscador de películas y/o series.</td>
  </tr>
  <tr>
    <td><b>Descripción:</b></td>
    <td>Barra en la cual el cliente podrá realizar la búsqueda de películas y series por la introducción del nombre.</td>
  </tr>
  <tr>
    <td><b>Actores:</b></td>
    <td>Cliente y administrador.</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>El cliente/administrador debe haber iniciado sesión.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>1-El usuario selecciona la barra de buscador.<br> 
  2-Introduce el nombre de la película en la barra del buscador.    
</td>
  </tr>
    <tr>
  <td><b>Postcondiciónes:</b></td>
  <td>La plataforma muestra las diferentes peliculas que coincidan con el nombre previamente introducido.</td>
  </tr>
    <tr>
  <td><b>Alternativas/Excepciones:</b></td>
  <td>2.1-El nombre de la película/serie previamente introducido no coincide con ninguna película/serie registrada en el servidor.</td>
  </tr>
  </table>


 

<table style="width:100%">
  <tr>
    <td><b>Nombre: </b></td>
    <td>Ver enlaces.</td>
  </tr>
  <tr>
    <td><b>Descripción:</b></td>
    <td>Después de seleccionar ver detalles, aparecerá un botón que mostrará todos los enlaces.</td>
  </tr>
  <tr>
    <td><b>Actores:</b></td>
    <td>Cliente.</td>
  </tr>
  <tr>
  <td><b>Precondiciones:</b></td>
  <td>El cliente debe haber iniciado sesión.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>1- El cliente utiliza el buscador y selecciona una serie o película.<br>
      2- Aparecen los enlaces disponibles.
</td>
  </tr>
  </table>

<table style="width:100%">
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
      3-El administrador clasifica el enlace y lo añade.</td>
  </tr>
  <tr>
    <td><b>Alternativas/Excepciones:</b></td>
    <td>3.1-El administrador considera que el enlace no es apropiado y decide no subirlo.</td>
  </tr>
  </table>

<div align="center">
 <img src="./unnamed.PNG">
</div>

# Diagrama de clases
<div align="center">
  <img src="./DClases.PNG">
  </div>
 
# Diagrama de entidad-relación
<div align="center">
  <img src="./DEntidad.PNG">
  </div>
            
