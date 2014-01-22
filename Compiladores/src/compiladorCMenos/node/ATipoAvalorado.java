/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorCMenos.node;

import compiladorCMenos.analysis.*;

@SuppressWarnings("nls")
public final class ATipoAvalorado extends PTipoAvalorado
{
    private TPChaveVoid _pChaveVoid_;

    public ATipoAvalorado()
    {
        // Constructor
    }

    public ATipoAvalorado(
        @SuppressWarnings("hiding") TPChaveVoid _pChaveVoid_)
    {
        // Constructor
        setPChaveVoid(_pChaveVoid_);

    }

    @Override
    public Object clone()
    {
        return new ATipoAvalorado(
            cloneNode(this._pChaveVoid_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipoAvalorado(this);
    }

    public TPChaveVoid getPChaveVoid()
    {
        return this._pChaveVoid_;
    }

    public void setPChaveVoid(TPChaveVoid node)
    {
        if(this._pChaveVoid_ != null)
        {
            this._pChaveVoid_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pChaveVoid_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pChaveVoid_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pChaveVoid_ == child)
        {
            this._pChaveVoid_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pChaveVoid_ == oldChild)
        {
            setPChaveVoid((TPChaveVoid) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}