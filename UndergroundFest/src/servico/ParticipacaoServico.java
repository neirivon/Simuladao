package servico;

import java.util.List;

import dominio.Participacao;

public interface ParticipacaoServico {
	
	public void inserirParticipacao(Participacao x) throws ServicoException;
	public void excluir(Participacao x);
	public Participacao buscar(int id);
	public List<Participacao> buscarTodos();
	
	public static List<Participacao> buscarParticipacaoPorOrdem(Integer ordem) {
		// TODO Auto-generated method stub
		return null;
	}
	void inserirAtualizar(Participacao x);

}
