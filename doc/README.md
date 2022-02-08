# Estructura Spring boot

## Proyecto Srping Boot

    El archivo de configuracion de un proyecto maven es el archivo pomp.xml

    lo principal de lo que se trata un proyecto spring, es que spring boot framework debe tener una etiqueta parent
    ( <parent> </parent>) en el archivo pomp.xml.
    Esta etiqueta quiere decir que el padre del proyecto o del cual este se esta heredando (Herencia del proyecto ) de donde se hereda.

    <parent>
        <groupId> Es un proyecto del framework spring boot  </groupId>
        <artifactId> inicializa (Started) el proyecto</artifactId>
        <version> version del spring boot en la que se esta trabajando</version>
        <!-- Esta es la version que se escoge en la pagina start.spring.io -->
    </parent>

### Significados 
    @SpringbootAplication: Le dice a springboot cual es el punto de inicio, es decir que esta clase es el punto de entrada (principal ) del servicio.
    Cuando se le de al springaplication. run 
    a partir de esta clase empieza a buscar todos los componenetes o lementos que necesito de mi aplicacion
    para qeu se ejecute sin problemas

    public class CrudApplication { }

    @RestController: Le dice a springbot que en esta clase se va a exponer algunas funciones como servicios REST,  es decir que restcontroller le dice a springboot que en esta clase van a haber unas funciones, y estas funciones van a ser publicadas como si fuera un servicio rest 

    @RequestMapping: permite decirle al navegador que todas las rutas que comiencen con /Index pertenecen a esta clase 

    @GetMapping: se expone un endpoing es decir una url, o direccion web utilizando una funcion get, lo que quiere decir que mapea una direccion get 

    @PathVariable: dentro de la ruta de la url se pueden agregar unas variables.

