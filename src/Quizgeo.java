import java.util.Scanner;
public class Quizgeo {
    public static void main(String[] args) throws java.lang.Exception {
        int numeroAcertos = 0;
        System.out.println("==================================================");
        System.out.println("           Bem-vindo ao Quiz de " +
                "Guilherme de Paula Dias");
        System.out.println("             Faculdade: UNIFAN");
        System.out.println("                Professor: Brenno");
        System.out.println("            Tema: Geografia");
        System.out.println("==================================================");
        System.out.println();
        System.out.println("===== Quiz: Geografia =====");
        numeroAcertos += grupo2();
        System.out.println("Final do Quiz! Parabéns... De 15 perguntas, você acertou: " + numeroAcertos);
    }

    public static int grupo2() {
        int cont = 0; // contador de respostas corretas
        String respostaUsuario = "";
        System.out.println("=========================================================================");

        // Questão 1
        Questao questao1 = new Questao();
        questao1.pergunta = "1)Qual é o bioma predominante de Goiás?";
        questao1.opcaoA = "a) Caatinga";
        questao1.opcaoB = "b) Pantanal";
        questao1.opcaoC = "c) Pampas";
        questao1.opcaoD = "d) Cerrado";
        questao1.opcaoE = "e) Mata Atlântica";
        questao1.correta = "d"; // Resposta correta é a opção d
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao1.isCorreta(respostaUsuario)) {
            cont++;
        }

        System.out.println("=========================================================================");

