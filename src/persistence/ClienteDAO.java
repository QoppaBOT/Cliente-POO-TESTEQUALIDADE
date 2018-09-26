package persistence;

import java.util.ArrayList;
import java.util.List;

import domain.Cliente;

public class ClienteDAO {

	private static ArrayList<Cliente> listaClientes = new ArrayList<>();

	public static List<Cliente> findAll() {

		return listaClientes;
	}

	public static void insert(Cliente cliente) {

		listaClientes.add(cliente);

	}

	public static void update(Cliente cliente, int escolha) {
		
		listaClientes.add(escolha, cliente);
	}

	public static void delete(Cliente cliente) {
		
		listaClientes.remove(cliente);
	}

	// TODO findBy x (x)

}
