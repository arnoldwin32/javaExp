package main;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente cli = new Cliente();
		cli.setNome("Joao da Silva");
		cli.setCpf("000.111.222-33");
		cli.setAdimplente(true);
		cli.setCodigo(1001);
		System.out.println(cli.getCodigo()+"\n"+cli.getNome()+"\n"+cli.getCpf()+"\n"+cli.getAdimplente());
	}

}
