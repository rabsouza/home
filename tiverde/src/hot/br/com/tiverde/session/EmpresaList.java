package br.com.tiverde.session;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import br.com.tiverde.entity.Empresa;

@Name("empresaList")
public class EmpresaList extends EntityQuery<Empresa>
{
    public EmpresaList()
    {
        setEjbql("select empresa from Empresa empresa");
    }
}
