package com.momo;

public class Main {

    public static void main( String[] args ) {
        int S = 0;
        for ( int i = 1; i < 11; i++ ) {
            if ( i % 2 == 1 ) {
                System.out.println( " S = " + S + " + " + i + " = " + ( S + i ) );
                S += i;
            } else {
                System.out.println( " S = " + S + " - " + i + " = " + ( S - i ) );
                S -= i;
            }
        }

    }

}
