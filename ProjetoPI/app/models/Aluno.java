package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Aluno extends Model {

	public String matricula;
	public String tamanho;
	public String nome;
	public String curso;
	public String turma;
	
	
}

