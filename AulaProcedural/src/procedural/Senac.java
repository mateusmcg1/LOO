package procedural;

public class Senac {
    String nomeCurso;

    //construtor da classe
    public Senac(String nome){
        nomeCurso = nome;
    }
    public void setNomeCurso (String nome){
        nomeCurso = nome;
    }
    public String getNomeCurso(){
        return nomeCurso;
    }

    public void MostrarMensagem(){
        System.out.println("Bem vindo ao Curso: " + getNomeCurso());
    }//end metodo
}