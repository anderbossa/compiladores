/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorCMenos.node;

import compiladorCMenos.analysis.*;

@SuppressWarnings("nls")
public final class AMatrizComandoAtribuicao extends PComandoAtribuicao
{
    private TId _id_;
    private TACol _aCol_;
    private PSeqParametro _seqParametro_;
    private TFCol _fCol_;
    private TAtrib _atrib_;
    private PExpGeral _expGeral_;

    public AMatrizComandoAtribuicao()
    {
        // Constructor
    }

    public AMatrizComandoAtribuicao(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TACol _aCol_,
        @SuppressWarnings("hiding") PSeqParametro _seqParametro_,
        @SuppressWarnings("hiding") TFCol _fCol_,
        @SuppressWarnings("hiding") TAtrib _atrib_,
        @SuppressWarnings("hiding") PExpGeral _expGeral_)
    {
        // Constructor
        setId(_id_);

        setACol(_aCol_);

        setSeqParametro(_seqParametro_);

        setFCol(_fCol_);

        setAtrib(_atrib_);

        setExpGeral(_expGeral_);

    }

    @Override
    public Object clone()
    {
        return new AMatrizComandoAtribuicao(
            cloneNode(this._id_),
            cloneNode(this._aCol_),
            cloneNode(this._seqParametro_),
            cloneNode(this._fCol_),
            cloneNode(this._atrib_),
            cloneNode(this._expGeral_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMatrizComandoAtribuicao(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TACol getACol()
    {
        return this._aCol_;
    }

    public void setACol(TACol node)
    {
        if(this._aCol_ != null)
        {
            this._aCol_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aCol_ = node;
    }

    public PSeqParametro getSeqParametro()
    {
        return this._seqParametro_;
    }

    public void setSeqParametro(PSeqParametro node)
    {
        if(this._seqParametro_ != null)
        {
            this._seqParametro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._seqParametro_ = node;
    }

    public TFCol getFCol()
    {
        return this._fCol_;
    }

    public void setFCol(TFCol node)
    {
        if(this._fCol_ != null)
        {
            this._fCol_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fCol_ = node;
    }

    public TAtrib getAtrib()
    {
        return this._atrib_;
    }

    public void setAtrib(TAtrib node)
    {
        if(this._atrib_ != null)
        {
            this._atrib_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._atrib_ = node;
    }

    public PExpGeral getExpGeral()
    {
        return this._expGeral_;
    }

    public void setExpGeral(PExpGeral node)
    {
        if(this._expGeral_ != null)
        {
            this._expGeral_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expGeral_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._aCol_)
            + toString(this._seqParametro_)
            + toString(this._fCol_)
            + toString(this._atrib_)
            + toString(this._expGeral_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._aCol_ == child)
        {
            this._aCol_ = null;
            return;
        }

        if(this._seqParametro_ == child)
        {
            this._seqParametro_ = null;
            return;
        }

        if(this._fCol_ == child)
        {
            this._fCol_ = null;
            return;
        }

        if(this._atrib_ == child)
        {
            this._atrib_ = null;
            return;
        }

        if(this._expGeral_ == child)
        {
            this._expGeral_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._aCol_ == oldChild)
        {
            setACol((TACol) newChild);
            return;
        }

        if(this._seqParametro_ == oldChild)
        {
            setSeqParametro((PSeqParametro) newChild);
            return;
        }

        if(this._fCol_ == oldChild)
        {
            setFCol((TFCol) newChild);
            return;
        }

        if(this._atrib_ == oldChild)
        {
            setAtrib((TAtrib) newChild);
            return;
        }

        if(this._expGeral_ == oldChild)
        {
            setExpGeral((PExpGeral) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
