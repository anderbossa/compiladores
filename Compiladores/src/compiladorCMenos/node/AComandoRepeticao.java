/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorCMenos.node;

import compiladorCMenos.analysis.*;

@SuppressWarnings("nls")
public final class AComandoRepeticao extends PComandoRepeticao
{
    private TPChaveWhile _pChaveWhile_;
    private TAPar _aPar_;
    private PExpGeral _expGeral_;
    private TFPar _fPar_;
    private PComando _comando_;

    public AComandoRepeticao()
    {
        // Constructor
    }

    public AComandoRepeticao(
        @SuppressWarnings("hiding") TPChaveWhile _pChaveWhile_,
        @SuppressWarnings("hiding") TAPar _aPar_,
        @SuppressWarnings("hiding") PExpGeral _expGeral_,
        @SuppressWarnings("hiding") TFPar _fPar_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setPChaveWhile(_pChaveWhile_);

        setAPar(_aPar_);

        setExpGeral(_expGeral_);

        setFPar(_fPar_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AComandoRepeticao(
            cloneNode(this._pChaveWhile_),
            cloneNode(this._aPar_),
            cloneNode(this._expGeral_),
            cloneNode(this._fPar_),
            cloneNode(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoRepeticao(this);
    }

    public TPChaveWhile getPChaveWhile()
    {
        return this._pChaveWhile_;
    }

    public void setPChaveWhile(TPChaveWhile node)
    {
        if(this._pChaveWhile_ != null)
        {
            this._pChaveWhile_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pChaveWhile_ = node;
    }

    public TAPar getAPar()
    {
        return this._aPar_;
    }

    public void setAPar(TAPar node)
    {
        if(this._aPar_ != null)
        {
            this._aPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aPar_ = node;
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

    public TFPar getFPar()
    {
        return this._fPar_;
    }

    public void setFPar(TFPar node)
    {
        if(this._fPar_ != null)
        {
            this._fPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fPar_ = node;
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pChaveWhile_)
            + toString(this._aPar_)
            + toString(this._expGeral_)
            + toString(this._fPar_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pChaveWhile_ == child)
        {
            this._pChaveWhile_ = null;
            return;
        }

        if(this._aPar_ == child)
        {
            this._aPar_ = null;
            return;
        }

        if(this._expGeral_ == child)
        {
            this._expGeral_ = null;
            return;
        }

        if(this._fPar_ == child)
        {
            this._fPar_ = null;
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pChaveWhile_ == oldChild)
        {
            setPChaveWhile((TPChaveWhile) newChild);
            return;
        }

        if(this._aPar_ == oldChild)
        {
            setAPar((TAPar) newChild);
            return;
        }

        if(this._expGeral_ == oldChild)
        {
            setExpGeral((PExpGeral) newChild);
            return;
        }

        if(this._fPar_ == oldChild)
        {
            setFPar((TFPar) newChild);
            return;
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
