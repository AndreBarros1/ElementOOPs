public class Agua extends Elementos{
    
    private String nome;
    private String tipo_elemento;


public Agua(){
    
    this.nome = "WaveNerd - (Água)";
    this.tipo_elemento = "Água";

} //fim do construtor

public String getNome(){
    return this.nome;
}

public String getTipo_elemento(){
    return this.tipo_elemento;
}

//Sobrescrista do metodo ataque especial
@Override
public int atacEspecial(int poder, int ataque, int opDefesa, String nome){
    
    if (tipo_elemento.equals("Fogo")) {
        System.out.println("Ataque Especial de Água");

        int dano = poder * ataque / opDefesa * 2;

        return dano;
        
    } else {
        System.out.println("taque Especial de Água");

        int dano = poder * ataque / opDefesa;

        return dano;
    }
}// metodo atacEspecial

public String toString() {
    return String.format("\nNome: %s\nTipo: %s", nome, tipo_elemento) + super.toString();         
}


} //fim da classe Agua
