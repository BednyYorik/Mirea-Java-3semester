package ru.mirea.pr9;

import java.math.BigInteger;

public class InnException extends Exception {

    private final BigInteger innNum;

    public InnException (BigInteger inn){
        super("Номер ИНН " + inn  + " не действителен.");
        innNum = inn;
    }

    public BigInteger getInnNum() {
        return innNum;
    }

}
