package domain;

import java.time.LocalDate;

public class Consulta {

    private Integer codigo;

    private LocalDate data;

    private String resumo;

    private Tratamento tratamento;

    private Veterinario veterinario;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Consulta [codigo=" + codigo + ", data=" + data + ", resumo=" + resumo + ", tratamento=" + tratamento
                + ", veterinario=" + veterinario + ", getCodigo()=" + getCodigo() + ", getData()=" + getData()
                + ", getResumo()=" + getResumo() + ", getTratamento()=" + getTratamento() + ", getVeterinario()="
                + getVeterinario() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public Tratamento getTratamento() {
        return tratamento;
    }

    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    private List<Exame>;

    }