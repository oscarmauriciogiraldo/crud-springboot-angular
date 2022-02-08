package co.edu.tu.isc.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//main aplication
@SpringBootApplication
// se agregan nuevos elementos al main aplication
/*nueva etiqueta o anotacion restcontroler --> indica que esta calse
adicionalmente va a tener un servicio rest (rutas)
*/
@RestController
// request maping hace el mapeo de las rutas el cual lo dirige a esta clase
@RequestMapping("index")
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
        
        // metodo get
        // se mapea una peticion get a la siguiente ruta
        @GetMapping("/{firstName}/{lastName}")
        // llama la funcion 
        public String sayIndex(
                @PathVariable("firstName") String firstName, 
                @PathVariable("lastName") String lastName){
            return String.format("Index %s %s", firstName, lastName);
            // retorna una cadena con nombre y apellido
        }

}
