package br.edu.ifgoias.academico.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;

@Entity
public class Disciplina implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iddisciplina;
	
	@Column (name = "nomedisciplina", nullable= false )
	private String nomedisciplina;
	
	@OneToMany (mappedBy = "disciplina")
	@JsonIgnore
	private List<Aluno> alunos = new ArrayList<>();

	public Disciplina() {

	}
	
	public Disciplina(Integer idcurso, String nome) {
		this.iddisciplina = idcurso;
		this.nomedisciplina = nome;
	}

	public Integer getIdDisciplina() {
		return iddisciplina;
	}

	public void setIdDisciplina(Integer idcurso) {
		this.iddisciplina = idcurso;
	}

	public String getNomeDisciplina() {
		return nomedisciplina;
	}

	public void setNomeDisciplina(String nome) {
		this.nomedisciplina = nome;
	}


	@Override
	public String toString() {
		return "Curso [idcurso=" + iddisciplina + ", nomecurso=" + nomedisciplina + "]";
	}
		
}
