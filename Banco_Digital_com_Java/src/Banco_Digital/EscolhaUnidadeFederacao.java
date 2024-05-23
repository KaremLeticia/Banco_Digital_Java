package Banco_Digital;

public class EscolhaUnidadeFederacao {
    String estadosBrasileiros[] = {"Acre", "Alagoas", "Amapá", "Amazonas",
            "Bahia", "Ceará", "Distrito Federal", "Espirito Santo",
            "Goiás", "Maranhão", "Mato Grosso do Sul", "Mato Grosso",
            "Minas Gerais", "Pará", "Paraíba", "Paraná",
            "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte",
            "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina",
            "São Paulo", "Sergipe", "Tocantins"};
    public void impressaoEstadosBrasileiros(){
        System.out.print("Opções de estado do endereço do Cliente: ");
        for (int i =0; i<estadosBrasileiros.length; i++){
            System.out.println((i+1) +" - " + estadosBrasileiros[i]);
        }

    }

    public String retornarEstado(int opcaoEstado){
        String estadoCliente = null;
        switch (opcaoEstado){
            case 1:
                UnidadeFederacao unidadeFederacao1 = UnidadeFederacao.ACRE;
                estadoCliente = String.valueOf(unidadeFederacao1.sigla());
                break;
            case 2:
                UnidadeFederacao unidadeFederacao2 = UnidadeFederacao.ALAGOAS;
                estadoCliente = String.valueOf(unidadeFederacao2.sigla());
                break;
            case 3:
                UnidadeFederacao unidadeFederacao3 = UnidadeFederacao.AMAPA;
                estadoCliente = String.valueOf(unidadeFederacao3.sigla());
                break;
            case 4:
                UnidadeFederacao unidadeFederacao4 = UnidadeFederacao.AMAZONAS;
                estadoCliente = String.valueOf(unidadeFederacao4.sigla());
                break;
            case 5:
                UnidadeFederacao unidadeFederacao5 = UnidadeFederacao.BAHIA;
                estadoCliente = String.valueOf(unidadeFederacao5.sigla());
                break;
            case 6:
                UnidadeFederacao unidadeFederacao6 = UnidadeFederacao.CEARA;
                estadoCliente = String.valueOf(unidadeFederacao6.sigla());
                break;
            case 7:
                UnidadeFederacao unidadeFederacao7 = UnidadeFederacao.DISTRITO_FEDERAL;
                estadoCliente = String.valueOf(unidadeFederacao7.sigla());
                break;
            case 8:
                UnidadeFederacao unidadeFederacao8 = UnidadeFederacao.ESPIRITO_SANTO;
                estadoCliente = String.valueOf(unidadeFederacao8.sigla());
                break;
            case 9:
                UnidadeFederacao unidadeFederacao9 = UnidadeFederacao.GOIAS;
                estadoCliente = String.valueOf(unidadeFederacao9.sigla());
                break;
            case 10:
                UnidadeFederacao unidadeFederacao10 = UnidadeFederacao.MARANHAO;
                estadoCliente = String.valueOf(unidadeFederacao10.sigla());
                break;
            case 11:
                UnidadeFederacao unidadeFederacao11 = UnidadeFederacao.MATO_GROSSO;
                estadoCliente = String.valueOf(unidadeFederacao11.sigla());
                break;
            case 12:
                UnidadeFederacao unidadeFederacao12 = UnidadeFederacao.MATO_GROSSO_DO_SUL;
                estadoCliente = String.valueOf(unidadeFederacao12.sigla());
                break;
            case 13:
                UnidadeFederacao unidadeFederacao13 = UnidadeFederacao.MINAS_GERAIS;
                estadoCliente = String.valueOf(unidadeFederacao13.sigla());
                break;
            case 14:
                UnidadeFederacao unidadeFederacao14 = UnidadeFederacao.PARA;
                estadoCliente = String.valueOf(unidadeFederacao14.sigla());
                break;
            case 15:
                UnidadeFederacao unidadeFederacao15 = UnidadeFederacao.PARAIBA;
                estadoCliente = String.valueOf(unidadeFederacao15.sigla());
                break;
            case 16:
                UnidadeFederacao unidadeFederacao16 = UnidadeFederacao.PARANA;
                estadoCliente = String.valueOf(unidadeFederacao16.sigla());
                break;
            case 17:
                UnidadeFederacao unidadeFederacao17 = UnidadeFederacao.PERNAMBUCO;
                estadoCliente = String.valueOf(unidadeFederacao17.sigla());
                break;
            case 18:
                UnidadeFederacao unidadeFederacao18 = UnidadeFederacao.PIAUI;
                estadoCliente = String.valueOf(unidadeFederacao18.sigla());
                break;
            case 19:
                UnidadeFederacao unidadeFederacao19 = UnidadeFederacao.RIO_DE_JANEIRO;
                estadoCliente = String.valueOf(unidadeFederacao19.sigla());
                break;
            case 20:
                UnidadeFederacao unidadeFederacao20 = UnidadeFederacao.RIO_GRANDE_DO_NORTE;
                estadoCliente = String.valueOf(unidadeFederacao20.sigla());
                break;
            case 21:
                UnidadeFederacao unidadeFederacao21 = UnidadeFederacao.RIO_GRANDE_DO_SUL;
                estadoCliente = String.valueOf(unidadeFederacao21.sigla());
                break;
            case 22:
                UnidadeFederacao unidadeFederacao22 = UnidadeFederacao.RONDONIA;
                estadoCliente = String.valueOf(unidadeFederacao22.sigla());
                break;
            case 23:
                UnidadeFederacao unidadeFederacao23 = UnidadeFederacao.RORAIMA;
                estadoCliente = String.valueOf(unidadeFederacao23.sigla());
                break;
            case 24:
                UnidadeFederacao unidadeFederacao24 = UnidadeFederacao.SANTA_CATARINA;
                estadoCliente = String.valueOf(unidadeFederacao24.sigla());
                break;
            case 25:
                UnidadeFederacao unidadeFederacao25 = UnidadeFederacao.SAO_PAULO;
                estadoCliente = String.valueOf(unidadeFederacao25.sigla());
                break;
            case 26:
                UnidadeFederacao unidadeFederacao26 = UnidadeFederacao.SERGIPE;
                estadoCliente = String.valueOf(unidadeFederacao26.sigla());
                break;
            case 27:
                UnidadeFederacao unidadeFederacao27 = UnidadeFederacao.TOCANTINS;
                estadoCliente = String.valueOf(unidadeFederacao27.sigla());
                break;
        }
        return estadoCliente;
    }
}
