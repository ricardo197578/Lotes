package com.adeco.Lotes;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
//import lombox.extern.slf4j.Slf4j;

@RestController
//para mandar info al log
//@Slf4j
public class ControladorInicio{
 //agrego un metodo y para q el navegador lo ejecute debo agregar un path
 	@GetMapping("/")
	public String inicio(){
		//log.info("ejecutando el controlador rest");
		return "Hola mundo";
	}

}
