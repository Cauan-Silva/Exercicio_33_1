package Principal;

import Clientes.Cliente;
import Clientes.PessoaFisica;
import Clientes.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new PessoaFisica("João Silva", "Rua 1", "1234-5678", "111.222.333-44", "MG-12.345.678", 5000.00));
        clientes.add(new PessoaFisica("Maria Oliveira", "Rua 2", "2345-6789", "222.333.444-55", "MG-23.456.789", 7000.00));
        clientes.add(new PessoaJuridica("Empresa A", "Av. Central", "3456-7890", "12.345.678/0001-99", "123456789", 12000.00));
        clientes.add(new PessoaJuridica("Empresa B", "Rua do Comércio", "4567-8901", "23.456.789/0001-88", "987654321", 25000.00));

        Cliente clienteMaiorRendimento = null;
        double maiorRendimento = Double.MIN_VALUE;

        for (Cliente cliente : clientes) {
            if (cliente.getRendimento() > maiorRendimento) {
                maiorRendimento = cliente.getRendimento();
                clienteMaiorRendimento = cliente;
            }
        }

        if (clienteMaiorRendimento != null) {
            System.out.println("Cliente com o maior rendimento:");
            System.out.println("Nome: " + clienteMaiorRendimento.getNome());
            System.out.println("Rendimento: " + clienteMaiorRendimento.getRendimento());
        }
    }
}
