package business;

import domain.Cliente;
import exceptions.CpfInvalidoException;
import persistence.ClienteDAO;

public class ClienteBO {

	public static void cadastrar(Cliente cliente) {

		try {
			validar(cliente);
			ClienteDAO.insert(cliente);

		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao cadastrar: " + e.getMessage());
		}

	}

	private static void validar(Cliente cliente) throws CpfInvalidoException {

		if (cliente.getCpf().equals("00000000000") || cliente.getCpf().equals("11111111111")
				|| cliente.getCpf().equals("22222222222") || cliente.getCpf().equals("33333333333")
				|| cliente.getCpf().equals("44444444444") || cliente.getCpf().equals("55555555555")
				|| cliente.getCpf().equals("66666666666") || cliente.getCpf().equals("77777777777")
				|| cliente.getCpf().equals("88888888888") || cliente.getCpf().equals("99999999999")
				|| (cliente.getCpf().length() != 11)) {

			throw new CpfInvalidoException("CPF Inválido");

		}

	}

	private static void editarCliente() {
		System.out.println("Que cliente deseja editar? : ");

		for (Cliente cliente : ClienteDAO.findAll()) {
			System.out.println("Cliente:" + cliente.getNome());

		}

	}
}
