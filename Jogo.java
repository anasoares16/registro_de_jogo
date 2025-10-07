public class Jogo{
    private String nome;
    private int anoLançamento;
    private String desenvolvedores;


    //construtor/ inicia um objeto jogo

    public Jogo(String nome, int anoLançamento, String desenvolvedores){
        this.nome = nome;
        this.anoLançamento = anoLançamento;
        this.desenvolvedores = desenvolvedores;
    }


    //getter/ acessa os campos

    public String getNome(){
        return nome;
    }

    public int getAnoLançamento(){
        return anoLançamento;
    }

    public int getDesenvolvedores(){
        return desenvolvedores;
    }

    //metodo toString
    @override
    public String toString(){
        return "Jogo: " + nome +
        ", Ano de Lançamento: " + anoLançamento +
        ", Desenvolvedores: " + desenvolvedores;
    }


}