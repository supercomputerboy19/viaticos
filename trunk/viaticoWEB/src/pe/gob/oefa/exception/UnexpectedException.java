/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.oefa.exception;

/**
 *
 * @author root
 */
public class UnexpectedException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public UnexpectedException(String message) {
		super(message);
	}

	public UnexpectedException(String message, Throwable cause) {
		super(message, cause);
	}
}
