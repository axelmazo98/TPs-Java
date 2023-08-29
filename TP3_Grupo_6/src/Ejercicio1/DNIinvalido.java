package Ejercicio1;

import java.io.IOException;

public class DNIinvalido extends IOException {
	public DNIinvalido()
	{
		
	}

	@Override
	public String getMessage() {
		
		return "El DNI debe contener solo números";
	}

}
