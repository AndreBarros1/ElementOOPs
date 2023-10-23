public class App {
    public static void main(String[] args){

        int escolha = Menu.iniciar();
        if (escolha == 1){
            int escolhaPerso = Menu.personagem();

            if (escolhaPerso > 0 && escolhaPerso <= 4){
                Elementos[] personagens = gerarPersonagem();


                Elementos personagemEscolhido = personagens[escolhaPerso - 1];
                
                
                
                System.out.println("Personagem Escolhido, Boa Sorte");
                System.out.println(personagemEscolhido);

                int escolhaTorneio = Menu.iniciarTorneio();

                if (escolhaTorneio == 1) {
                    for (int i = 0; i < personagens.length; i++) {
                        if (i != escolhaPerso - 1) {

                            
                        
                            System.out.println(personagemEscolhido.getNome() + " VS " + personagens[i].getNome() + ":");
                            System.out.println("\nFicha do seu Personagem:\n " + personagemEscolhido);
                            System.out.println("\nFicha do Oponente:\n" + personagens[i]);
                            boolean vitoria = Torneio.batalhar(personagemEscolhido, personagens[i]);
                            if (vitoria == false) {
                                break;
                            } else {
                                if (i < 3 && vitoria) {
                                    int proximoRound = Menu.iniciarProximoRound();
                                    if (proximoRound == 0) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            
                        }
                    }
                }
                
            }
        }

    }// fim do metodo Main

    public static Elementos[] gerarPersonagem() {
            Elementos[] personagem = new Elementos[4];
            personagem[0] = new Terra();
            personagem[1] = new Agua();
            personagem[2] = new Ar();
            personagem[3] = new Fogo();
            return personagem;
        }
    
    } //fim da classe Main
