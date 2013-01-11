package br.com.battista.sigeco.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Classe base para as entidades.
 *
 * @author rabsouza
 * @since 10/01/2013
 * @version 1.0
 *
 */
@MappedSuperclass
public abstract class BaseEntityImpl implements BaseEntity, Serializable,
		Cloneable, Comparable<BaseEntity> {

	private static final long serialVersionUID = -5021412936336445119L;

	private final Long uiid = System.currentTimeMillis();

	@Version
	private Integer versao;

	@Version
	private Date ultimaAlteracao;

	/**
	 * Construtor para a classe BaseEntityImpl.
	 *
	 */
	public BaseEntityImpl() {
	}


	@Override
	public Long getUiid() {
		return uiid;
	}

	@Override
	public Integer getVersao() {
		return versao;
	}

	@Override
	@Deprecated
	public void setVersao(Integer versao) {
		this.versao = versao;
	}

	@Override
	public Date getUltimaAlteracao() {
		return ultimaAlteracao;
	}

	@Override
	@Deprecated
	public void setUltimaAlteracao(Date ultimaAlteracao) {
		this.ultimaAlteracao = ultimaAlteracao;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder hashCode = new HashCodeBuilder();
		hashCode.append(getUiid());
		hashCode.append(getId());

		return hashCode.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		BaseEntityImpl other = (BaseEntityImpl) obj;

		EqualsBuilder equals = new EqualsBuilder();
		equals.append(getUiid(), other.getUiid());
		equals.append(getId(), other.getId());

		return equals.isEquals();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public int compareTo(BaseEntity obj) {
		if (obj == null) {
			return -1;
		}

		CompareToBuilder compareTo = new CompareToBuilder();
		compareTo.append(getUiid(), obj.getUiid());
		compareTo.append(getId(), obj.getId());

		return compareTo.toComparison();
	}

}
