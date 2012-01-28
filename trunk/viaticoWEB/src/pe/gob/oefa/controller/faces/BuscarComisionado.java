package pe.gob.oefa.controller.faces;

import java.util.List;

import pe.gob.oefa.be.Comisionado;
import pe.gob.oefa.controller.bussines.ComisionCN;
import pe.gob.oefa.utiles.CONSTANTE;

public class BuscarComisionado {
	Comisionado comisionadob;
	Comisionado comisionado;
	List<Comisionado> comisionados;
	
	
	public Comisionado getComisionado() {
		if(comisionado==null){
			comisionado = new Comisionado();
		}
		return comisionado;
	}

	public void setComisionado(Comisionado comisionado) {
		this.comisionado = comisionado;
	}

	public List<Comisionado> getComisionados() {
		ComisionCN comisionCN = ComisionCN.getComisionCN();
		List<Comisionado> comisionados = comisionCN.getComisionados(comisionadob);
		return comisionados;
	}

	public Comisionado getComisionadob() {
		if(comisionadob==null){
			comisionadob = new Comisionado();
		}
		return comisionadob;
	}

	public void setComisionadob(Comisionado comisionadob) {
		this.comisionadob = comisionadob;
	}

	public void setComisionados(List<Comisionado> comisionados) {
		this.comisionados = comisionados;
	}
		public String mostrar(){
		return CONSTANTE.SUCCESS;
	}
		
}
