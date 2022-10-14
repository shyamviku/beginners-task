package createdexception;

import java.sql.SQLException;

public class CustomException extends Exception {
	public CustomException (String message) {
		super(message);
	}

	public CustomException(String message, Exception e) {
		super(message,e);
	}

}
