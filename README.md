# Reto
Para poder tener permanencia de datos es necesario modificar la ruta
en donde se guarda el archivo con la informacion de la partida.
La modificacion hay que hacerla en la clase Main en el paquete com.sofka.main
en la linea 48 y 117
ObjectInputStream leerDatos = new ObjectInputStream(new FileInputStream("/home/david/Escritorio/Usuario.txt"));
y
ObjectOutputStream escribirDatos = new ObjectOutputStream(new FileOutputStream("/home/david/Escritorio/Usuario.txt"));
Respectivamente.
En la ruta hay que poner una carpeta, cualquiera, en este caso el escritorio con un nombre de archivo para guardar los datos

En windows sería:
C:/Users/Nombre de usuario/Desktop/Archivo_Cualquiera.txt

ObjectInputStream leerDatos = new ObjectInputStream(new FileInputStream("C:/Users/Nombre de usuario/Desktop/Archivo_Cualquiera.txt"));
ObjectOutputStream escribirDatos = new ObjectOutputStream(new FileOutputStream("C:/Users/Nombre de usuario/Desktop/Archivo_Cualquiera.txt"));
