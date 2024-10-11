package domain;

public class Veterinario extends Pessoa {

    private String crmv;

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public Veterinario(Integer codigo, String nome, String telefone, String crmv) {
        super(codigo, nome, telefone);
        this.crmv = crmv;
    }

    @Override
    public String toString() {
        return "Veterinario [crmv=" + crmv + "]";
    }

    


}
