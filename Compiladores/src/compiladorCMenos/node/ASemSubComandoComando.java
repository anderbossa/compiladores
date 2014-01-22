/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorCMenos.node;

import compiladorCMenos.analysis.*;

@SuppressWarnings("nls")
public final class ASemSubComandoComando extends PComando
{
    private PSemSubComando _semSubComando_;

    public ASemSubComandoComando()
    {
        // Constructor
    }

    public ASemSubComandoComando(
        @SuppressWarnings("hiding") PSemSubComando _semSubComando_)
    {
        // Constructor
        setSemSubComando(_semSubComando_);

    }

    @Override
    public Object clone()
    {
        return new ASemSubComandoComando(
            cloneNode(this._semSubComando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASemSubComandoComando(this);
    }

    public PSemSubComando getSemSubComando()
    {
        return this._semSubComando_;
    }

    public void setSemSubComando(PSemSubComando node)
    {
        if(this._semSubComando_ != null)
        {
            this._semSubComando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semSubComando_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._semSubComando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._semSubComando_ == child)
        {
            this._semSubComando_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._semSubComando_ == oldChild)
        {
            setSemSubComando((PSemSubComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
