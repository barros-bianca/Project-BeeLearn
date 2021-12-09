package org.generation.BeeLearn.modelsbee;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tbl_instrutor")

public class InstrutorModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Size(min = 1, max = 500)
	private String url_instrutor;
	private String titulo_instrutor;
	private String bio_instrutor;
	private int nivel_instrutor;
	private int xp_instrutor;

	@OneToOne(mappedBy = "instrutor")
	private UserModel userIns;

	@OneToMany(mappedBy = "instrutor", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("InstrutorModel")
	private List<GrupoModels> grupo = new ArrayList<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUrl_instrutor() {
		return url_instrutor;
	}

	public void setUrl_instrutor(String url_instrutor) {
		this.url_instrutor = url_instrutor;
	}

	public String getTitulo_instrutor() {
		return titulo_instrutor;
	}

	public void setTitulo_instrutor(String titulo_instrutor) {
		this.titulo_instrutor = titulo_instrutor;
	}

	public String getBio_instrutor() {
		return bio_instrutor;
	}

	public void setBio_instrutor(String bio_instrutor) {
		this.bio_instrutor = bio_instrutor;
	}

	public int getNivel_instrutor() {
		return nivel_instrutor;
	}

	public void setNivel_instrutor(int nivel_instrutor) {
		this.nivel_instrutor = nivel_instrutor;
	}

	public int getXp_instrutor() {
		return xp_instrutor;
	}

	public void setXp_instrutor(int xp_instrutor) {
		this.xp_instrutor = xp_instrutor;
	}

	public UserModel getUserIns() {
		return userIns;
	}

	public void setUserIns(UserModel userIns) {
		this.userIns = userIns;
	}

	public List<GrupoModels> getGrupo() {
		return grupo;
	}

	public void setGrupo(List<GrupoModels> grupo) {
		this.grupo = grupo;
	}

}
