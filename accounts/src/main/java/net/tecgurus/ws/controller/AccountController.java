package net.tecgurus.ws.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.tecgurus.ws.dto.ConfigurationDTO;

@RestController
@RequestMapping("/account")
public class AccountController {

	//Debe de tener una URL localhost:8080
	//Debe de tener una URI /account/
	//Debe de tener el nombre del servicio /account/get
	//Todos los metodos que esten en el controlador deben de ser publicos
	
	/*
	 * {accesor} {retorno} {nombre} {argumentos}
	 */
	
	/*
	 * HTTP: GET, PUT, POST, DELETE => CRUD
	 */
	
	@Autowired
	private ConfigurationDTO configurationDTO;
	
	@GetMapping("/get")
	public String getAccount() {
		return "Hola equpo!";
	}
	
	@PutMapping("/put")
	public boolean putAccount() {
		return false;
	}
	
	@PostMapping("/post")
	public boolean postAccount() {
		return true;
	}
	
	@DeleteMapping("/delete")
	public boolean deleteAccount() {
		return false;
	}
	
	@GetMapping("/configuration")
	public ConfigurationDTO getConfig() {
		return configurationDTO;
	}
}
