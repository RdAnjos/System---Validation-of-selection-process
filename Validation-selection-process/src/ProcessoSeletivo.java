import java.util.Random;
//import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
						
		System.out.println("Processo seletivo!");
		//analisarCandidato(2950.0);
		//System.out.println("Digite o salario pretendido: ");
		//salarioPretendido = scanner.nextDouble();
		
		String[] candidatos = {"RODRIGO", "JOAO", "ROSANGELA"};
		
		for(String cadidato: candidatos) {
			entrandoEmContato(cadidato);
		}
		
			
		//selecaoCandidatos();
		//imprimirSelecionados() ;
		
	}
	
	static void entrandoEmContato (String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do{
			atendeu = atender();
			continuarTentando = !atendeu;
			if (continuarTentando) {
				tentativasRealizadas++;
			} else {
				System.out.println("CONTATO REALIZADO COM SUCESSO!");
			}
			
		}while(continuarTentando && tentativasRealizadas < 3);
		
		if (atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA(S)");
		} else {
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO DE TENTATIVAS EXCEDIDOS " + tentativasRealizadas);
		}
		
		
	}
	
	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}
	
	static void imprimirSelecionados() {
		String[] candidatos = {"RODRIGO", "JOAO", "ROSANGELA"};
		
		System.out.println("Printing list of selected candidates, mentioning the index: " );
		
		for (int i = 1; i < candidatos.length; i++) {			
			System.out.println("The candidate of number: " + (i + 1) + " is " + candidatos[i]);
		}
		
		//Forma abreviada foreach
		for (String candidato : candidatos) {
			System.out.println("The selected candidate was: " + candidato);
		}
	}
	
	
	static void selecaoCandidatos() {
		String[] candidatos = {"RODRIGO", "JOAO", "ROSANGELA"};
		//String[] candidatosSelecionadosList;
		
 		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		
		while(candidatosSelecionados < 1 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorAleatorio();
			
			System.out.println("O candidato " + candidato + " Solicitou este valor de salario: " + salarioPretendido);
			
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato: " + candidato + " foi selecionado.");
				candidatosSelecionados++;
				//candidatosSelecionadosList = {candidato};
			}
			candidatosAtual++;

		}
	}
	
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
	
	
	//Validando candidatura
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o Candidato! ");
		} else if (salarioBase == salarioPretendido){
			System.out.println("Ligar para o Candidato com contra proposta! ");
		} else {
			System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
		}		
		
	}
}



    

