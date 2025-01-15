package br.com.gymble.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	@GetMapping("/somar/{a}/{b}")
	@ResponseBody
	public int somar(@PathVariable int a,@PathVariable int b )
	{
		try {
			return (a + b) ;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	@GetMapping("/subtrair")
	public Double subtrair(
			@RequestParam(name = "a", defaultValue = "0") String a,
			@RequestParam(name = "b", defaultValue = "0") String b
			)
	{
		try {
			return (Double.parseDouble(a) - Double.parseDouble(b)) ;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0.0;
	}
	
}
