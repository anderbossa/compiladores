/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorCMenos.node;

import compiladorCMenos.analysis.*;

@SuppressWarnings("nls")
public final class AMatrizExp extends PExp
{
    private TId _nome_;
    private PExp _indice_;

    public AMatrizExp()
    {
        // Constructor
    }

    public AMatrizExp(
        @SuppressWarnings("hiding") TId _nome_,
        @SuppressWarnings("hiding") PExp _indice_)
    {
        // Constructor
        setNome(_nome_);

        setIndice(_indice_);

    }

    @Override
    public Object clone()
    {
        return new AMatrizExp(
            cloneNode(this._nome_),
            cloneNode(this._indice_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMatrizExp(this);
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

    public PExp getIndice()
    {
        return this._indice_;
    }

    public void setIndice(PExp node)
    {
        if(this._indice_ != null)
        {
            this._indice_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._indice_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nome_)
            + toString(this._indice_);
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

        if(this._indice_ == child)
        {
            this._indice_ = null;
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

        if(this._indice_ == oldChild)
        {
            setIndice((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}