<h1>Manual de usuario</h1>

<p>Para poder utilizar nuestra aplicación será necesario tener una serie de programas instalados<br>
  los cuales son:  IntelliJ IDE, WampServer y Filezilla Server.</p>
  
  <b>IntelliJ IDE</b><br>
  <p>En este programa clonaremos el código de nuestro repositorio Github. Le daremos a New->Project<br>
  from Version Control->Git.</p>
  <img src="/Recursos/img1.png" height="450" width="800"/><br>
  <p>Nos saldrá una pestaña como esta y pondremos la URL de nuestro repositorio<br>
  ("https://github.com/victorlopez00/proyectopsp-grupo5.git")</p>
  <img src="/Recursos/img2.PNG" height="450" width="800"/><br>
  <p>Ahora tendremos que configurar nuestro proyecto en IntelliJ para ello presionaremos Ctrl+Alt+Shift+S,<br>
  debemos asegurarnos de que le asignamos el SDK que tenemos en nuestro equipo, en nuestro caso 11 y asignamos<br>
  a Project language level: "8 - Lambdas, type annotations etc". </p>
  <img src="/Recursos/img3.PNG" height="450" width="800"/><br>
  <p>Además debemos configurar los módulos de nuestro proyecto, asignandole source a la carpeta src y Excluded a<br>
  la carpeta out</p> 
  <img src="/Recursos/img4.PNG" height="450" width="800"/><br>
  <p>Por último debemos añadir las librerias a nuestro proyecto, estas se encuentran en la carpeta lib, tan solo<br>
  vamosa  la pestaña libraries, pulsamos el signo + y añadiremos commons-net-3.6 y mysql-connector-java-8.0.12</p>
  <img src="/Recursos/img5.PNG" height="450" width="800"/><br>
  
  <b>WampServer</b><br>
  <p>Para descargar WampServer pulsa <a href="https://sourceforge.net/projects/wampserver/">aquí</a> y dale al botón<br>
  de descargar. Una vez lo tenemos instalado tan solo hay que crear una base de datos con el nombre "videoclub", para ello<br>
  abriremos Wamp  y pulsaremos phpMyAdmin, ahora le daremos a "Nueva".<br></p>
  <img src="/Recursos/img6.PNG" height="450" width="800"/><br>
  <p>A continuación introduciremos el nombre "videoclub"</p>
  <img src="/Recursos/img7.PNG" height="250" width="600"/><br>
  <p>Por último importaremos los datos a la base de datos dándole a "Importar", despúes de damos a examinar y seleccionamos el<br>
  archivo .SQL de nuestro repositorio.</p>
  <img src="/Recursos/img8.PNG" height="450" width="800"/><br>  
  
  <b>FileZilla Server</b><br>
  <p>Para descargar FileZilla Server pulsa <a href="https://filezilla-project.org/download.php?type=server">aquí.</a> y dale<br>
  al botón de descargar. Una vez instalado pulsamos en "Edit" y después en "Users"</p>
  <img src="/Recursos/img9.png" height="450" width="800"/><br> 
  <p>Ahora le damos a "Add" y creamos un usuario con nombre "usuario" y contraseña "usuario"</p>
  <img src="/Recursos/img10.PNG" height="450" width="800"/><br>
  <p>Por último iremos a la pestaña Shared folders, y le daremos a "Add", este será el directorio donde se iniciará el serivdor<br>
   en nuestro caso hemos elegido Documents. Además debemos asegurarnos de darle todos los permisos, lo haremos marcando todos los<br>
  checkboxs que nos aparecen.<br>
   <img src="/Recursos/img11.PNG" height="450" width="800"/><br>
