package br.com.battista.sigeco.model;

import java.util.Date;

/**
 * Entidade base.
 *
 * @author rabsouza
 * @since 10/01/2013
 * @version 1.0
 *
 */
interface BaseEntity {

	/**
	 * Retorna id da entidade.
	 *
	 * @return id
	 */
	<T> T getId();

	/**
	 * @return uiid
	 */
	Long getUiid();

	/**
	 * @return ultimaAlteracao
	 */
	Date getUltimaAlteracao();

	/**
	 * @return versao
	 */
	Integer getVersao();

	/**
	 * @param ultimaAlteracao
	 *            Date
	 */
	@Deprecated
	void setUltimaAlteracao(Date ultimaAlteracao);

	/**
	 * @param versao
	 *            Integer
	 */
	@Deprecated
	void setVersao(Integer versao);
}
