package br.com.battista.sigeco.model;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class UsuarioTest extends BaseTest {

	private Usuario usuario = new Usuario();

	@Test
	public void test() {
		usuario.setUsuario("rabsouza");
		usuario.setSenha("123456");

		getEntityManager().persist(usuario);
	}

}
