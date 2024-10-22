package Clientes;

public class PessoaFisica extends Cliente {
    private String cpf;
    private String rg;
    private double salario;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf, String rg, double salario) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
    }

    @Override
    public double getRendimento() {
        return salario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }
}
