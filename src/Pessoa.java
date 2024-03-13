public abstract class Pessoa {
    private String nome;
    private String endereco;
    private Long numero;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Long getNumero() {
        return numero;
    }
    public void setNumero(Long numero) {
        this.numero = numero;
    }
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", numero=" + numero + "]";
    }

    
}
