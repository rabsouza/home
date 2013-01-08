package br.com.tiverde.session;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.web.RequestParameter;
import org.jboss.seam.framework.EntityHome;

import br.com.tiverde.entity.Empresa;

@Name("empresaHome")
public class EmpresaHome extends EntityHome<Empresa>
{
    @RequestParameter Long empresaId;

    @Override
    public Object getId()
    {
        if (empresaId == null)
        {
            return super.getId();
        }
        else
        {
            return empresaId;
        }
    }

    @Override @Begin
    public void create() {
        super.create();
    }

}
