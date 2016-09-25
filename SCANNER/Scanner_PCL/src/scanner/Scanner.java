/* The following code was generated by JFlex 1.6.1 */

package scanner;

import java_cup.runtime.*;
import symbols.sym;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>M:/Github/Compilador-PCL/SCANNER/Scanner_PCL/src/scanner/pcl_rules.flex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\11\1\2\1\27\1\27\1\3\22\0\1\11\7\0\1\4"+
    "\1\6\1\5\1\15\3\0\1\1\1\16\11\14\7\0\32\12\4\0"+
    "\1\12\1\0\1\25\2\12\1\26\1\23\1\20\1\12\1\22\1\17"+
    "\4\12\1\24\5\12\1\21\6\12\1\7\1\13\1\10\7\0\1\27"+
    "\u1fa2\0\1\27\1\27\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\3\1\1\2\1\3\1\4\1\3"+
    "\3\1\1\5\2\0\1\5\1\6\1\7\2\6\2\5"+
    "\1\0\2\6\1\10\1\5\1\6\1\11\170\6";

  private static int [] zzUnpackAction() {
    int [] result = new int[151];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\30\0\60\0\30\0\110\0\140\0\170\0\170"+
    "\0\220\0\30\0\30\0\250\0\300\0\330\0\360\0\u0108"+
    "\0\140\0\140\0\u0120\0\u0120\0\u0138\0\u0150\0\30\0\u0168"+
    "\0\u0180\0\u0198\0\u01b0\0\u0198\0\u0108\0\u01c8\0\u01c8\0\u01e0"+
    "\0\u01f8\0\u0210\0\u0228\0\u0240\0\u0258\0\u0270\0\u0288\0\u02a0"+
    "\0\u02b8\0\u02d0\0\u02e8\0\u0300\0\u0318\0\u0330\0\u0348\0\u0360"+
    "\0\u0378\0\u0390\0\u03a8\0\u03c0\0\u03d8\0\u03f0\0\u0408\0\u0420"+
    "\0\u0438\0\u0450\0\u0468\0\u0480\0\u0498\0\u04b0\0\u04c8\0\u04e0"+
    "\0\u04f8\0\u0510\0\u0528\0\u0540\0\u0558\0\u0570\0\u0588\0\u05a0"+
    "\0\u05b8\0\u05d0\0\u05e8\0\u0600\0\u0618\0\u0630\0\u0648\0\u0660"+
    "\0\u0678\0\u0690\0\u06a8\0\u06c0\0\u06d8\0\u06f0\0\u0708\0\u0720"+
    "\0\u0738\0\u0750\0\u0768\0\u0780\0\u0798\0\u07b0\0\u07c8\0\u07e0"+
    "\0\u07f8\0\u0810\0\u0828\0\u0840\0\u0858\0\u0870\0\u0888\0\u08a0"+
    "\0\u08b8\0\u08d0\0\u08e8\0\u0900\0\u0918\0\u0930\0\u0948\0\u0960"+
    "\0\u0978\0\u0990\0\u09a8\0\u09c0\0\u09d8\0\u09f0\0\u0a08\0\u0a20"+
    "\0\u0a38\0\u0a50\0\u0a68\0\u0a80\0\u0a98\0\u0ab0\0\u0ac8\0\u0ae0"+
    "\0\u0af8\0\u0b10\0\u0b28\0\u0b40\0\u0b58\0\u0b70\0\u0b88\0\u0ba0"+
    "\0\u0bb8\0\u0bd0\0\u0be8\0\u0c00\0\u0c18\0\u0c30\0\u0c48\0\u0c60"+
    "\0\u0c78\0\u0c90\0\u0ca8\0\u0cc0\0\u0cd8\0\u0cf0\0\30";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[151];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\4\1\5\2\2\1\6\1\2\1\4"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\7\1\15"+
    "\3\7\1\16\1\7\32\0\1\17\33\0\1\20\22\0"+
    "\10\21\1\22\17\21\12\0\3\23\1\0\11\23\15\0"+
    "\1\11\1\0\1\11\23\0\3\23\1\0\2\23\1\24"+
    "\6\23\13\0\3\23\1\0\4\23\1\25\4\23\13\0"+
    "\3\23\1\0\6\23\1\26\2\23\1\0\2\17\1\27"+
    "\1\30\24\17\5\20\1\31\22\20\12\0\3\32\1\0"+
    "\11\32\13\0\3\32\1\0\5\32\1\33\3\32\13\0"+
    "\3\32\1\0\10\32\1\34\3\0\1\27\25\0\5\20"+
    "\1\31\1\35\21\20\12\0\3\36\1\0\11\36\13\0"+
    "\3\36\1\0\6\36\1\37\2\36\13\0\3\40\1\0"+
    "\11\40\13\0\3\41\1\0\11\41\13\0\3\42\1\0"+
    "\11\42\13\0\3\43\1\0\11\43\13\0\3\44\1\0"+
    "\11\44\13\0\3\45\1\0\11\45\13\0\3\46\1\0"+
    "\11\46\13\0\3\47\1\0\11\47\13\0\3\50\1\0"+
    "\11\50\13\0\3\51\1\0\11\51\13\0\3\52\1\0"+
    "\11\52\13\0\3\53\1\0\11\53\13\0\3\54\1\0"+
    "\11\54\13\0\3\55\1\0\11\55\13\0\3\56\1\0"+
    "\11\56\13\0\3\57\1\0\11\57\13\0\3\60\1\0"+
    "\11\60\13\0\3\61\1\0\11\61\13\0\3\62\1\0"+
    "\11\62\13\0\3\63\1\0\11\63\13\0\3\64\1\0"+
    "\11\64\13\0\3\65\1\0\11\65\13\0\3\66\1\0"+
    "\11\66\13\0\3\67\1\0\11\67\13\0\3\70\1\0"+
    "\11\70\13\0\3\71\1\0\11\71\13\0\3\72\1\0"+
    "\11\72\13\0\3\73\1\0\11\73\13\0\3\74\1\0"+
    "\11\74\13\0\3\75\1\0\11\75\13\0\3\76\1\0"+
    "\11\76\13\0\3\77\1\0\11\77\13\0\3\100\1\0"+
    "\11\100\13\0\3\101\1\0\11\101\13\0\3\102\1\0"+
    "\11\102\13\0\3\103\1\0\11\103\13\0\3\104\1\0"+
    "\11\104\13\0\3\105\1\0\11\105\13\0\3\106\1\0"+
    "\11\106\13\0\3\107\1\0\11\107\13\0\3\110\1\0"+
    "\11\110\13\0\3\111\1\0\11\111\13\0\3\112\1\0"+
    "\11\112\13\0\3\113\1\0\11\113\13\0\3\114\1\0"+
    "\11\114\13\0\3\115\1\0\11\115\13\0\3\116\1\0"+
    "\11\116\13\0\3\117\1\0\11\117\13\0\3\120\1\0"+
    "\11\120\13\0\3\121\1\0\11\121\13\0\3\122\1\0"+
    "\11\122\13\0\3\123\1\0\11\123\13\0\3\124\1\0"+
    "\11\124\13\0\3\125\1\0\11\125\13\0\3\126\1\0"+
    "\11\126\13\0\3\127\1\0\11\127\13\0\3\130\1\0"+
    "\11\130\13\0\3\131\1\0\11\131\13\0\3\132\1\0"+
    "\11\132\13\0\3\133\1\0\11\133\13\0\3\134\1\0"+
    "\11\134\13\0\3\135\1\0\11\135\13\0\3\136\1\0"+
    "\11\136\13\0\3\137\1\0\11\137\13\0\3\140\1\0"+
    "\11\140\13\0\3\141\1\0\11\141\13\0\3\142\1\0"+
    "\11\142\13\0\3\143\1\0\11\143\13\0\3\144\1\0"+
    "\11\144\13\0\3\145\1\0\11\145\13\0\3\146\1\0"+
    "\11\146\13\0\3\147\1\0\11\147\13\0\3\150\1\0"+
    "\11\150\13\0\3\151\1\0\11\151\13\0\3\152\1\0"+
    "\11\152\13\0\3\153\1\0\11\153\13\0\3\154\1\0"+
    "\11\154\13\0\3\155\1\0\11\155\13\0\3\156\1\0"+
    "\11\156\13\0\3\157\1\0\11\157\13\0\3\160\1\0"+
    "\11\160\13\0\3\161\1\0\11\161\13\0\3\162\1\0"+
    "\11\162\13\0\3\163\1\0\11\163\13\0\3\164\1\0"+
    "\11\164\13\0\3\165\1\0\11\165\13\0\3\166\1\0"+
    "\11\166\13\0\3\167\1\0\11\167\13\0\3\170\1\0"+
    "\11\170\13\0\3\171\1\0\11\171\13\0\3\172\1\0"+
    "\11\172\13\0\3\173\1\0\11\173\13\0\3\174\1\0"+
    "\11\174\13\0\3\175\1\0\11\175\13\0\3\176\1\0"+
    "\11\176\13\0\3\177\1\0\11\177\13\0\3\200\1\0"+
    "\11\200\13\0\3\201\1\0\11\201\13\0\3\202\1\0"+
    "\11\202\13\0\3\203\1\0\11\203\13\0\3\204\1\0"+
    "\11\204\13\0\3\205\1\0\11\205\13\0\3\206\1\0"+
    "\11\206\13\0\3\207\1\0\11\207\13\0\3\210\1\0"+
    "\11\210\13\0\3\211\1\0\11\211\13\0\3\212\1\0"+
    "\11\212\13\0\3\213\1\0\11\213\13\0\3\214\1\0"+
    "\11\214\13\0\3\215\1\0\11\215\13\0\3\216\1\0"+
    "\11\216\13\0\3\217\1\0\11\217\13\0\3\220\1\0"+
    "\11\220\13\0\3\221\1\0\11\221\13\0\3\222\1\0"+
    "\11\222\13\0\3\223\1\0\11\223\13\0\3\224\1\0"+
    "\11\224\13\0\3\225\1\0\11\225\13\0\3\226\1\0"+
    "\11\226\13\0\3\227\1\0\11\227\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3336];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\5\1\2\11\4\1\2\0"+
    "\5\1\1\11\1\1\1\0\175\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[151];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
private Symbol token(int type, Object value)
{
    return new Symbol(type, yyline, yycolumn, value);
}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 120) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { throw new RuntimeException("Caracter inválido " + yytext());
            }
          case 10: break;
          case 2: 
            { /*Omitir el espacio blanco*/
            }
          case 11: break;
          case 3: 
            { return token(sym.ENTERO, yytext());
            }
          case 12: break;
          case 4: 
            { return token(sym.SUMA, yytext());
            }
          case 13: break;
          case 5: 
            { return token(sym.COMMENT, yytext());
            }
          case 14: break;
          case 6: 
            { return token(sym.ID, yytext());
            }
          case 15: break;
          case 7: 
            { return token(sym.IF,yytext());
            }
          case 16: break;
          case 8: 
            { return token(sym.AND, yytext());
            }
          case 17: break;
          case 9: 
            { return token(sym.THEN, yytext());
            }
          case 18: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}