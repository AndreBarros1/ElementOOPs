import java.util.Random;

public class Elementos {
    
    static Random random = new Random();

    private int poder;
    private int ataque;
    private int velocidade; 
    private int defesa;
    private int vida;


public Elementos(){

    setPoder();
    setAtaque();
    setVelocidade();
    setDefesa();
    setVida();

} //fim do construto

//Metodos Get and Set

public void setPoder(){
    this.poder = random.nextInt(10, 30);
}

public int getPoder(){
    return this.poder;
}

public void setAtaque(){
    this.ataque = random.nextInt(5, 15);
}

public int getAtaque(){
    return this.ataque;
}

public void setVelocidade(){
    this.velocidade = random.nextInt(1, 10);
}

public int getVelocidade(){
    return this.velocidade;
}

public void setDefesa(){
    this.defesa = random.nextInt(5, 15);
}

public int getDefesa(){
    return this.defesa;
}

public void setVida(){
    this.vida = random.nextInt(200, 400);
}

public int getVida(){
    return this.vida;
}

//Recuperar vida a cada batalha
public void setRec(int rec){
    this.vida = rec;
}

public int getRec(){
    return this.vida;
}

public String toString() {
    return String.format("Ficha de Personagem: \nPoder: %d\nAtaque: %d\nVelocidade: %d\nDefesa: %d\nVida: %d",
    getPoder(),
    getAtaque(),
    getVelocidade(),
    getDefesa(),
    getVida());
}

public int atacar(int opDefesa){

    int dano = poder * ataque / opDefesa;

    return dano;
}// metodo atacar

public int atacEspecial(int p, int a, int d, String n){
    return ataque;
}// metodo atacEspecial



public String getNome() {
    return null;
}

public String getElemento() {
    return null;
}

} //fim da classe Elementos
