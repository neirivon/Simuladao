package dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="tb_Bandas")
public class Banda implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codBanda;
	private String nome;
	private BigDecimal preco;
	
	//@OneToMany(mappedBy="nome da associação")
    @OneToMany(mappedBy="banda")
    private List<Participacao> participacoes;
    
    public Banda() {
    	participacoes = new ArrayList<>();
    }
    
    public Banda(Integer codBanda, String nome, BigDecimal preco) {
    	super();
    	this.codBanda = codBanda;
    	this.nome = nome;
    	this.preco =  preco;
    	participacoes = new ArrayList<>();
    }

	@Override
	public String toString() {
		return "Banda [codBanda=" + codBanda + ", nome=" + nome + ", preco=" + preco + ", participacoes="
				+ participacoes + "]";
	}

	public Integer getCodBanda() {
		return codBanda;
	}

	public void setCodBanda(Integer codBanda) {
		this.codBanda = codBanda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public List<Participacao> getParticipacoes() {
		return participacoes;
	}

	public void setParticipacoes(List<Participacao> participacoes) {
		this.participacoes = participacoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codBanda == null) ? 0 : codBanda.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banda other = (Banda) obj;
		if (codBanda == null) {
			if (other.codBanda != null)
				return false;
		} else if (!codBanda.equals(other.codBanda))
			return false;
		return true;
	}
	
}
