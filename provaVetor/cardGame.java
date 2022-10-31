package provaVetor;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class vetorSorter {

	public static void main(String[] args) {
		
		String respDoJogador ="";
		String resposta = "";
		Scanner respJogador = new Scanner(System.in);
		
		while(!resposta.contentEquals("S")) 
		{
		while(!respDoJogador.contentEquals("Sim"))
		{
			System.out.println("Bem-vindo ao Jogo das Cartas!");
			System.out.println("Você será o Jogador 1, Escreva Sim para continuar");
			respDoJogador = respJogador.nextLine();
		}
		
		int acompanhamento1 = 0,acompanhamento2 = 23;
		int pontosUserJ1 = 0,pontosMaquinaJ2 = 0, ponto = 3;
		Scanner respostaGeral = new Scanner(System.in);
		
		List<Integer> numVetor = new ArrayList<>();
		
		List<Integer> userJogador1 = new ArrayList<>();
		
		List<Integer> maquinaJogador2 = new ArrayList<>();
		
		
		
		System.out.println("Digite os 24 numeros");
		System.out.println("");
		for(int i = 0; i < 24; i++) {
			
			System.out.print("Insira o "+ (i+1) + "° valor Desejado: "); // i+1 para na primeira vez que solicitar o número não fique como "insira o 0° valor Desejado:" 
			numVetor.add(respostaGeral.nextInt());
		}
		respostaGeral.nextLine();
		Collections.shuffle(numVetor);
		
		while(acompanhamento1 < 12) 
		{
			userJogador1.add(numVetor.get(acompanhamento1));
			maquinaJogador2.add(numVetor.get(acompanhamento2));
			acompanhamento1++;
			acompanhamento2--;
		}
		
		
			for (int i = 0; i < 12; i++)
			{
				String respostaJogo = "";
				int j1 = userJogador1.get(i);
				int j2 = maquinaJogador2.get(i);
				if(j1 < j2) {
					pontosUserJ1 += 2;
					ponto  = 1;
				} else if(j2 < j1) {
					pontosMaquinaJ2 += 2;
					ponto  = 2;
				} else if(j1 == j2 && ponto  != 0) {
					if(ponto  == 1) {pontosMaquinaJ2 += 2;}
					if(ponto  == 2) {pontosUserJ1 += 2;}
				}
				System.out.println("");
				System.out.print("Valor pego por Você (J1):" + j1+ "   ");
				System.out.println("  Valor pego pela Máquina (J2):" + j2);
				System.out.println("");
				System.out.print("  Seus Pontos:" + pontosUserJ1+"   ");
				System.out.println("  Pontos da máquina:" + pontosMaquinaJ2);
				System.out.println("");
				while(!respostaJogo.contentEquals("C")) {
					System.out.print("Escreva C para continuar: ");
					respostaJogo = respostaGeral.nextLine();
				}
			}
			
			System.out.println("");
			System.out.println("Você (J1) Fez: " + pontosUserJ1 + " Pontos!");
			System.out.println("A Máquina (J2) fez: " + pontosMaquinaJ2 + " Pontos!");
			
			if(pontosUserJ1>pontosMaquinaJ2) 
			{
				
				System.out.println("Você ficou com: "+ pontosUserJ1 + " Pontos!"+ "Você Ganhou, Parabens!");
				 
			} else if (pontosUserJ1<pontosMaquinaJ2) 
			{
				System.out.println("Você ficou com: "+ pontosUserJ1 +" Pontos!"+" Você Perdeu, Tente Novamente!");
			} else
			{
				System.out.println("Você ficou com: "+ pontosUserJ1 +" Pontos!"+" Deu empate, tente novamente!");
			}
			
			System.out.println("Escreva S para sair ou qualquer tecla para continuar: ");
			resposta = respostaGeral.nextLine();
			if(resposta.contentEquals("S"))
			{
				System.out.println("Jogo Finalizado, obrigado por jogar!");
				System.exit(0);
			}
		}
		}
		}

