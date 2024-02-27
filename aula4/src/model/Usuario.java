package model;

public class Usuario {
 private String nome, cpf, celular, email, senha;
 
 private boolean estalogado = false;
 
  Usuario (String nome, String cpf, String celular, String email, String senha) {
	 this.nome = nome;
	 this.cpf = cpf;
	 this.celular = celular;
	 this.email = email;
	 this.senha = senha;
 }
 
 void aitenticacao (String email, String senha) {
 if(this.email == email
	 && this.senha == senha) {
		 estalogado = true;
	 }
 }

 public String getusuario() {
	 return( "\nnome" + this.nome
			 + "\ncpf" + this.cpf
			 + "\ncelular" + this.celular
			 + "\nemail" + this.email
			 + "\nsenhya" + this.senha
			 + "\nestalogado" + this.estalogado);
 }

}
