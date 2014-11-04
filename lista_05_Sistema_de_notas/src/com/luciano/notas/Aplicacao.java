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
					int matricula = buffer.nextInt();
					if (banco_de_dados.excluiAlunomatricula(matricula)) {
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
					ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
					System.out
							.println("Deseja inserir disciplimas para o professor? 1-Sim 2-Não");
					opc = buffer.nextShort();
					while (opc == 1) {
						System.out.println("Digite o codigo da disciplina: ");
						int codigo = buffer.nextInt();
						Disciplina disciplina = banco_de_dados
								.procuraDisciplinaCodigo(codigo);
						if (disciplina != null) {
							disciplinas.add(disciplina);
							System.out.println("Adicionado com sucesso.");
						} else {
							System.out.println("Não econtrado.");
						}
						System.out
								.println("Deseja adicionar outra diciplina?1-Sim 2-Não");
						opc = buffer.nextShort();
					}
					System.out.println("1-MESTRE ou 2-DOUTOR");
					opc = buffer.nextShort();
					if (opc == 1) {
						System.out
								.println("Digite o titulo da dissertacao do professor");
						String titulo = buffer.next();
						Professor professor = new Mestre(titulo, cpf, nome,
								salario, disciplinas);
						banco_de_dados.setProfessores(professor);
					} else {
						System.out
								.println("Digite o titulo da tese do professor");
						String titulo = buffer.next();
						Professor professor = new Doutor(titulo, cpf, nome,
								salario, disciplinas);
						banco_de_dados.setProfessores(professor);
					}
				} else if (opc == 2) {
					long cpf = buffer.nextLong();
					banco_de_dados.excluiProfessorCPF(cpf);
				} else if (opc == 3) {
					banco_de_dados.imprimirListaProfessores();
				}

				// Disciplina
			} else if (opc == 3) {
				System.out.println("1-Inluir\n" + "2-Exluir\n" + "3-Listar");
				opc = buffer.nextShort();
				if (opc == 1) {
					System.out.println("Digite o codigo da disciplina: ");
					int codigo = buffer.nextInt();
					System.out.println("Digite o nome da disciplina: ");
					String nome = buffer.next();
					System.out
							.println("Digite a carga horaria da disciplina: ");
					int cargaHoraria = buffer.nextInt();
					System.out
							.println("Deseja adicionar um professor para a disciplina? 1-Sim 2-Não");
					opc = buffer.nextShort();
					Professor professor = null;
					if (opc == 1) {
						System.out
								.println("Digite o cpf do professor da disciplina: ");
						long cpf = buffer.nextLong();
						professor = banco_de_dados.procuraProfessorCPF(cpf);
						if (professor == null) {
							System.out
									.println("professor não encontrado, cadastro cancelado! ");
						}
					}
					Disciplina disciplina = new Disciplina(codigo, nome,
							cargaHoraria, professor);
					banco_de_dados.setDisciplinas(disciplina);

				} else if (opc == 2) {
					System.out
							.println("Digite o codigo da disciplina a ser exluida: ");
					int codigo = buffer.nextInt();
					if (banco_de_dados.excluiDisciplinaCPF(codigo)) {
						System.out.println("Professor exluido com sucesso!");
					} else
						System.out.println("Professor não encontrado!");
				} else if (opc == 3) {
					banco_de_dados.imprimirListaDisciplina();
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
