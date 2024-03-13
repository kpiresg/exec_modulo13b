import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        criarEmpresa();
        criarPessoa();
    }

    private static void criarPessoa() {
        PessoaFisica pessoaFisica = new PessoaFisica();
        List<PessoaFisica> pessoas = new ArrayList<>();

        pessoaFisica.setCpf("123.456.789-10");
        pessoaFisica.setNome("Kauan");
        pessoaFisica.setSobrenome("Pires");
        pessoaFisica.setEndereco("Pindamonhamgaba, Sao Paulo");
        pessoaFisica.setNumero(21988102983l);

        pessoas.add(pessoaFisica);
        print(pessoaFisica);
    }

    private static void criarEmpresa() {
        PessoaJuridica empresa = new PessoaJuridica();
        List<PessoaJuridica> empresas = new ArrayList<>();

        empresa.setCnpj("1231234124");
        empresa.setNome("CA servicos e vendas de refrigerador");
        empresa.setEndereco("Xique-xique, Bahia");
        empresa.setNumero(21990242592l);

        empresas.add(empresa);
        print(empresa);
    }

    private static void print(Pessoa pessoa) {

        if (pessoa instanceof PessoaJuridica) {
            PessoaJuridica empresa = (PessoaJuridica) pessoa;
            System.out.println("Nome: " + pessoa.getNome() + "\nCnpj: " + empresa.getCnpj() + "\nEndereco: " + pessoa.getEndereco() + "\nNumero: " + pessoa.getNumero());
        } else {
            PessoaFisica pessoaFisica = (PessoaFisica) pessoa;
            System.out.println("\nNome: " + pessoa.getNome() + " " + pessoaFisica.getSobrenome() + "\nCpf: " + pessoaFisica.getCpf() + "\nEndereco: " + pessoa.getEndereco() + "\nNumero: " + pessoa.getNumero());
        }
        
    }
}
