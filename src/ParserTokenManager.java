/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */

public class ParserTokenManager implements ParserConstants
{

    public static  java.io.PrintStream debugStream = System.out;
    public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
    private static int jjStopStringLiteralDfa_0(int pos, long active0)
    {
        switch (pos) {
            case 0 -> {
                if ((active0 & 0x1e0L) != 0L) {
                    jjmatchedKind = 16;
                    return 5;
                }
                return -1;
            }
            case 1 -> {
                if ((active0 & 0x1e0L) != 0L) {
                    jjmatchedKind = 16;
                    jjmatchedPos = 1;
                    return 5;
                }
                return -1;
            }
            case 2 -> {
                if ((active0 & 0xe0L) != 0L) {
                    jjmatchedKind = 16;
                    jjmatchedPos = 2;
                    return 5;
                }
                if ((active0 & 0x100L) != 0L)
                    return 5;
                return -1;
            }
            case 3 -> {
                if ((active0 & 0xa0L) != 0L) {
                    jjmatchedKind = 16;
                    jjmatchedPos = 3;
                    return 5;
                }
                if ((active0 & 0x40L) != 0L)
                    return 5;
                return -1;
            }
            case 4 -> {
                if ((active0 & 0x20L) != 0L) {
                    jjmatchedKind = 16;
                    jjmatchedPos = 4;
                    return 5;
                }
                if ((active0 & 0x80L) != 0L)
                    return 5;
                return -1;
            }
            default -> {
                return -1;
            }
        }
    }
    private static int jjStartNfa_0(int pos, long active0)
    {
        return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
    }
    static private int jjStopAtPos(int kind)
    {
        jjmatchedKind = kind;
        jjmatchedPos = 0;
        return 1;
    }
    static private int jjMoveStringLiteralDfa0_0()
    {
        return switch (curChar) {
            case 34 -> jjStopAtPos(13);
            case 40 -> jjStopAtPos(9);
            case 41 -> jjStopAtPos(10);
            case 44 -> jjStopAtPos(12);
            case 46 -> jjStopAtPos(11);
            case 65, 97 -> jjMoveStringLiteralDfa1_0(0x100L);
            case 70, 102 -> jjMoveStringLiteralDfa1_0(0x40L);
            case 83, 115 -> jjMoveStringLiteralDfa1_0(0x20L);
            case 87, 119 -> jjMoveStringLiteralDfa1_0(0x80L);
            default -> jjMoveNfa_0(0, 0);
        };
    }
    static private int jjMoveStringLiteralDfa1_0(long active0)
    {
        try { curChar = SimpleCharStream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(0, active0);
            return 1;
        }
        switch (curChar) {
            case 69, 101 -> {
                return jjMoveStringLiteralDfa2_0(active0, 0x20L);
            }
            case 72, 104 -> {
                return jjMoveStringLiteralDfa2_0(active0, 0x80L);
            }
            case 78, 110 -> {
                return jjMoveStringLiteralDfa2_0(active0, 0x100L);
            }
            case 82, 114 -> {
                return jjMoveStringLiteralDfa2_0(active0, 0x40L);
            }
            default -> {
            }
        }
        return jjStartNfa_0(0, active0);
    }
    static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
    {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(0, old0);
        try { curChar = SimpleCharStream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(1, active0);
            return 2;
        }
        switch (curChar) {
            case 68, 100 -> {
                if ((active0 & 0x100L) != 0L)
                    return jjStartNfaWithStates_0(2, 8);
            }
            case 69, 101 -> {
                return jjMoveStringLiteralDfa3_0(active0, 0x80L);
            }
            case 76, 108 -> {
                return jjMoveStringLiteralDfa3_0(active0, 0x20L);
            }
            case 79, 111 -> {
                return jjMoveStringLiteralDfa3_0(active0, 0x40L);
            }
            default -> {
            }
        }
        return jjStartNfa_0(1, active0);
    }
    static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
    {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(1, old0);
        try { curChar = SimpleCharStream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(2, active0);
            return 3;
        }
        switch (curChar) {
            case 69, 101 -> {
                return jjMoveStringLiteralDfa4_0(active0, 0x20L);
            }
            case 77, 109 -> {
                if ((active0 & 0x40L) != 0L)
                    return jjStartNfaWithStates_0(3, 6);
            }
            case 82, 114 -> {
                return jjMoveStringLiteralDfa4_0(active0, 0x80L);
            }
            default -> {
            }
        }
        return jjStartNfa_0(2, active0);
    }
    static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
    {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(2, old0);
        try { curChar = SimpleCharStream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(3, active0);
            return 4;
        }
        switch (curChar) {
            case 67, 99 -> {
                return jjMoveStringLiteralDfa5_0(active0, 0x20L);
            }
            case 69, 101 -> {
                if ((active0 & 0x80L) != 0L)
                    return jjStartNfaWithStates_0(4, 7);
            }
            default -> {
            }
        }
        return jjStartNfa_0(3, active0);
    }
    static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
    {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(3, old0);
        try { curChar = SimpleCharStream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(4, active0);
            return 5;
        }
        switch (curChar) {
            case 84, 116 -> {
                if ((active0 & 0x20L) != 0L)
                    return jjStartNfaWithStates_0(5, 5);
            }
            default -> {
            }
        }
        return jjStartNfa_0(4, active0);
    }
    static private int jjStartNfaWithStates_0(int pos, int kind)
    {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        try { curChar = SimpleCharStream.readChar(); }
        catch(java.io.IOException e) { return pos + 1; }
        return jjMoveNfa_0(5, pos + 1);
    }
    static private int jjMoveNfa_0(int startState, int curPos)
    {
        int startsAt = 0;
        jjnewStateCnt = 9;
        int i = 1;
        jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (;;)
        {
            if (++jjround == 0x7fffffff)
                ReInitRounds();
            if (curChar < 64)
            {
                long l = 1L << curChar;
                do
                {
                    switch (jjstateSet[--i]) {
                        case 0 -> {
                            if ((0x3ff000000000000L & l) != 0L) {
                                if (kind > 16)
                                    kind = 16;
                                jjCheckNAdd(5);
                            } else if ((0x6000000000000000L & l) != 0L) {
                                if (kind > 14)
                                    kind = 14;
                            } else if (curChar == 60)
                                jjCheckNAddStates(0, 2);
                            else if (curChar == 33)
                                jjCheckNAdd(1);
                            if ((0x3ff000000000000L & l) != 0L) {
                                if (kind > 15)
                                    kind = 15;
                                jjCheckNAdd(4);
                            } else if (curChar == 62)
                                jjCheckNAdd(1);
                        }
                        case 1 -> {
                            if (curChar == 61 && kind > 14)
                                kind = 14;
                        }
                        case 2 -> {
                            if (curChar == 62)
                                jjCheckNAdd(1);
                        }
                        case 3 -> {
                            if (curChar == 33)
                                jjCheckNAdd(1);
                        }
                        case 4 -> {
                            if ((0x3ff000000000000L & l) == 0L)
                                break;
                            if (kind > 15)
                                kind = 15;
                            jjCheckNAdd(4);
                        }
                        case 5 -> {
                            if ((0x3ff000000000000L & l) == 0L)
                                break;
                            if (kind > 16)
                                kind = 16;
                            jjCheckNAdd(5);
                        }
                        case 6 -> {
                            if (curChar == 60)
                                jjCheckNAddStates(0, 2);
                        }
                        case 7 -> {
                            if (curChar == 32)
                                kind = 14;
                        }
                        case 8 -> {
                            if (curChar == 62 && kind > 14)
                                kind = 14;
                        }
                        default -> {
                        }
                    }
                } while(i != startsAt);
            }
            else if (curChar < 128)
            {
                long l = 1L << (curChar & 63);
                do
                {
                    switch (jjstateSet[--i]) {
                        case 0, 5 -> {
                            if ((0x7fffffe07fffffeL & l) == 0L)
                                break;
                            kind = 16;
                            jjCheckNAdd(5);
                        }
                        default -> {
                        }
                    }
                } while(i != startsAt);
            }
            else
            {
                int i2 = (curChar & 0xff) >> 6;
                long l2 = 1L << (curChar & 63);
                do
                {
                    switch(jjstateSet[--i])
                    {
                        default : break;
                    }
                } while(i != startsAt);
            }
            if (kind != 0x7fffffff)
            {
                jjmatchedKind = kind;
                jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = jjnewStateCnt) == (startsAt = 9 - (jjnewStateCnt = startsAt)))
                return curPos;
            try { curChar = SimpleCharStream.readChar(); }
            catch(java.io.IOException e) { return curPos; }
        }
    }
    static final int[] jjnextStates = {
            7, 1, 8,
    };

    public static final String[] jjstrLiteralImages = {
            "", null, null, null, null, null, null, null, null, "\50", "\51", "\56",
            "\54", "\42", null, null, null, };

    public static final String[] lexStateNames = {
            "DEFAULT",
    };
    static final long[] jjtoToken = {
            0x1ffe1L,
    };
    static final long[] jjtoSkip = {
            0x1eL,
    };
    static protected SimpleCharStream input_stream;
    static private final int[] jjrounds = new int[9];
    static private final int[] jjstateSet = new int[18];
    static protected char curChar;
    public ParserTokenManager(SimpleCharStream stream){
        if (input_stream != null)
            throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
        input_stream = stream;
    }

    public ParserTokenManager(SimpleCharStream stream, int lexState){
        this(stream);
        SwitchTo(lexState);
    }

    static public void ReInit(SimpleCharStream stream)
    {
        jjmatchedPos = jjnewStateCnt = 0;
        curLexState = defaultLexState;
        input_stream = stream;
        ReInitRounds();
    }
    static private void ReInitRounds()
    {
        int i;
        jjround = 0x80000001;
        for (i = 9; i-- > 0;)
            jjrounds[i] = 0x80000000;
    }

    static public void SwitchTo(int lexState)
    {
        if (lexState != 0)
            throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
        else
            curLexState = lexState;
    }

    static protected Token jjFillToken()
    {
        final Token t;
        final String curTokenImage;
        final int beginLine;
        final int endLine;
        final int beginColumn;
        final int endColumn;
        String im = jjstrLiteralImages[jjmatchedKind];
        curTokenImage = (im == null) ? SimpleCharStream.GetImage() : im;
        beginLine = SimpleCharStream.getBeginLine();
        beginColumn = SimpleCharStream.getBeginColumn();
        endLine = SimpleCharStream.getEndLine();
        endColumn = SimpleCharStream.getEndColumn();
        t = Token.newToken(jjmatchedKind, curTokenImage);

        t.beginLine = beginLine;
        t.endLine = endLine;
        t.beginColumn = beginColumn;
        t.endColumn = endColumn;

        return t;
    }

    static int curLexState = 0;
    static int defaultLexState = 0;
    static int jjnewStateCnt;
    static int jjround;
    static int jjmatchedPos;
    static int jjmatchedKind;

    public static Token getNextToken()
    {
        Token matchedToken;
        int curPos = 0;

        EOFLoop :
        for (;;)
        {
            try
            {
                curChar = SimpleCharStream.BeginToken();
            }
            catch(java.io.IOException e)
            {
                jjmatchedKind = 0;
                matchedToken = jjFillToken();
                return matchedToken;
            }

            try { SimpleCharStream.backup(0);
                while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
                    curChar = SimpleCharStream.BeginToken();
            }
            catch (java.io.IOException e1) { continue EOFLoop; }
            jjmatchedKind = 0x7fffffff;
            jjmatchedPos = 0;
            curPos = jjMoveStringLiteralDfa0_0();
            if (jjmatchedKind != 0x7fffffff)
            {
                if (jjmatchedPos + 1 < curPos)
                    SimpleCharStream.backup(curPos - jjmatchedPos - 1);
                if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 63))) != 0L)
                {
                    matchedToken = jjFillToken();
                    return matchedToken;
                }
                else
                {
                    continue EOFLoop;
                }
            }
            int error_line = SimpleCharStream.getEndLine();
            int error_column = SimpleCharStream.getEndColumn();
            String error_after = null;
            boolean EOFSeen = false;
            try { SimpleCharStream.readChar(); SimpleCharStream.backup(1); }
            catch (java.io.IOException e1) {
                EOFSeen = true;
                error_after = curPos <= 1 ? "" : SimpleCharStream.GetImage();
                if (curChar == '\n' || curChar == '\r') {
                    error_line++;
                    error_column = 0;
                }
                else
                    error_column++;
            }
            if (!EOFSeen) {
                SimpleCharStream.backup(1);
                error_after = curPos <= 1 ? "" : SimpleCharStream.GetImage();
            }
            throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
        }
    }

    static private void jjCheckNAdd(int state)
    {
        if (jjrounds[state] != jjround)
        {
            jjstateSet[jjnewStateCnt++] = state;
            jjrounds[state] = jjround;
        }
    }
    static private void jjAddStates(int start, int end)
    {
        do {
            jjstateSet[jjnewStateCnt++] = jjnextStates[start];
        } while (start++ != end);
    }
    static private void jjCheckNAddTwoStates(int state1, int state2)
    {
        jjCheckNAdd(state1);
        jjCheckNAdd(state2);
    }

    static private void jjCheckNAddStates(int start, int end)
    {
        do {
            jjCheckNAdd(jjnextStates[start]);
        } while (start++ != end);
    }

}
