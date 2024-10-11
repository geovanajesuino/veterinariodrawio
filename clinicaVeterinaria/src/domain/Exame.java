package domain;

import java.time.LocalDate;

public class Exame {

    private Integer codigo;
    private String tipo;
    private String resultado;
    private LocalDate date;
    private Consulta consulta;
   
    public Exame(String tipo, String resultado, LocalDate date, Consulta consulta) {
        this.tipo = tipo;
        this.resultado = resultado;
        this.date = date;
        this.consulta = consulta;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public Consulta getConsulta() {
        return consulta;
    }
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    @Override
    public String toString() {
        return "Exame [codigo=" + codigo + ", tipo=" + tipo + ", resultado=" + resultado + ", date=" + date
                + ", consulta=" + consulta + "]";
    }

    

}
