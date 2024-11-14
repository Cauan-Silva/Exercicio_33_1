package Clientes;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String ie;
    private double faturamento;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String ie, double faturamento) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.ie = ie;
        this.faturamento = faturamento;
    }

    @Override
    public double getRendimento() {
        return faturamento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getIe() {
        return ie;
    }
}
