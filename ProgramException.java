package jazmachine;

/**
 *
 * @author Jordan
 */
public class ProgramException extends RuntimeException {
	ProgramException() {}
	ProgramException(String message) { super(message); }
	ProgramException(Throwable cause) { super(cause); }
	ProgramException(String message, Throwable cause) { super(message, cause); }
}
