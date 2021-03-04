# Cromosol Challenge
Desarrollo de APiRest para Peliculas


# Instrucciones para la ejecucion del proyecto
 Requisistos de la PC:
 
    • - Java JDK8
    • - Git
    • - Maven
    • - InteliJ Community / EClipse
 
Abrir la consola:

    • En windows: Presionar tecla Windows + r y en la pantalla que aparece escribir cmd y presionar Enter
    • En linux: Presionar tecla Ctrl +Alt + t
 
# Clonarse el repositorio 
    - cd "folder"
    - git clone "url de github"

# Se puede clonar desde la IDE elegida o desde línea de comandos:

    - cd /WorkSpace (o donde esten los proyectos con java)
    - git clone https://github.com/facundocardenas11/FravegaChallenge.git
    - Abrimos IDE Eclipse (en este caso)
    - Import > Import Folder or Archive > Seleccionamos Directory > "Ruta donde clonamos el proyecto"
    - Click en Finish. Aguardamos que se carguen las dependencias de Maven.

# Base de datos H2 (Base de datos en memoria) :

    - Levantamos el proyecto maven.
    - ir al browser y escribir “localhost:8081/h2” el schema de base de datos que escribiremos es h2cromosol
    - Solo ingresamos el usuario “user” dado que no hay clave fijada.
    - Ingresamos al motor de base de datos H2 y se pueden realizar consultar, inserciones, actualizaciones y borrar registros
