package br.com.battista.sigeco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe para a tabela USUARIO <br>
 * <dd>USUARIO</dd> <dd>SENHA</dd>
 *
 * @author rabsouza
 * @since 10/01/2013
 * @version 1.0
 *
 */
@Entity
@Table(name = "USUARIO")
public class Usuario extends BaseEntityImpl implements BaseEntity {

	private static final long serialVersionUID = 15524342167825664L;

	@Id
	@Column(name = "USUARIO", length = 30, nullable = false, unique = true)
	private String usuario;

	@Column(name = "SENHA", length = 30, nullable = false)
	private String senha;

	/**
	 * Construtor para a classe Usuario.
	 *
	 */
	public Usuario() {
		super();
	}

	/**
	 * Construtor para a classe Usuario.
	 *
	 * @param usuario
	 * @param senha
	 */
	public Usuario(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}

	/**
	 * @return usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario
	 *            String
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha
	 *            String
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@SuppressWarnings("unchecked")
	@Override
	public String getId() {
		return getUsuario();
	}

}
