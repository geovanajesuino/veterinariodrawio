package domain;

import java.util.List;

public class Atendente extends Pessoa {

    private Double salario;

    private List<Cliente> clientesCadastros;

    public Atendente(List<Cliente> clientesCadastros, Double salario, Integer codigo, String nome, String telefone) {
        super(codigo, nome, telefone);
        this.clientesCadastros = clientesCadastros;
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public List<Cliente> getClientesCadastros() {
        return clientesCadastros;
    }

    @Override
    public String toString() {
        return "Atendente [salario=" + salario + ", clientesCadastros=" + clientesCadastros + "]";
    }

    public void setClientesCadastros(List<Cliente> clientesCadastros) {
        this.clientesCadastros = clientesCadastros;
    }

}
