import java.util.Random;

public class Torneio {
    
    static Random r = new Random();


    public static boolean batalhar(Elementos herois , Elementos viloes){

        int velocidadeH = herois.getVelocidade();
        int velocidadeV = viloes.getVelocidade();

        int vidaP = herois.getVida();
        
        if (velocidadeH > velocidadeV) {
            System.out.println(":");
            System.out.println("Você ataca primeiro");
            
            while (herois.getVida() > 0 && viloes.getVida() > 0) {

                System.out.println("Seu ataque");

                int escolherAtaque = Menu.atacar();
                if (escolherAtaque == 0)
                        break;
                ataqueElemento(escolherAtaque, herois, viloes);
                
                System.out.println("Ataque do inimigo");

                ataqueOponente(viloes, herois);

                
            }

        } else if (velocidadeH < velocidadeV) {
            System.out.println(":");
            System.out.println("Seu inimigo ataca primeiro");

            while (herois.getVida() > 0 && viloes.getVida() > 0) {

                System.out.println("Ataque do inimigo");
                ataqueOponente(viloes, herois);
                
                if (herois.getVida() > 0){
                    System.out.println("Escolher ataque");
                    int escolherAtaque = Menu.atacar();
                    if (escolherAtaque == 0)
                        break;
                    ataqueElemento(escolherAtaque, herois, viloes);
                } else {
                    
                }

            }

        } else {
            System.out.println(":");
            System.out.println("Vocês tem a mesma velocidade");
        }
        
        herois.setRec(vidaP);
        if (viloes.getVida() > 0) {
            System.out.println("Você Venceu");
            return true;
        } else {
            System.out.println("Você Perdeu");
            System.out.println(":");
            System.out.println("Torneio encerrado");
            
            return false;
        }
    }

    public static void diminuirVida(Elementos personagem, int danoCausado) {
        int vida = personagem.getVida();
        vida -= danoCausado;
        personagem.setRec(vida);
    }

    public static void ataque(Elementos personagem1, Elementos personagem2) {
        int danoCausado = personagem1.atacar(personagem2.getDefesa());
        diminuirVida(personagem2, danoCausado);

        System.out.println("Ataque Físico: " + danoCausado);
        System.out.println("Sua vida: " + personagem1.getVida() + "\nVida do seu inimigo: " + personagem2.getVida());
    }

    public static void ataqueElemental(Elementos personagem1, Elementos personagem2) {
        int danoCausado = personagem1.atacEspecial(personagem1.getPoder(), personagem1.getAtaque(), personagem2.getDefesa(), personagem2.getNome());
        diminuirVida(personagem2, danoCausado);

        System.out.println("Ataque Elemental: " + danoCausado);
        System.out.println("Sua Vida: " + personagem1.getVida() + "\nVida do seu inimigo: " + personagem2.getVida());
    }

    public static boolean ataqueElemento(int escolherAtaque, Elementos personagem1, Elementos personagem2) {
        if (escolherAtaque == 1) {
            ataque(personagem1, personagem2);
        } else if (escolherAtaque == 2) {
            ataqueElemental(personagem1, personagem2);
        } else {
            return false;
        }
        return false;
    }

    public static void ataqueOponente(Elementos personagem1, Elementos personagem2) {
        int escolherAtaque = r.nextInt(1, 2);
        if (escolherAtaque == 1) {
            ataque(personagem1, personagem2);
        } else if (escolherAtaque == 2) {
            ataqueElemental(personagem1, personagem2);
        }
    }

}
