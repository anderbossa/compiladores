/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorCMenos.node;

import compiladorCMenos.analysis.*;

@SuppressWarnings("nls")
public final class TPChaveString extends Token
{
    public TPChaveString()
    {
        super.setText("string");
    }

    public TPChaveString(int line, int pos)
    {
        super.setText("string");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPChaveString(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPChaveString(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPChaveString text.");
    }
}
