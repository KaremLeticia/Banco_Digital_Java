##Criando um Banco Digital com Java e Orientação a Objetos

#Introdução
Este projeto demonstra a criação de um sistema básico de Banco Digital utilizando Java e os princípios da Programação Orientada a Objetos (POO). O projeto foca na aplicação de conceitos como herança, encapsulamento, polimorfismo e abstração.

Funcionalidades do Projeto
Criação de contas bancárias (corrente e poupança)
Depósitos e saques
Transferências entre contas
Impressão de informações da conta
Conceitos de POO Utilizados
1. Encapsulamento
Encapsulamento é a prática de esconder os detalhes internos de um objeto e expor apenas o necessário. Isso é feito através de modificadores de acesso (private, protected, public) e métodos getter e setter.

No projeto, as classes Conta e Banco utilizam encapsulamento para proteger os dados das contas e permitir o acesso seguro através de métodos públicos.

java
Copiar código
public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente cliente;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    // Outros métodos...
}
2. Herança
Herança permite que uma classe herde propriedades e métodos de outra classe. No projeto, ContaCorrente e ContaPoupanca herdam de Conta, aproveitando e especializando o comportamento da classe base.

java
Copiar código
public class ContaCorrente extends Conta {
    private double taxaManutencao;

    public void cobrarTaxa() {
        // Implementação da cobrança de taxa...
    }
}

public class ContaPoupanca extends Conta {
    private double rendimento;

    public void calcularRendimento() {
        // Implementação do cálculo de rendimento...
    }
}
3. Polimorfismo
Polimorfismo permite que objetos de diferentes classes sejam tratados através de uma interface comum. No projeto, isso é demonstrado ao tratar diferentes tipos de contas (ContaCorrente, ContaPoupanca) de maneira uniforme.

java
Copiar código
public class Banco {
    private List<Conta> contas;

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void imprimirContas() {
        for (Conta conta : contas) {
            System.out.println(conta.getSaldo());
        }
    }
}
4. Abstração
Abstração envolve a definição de classes e métodos que representam conceitos essenciais sem especificar detalhes internos. No projeto, a classe Conta é abstrata, fornecendo uma estrutura básica que as classes derivadas especializam.

java
Copiar código
public abstract class Conta {
    protected double saldo;
    protected int agencia;
    protected int numero;
    protected Cliente cliente;

    public abstract void sacar(double valor);

    // Outros métodos abstratos ou concretos...
}
Estrutura do Projeto
com.marcosfshirafuchi
Banco.java: Classe principal que gerencia contas e operações bancárias.
Conta.java: Classe abstrata representando uma conta bancária.
ContaCorrente.java: Classe representando uma conta corrente.
ContaPoupanca.java: Classe representando uma conta poupança.
Cliente.java: Classe representando um cliente do banco.
Requisitos
Java 11 ou superior
Maven ou Gradle (para gerenciamento de dependências)
Como Executar
Clone o repositório:
bash
Copiar código
git clone https://github.com/seuusuario/banco-digital.git
cd banco-digital
Compile e execute o projeto:
Usando Maven
bash
Copiar código
mvn clean install
mvn exec:java -Dexec.mainClass=com.marcosfshirafuchi.App
Usando Gradle
bash
Copiar código
gradle clean build
gradle run
Conclusão
Este projeto demonstra como utilizar os princípios da Programação Orientada a Objetos para construir um sistema básico de Banco Digital em Java. Conceitos como encapsulamento, herança, polimorfismo e abstração são aplicados para criar um código organizado, reutilizável e fácil de manter.

Espero que este README forneça uma boa base para entender como implementar um banco digital em Java usando conceitos de POO. Se precisar de mais detalhes ou tiver alguma dúvida, sinta-se à vontade para perguntar!
