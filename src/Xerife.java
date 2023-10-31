public class Xerife extends Humanos {
    String corDistintivo;
    String corChapeu;
    String aparencia;
    int numeroDePistolas;
    int numeroDeBalas;

    public Xerife (){
        aparencia = "Calvo";
        numeroDePistolas = 2;
        numeroDeBalas = 16;
    }

    public void atirar() {
        if(numeroDeBalas > 0){
            numeroDeBalas--;
        }
        else
        {
            System.out.println("Você não tem balas suficientes!");
        }
    }
    public int quantasBalasTem(){
        return numeroDeBalas;
    }
}
