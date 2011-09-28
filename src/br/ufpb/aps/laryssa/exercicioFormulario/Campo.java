package br.ufpb.aps.laryssa.exercicioFormulario;

public class Campo {
	private Validador validador;
	private String label;
	private String id;
	private String valor;
	
	public Campo(String label, String id, Validador validador){
		this.label = label;
		this.id = id;
		this.validador = validador;
	}
	
	public boolean validar() throws ValorInvalidoException{
		try{
			validador.validar(this.valor);
			return true;
		}catch(ValorInvalidoException e){
			throw new ValorInvalidoException(e.getMessage());
		}
	}
	
	
	
// gets e sets	
	public Validador getValidador() {
		return validador;
	}
	public void setValidador(Validador validador) {
		this.validador = validador;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
}
