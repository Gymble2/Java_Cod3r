package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

//SEMPRE USAR NOS MAPEAMENTOS ENTIDADES no banco de dadoss 
@Entity
public class Usuario {
	
	//SEMPRE USAR NO MAPEAMENTO
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//EXEMPLO
	//@Column(name = "...", nullable = false)
	private String nome;
	
	//não manda pro banco de dados @Transient
	
	private String email;
	
	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public Usuario() {
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
