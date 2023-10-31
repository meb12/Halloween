public class Tiroteio {
    public static void main(String[] args) {
        CidadeOeste sweatyPost = new CidadeOeste();
        sweatyPost.saloes = 2;
        sweatyPost.xerifes = 1;
        sweatyPost.causadoresdeproblemas = 5;

        Vilao maurice = new Vilao();
        maurice.corChapeu = "azul";
        maurice.corBigode = "preto";
        maurice.sexo = "masculino";
        maurice.nomeCavalo = "Milk Shake";
        maurice.preferenciaWhiskey = "Jack Daniels";

        Humanos mary = new Humanos();
        mary.sexo = "feminino";
        mary.nomeCavalo = "Bob";
        mary.preferenciaWhiskey = "White Worse";
        mary.nome = "Stefany";

        Xerife Scott = new Xerife();
        Scott.aparencia = "Calvo";
        Scott.numeroDeBalas = 12;
        Scott.corDistintivo = "Dourado e preto";
        Scott.corChapeu = "Marrom";

        maurice.beberWhiskey();
        System.out.println(maurice.quaoBebadoEstou());
        maurice.capturarDonzela(mary);

        Scott.atirar();
        System.out.println("\nNumero de balas disponiveis:" + Scott.quantasBalasTem());
    }
}

