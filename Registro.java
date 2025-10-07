import java.util.ArrayList;
import java.util.List;
import java.util.scanner;

public class Registro{
    private List<Jogo> jogos;
    private Scanner scanner;


    // construtor pra lista de jogos
        public Registro(){
            this.jogos = new ArrayList<>();
            this.scanner = new Scanner(System.in);
        }

        // add novo jogo
        public void adicionarJogo() {
            System.out.print(" nome do jogo:");
            String nome = scanner.nestLine();

            System.out.print(" ano de lançamento:");
            int anoLançamento = Integer.parseInt(scanner.nextLine());

            System.out.printl(" desenvolvedores:");
            String desenvolvedores = scanner.nextLine

            Jogo jogo = new Jogo(nome, anoLançamento, desenvolvedores);
            jogos.add(jogo);
            System.out.printl("Jogo adicionado com sucesso");
        }

        //monstra todos os jogos
        public void exibirJogos() {
            if (jogos.isEmpty()){
                System.out.println(" Nenhum jogo registrado");
            }else{
                System.out.println(" ==Lista de jogos==\n:");
                for (Jogo jogo : jogo){
                    System.out.println(jogo.toString());
                }
            }
        }

        //fechar scanner
        public void fecharScanner() {
            scanner.close();
        }

        //menu

        public static void main (String[] args){
            Registro registro = new Registro();
            int opcao;

            System.out.println("SISTEMA DE REGISTRO DE JOGOS\n");

            do {
                System.out.println("escolha uma opção:");
                System.out.println("1- nome do jogo")
                System.out.println("2- exibir todos os jogos:")
                System.out.println("0- sair:")
                System.out.println("opção:")
                opcao = Integer.parseInt(registro.scanner.nestLine());

                switch (opcao) {
                    case 1:
                        registro.adicionadoJogo();
                        break;4
                    case 2:
                        registro.exibirJogos();
                        break;
                    case 0:
                        System.out.println("Saindo do sistema. Obrigado!");
                        break;
                    default:
                        System.out.println("Opçaõ inválida! tente novamente\n");
                }
            }while (opcao != 0);

            registro.fecharScanner();
            
        }
    
   }
    

     