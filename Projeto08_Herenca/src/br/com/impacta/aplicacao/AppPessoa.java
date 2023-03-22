package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Nelson Machado");
		pessoa.setIdade(25);
		pessoa.setSexo(Sexo.MASCULINO);
		
		JOptionPane.showMessageDialog(null, pessoa.mostrar());
		
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("aluka");
		funcionario.setIdade(20);
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setCargo("bartender");
		funcionario.setSalario(3600);
		JOptionPane.showMessageDialog(null, funcionario.mostrar());
		
		
		
		//Curso cursoDoAluno = new Curso();
		//cursoDoAluno.setCargaHoraria(2000);
		//cursoDoAluno.setCodigo(2589);
		//cursoDoAluno.setDescricao("Java dev");
		//cursoDoAluno.setPreco(5000);
	//instancia aluno.
		Aluno aluno = new Aluno();
		aluno.setNome("Adnama");
		aluno.setIdade(22);
		aluno.setSexo(Sexo.FEMININO);
		aluno.setMatricula(5485);
		//aluno.setCurso(new Curso(22, "Java dev",100,1000));
		JOptionPane.showMessageDialog(null, aluno.mostrar());
		
		
	}

}
