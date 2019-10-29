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
    <b>Buscador de películas y/o series:</b> Según los gustos que ha indicado el usuario en el formulario de registro se
    le harán unas recomendaciones que también varian dependiendo de las películas y series que el usuario ha visto. Los gustos
    pueden ser modificados en cualquier momento. Además también veremos las opiniones de los usuarios sobre las series y             películas.
  </li>
  <li>
    <b>Enlaces para ver películas:</b> En este apartado tendremos varios links para ver películas y series online. Los propios
    usuarios también podrán aportar enlaces para ver películas. Estos enlaces serán evaluados por un administrador, este decidirá
    si es apropiado o no, en caso de ser apropiado, evaluarlo según la calidad de video, de audio y en caso de contar con subtítulos
    indicarlo. Además de esto los usuarios podrán opinar sobre la calidad de los enlaces.
  </li>
  <li>
    <b>Lista de películas y series:</b> Puedes añadir series y película a listas (pendientes,siguiendo,vistas y género)
    a las cuales se podrá acceder. En caso de género saldrán las películas que pertenecen a ese género.
  </li>
  </ul>
  
  # Actividad 3: Análisis de requisitos funcionales. Casos de uso.
 
 <table style="width:100%">
  <tr>
    <th><b>Nombre: </b></th>
    <th>Lista de películas y series</th>
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
  <td>El cliente esté registrado.</td>
  </tr>
    <tr>
  <td><b>Curso normal del caso de uso:</b></td>
  <td>1-El cliente busca la película o serie.<br> 
      2-El cliente añade la película a una lista existente.
</td>
  </tr>
    <tr>
  <td><b>Postcondiciónes:</b></td>
  <td>Se añade a las listas de películas/series las cuales tiene almacenadas 
    el cliente la nueva película/serie seleccionada.</td>
  </tr>
    <tr>
  <td><b>Alternativas/Excepciones:</b></td>
  <td>2.1- El cliente crea una nueva lista para añadir la película.</td>
  </tr>
</table>
