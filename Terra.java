public class Terra extends Elementos{
    
    private String nome;
    private String tipo_elemento;


public Terra(){
    
    this.nome = "StoneDev - (Terra)";
    this.tipo_elemento = "Terra";

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
    
    if (tipo_elemento.equals("Água")) {
        System.out.println("Ataque Especial de Terra");

        int dano = poder * ataque / opDefesa * 2;

        return dano;
        
    } else {
        System.out.println("taque Especial de Terra");

        int dano = poder * ataque / opDefesa;

        return dano;
    }
}// metodo atacEspecial

public String toString() {
    return String.format("\nNome: %s\nTipo: %s", nome, tipo_elemento) + super.toString();         
}

} //fim da classe terra
