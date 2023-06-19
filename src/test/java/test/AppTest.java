package test;

import entity.Contato;
import entity.DadosProfissionais;
import entity.Endereco;
import entity.PretensaoSalarial;
import org.junit.Test;
import service.CadastroService;

import java.io.IOException;

import static test.util.TestDataCreator.*;

public class AppTest {

    @Test
    public void testCandidatoComTodosOsParametros() {
        Endereco endereco = newEnderecoBuilder().build();
        Contato contato = newContatoBuilder().build();
        PretensaoSalarial pretensaoSalarial = newPretensaoSalarial().build();
        DadosProfissionais dadosProfissionais = newProfissaoBuilder(pretensaoSalarial).build();

        var candidato = (
            newCandidatoBuilder(endereco, contato, dadosProfissionais).build()
        );

        System.out.println(CadastroService.transformandoCandidatosEmTextoParaArquivoCsv(candidato));
    }

    @Test
    public void testCandidatoSemNumeroComplementoETelefone() {
        Endereco endereco = newEnderecoBuilder().complemento(null).numero(null).build();
        Contato contato = newContatoBuilder().telefone(null).build();
        PretensaoSalarial pretensaoSalarial = newPretensaoSalarial().build();
        DadosProfissionais dadosProfissionais = newProfissaoBuilder(pretensaoSalarial).build();

        var candidato = (
            newCandidatoBuilder(endereco, contato, dadosProfissionais).build()
        );

        System.out.println(CadastroService.transformandoCandidatosEmTextoParaArquivoCsv(candidato));
    }


    @Test
    public void testGerandoArquivoComCandidato() {
        Endereco endereco = newEnderecoBuilder().build();
        Contato contato = newContatoBuilder().build();
        PretensaoSalarial pretensaoSalarial = newPretensaoSalarial().build();
        DadosProfissionais dadosProfissionais = newProfissaoBuilder(pretensaoSalarial).build();

        var candidato = (
            newCandidatoBuilder(endereco, contato, dadosProfissionais).build()
        );

        try {
            CadastroService.gerandoArquivoCsvAPartirDoCandidato(candidato);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
