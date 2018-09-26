package exceptions;

public class CpfInvalidoException extends Exception {

	public CpfInvalidoException(String mensagem) {
		super(mensagem);
	}

	private static final long serialVersionUID = 1L;

}
