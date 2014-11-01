package com.luciano.notas;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Aplicacao {

	public Aplicacao() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		BD banco_de_dados = new BD();
		Scanner buffer = new Scanner(System.in);
		short opc = 1;
		while (opc != 0) {

			System.out.println("Selecione a opcao:\n" + "1-Aluno\n"
					+ "2-Professor\n" + "3-Disciplina\n"
					+ "4-Matricular Aluno\n" + "5-Inserir Note\n"
					+ "6-Listar Disciplinas\n" + "7-Exibir Backup");
			opc = buffer.nextShort();
			// Aluno
			if (opc == 1) {
				System.out.println("1-Inluir\n" + "2-Exluir\n" + "3-Listar");
				opc = buffer.nextShort();
				if (opc == 1) {
					System.out.println("Digite a matricula do aluno: ");
					int matricula = buffer.nextInt();
					System.out.println("Digite o nome do aluno: ");
					String nome = buffer.next();
					System.out
							.println("Digite a data de nascimento do aluno: ");
					int ano = buffer.nextInt();
					int mes = buffer.nextInt();
					int dia = buffer.nextInt();
					@SuppressWarnings("deprecation")
					Date dataNascimeto = new Date(ano, mes, dia);
					Aluno aluno = new Aluno(matricula, nome, dataNascimeto);
					banco_de_dados.setAlunos(aluno);
				} else if (opc == 2) {
					String nome = buffer.next();
					if (banco_de_dados.excluiAlunoNome(nome)) {
						System.out.println("Aluno excluido com sucesso!!!");
					} else {
						System.out.println("Aluno nao encontrado.");
					}
				} else if (opc == 3) {
					banco_de_dados.imprimirListaAlunos();
				}
				// Professor
			} else if (opc == 2) {
				System.out.println("1-Inluir\n" + "2-Exluir\n" + "3-Listar");
				opc = buffer.nextShort();
				if (opc == 1) {
					System.out.println("Digite o cpf do professor: ");
					long cpf = buffer.nextLong();
					System.out.println("Digite o nome do professor: ");
					String nome = buffer.next();
					System.out.println("Digite o salario do professor: ");
					double salario = buffer.nextDouble();
					System.out.println("1-MESTRE ou 2-DOUTOR");
					opc = buffer.nextShort();
					Professor professor;
					if (opc == 1) {
						System.out
								.println("Digite o titulo da dissertacao do professor: ");
						String titulo = buffer.next();
						professor = new Mestre(titulo, cpf, nome, salario);
						banco_de_dados.setProfessores(professor);
					} else {
						System.out
								.println("Digite o titulo da teste do professor: ");
						String titulo = buffer.next();
						professor = new Doutor(titulo, cpf, nome, salario);
					}
					banco_de_dados.setProfessores(professor);
				} else if (opc == 2) {
					// excluir
				} else if (opc == 3) {
					ArrayList<Professor> professor = banco_de_dados
							.getProfessores();
					for (Professor i : professor) {
						System.out.println(i);
					}
				}

				// Disciplina
			} else if (opc == 3) {
				System.out.println("1-Inluir\n" + "2-Exluir\n" + "3-Listar");
				opc = buffer.nextShort();
				if (opc == 1) {
					System.out.println("Digite o ");
				} else if (opc == 2) {

				} else if (opc == 3) {

				}
			} else if (opc == 4) {

			} else if (opc == 5) {

			} else if (opc == 6) {

			} else if (opc == 7) {

			}
		}
		buffer.close();
	}
}
