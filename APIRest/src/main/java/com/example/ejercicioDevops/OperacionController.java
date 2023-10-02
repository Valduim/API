package com.example.ejercicioDevops;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperacionController {	
	
	
	
	@PostMapping("/sumar")
    public int sumar(@RequestParam int numero1, @RequestParam int numero2) {
        
		int resultado = numero1+numero2;
		
		return resultado;
    }
	
	@PostMapping("/multiplicar")
    public int multiplicar(@RequestParam int numero1, @RequestParam int numero2) {
		
		int resultado = numero1*numero2;
		
		return resultado;
    }
	

}
