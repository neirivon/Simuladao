package dao;

import dao.jpa.BandaDaoImpl;
import dao.jpa.EspetaculoDaoImpl;
import dao.jpa.ParticipacaoDaoImpl;

public class DaoFactory {
	
	public static BandaDao criarBandaDao() {
		return new BandaDaoImpl();
	}
	
	public static ParticipacaoDao criarParticipacaoDao() {
		return new ParticipacaoDaoImpl();
	}
	
	public static EspetaculoDao criarEspetaculoDao() {
		return new EspetaculoDaoImpl();
	}

}
