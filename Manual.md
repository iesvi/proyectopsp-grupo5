<h1>Manual de usuario</h1>

<h2>Componentes Software</h2>
<p>Para poder utilizar nuestra aplicación será necesario tener una serie de programas instalados
  los cuales son: IntelliJ IDE, WampServer y Filezilla Server.</p>
  
  <b>IntelliJ IDE</b><br>
  <p>En este programa clonaremos el código de nuestro repositorio Github. Le daremos a New->Project<br>
  from Version Control->Git.</p>
  <img src="/Recursos/img1.png" height="450" width="800"/><br>
  <p>Nos saldrá una pestaña como esta y pondremos la URL de nuestro repositorio.</p>
  ("https://github.com/victorlopez00/proyectopsp-grupo5.git")</p>
  <img src="/Recursos/img2.PNG" height="450" width="800"/><br>
  <p>Ahora tendremos que configurar nuestro proyecto en IntelliJ para ello presionaremos Ctrl+Alt+Shift+S,
  debemos asegurarnos de que le asignamos el SDK que tenemos en nuestro equipo, en nuestro caso 11 y asignamos
  a Project language level: "8 - Lambdas, type annotations etc". </p>
  <img src="/Recursos/img3.PNG" height="450" width="800"/><br>
  <p>Además debemos configurar los módulos de nuestro proyecto, asignandole source a la carpeta src y Excluded a
  la carpeta out.</p> 
  <img src="/Recursos/img4.PNG" height="450" width="800"/><br>
  <p>Por último debemos añadir las librerias a nuestro proyecto, estas se encuentran en la carpeta lib, tan solo
  vamosa  la pestaña libraries, pulsamos el signo + y añadiremos commons-net-3.6 y mysql-connector-java-8.0.12.</p>
  <img src="/Recursos/img5.PNG" height="450" width="800"/><br>
  
  <b>WampServer</b><br>
  <p>Para descargar WampServer pulsa <a href="https://sourceforge.net/projects/wampserver/">aquí</a> y dale al botón
  de descargar. Una vez lo tenemos instalado tan solo hay que crear una base de datos con el nombre "videoclub", para ello
  abriremos Wamp  y pulsaremos phpMyAdmin, ahora le daremos a "Nueva".</p>
  <img src="/Recursos/img6.PNG" height="450" width="800"/><br>
  <p>A continuación introduciremos el nombre "videoclub".</p>
  <img src="/Recursos/img7.PNG" height="250" width="600"/><br>
  <p>Por último importaremos los datos a la base de datos dándole a "Importar", despúes de damos a examinar y seleccionamos el
  archivo .SQL de nuestro repositorio.</p>
  <img src="/Recursos/img8.PNG" height="450" width="800"/><br>  
  
  <b>FileZilla Server</b><br>
  <p>Para descargar FileZilla Server pulsa <a href="https://filezilla-project.org/download.php?type=server">aquí.</a> y dale
  al botón de descargar. Una vez instalado pulsamos en "Edit" y después en "Users".</p>
  <img src="/Recursos/img9.png" height="450" width="800"/><br> 
  <p>Ahora le damos a "Add" y creamos un usuario con nombre "usuario" y contraseña "usuario"</p>
  <img src="/Recursos/img10.PNG" height="450" width="800"/><br>
  <p>Por último iremos a la pestaña Shared folders, y le daremos a "Add", este será el directorio donde se iniciará el serivdor
   en nuestro caso hemos elegido Documents. Además debemos asegurarnos de darle todos los permisos, lo haremos marcando todos los
  checkboxs que nos aparecen.</p>
   <img src="/Recursos/img11.PNG" height="450" width="800"/><br>
   
   <p>Tras estas instalaciones nuestro proyecto está listo para ser ejecutado.</p>
   
   <h2>Funcionalidades no operativas</h2>
   <p>La única funcionalidad no operativa en nuestro proyecto sería "Leer Correo" ya que no fuimos capaces de configurar el servidor
   POP3 de Mercury de forma correcta ya que nos muestra un correo de ejemplo y no es capaz de leer los correos de nuestro Gmail.</p>
   
   <p>Para ver el video sobre nuestra apliación pulse aquí <a href="https://www.youtube.com/watch?v=wJ8z72qiwPg&feature=youtu.be">aquí</a>.</p>
