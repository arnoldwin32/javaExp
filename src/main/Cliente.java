package main;

public class Cliente extends Pessoa{
	private boolean adimplente;
	private int codigo;
	public boolean getAdimplente() {
		return this.adimplente;
	}
	public void setAdimplente(boolean adimplente) {
		this.adimplente = adimplente;
	}
	public int  getCodigo() {
		return this.codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
