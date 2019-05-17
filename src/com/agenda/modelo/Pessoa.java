package com.agenda.modelo;

public class Pessoa {
private String nome;
private String phone;
private String email;
private String end;
private Long id;

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getEnd() {
	return end;
}
public void setEnd(String end) {
	this.end = end;
}

public long getId() {
	// TODO Auto-generated method stub
	
	return this.id;
}

public void setId(long id) {
	this.id = id;
}

}