        // Questão 2
        Questao questao2 = new Questao();
        questao2.pergunta = "2)Qual é a cidade mais Populosa do Brasil?";
        questao2.opcaoA = "a) Rio de Janeiro";
        questao2.opcaoB = "b) Curitiba";
        questao2.opcaoC = "c) São Paulo";
        questao2.opcaoD = "d) Fortaleza";
        questao2.opcaoE = "e) Manaus";
        questao2.correta = "c"; // Resposta correta é a opção c
        questao2.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao2.isCorreta(respostaUsuario)) {
            cont++;
        }

        // Questão 3
        Questao questao3 = new Questao();
        questao3.pergunta = "3)Quantos continentes tem no mundo?";
        questao3.opcaoA = "a) 6";
        questao3.opcaoB = "b) 5";
        questao3.opcaoC = "c) 8";
        questao3.opcaoD = "d) 9";
        questao3.opcaoE = "e) 7";
        questao3.correta = "a"; // Resposta correta é a opção a
        questao3.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao3.isCorreta(respostaUsuario)) {
            cont++;
        }

        // Questão 4
        Questao questao4 = new Questao();
        questao4.pergunta = "4)Qual a Capital da China?";
        questao4.opcaoA = "a) Xangai";
        questao4.opcaoB = "b) Toquio";
        questao4.opcaoC = "c) Singapura";
        questao4.opcaoD = "d) Hon Kong";
        questao4.opcaoE = "e) Pequim";
        questao4.correta = "e"; // Resposta correta é a opção e
        questao4.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao4.isCorreta(respostaUsuario)) {
            cont++;
        }

        // Questão 5
        Questao questao5 = new Questao();
        questao5.pergunta = "5)Qual país NÃO é banhado pelo Mar do Mediterrâneo";
        questao5.opcaoA = "a) França";
        questao5.opcaoB = "b) Turquia";
        questao5.opcaoC = "c) Marrocos";
        questao5.opcaoD = "d) Inglaterra";
        questao5.opcaoE = "e) Egito";
        questao5.correta = "d"; // Resposta correta é a opção d
        questao5.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao5.isCorreta(respostaUsuario)) {
            cont++;
        }
        // Questão 6
        Questao questao6 = new Questao();
        questao6.pergunta = "6)Qual País é banhado pelos oceanos Atlântico e Pácifico?";
        questao6.opcaoA = "a) Japão";
        questao6.opcaoB = "b) EUA";
        questao6.opcaoC = "c) Espanha";
        questao6.opcaoD = "d) Brasil";
        questao6.opcaoE = "e) Nenhum das opções";
        questao6.correta = "b"; // Resposta correta é a opção b
        questao6.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao6.isCorreta(respostaUsuario)) {
            cont++;
        }
        // Questão 7
        Questao questao7 = new Questao();
        questao7.pergunta = "7) Qual o maior país do mundo em território?";
        questao7.opcaoA = "a) Rússia";
        questao7.opcaoB = "b) China";
        questao7.opcaoC = "c) India";
        questao7.opcaoD = "d) Brasil";
        questao7.opcaoE = "e) USA";
        questao7.correta = "a"; // Resposta correta é a opção a
        questao7.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao7.isCorreta(respostaUsuario)) {
            cont++;
        } // Questão 8
        Questao questao8 = new Questao();
        questao5.pergunta = "8)Qual o menor país do mundo?";
        questao5.opcaoA = "a) Haiti";
        questao5.opcaoB = "b) Cuba";
        questao5.opcaoC = "c) Vaticano";
        questao5.opcaoD = "d) Nepal";
        questao5.opcaoE = "e) Taiwan";
        questao5.correta = "c"; // Resposta correta é a opção c
        questao5.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao8.isCorreta(respostaUsuario)) {
            cont++;
        } // Questão 9
        Questao questao9 = new Questao();
        questao9.pergunta = "9)Qual país da America do Sul não possui conexão com o mar?";
        questao9.opcaoA = "a) Paraguai";
        questao9.opcaoB = "b) Brasil";
        questao9.opcaoC = "c) Venezuela";
        questao9.opcaoD = "d) Chile";
        questao9.opcaoE = "e) Uruguai";
        questao9.correta = "a"; // Resposta correta é a opção a
        questao9.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao9.isCorreta(respostaUsuario)) {
            cont++;
        } // Questão 10
        Questao questao10 = new Questao();
        questao10.pergunta = "10)Qual Região do Brasil se encontra o Bioma da Caatinga como predominante?";
        questao10.opcaoA = "a) Nordeste";
        questao10.opcaoB = "b) Sul";
        questao10.opcaoC = "c) Centroeste";
        questao10.opcaoD = "d) Suldeste";
        questao10.opcaoE = "e) Norte";
        questao10.correta = "a"; // Resposta correta é a opção a
        questao10.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao10.isCorreta(respostaUsuario)) {
            cont++;
        } // Questão 11
        Questao questao11 = new Questao();
        questao11.pergunta = "11)Qual Região do Brasil se encontra o Bioma da Pantanal?";
        questao11.opcaoA = "a) Norte";
        questao11.opcaoB = "b) Suldeste";
        questao11.opcaoC = "c) Sul";
        questao11.opcaoD = "d) Nordeste";
        questao11.opcaoE = "e) Centroeste";
        questao11.correta = "e"; // Resposta correta é a opção e
        questao11.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao11.isCorreta(respostaUsuario)) {
            cont++;
        } // Questão 12
        Questao questao12 = new Questao();
        questao12.pergunta = "12)Qual é o estado com maior extensão territórial do Brasil";
        questao12.opcaoA = "a) São Paulo";
        questao12.opcaoB = "b) Amazonas";
        questao12.opcaoC = "c) Para";
        questao12.opcaoD = "d) Mato Grosso";
        questao12.opcaoE = "e) Maranhão";
        questao12.correta = "b"; // Resposta correta é a opção b
        questao12.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao12.isCorreta(respostaUsuario)) {
            cont++;
        } // Questão 13
        Questao questao13 = new Questao();
        questao13.pergunta = "13)Qual estado brasileiro com maior renda per capita";
        questao13.opcaoA = "a) São Paulo";
        questao13.opcaoB = "b) Rio de Janeiro";
        questao13.opcaoC = "c) Paraná";
        questao13.opcaoD = "d) Rio Grande do Sul";
        questao13.opcaoE = "e) Distrito Federal";
        questao13.correta = "a"; // Resposta correta é a opção a
        questao13.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao13.isCorreta(respostaUsuario)) {
            cont++;
        } // Questão 14
        Questao questao14 = new Questao();
        questao14.pergunta = "14)Em qual continente fica localizado o Egito?";
        questao14.opcaoA = "a) Ásia";
        questao14.opcaoB = "b) Europa";
        questao14.opcaoC = "c) África";
        questao14.opcaoD = "d) America Central";
        questao14.opcaoE = "e) Antártica";
        questao14.correta = "c"; // Resposta correta é a opção c
        questao14.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao14.isCorreta(respostaUsuario)) {
            cont++;
        } // Questão 15
        Questao questao15 = new Questao();
        questao15.pergunta = "15)Qual é o País que é considerado Terra do Sol Nascente:";
        questao15.opcaoA = "a) Coreia do Sul";
        questao15.opcaoB = "b) Mongólia";
        questao15.opcaoC = "c) China";
        questao15.opcaoD = "d) Japão";
        questao15.opcaoE = "e) Brasil";
        questao15.correta = "d"; // Resposta correta é a opção d
        questao15.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao15.isCorreta(respostaUsuario)) {
            cont++;
        }

        return cont;
    }

    public static String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a letra correspondente à sua resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    public static boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Resposta inválida ... ");
        return false;
    }

    public static class Questao {
        String pergunta = "";
        String opcaoA = "";
        String opcaoB = "";
        String opcaoC = "";
        String opcaoD = "";
        String opcaoE = "";
        String correta = "";

        public boolean isCorreta(String resposta) {
            if (resposta.equalsIgnoreCase(this.correta)) {
                System.out.println("Parabéns! Resposta Correta!");
                return true;
            } else {
                System.out.println("Resposta Errada!");
                System.out.println("A opção correta é a letra: " + this.correta);
                return false;
            }
        }

        public void escrevaQuestao() {
            System.out.println(this.pergunta);
            System.out.println(this.opcaoA);
            System.out.println(this.opcaoB);
            System.out.println(this.opcaoC);
            System.out.println(this.opcaoD);
            System.out.println(this.opcaoE);
        }
    }
}
