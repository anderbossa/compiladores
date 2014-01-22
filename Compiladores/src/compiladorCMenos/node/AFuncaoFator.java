/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorCMenos.node;

import compiladorCMenos.analysis.*;

@SuppressWarnings("nls")
public final class AFuncaoFator extends PFator
{
    private PComandoFuncao _comandoFuncao_;

    public AFuncaoFator()
    {
        // Constructor
    }

    public AFuncaoFator(
        @SuppressWarnings("hiding") PComandoFuncao _comandoFuncao_)
    {
        // Constructor
        setComandoFuncao(_comandoFuncao_);

    }

    @Override
    public Object clone()
    {
        return new AFuncaoFator(
            cloneNode(this._comandoFuncao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFuncaoFator(this);
    }

    public PComandoFuncao getComandoFuncao()
    {
        return this._comandoFuncao_;
    }

    public void setComandoFuncao(PComandoFuncao node)
    {
        if(this._comandoFuncao_ != null)
        {
            this._comandoFuncao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandoFuncao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comandoFuncao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comandoFuncao_ == child)
        {
            this._comandoFuncao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comandoFuncao_ == oldChild)
        {
            setComandoFuncao((PComandoFuncao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}