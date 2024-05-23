package Banco_Digital;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    private Endereco endereco;
    private String telefone;
    private String tipoConta;

    public Cliente(String nome, String cpf, Endereco endereco, String profissao, String telefone, String tipoConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.profissao = profissao;
        this.telefone = telefone;
        this.tipoConta = tipoConta;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", profissao='" + profissao + '\'' +
                ", endereco=" + endereco +
                ", telefone='" + telefone + '\'' +
                ", tipoConta='" + tipoConta + '\'' +
                '}';
    }

    public Object getNome() {
        return null;
    }
}
