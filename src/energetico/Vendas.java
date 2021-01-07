package energetico;

public class Vendas {
    private double precoUnitario = 4.50;
    private String nomeEmpresa;
    private int quantidade;

    private double icms;
    private double ipi;
    private double pis;
    private double cofins;
    private double bonificacao;

    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }

    public double getIpi() {
        return ipi;
    }

    public void setIpi(double ipi) {
        this.ipi = ipi;
    }

    public double getPis() {
        return pis;
    }

    public void setPis(double pis) {
        this.pis = pis;
    }

    public double getCofins() {
        return cofins;
    }

    public void setCofins(double cofins) {
        this.cofins = cofins;
    }

    public double getPrecoUnitario() {

        return precoUnitario;
    }

    public String getNomeEmpresa() {

        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {

        this.nomeEmpresa = nomeEmpresa;
    }

    public int getQuantidade() {

        return quantidade;
    }

    public void setQuantidade(int quantidade) {

        this.quantidade = quantidade;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
}
