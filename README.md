# GsonExample
Gson parser example
Cómo parsear documentos Json con Gson

<strong>1.- Descargar la librería Gson en  Android Studio.</strong>

Dentro de la carpeta app, abrimos el archivo build.gradle y añadimos en el apartado “dependencies” la siguiente línea:

<code>compile 'com.google.code.gson:gson:2.3'</code>

La versión de Gson dependerá del momento en que nos lo bajemos pero si bajamos una antigua ya nos avisará de que hay una nueva y si queremos actualizarla.

![Alt text](https://dl.dropboxusercontent.com/u/4120996/screenshot.jpg "Gson library")

En la carpeta “External Libraries” os aparecerá la librería descargada, si no aparece haced un Rebuild Project y aparecerá. 

<strong>2.- Este es el Json que queremos parsear almacenado en un objeto String:</strong>

<code>
private final static String miJsonEjemplo = "{\n" +
            "character: \"Arakina\",\n" +
            "class: \"Death Knigth\",\n" +
            "level: \"100\",\n" +
            "race: \"Gobblin\",\n" +
            "gold: \"823759375435\",\n" +
            "armor: \n" +
            "[\n" +
            "{\n" +
            "name: \"Molten Edge Eviscerator\",\n" +
            "ilevel: \"676\"\n" +
            "},\n" +
            "{\n" +
            "name: \"Thunder maze\",\n" +
            "ilevel: \"456\"\n" +
            "},\n" +
            "{\n" +
            "name: \"The Black Hand\",\n" +
            "ilevel: \"668\"\n" +
            "},\n" +
            "{\n" +
            "name: \"Gar'an's Brutal Spearlauncher\",\n" +
            "ilevel: \"778\"\n" +
            "},\n" +
            "{\n" +
            "name: \"Oregorger's Acid-Etched Gutripper\",\n" +
            "ilevel: \"566\"\n" +
            "}\n" +
            "]\n" +
            "}";
</code>

<strong>3.- Creamos las clases para almacenar los objetos que recibimos del Json</strong>

En este caso las clases Character y Armor.
Fijaros que como el Json contiene un atributo con una palabra reservada en Java (class), hay que serializarla para que no de error y la admita.

<code>@SerializedName("class")</code>

<code>private String classCharacter;</code>



<strong>4.- Creamos un objeto Gson:</strong>

<code>Gson gson = new Gson();</code>
	

<strong>5.- Creamos un objeto de la clase a la que vamos a almacenar los objetos que recibimos del Json</strong>

En este caso la clase Character.

<code>Character character = new Character();</code>

<strong>4.- Y por último parseamos:</strong>

<code>character = gson.fromJson(miJsonEjemplo, Character.class);</code>


<strong>¡Ya tenemos los objetos listos para utilizarlos!</strong>

