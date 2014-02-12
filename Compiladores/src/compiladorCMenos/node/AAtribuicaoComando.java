/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorCMenos.node;

import java.util.*;
import compiladorCMenos.analysis.*;

@SuppressWarnings("nls")
public final class AAtribuicaoComando extends PComando
{
    private TId _nome_;
    private final LinkedList<PExp> _indices_ = new LinkedList<PExp>();
    private PExp _valor_;

    public AAtribuicaoComando()
    {
        // Constructor
    }

    public AAtribuicaoComando(
        @SuppressWarnings("hiding") TId _nome_,
        @SuppressWarnings("hiding") List<?> _indices_,
        @SuppressWarnings("hiding") PExp _valor_)
    {
        // Constructor
        setNome(_nome_);

        setIndices(_indices_);

        setValor(_valor_);

    }

    @Override
    public Object clone()
    {
        return new AAtribuicaoComando(
            cloneNode(this._nome_),
            cloneList(this._indices_),
            cloneNode(this._valor_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAtribuicaoComando(this);
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

    public LinkedList<PExp> getIndices()
    {
        return this._indices_;
    }

    public void setIndices(List<?> list)
    {
        for(PExp e : this._indices_)
        {
            e.parent(null);
        }
        this._indices_.clear();

        for(Object obj_e : list)
        {
            PExp e = (PExp) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._indices_.add(e);
        }
    }

    public PExp getValor()
    {
        return this._valor_;
    }

    public void setValor(PExp node)
    {
        if(this._valor_ != null)
        {
            this._valor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._valor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nome_)
            + toString(this._indices_)
            + toString(this._valor_);
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

        if(this._indices_.remove(child))
        {
            return;
        }

        if(this._valor_ == child)
        {
            this._valor_ = null;
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

        for(ListIterator<PExp> i = this._indices_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PExp) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._valor_ == oldChild)
        {
            setValor((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}