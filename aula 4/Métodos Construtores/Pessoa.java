public class Pessoa {
    String nome;
    String corDoCabelo;
    String biotipo;
    int idade;

    public Pessoa() {
        
    }

    public Pessoa(String nome, String corDoCabelo, String biotipo, int idade) {
        this.nome = nome;
        this.corDoCabelo = corDoCabelo;
        this.biotipo = biotipo;
        this.idade = idade;
    }

void setNome(String nome){
    this.nome = nome;
}

public String getNome(){
    return nome;
}

void setCorDoCabelo(String corDoCabelo){
    this.corDoCabelo = corDoCabelo;
}

public String getCorDoCabelo(){
    return corDoCabelo;
}

void setBiotipo(String biotipo){
    this.biotipo = biotipo;
}

public String getBiotipo(){
    return biotipo;
}

void setIdade(int idade){
    this.idade = idade;
}

public int getidade(){
    return idade;
}

}