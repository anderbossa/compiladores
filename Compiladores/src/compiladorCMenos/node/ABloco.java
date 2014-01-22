/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorCMenos.node;

import compiladorCMenos.analysis.*;

@SuppressWarnings("nls")
public final class ABloco extends PBloco
{
    private TAChave _aChave_;
    private PSeqComando _seqComando_;
    private TFChave _fChave_;

    public ABloco()
    {
        // Constructor
    }

    public ABloco(
        @SuppressWarnings("hiding") TAChave _aChave_,
        @SuppressWarnings("hiding") PSeqComando _seqComando_,
        @SuppressWarnings("hiding") TFChave _fChave_)
    {
        // Constructor
        setAChave(_aChave_);

        setSeqComando(_seqComando_);

        setFChave(_fChave_);

    }

    @Override
    public Object clone()
    {
        return new ABloco(
            cloneNode(this._aChave_),
            cloneNode(this._seqComando_),
            cloneNode(this._fChave_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABloco(this);
    }

    public TAChave getAChave()
    {
        return this._aChave_;
    }

    public void setAChave(TAChave node)
    {
        if(this._aChave_ != null)
        {
            this._aChave_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aChave_ = node;
    }

    public PSeqComando getSeqComando()
    {
        return this._seqComando_;
    }

    public void setSeqComando(PSeqComando node)
    {
        if(this._seqComando_ != null)
        {
            this._seqComando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._seqComando_ = node;
    }

    public TFChave getFChave()
    {
        return this._fChave_;
    }

    public void setFChave(TFChave node)
    {
        if(this._fChave_ != null)
        {
            this._fChave_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fChave_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aChave_)
            + toString(this._seqComando_)
            + toString(this._fChave_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aChave_ == child)
        {
            this._aChave_ = null;
            return;
        }

        if(this._seqComando_ == child)
        {
            this._seqComando_ = null;
            return;
        }

        if(this._fChave_ == child)
        {
            this._fChave_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aChave_ == oldChild)
        {
            setAChave((TAChave) newChild);
            return;
        }

        if(this._seqComando_ == oldChild)
        {
            setSeqComando((PSeqComando) newChild);
            return;
        }

        if(this._fChave_ == oldChild)
        {
            setFChave((TFChave) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
