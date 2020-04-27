package com.momo;

public class pcBureau {
    private String pc;
    private String portable;
    private int    quandtite;

    public pcBureau() {
        pc = null;
        portable = null;
        quandtite = 0;
    }

    public String getPc() {
        return pc;
    }

    public String getPortable() {
        return portable;
    }

    public int getQuandtite() {
        return quandtite;
    }

    public void setPc( String pc ) {
        this.pc = pc;
    }

    public void setPortable( String portable ) {
        this.portable = portable;
    }

    public void setQuandtite( int quandtite ) {
        this.quandtite = quandtite;
    }
}
