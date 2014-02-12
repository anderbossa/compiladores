/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorCMenos.node;

import java.util.*;
import compiladorCMenos.analysis.*;

@SuppressWarnings("nls")
public final class AVarIntDeclaracao extends PDeclaracao
{
    private TId _nome_;
    private final LinkedList<PExp> _dimens_ = new LinkedList<PExp>();

    public AVarIntDeclaracao()
    {
        // Constructor
    }

    public AVarIntDeclaracao(
        @SuppressWarnings("hiding") TId _nome_,
        @SuppressWarnings("hiding") List<?> _dimens_)
    {
        // Constructor
        setNome(_nome_);

        setDimens(_dimens_);

    }

    @Override
    public Object clone()
    {
        return new AVarIntDeclaracao(
            cloneNode(this._nome_),
            cloneList(this._dimens_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVarIntDeclaracao(this);
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

    public LinkedList<PExp> getDimens()
    {
        return this._dimens_;
    }

    public void setDimens(List<?> list)
    {
        for(PExp e : this._dimens_)
        {
            e.parent(null);
        }
        this._dimens_.clear();

        for(Object obj_e : list)
        {
            PExp e = (PExp) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._dimens_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nome_)
            + toString(this._dimens_);
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

        if(this._dimens_.remove(child))
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

        for(ListIterator<PExp> i = this._dimens_.listIterator(); i.hasNext();)
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

        throw new RuntimeException("Not a child.");
    }
}