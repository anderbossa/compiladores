/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorCMenos.node;

import java.util.*;
import compiladorCMenos.analysis.*;

@SuppressWarnings("nls")
public final class AFuncaoStrDeclaracao extends PDeclaracao
{
    private TId _nome_;
    private final LinkedList<PParametro> _pars_ = new LinkedList<PParametro>();
    private final LinkedList<PComando> _bloco_ = new LinkedList<PComando>();

    public AFuncaoStrDeclaracao()
    {
        // Constructor
    }

    public AFuncaoStrDeclaracao(
        @SuppressWarnings("hiding") TId _nome_,
        @SuppressWarnings("hiding") List<?> _pars_,
        @SuppressWarnings("hiding") List<?> _bloco_)
    {
        // Constructor
        setNome(_nome_);

        setPars(_pars_);

        setBloco(_bloco_);

    }

    @Override
    public Object clone()
    {
        return new AFuncaoStrDeclaracao(
            cloneNode(this._nome_),
            cloneList(this._pars_),
            cloneList(this._bloco_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFuncaoStrDeclaracao(this);
    }

    public TId getNome()
    {
        return this._nome_;
    }

    public void setNome(TId node)
    {
        if(this._nome_ != null)
        {
            this._nome_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nome_ = node;
    }

    public LinkedList<PParametro> getPars()
    {
        return this._pars_;
    }

    public void setPars(List<?> list)
    {
        for(PParametro e : this._pars_)
        {
            e.parent(null);
        }
        this._pars_.clear();

        for(Object obj_e : list)
        {
            PParametro e = (PParametro) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._pars_.add(e);
        }
    }

    public LinkedList<PComando> getBloco()
    {
        return this._bloco_;
    }

    public void setBloco(List<?> list)
    {
        for(PComando e : this._bloco_)
        {
            e.parent(null);
        }
        this._bloco_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._bloco_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nome_)
            + toString(this._pars_)
            + toString(this._bloco_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nome_ == child)
        {
            this._nome_ = null;
            return;
        }

        if(this._pars_.remove(child))
        {
            return;
        }

        if(this._bloco_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._nome_ == oldChild)
        {
            setNome((TId) newChild);
            return;
        }

        for(ListIterator<PParametro> i = this._pars_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParametro) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PComando> i = this._bloco_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
