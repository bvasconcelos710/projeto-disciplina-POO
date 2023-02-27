import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorObra gerenciador = new GerenciadorObraPadrao();
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        while (opcao == 0) {

            imprimirOpcoes();
            opcao = Integer.parseInt(scan.nextLine());

            if (opcao >= 1 && opcao <= 3) {
                switch (opcao) {
                    case 1: {
                        Obra novaObra = null;
                        String tipoObra;
                        System.out.println(
                                "Informe o tipo de obra que deseja registrar (Filme, Serie, Documentario, Desenho)");
                        tipoObra = scan.nextLine();

                        if (tipoObra.equals("Filme")) {
                            System.out.println("Informe o titulo");
                            String titulo = scan.nextLine();
                            System.out.println("Informe o ano de lançamento");
                            int ano = Integer.parseInt(scan.nextLine());
                            System.out.println("Informe o País de origem (BR, EUA, FR");
                            String codigoPais;
                            codigoPais = scan.nextLine();
                            if (!codigoPais.equals(Obra.BRASIL) && !codigoPais.equals(Obra.EUA)
                                    && !codigoPais.equals(Obra.FRANCA)) {
                                System.out.println("Código de País inválido");

                                opcao = 0;
                                break;

                            }

                            System.out.println("Informe o genero");
                            String genero;
                            genero = scan.nextLine();
                            System.out.println("Informe o tempo de duração");
                            String duracao;
                            duracao = scan.nextLine();
                            System.out.println("Informe o nome do diretor (separe por vírgula se houver mais de um)");
                            String diretores = scan.nextLine();
                            String[] diretoresArray = diretores.split(",");
                            System.out.println("Informe o nome dos atores (separe por vírgula se houver mais de um)");
                            String atores = scan.nextLine();
                            String[] atoresArray = atores.split(",");

                            novaObra = new Filme(titulo, ano, codigoPais, genero, duracao, diretoresArray,
                                    atoresArray);
                            System.out.println("\r\n");
                            System.out.println("O Filme informado foi: ");

                        }

                        else if (tipoObra.equals("Serie")) {
                            System.out.println("Informe o titulo da série");
                            String titulo = scan.nextLine();
                            System.out.println("Informe o ano de lançamento da série");
                            int ano = Integer.parseInt(scan.nextLine());
                            System.out.println("Informe o País de origem (BR, EUA, FR)");
                            String codigoPais = scan.nextLine();
                            if (!codigoPais.equals(Obra.BRASIL) && !codigoPais.equals(Obra.EUA)
                                    && !codigoPais.equals(Obra.FRANCA)) {
                                System.out.println("Código de País inválido");

                                opcao = 0;
                                break;

                            }
                            System.out.println("Informe o criador da série (separe por vírgula se houver mais de um)");
                            String criadores = scan.nextLine();
                            String[] criadoresArray = criadores.split(",");
                            System.out.println("Informe os atores da série (separe por vírgula se houver mais de um)");
                            String atores = scan.nextLine();
                            String[] atoresArray = atores.split(",");
                            System.out.println("Informe o número de temporadas");
                            int temporadas = Integer.parseInt(scan.nextLine());
                            System.out.println("Informe o número de episódios");
                            int episodios = Integer.parseInt(scan.nextLine());

                            novaObra = new Serie(titulo, ano, codigoPais, criadoresArray, atoresArray, temporadas,
                                    episodios);
                            System.out.println("\r\n");
                            System.out.println("A serie informada foi: ");

                        }

                        else if (tipoObra.equals("Documentario")) {
                            System.out.println("Informe o titulo");
                            String titulo = scan.nextLine();
                            System.out.println("Informe o ano de lançamento");
                            int ano = Integer.parseInt(scan.nextLine());
                            System.out.println("Informe o País de origem (BR, EUA, FR)");
                            String codigoPais = scan.nextLine();
                            if (!codigoPais.equals(Obra.BRASIL) && !codigoPais.equals(Obra.EUA)
                                    && !codigoPais.equals(Obra.FRANCA)) {
                                System.out.println("Código de País inválido");

                                opcao = 0;
                                break;

                            }
                            System.out.println("Informe a duração");
                            String duracao = scan.nextLine();
                            System.out.println("Informe o nome do Diretor (separe por vírgula se houver mais de um)");
                            String diretores = scan.nextLine();
                            String[] diretorArray = diretores.split(",");
                            System.out.println("Informe o tema do documentário");
                            String tema = scan.nextLine();

                            novaObra = new Documentario(titulo, ano, codigoPais, duracao,
                                    diretorArray, tema);

                            System.out.println("\r\n");
                            System.out.println("O documentario informado foi:");

                        }

                        else if (tipoObra.equals("Desenho")) {
                            System.out.println("Informe o titulo");
                            String titulo = scan.nextLine();
                            System.out.println("Informe o ano de lançamento");
                            int ano = Integer.parseInt(scan.nextLine());
                            System.out.println("Informe o País de origem (BR, EUA, FR)");
                            String codigoPais = scan.nextLine();
                            if (!codigoPais.equals(Obra.BRASIL) && !codigoPais.equals(Obra.EUA)
                                    && !codigoPais.equals(Obra.FRANCA)) {
                                System.out.println("Código de País inválido");

                                opcao = 0;
                                break;

                            }
                            System.out.println("Informe o nome do criador (se houver mais de um separe por vírgula)");
                            String criadores = scan.nextLine();
                            String[] criadoresArray = criadores.split(",");
                            System.out.println("Informe o número de temporadas");
                            int temporadas = Integer.parseInt(scan.nextLine());
                            System.out.println("Informe o número de episódios");
                            int episodios = Integer.parseInt(scan.nextLine());
                            System.out.println("Informe a faixa etária dessa obra");
                            int faixaEtaria = Integer.parseInt(scan.nextLine());

                            novaObra = new SerieDesenho(titulo, ano, codigoPais, criadoresArray,
                                    temporadas, episodios,
                                    faixaEtaria);

                            System.out.println("\r\n");
                            System.out.println("O desenho informado foi: ");

                        }
                        System.out.println(novaObra.getInfo());
                        gerenciador.adicionar(novaObra);
                        opcao = 0;
                        break;
                    }
                    case 2: {
                        List<Obra> obras = gerenciador.listar();
                        for (int i = 0; i < obras.size(); i++) {
                            System.out.println(i + 1 + "." + obras.get(i).getTitulo());

                        }

                        System.out.println("Digite o índice do filme que deseja remover");
                        int filmeRemover = Integer.parseInt(scan.nextLine()) - 1;
                        Obra obraRemover = obras.get(filmeRemover);
                        gerenciador.remover(obraRemover);

                        opcao = 0;
                        break;
                    }
                    case 3: {
                        List<Obra> obras = gerenciador.listar();
                        for (int i = 0; i < obras.size(); i++) {
                            System.out.println(i + 1 + "." + obras.get(i).getTitulo());

                        }
                        opcao = 0;
                        break;
                    }
                }
            } else {
                System.out.println("Opção inválida");
                opcao = 0;
            }
        }
        scan.close();
    }

    private static void imprimirOpcoes() {
        System.out.println("Selecione uma opção:");
        System.out.println("1. adicionar");
        System.out.println("2. remover");
        System.out.println("3. listar");
    }

}