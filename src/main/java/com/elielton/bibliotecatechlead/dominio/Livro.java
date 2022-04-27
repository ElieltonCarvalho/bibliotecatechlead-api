package com.elielton.bibliotecatechlead.dominio;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Livro implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer numero_exemplares;
	private String titulo;
	private String nome_autor;
	private String ano;
	private String editora;
	
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria catergoria;

	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livro(Integer id, Integer numero_exemplares, String titulo, String nome_autor, String ano, String editora,
			Categoria catergoria) {
		super();
		this.id = id;
		this.numero_exemplares = numero_exemplares;
		this.titulo = titulo;
		this.nome_autor = nome_autor;
		this.ano = ano;
		this.editora = editora;
		this.catergoria = catergoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero_exemplares() {
		return numero_exemplares;
	}

	public void setNumero_exemplares(Integer numero_exemplares) {
		this.numero_exemplares = numero_exemplares;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNome_autor() {
		return nome_autor;
	}

	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Categoria getCatergoria() {
		return catergoria;
	}

	public void setCatergoria(Categoria catergoria) {
		this.catergoria = catergoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(id, other.id);
	}

}
