package br.edu.ifpr.locadora.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="LOCACAO")
public class Locacao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	private Cliente cliente;
	private Date data;
	private Date devolucao;
	private BigDecimal valor;
	private String filme;
	
	public Locacao() { }
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/*public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}*/

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(Date devolucao) {
		this.devolucao = devolucao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getFilme() {
		return filme;
	}

	public void setFilme(String filme) {
		this.filme = filme;
	}
	

	/*public Filme getFilme() {
		// o link ta mandando a variavel "i" que é o ID do filme no IMDB, não o título, pra pegar o titulo usa variavel "t"
		final String uri = "http://omdbapi.com/?apikey=8ee5444a&i="+this.filme+"&";
	     
	    RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(uri, Filme.class);
	}

	public void setFilme(Filme filme) {
		final String uri = "http://omdbapi.com/?apikey=8ee5444a&i="+this.filme+"&";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    this.filme = restTemplate.getForObject(uri, Filme.class);
	}*/

	

	
}
