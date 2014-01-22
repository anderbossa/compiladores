/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorCMenos.node;

import java.util.*;
import compiladorCMenos.analysis.*;

@SuppressWarnings("nls")
public final class ASeqDeclParametro extends PSeqDeclParametro
{
    private PDeclParametro _declParametro_;
    private final LinkedList<PDeclParametroLista> _declParametroLista_ = new LinkedList<PDeclParametroLista>();

    public ASeqDeclParametro()
    {
        // Constructor
    }

    public ASeqDeclParametro(
        @SuppressWarnings("hiding") PDeclParametro _declParametro_,
        @SuppressWarnings("hiding") List<?> _declParametroLista_)
    {
        // Constructor
        setDeclParametro(_declParametro_);

        setDeclParametroLista(_declParametroLista_);

    }

    @Override
    public Object clone()
    {
        return new ASeqDeclParametro(
            cloneNode(this._declParametro_),
            cloneList(this._declParametroLista_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeqDeclParametro(this);
    }

    public PDeclParametro getDeclParametro()
    {
        return this._declParametro_;
    }

    public void setDeclParametro(PDeclParametro node)
    {
        if(this._declParametro_ != null)
        {
            this._declParametro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declParametro_ = node;
    }

    public LinkedList<PDeclParametroLista> getDeclParametroLista()
    {
        return this._declParametroLista_;
    }

    public void setDeclParametroLista(List<?> list)
    {
        for(PDeclParametroLista e : this._declParametroLista_)
        {
            e.parent(null);
        }
        this._declParametroLista_.clear();

        for(Object obj_e : list)
        {
            PDeclParametroLista e = (PDeclParametroLista) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._declParametroLista_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declParametro_)
            + toString(this._declParametroLista_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declParametro_ == child)
        {
            this._declParametro_ = null;
            return;
        }

        if(this._declParametroLista_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._declParametro_ == oldChild)
        {
            setDeclParametro((PDeclParametro) newChild);
            return;
        }

        for(ListIterator<PDeclParametroLista> i = this._declParametroLista_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDeclParametroLista) newChild);
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