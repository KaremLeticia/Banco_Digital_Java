package Banco_Digital;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
@Getter
@Setter

public class Banco {
    private String nome;
    private List<Conta> contas;


    public void impressaoContasDoBanco(){
        System.out.println("Impressão das contas dos clientes do banco " + getNome() +":");
        for (Conta c : contas){
            for (String s : Arrays.asList("Nome: " + c.cliente.getNome(), "Tipo de Conta: " + c.cliente.getTipoConta(), "Agência: " + c.agencia, "Número da Conta: " + c.numero)) {
                System.out.println(s);
            }
            System.out.printf("Saldo da conta: %.2f\n",c.saldo);
            // c.imprimirInfosComuns();
            System.out.println();
        }
    }

    public void setNome(String nomeDoBanco) {
    }

    public void setContas(List<Conta> listaDeContas) {
    }
}
