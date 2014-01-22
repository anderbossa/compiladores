/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorCMenos.node;

import compiladorCMenos.analysis.*;

@SuppressWarnings("nls")
public final class ADeclFuncaoMain extends PDeclFuncaoMain
{
    private PTipoAvalorado _tipoAvalorado_;
    private TId _id_;
    private TAPar _aPar_;
    private TPChaveVoid _pChaveVoid_;
    private TFPar _fPar_;
    private PBloco _bloco_;

    public ADeclFuncaoMain()
    {
        // Constructor
    }

    public ADeclFuncaoMain(
        @SuppressWarnings("hiding") PTipoAvalorado _tipoAvalorado_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TAPar _aPar_,
        @SuppressWarnings("hiding") TPChaveVoid _pChaveVoid_,
        @SuppressWarnings("hiding") TFPar _fPar_,
        @SuppressWarnings("hiding") PBloco _bloco_)
    {
        // Constructor
        setTipoAvalorado(_tipoAvalorado_);

        setId(_id_);

        setAPar(_aPar_);

        setPChaveVoid(_pChaveVoid_);

        setFPar(_fPar_);

        setBloco(_bloco_);

    }

    @Override
    public Object clone()
    {
        return new ADeclFuncaoMain(
            cloneNode(this._tipoAvalorado_),
            cloneNode(this._id_),
            cloneNode(this._aPar_),
            cloneNode(this._pChaveVoid_),
            cloneNode(this._fPar_),
            cloneNode(this._bloco_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclFuncaoMain(this);
    }

    public PTipoAvalorado getTipoAvalorado()
    {
        return this._tipoAvalorado_;
    }

    public void setTipoAvalorado(PTipoAvalorado node)
    {
        if(this._tipoAvalorado_ != null)
        {
            this._tipoAvalorado_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoAvalorado_ = node;
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

    public PBloco getBloco()
    {
        return this._bloco_;
    }

    public void setBloco(PBloco node)
    {
        if(this._bloco_ != null)
        {
            this._bloco_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bloco_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipoAvalorado_)
            + toString(this._id_)
            + toString(this._aPar_)
            + toString(this._pChaveVoid_)
            + toString(this._fPar_)
            + toString(this._bloco_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoAvalorado_ == child)
        {
            this._tipoAvalorado_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._aPar_ == child)
        {
            this._aPar_ = null;
            return;
        }

        if(this._pChaveVoid_ == child)
        {
            this._pChaveVoid_ = null;
            return;
        }

        if(this._fPar_ == child)
        {
            this._fPar_ = null;
            return;
        }

        if(this._bloco_ == child)
        {
            this._bloco_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipoAvalorado_ == oldChild)
        {
            setTipoAvalorado((PTipoAvalorado) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._aPar_ == oldChild)
        {
            setAPar((TAPar) newChild);
            return;
        }

        if(this._pChaveVoid_ == oldChild)
        {
            setPChaveVoid((TPChaveVoid) newChild);
            return;
        }

        if(this._fPar_ == oldChild)
        {
            setFPar((TFPar) newChild);
            return;
        }

        if(this._bloco_ == oldChild)
        {
            setBloco((PBloco) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}