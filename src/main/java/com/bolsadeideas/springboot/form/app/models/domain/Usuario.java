package com.bolsadeideas.springboot.form.app.models.domain;

import com.bolsadeideas.springboot.form.app.validators.IdentificadorRegex;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Usuario {

	//@Pattern(regexp = "[0-9]{2}[.][0-9]{3}[.][0-9]{3}[-][A-Z]{1}")
	@IdentificadorRegex
	private String id;
	@NotBlank
	@Size(min = 3, max = 6)
	private String username;
	@NotEmpty
	private String password;
	@NotEmpty
	@Email
	private String email;
	//@NotEmpty
	private String nombre;
	@NotBlank
	private String apellido;

	public Usuario(@NotEmpty String nombre, @NotEmpty String apellido, String id) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
