package com.oreilly.javanut6;

import static util.Convenience.print;

class Syntax {
    public static /* a comment */ void main(String[] args) {
        print("Comments can appear between any two tokens.");

        print((char) 65);
        print((byte) '\u216C');
        print((long) '\u216C');
        print(Character.getNumericValue('\u216C'));
    }
}
