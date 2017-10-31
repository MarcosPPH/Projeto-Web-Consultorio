package model;
/**
 * Classe criada para instanciar os N Contatos do Paciente
 * @author Marcos e Mirian
 * @since Classe criada em 30/10/2017
 */
public class ContatoPaciente {
    
    private String codigo;
    private String tipo;
    private String dados;

    public ContatoPaciente(String codigo, String tipo, String dados) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.dados = dados;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }
    
}
