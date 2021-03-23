package net.tecgurus.ws.controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	//Debe de tener una URL localhost:8080
	//Debe de tener una URI /user/
	//Debe de tener el nombre del servicio /user/get
	//Todos los metodos que esten en el controlador deben de ser publicos
	
	/*
	 * {accesor} {retorno} {nombre} {argumentos}
	 */
	
	/*
	 * HTTP: GET, PUT, POST, DELETE => CRUD
	 */
	
	@GetMapping("/get")
	public String getUser() {
		return "Hola equpo!";
	}
	
	@PutMapping("/put")
	public boolean putUser() {
		return false;
	}
	
	@PostMapping("/post")
	public boolean postUser() {
		return true;
	}
	
	@DeleteMapping("/delete")
	public boolean deleteUser() {
		return false;
	}
}
