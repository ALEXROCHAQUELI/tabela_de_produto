package sistema;
/**
 *
 * @author Alex Rocha
 */
class Produto {

    static void nextString() {
       
    }

    public String codigo;
    public String NomeProduto;
    public String qtTotal;
    public String valor;

    public Produto(String codigo, String NomeProduto, String qtTotal, String valor) {
        this.codigo      = codigo;
        this.NomeProduto = NomeProduto;
        this.qtTotal     = qtTotal;
        this.valor       = valor;
    }

    Produto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return NomeProduto;
    }

    public void setProduto(String NomeProduto) {
        this.NomeProduto = NomeProduto;
    }

    public String getQtTotal() {
        return qtTotal;
    }

    public void setQtTotal(String qtTotal) {
        this.qtTotal = qtTotal;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "codigo"+"-"+"-"+codigo+"-"+"-"+"-"+"Produtos"+"-"+"-"+NomeProduto+"-"+"-"+"-"+"Quantidade"+"-"+"-"+"-"+qtTotal+"-"+"-"+"-"+"Valor do Produto"+"-"+"-"+valor;
    }
}