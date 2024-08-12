public class Ingresso {
    private int numeroIngresso;
    private int assentoIngresso;
    private String tipoIngresso;
    private float valorIngresso;
    private String dataHoraCompra;

    public Ingresso(int numeroIngresso, int assentoIngresso, String tipoIngresso, float valorIngresso, String dataHoraCompra) {
        this.numeroIngresso = numeroIngresso;
        this.assentoIngresso = assentoIngresso;
        this.tipoIngresso = tipoIngresso;
        this.valorIngresso = valorIngresso;
        this.dataHoraCompra = dataHoraCompra;
    }

    public int getNumeroIngresso() {
        return numeroIngresso;
    }

    public void setNumeroIngresso(int numeroIngresso) {
        this.numeroIngresso = numeroIngresso;
    }

    public int getAssentoIngresso() {
        return assentoIngresso;
    }

    public void setAssentoIngresso(int assentoIngresso) {
        this.assentoIngresso = assentoIngresso;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public float getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public String getDataHoraCompra() {
        return dataHoraCompra;
    }

    public void setDataHoraCompra(String dataHoraCompra) {
        this.dataHoraCompra = dataHoraCompra;
    }

    public void imprimirIngresso() {
        System.out.println("Ingresso:");
        System.out.println("Número: " + numeroIngresso);
        System.out.println("Assento: " + assentoIngresso);
        System.out.println("Tipo: " + tipoIngresso);
        System.out.println("Valor: " + valorIngresso);
        System.out.println("Data/Hora da Compra: " + dataHoraCompra);
    }
}
