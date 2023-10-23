import java.util.Scanner;

public class Menu {
    
    public static int iniciar() {
        int jogar;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("\nTORNEIO DE ELEMENTOS\n1 Iniciar\n0 Sair\n");
            while (!scanner.hasNextInt()) {
                scanner.next(); 
                System.out.println("Escolha entre 0 ou 1.");
            }
            jogar = scanner.nextInt(); 
            if (jogar == 0)
                break;
        } while(jogar != 0 && jogar != 1);
        System.out.printf("Opção Escolhida: %d.\n" ,jogar);
        return jogar;
    } //fim do iniciar

    public static int iniciarProximoRound() {
        int jogar;
        Scanner scanner = new Scanner(System.in);
        do {
          
            System.out.print("\n1 Próximo Round;\n0 Sair\n");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Escolha entre 0 ou 2.");
            }
            jogar = scanner.nextInt(); 
            if (jogar == 0)
                break;
        } while(jogar != 0 && jogar != 1);
        System.out.printf("Opção Escolhida: %d.\n" ,jogar);
        return jogar;
    } //fim do iniciarProximoRound

    public static int iniciarTorneio() {
        int jogar;
        Scanner scanner = new Scanner(System.in);
        do {
           
            System.out.print("\n1 Iniciar torneio;\n0 Sair\n");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Escolha entre 0 ou 1.");
            }
            jogar = scanner.nextInt(); 
            if (jogar == 0)
                break;
        } while(jogar != 0 && jogar != 1);
        System.out.printf("Opção Escolhida: %d.\n" ,jogar);
        return jogar;
    } //fim do iniciarTorneio


    public static int personagem() {
        int elemento;
        Scanner scanner = new Scanner(System.in);
        do {
            
            System.out.printf("\nEscolha um personagem:\n 1 - StoneDev (Terra);\n 2 - WaveNerd (Água));\n 3 - BreezeHacker (Ar);\n 4 - BurnCoder(Fogo);\n 0 - Sair;\n");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Escolha entre 0 a 4.");
            }
            elemento = scanner.nextInt();
            if (elemento == 0)
                break;
        } while(elemento != 0 && elemento != 1 && elemento != 2 && elemento != 3 && elemento != 4 );
        return elemento;
    } //fim da escolha de personagem

    

    public static int atacar() {
        int ataque;
        Scanner scanner = new Scanner(System.in);
        do {
           
            System.out.printf("\nATAQUE!!!\n1 Ataque Físico;\n2 Ataque Elemental;\n0 Sair;\n");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Escolha entre 0 a 2.");
            }
            ataque = scanner.nextInt();
            if (ataque == 0)
                break;
        } while(ataque != 0 && ataque != 1 && ataque != 2);
        return ataque;
    } //fim do atacar

} //fim da classe Menu
