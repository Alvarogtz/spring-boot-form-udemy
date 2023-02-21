package com.bolsadeideas.springboot.form.app.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bolsadeideas.springboot.form.app.models.domain.Usuario;

import jakarta.validation.Validation;

@Component
public class UsuarioValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Usuario.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Usuario usuario = (Usuario)target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "NotEmpty.usuario.nombre");
		
		/*if(!usuario.getId().matches("[0-9]{2}[.][0-9]{3}[.][0-9]{3}[-][A-Z]{1}"))
			errors.rejectValue("id","Pattern.usuario.id");*/
		
	}

}
