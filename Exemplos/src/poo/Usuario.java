package poo;

public class Usuario extends Pessoa {
	private String email;
	
	public Usuario() {
		super("Douglas");
		email = "douglasjanovikmaliszewski@gmail.com";
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public boolean equals(Object objeto) {
		if(objeto instanceof Usuario) {
			Usuario objeto_usuario = (Usuario) objeto;
			
			boolean questao1 = this.getNome().equals(objeto_usuario.getNome());
			boolean questao2 = this.getEmail().equals(objeto_usuario.getEmail());
			
			return questao1 && questao2;
		}else return false;
	}
}
