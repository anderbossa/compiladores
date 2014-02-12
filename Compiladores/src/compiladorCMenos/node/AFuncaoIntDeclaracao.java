/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorCMenos.node;

import java.util.*;
import compiladorCMenos.analysis.*;

@SuppressWarnings("nls")
public final class AFuncaoIntDeclaracao extends PDeclaracao
{
    private TId _nome_;
    private final LinkedList<PParametro> _pars_ = new LinkedList<PParametro>();
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();

    public AFuncaoIntDeclaracao()
    {
        // Constructor
    }

    public AFuncaoIntDeclaracao(
        @SuppressWarnings("hiding") TId _nome_,
        @SuppressWarnings("hiding") List<?> _pars_,
        @SuppressWarnings("hiding") List<?> _comando_)
    {
        // Constructor
        setNome(_nome_);

        setPars(_pars_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AFuncaoIntDeclaracao(
            cloneNode(this._nome_),
            cloneList(this._pars_),
            cloneList(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFuncaoIntDeclaracao(this);
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

    public LinkedList<PComando> getComando()
    {
        return this._comando_;
    }

    public void setComando(List<?> list)
    {
        for(PComando e : this._comando_)
        {
            e.parent(null);
        }
        this._comando_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comando_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nome_)
            + toString(this._pars_)
            + toString(this._comando_);
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

        if(this._comando_.remove(child))
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

        for(ListIterator<PComando> i = this._comando_.listIterator(); i.hasNext();)
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