import java.io.Serial;

public class ParseException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public ParseException(Token currentTokenVal,
                          int[][] expectedTokenSequencesVal,
                          String[] tokenImageVal
    ) {
        super(initialise(currentTokenVal, expectedTokenSequencesVal, tokenImageVal));
        currentToken = currentTokenVal;
        expectedTokenSequences = expectedTokenSequencesVal;
        tokenImage = tokenImageVal;
    }

    public ParseException() {
        super();
    }

    public ParseException(String message) {
        super(message);
    }

    public Token currentToken;

    public int[][] expectedTokenSequences;
    public String[] tokenImage;
    private static String initialise(Token currentToken,
                                     int[][] expectedTokenSequences,
                                     String[] tokenImage) {
        String eol = System.getProperty("line.separator", "\n");
        StringBuilder expected = new StringBuilder();
        int maxSize = 0;
        for (int[] expectedTokenSequence : expectedTokenSequences) {
            if (maxSize < expectedTokenSequence.length) {
                maxSize = expectedTokenSequence.length;
            }
            for (int i : expectedTokenSequence) {
                expected.append(tokenImage[i]).append(' ');
            }
            if (expectedTokenSequence[expectedTokenSequence.length - 1] != 0) {
                expected.append("...");
            }
            expected.append(eol).append("    ");
        }
        StringBuilder retval = new StringBuilder("Encountered \"");
        Token tok = currentToken.next;
        for (int i = 0; i < maxSize; i++) {
            if (i != 0) retval.append(" ");
            if (tok.kind == 0) {
                retval.append(tokenImage[0]);
                break;
            }
            retval.append(" ").append(tokenImage[tok.kind]);
            retval.append(" \"");
            retval.append(add_escapes(tok.image));
            retval.append(" \"");
            tok = tok.next;
        }
        retval.append("\" at line ").append(currentToken.next.beginLine).append(", column ").append(currentToken.next.beginColumn);
        retval.append(".").append(eol);
        if (expectedTokenSequences.length == 1) {
            retval.append("Was expecting:").append(eol).append("    ");
        } else {
            retval.append("Was expecting one of:").append(eol).append("    ");
        }
        retval.append(expected.toString());
        return retval.toString();
    }
    protected String eol = System.getProperty("line.separator", "\n");
    static String add_escapes(String str) {
        StringBuilder retval = new StringBuilder();
        char ch;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 0 -> {
                }
                case '\b' -> {
                    retval.append("\\b");
                }
                case '\t' -> {
                    retval.append("\\t");
                }
                case '\n' -> {
                    retval.append("\\n");
                }
                case '\f' -> {
                    retval.append("\\f");
                }
                case '\r' -> {
                    retval.append("\\r");
                }
                case '\"' -> {
                    retval.append("\\\"");
                }
                case '\'' -> {
                    retval.append("\\\'");
                }
                case '\\' -> {
                    retval.append("\\\\");
                }
                default -> {
                    if ((ch = str.charAt(i)) < 0x20 || ch > 0x7e) {
                        String s = "0000" + Integer.toString(ch, 16);
                        retval.append("\\u").append(s.substring(s.length() - 4));
                    } else {
                        retval.append(ch);
                    }
                }
            }
        }
        return retval.toString();
    }

}
/* JavaCC - OriginalChecksum=c5a983a229aa877dc2b3b3b9933cdd6b (do not edit this line) */
