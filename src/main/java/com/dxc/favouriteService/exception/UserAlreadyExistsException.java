package com.dxc.favouriteService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.CONFLICT,reason="User already exists")
public class UserAlreadyExistsException extends Exception {
	public static final long serialVersionUID = 1234567893;

}
