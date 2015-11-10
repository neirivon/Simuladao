package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="tb_Espetaculos")
public class Espetaculo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codEspetaculo;
	private String nome;
	
	//@OneToMany(mappedBy="nome da associação")
    @OneToMany(mappedBy="espetaculo")
    private List<Participacao> participacoes;
    
    public Espetaculo() {
    	participacoes = new ArrayList<>();
    }
    
    public Espetaculo(Integer codEspetaculo, String nome) {
    	super();
    	this.codEspetaculo = codEspetaculo;
    	this.nome = nome;
    	participacoes = new ArrayList<>();
    }

	public Integer getCodEspetaculo() {
		return codEspetaculo;
	}

	public String getNome() {
		return nome;
	}

	public List<Participacao> getParticipacoes() {
		return participacoes;
	}

	public void setCodEspetaculo(Integer codEspetaculo) {
		this.codEspetaculo = codEspetaculo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setParticipacoes(List<Participacao> participacoes) {
		this.participacoes = participacoes;
	}

	@Override
	public String toString() {
		return "Espetaculo [codEspetaculo=" + codEspetaculo + ", nome=" + nome + ", participacoes=" + participacoes
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codEspetaculo == null) ? 0 : codEspetaculo.hashCode());
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
		Espetaculo other = (Espetaculo) obj;
		if (codEspetaculo == null) {
			if (other.codEspetaculo != null)
				return false;
		} else if (!codEspetaculo.equals(other.codEspetaculo))
			return false;
		return true;
	}
}
