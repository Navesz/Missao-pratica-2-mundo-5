package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Movimentacao;
import model.PessoaFisica;
import model.PessoaJuridica;

@StaticMetamodel(Pessoa.class)
public class Pessoa_ { 

    public static volatile SingularAttribute<Pessoa, Integer> idPessoa;
    public static volatile SingularAttribute<Pessoa, String> cidade;
    public static volatile SingularAttribute<Pessoa, String> estado;
    public static volatile SingularAttribute<Pessoa, String> telefone;
    public static volatile CollectionAttribute<Pessoa, PessoaFisica> pessoaFisicaCollection;
    public static volatile SingularAttribute<Pessoa, String> logradouro;
    public static volatile SingularAttribute<Pessoa, String> nome;
    public static volatile CollectionAttribute<Pessoa, PessoaJuridica> pessoaJuridicaCollection;
    public static volatile SingularAttribute<Pessoa, String> email;
    public static volatile CollectionAttribute<Pessoa, Movimentacao> movimentacaoCollection;

}