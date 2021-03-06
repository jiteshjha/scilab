/* The following code was generated by JFlex 1.6.1 */

//CHECKSTYLE:OFF

package org.scilab.modules.scinotes;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;

@javax.annotation.Generated("JFlex")
@SuppressWarnings("fallthrough")

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>../../../../jflex/function.jflex</tt>
 */
public final class FunctionScanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int FUNCTION = 2;
  public static final int TYPEID = 4;
  public static final int FUNNAME = 6;
  public static final int RETS = 8;
  public static final int ARGS = 10;
  public static final int BROKEN = 12;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6, 6
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\2\1\4\1\4\1\4\22\0\1\1\1\10\1\0"+
    "\2\10\1\6\2\0\1\25\1\12\2\0\1\26\1\0\1\5\1\3"+
    "\12\7\3\0\1\11\1\0\1\10\1\0\32\10\1\22\1\0\1\27"+
    "\1\0\1\10\1\0\2\10\1\16\1\24\1\23\1\13\2\10\1\20"+
    "\4\10\1\15\1\21\4\10\1\17\1\14\5\10\12\0\1\4\u1fa2\0"+
    "\1\4\1\4\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\7\0\4\1\1\2\1\3\1\4\1\5\1\1\1\6"+
    "\1\7\1\1\1\10\1\1\1\11\1\12\1\4\1\13"+
    "\1\4\2\1\1\14\1\1\1\15\1\0\1\15\13\0"+
    "\1\16\5\0\1\17\1\0\1\20\15\0\1\21\2\0"+
    "\2\22";

  private static int [] zzUnpackAction() {
    int [] result = new int[71];
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
    "\0\0\0\30\0\60\0\110\0\140\0\170\0\220\0\250"+
    "\0\300\0\330\0\360\0\u0108\0\250\0\u0120\0\250\0\u0138"+
    "\0\u0150\0\250\0\u0168\0\250\0\u0180\0\u0198\0\250\0\u01b0"+
    "\0\u01c8\0\250\0\u01e0\0\u01f8\0\u0210\0\u0228\0\u0240\0\u0240"+
    "\0\u0258\0\300\0\330\0\u0270\0\u0288\0\u02a0\0\u0138\0\u02b8"+
    "\0\u0168\0\u0180\0\u02d0\0\u01e0\0\u02e8\0\u0300\0\u0228\0\u0258"+
    "\0\u0318\0\u0330\0\u0348\0\u0360\0\250\0\u0378\0\u0348\0\u0390"+
    "\0\u03a8\0\u03c0\0\u03d8\0\u03f0\0\u0408\0\u0420\0\u0438\0\u0450"+
    "\0\u0468\0\u0480\0\u0498\0\u04b0\0\u04c8\0\u04e0\0\250";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[71];
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
    "\1\10\1\11\2\10\1\0\6\10\1\12\7\10\1\13"+
    "\10\10\1\0\1\10\1\14\1\10\1\14\2\10\7\14"+
    "\1\15\2\14\4\10\1\16\1\17\1\20\1\0\4\10"+
    "\1\21\13\10\1\22\3\10\1\23\1\24\1\25\1\0"+
    "\1\10\1\26\1\10\1\26\2\10\7\26\1\10\2\26"+
    "\1\27\3\10\1\30\2\10\1\0\1\10\1\31\1\10"+
    "\1\31\2\10\7\31\1\10\2\31\1\10\1\32\1\33"+
    "\1\10\1\30\2\10\1\0\1\34\1\35\1\10\1\35"+
    "\1\10\1\36\7\35\1\10\2\35\1\10\1\32\1\10"+
    "\4\37\1\40\1\41\22\37\31\0\1\42\11\0\1\43"+
    "\7\0\1\44\20\0\1\45\30\0\1\46\21\0\2\14"+
    "\2\0\7\14\1\0\2\14\4\0\1\16\1\17\1\47"+
    "\5\0\1\21\21\0\1\50\25\0\1\21\27\0\1\51"+
    "\1\24\1\52\21\0\1\27\5\0\1\53\33\0\2\26"+
    "\2\0\7\26\1\0\2\26\4\0\1\30\35\0\2\31"+
    "\2\0\7\31\1\0\2\31\4\0\1\54\7\0\1\55"+
    "\23\0\1\56\31\0\2\35\2\0\7\35\1\0\2\35"+
    "\4\0\1\57\1\24\1\52\24\0\5\40\1\60\27\40"+
    "\1\56\22\40\15\0\1\61\27\0\1\62\36\0\1\63"+
    "\3\0\2\50\1\17\1\50\1\0\23\50\2\53\1\24"+
    "\1\53\1\0\23\53\1\0\1\55\27\0\1\64\1\65"+
    "\1\66\1\0\1\56\46\0\1\67\21\0\1\70\24\0"+
    "\1\71\15\0\1\64\1\65\1\66\27\0\1\72\43\0"+
    "\1\73\24\0\1\74\13\0\2\72\1\65\1\72\1\0"+
    "\23\72\20\0\1\75\24\0\1\76\33\0\1\77\24\0"+
    "\1\100\26\0\1\101\31\0\1\102\11\0\1\103\20\0"+
    "\1\15\25\0\1\104\10\0\1\103\47\0\1\105\23\0"+
    "\1\106\12\0\7\107\2\0\2\107\7\0\1\107\2\0"+
    "\3\107";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1272];
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
    "\7\0\1\11\4\1\1\11\1\1\1\11\2\1\1\11"+
    "\1\1\1\11\2\1\1\11\2\1\1\11\5\1\1\0"+
    "\1\1\13\0\1\1\5\0\1\1\1\0\1\11\15\0"+
    "\1\1\2\0\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[71];
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
    List<String> returnValues;
    List<String> argsValues;
    String functionName;
    int end;
    int start;

    private ScilabDocument doc;
    private String id;
    private MatchingBlockScanner matchBlock;

    public FunctionScanner(ScilabDocument doc) {
        this.doc = doc;
        returnValues = new ArrayList();
        argsValues = new ArrayList();
	this.matchBlock = new MatchingBlockScanner(doc);
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<String> getReturnValues() {
        return returnValues;
    }

    public List<String> getArgsValues() {
        return argsValues;
    }

    public int getLineType(int p0, int p1) {
        try {
            returnValues = new ArrayList();
            argsValues = new ArrayList();
	    start = p0;
            end = p1;
            yyreset(new ScilabDocumentReader(doc, p0, p1));
            yybegin(BROKEN);
            int broken = yylex();

            yyreset(new ScilabDocumentReader(doc, p0, p1));
            while (true) {
                int ret = yylex();
                if (ret != ScilabDocument.ScilabLeafElement.BROKEN) {
                   return ret | broken;
                }
                Element elem = doc.getDefaultRootElement();
                elem = elem.getElement(elem.getElementIndex(end + 1));
                end = elem.getEndOffset();
                yyreset(new ScilabDocumentReader(doc, elem.getStartOffset(), end));
                yybegin(ARGS);
            }
        } catch (IOException e) {
            return ScilabDocument.ScilabLeafElement.NOTHING;
        }
    }

    public FunctionInfo getFunctionInfo() {
        return new FunctionInfo(functionName, returnValues, argsValues);
    }

    public class FunctionInfo {
        public String functionName;
        public List<String> returnValues;
        public List<String> argsValues;

        public FunctionInfo(String name, List ret, List args) {
            this.functionName = name;
            this.returnValues = ret;
            this.argsValues = args;
        }
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public FunctionScanner(java.io.Reader in) {
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
    while (i < 138) {
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
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

      yychar+= zzMarkedPosL-zzStartRead;

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
          {   return ScilabDocument.ScilabLeafElement.NOTHING;
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return ScilabDocument.ScilabLeafElement.NOTHING;
            }
          case 19: break;
          case 2: 
            { id = yytext();
                                   yybegin(TYPEID);
            }
          case 20: break;
          case 3: 
            { yybegin(RETS);
            }
          case 21: break;
          case 4: 
            { 
            }
          case 22: break;
          case 5: 
            { functionName = id;
                                   return ScilabDocument.ScilabLeafElement.FUN;
            }
          case 23: break;
          case 6: 
            { returnValues.add(id);
                                   yybegin(FUNNAME);
            }
          case 24: break;
          case 7: 
            { functionName = id;
                                   yybegin(ARGS);
            }
          case 25: break;
          case 8: 
            { return ScilabDocument.ScilabLeafElement.FUN;
            }
          case 26: break;
          case 9: 
            { functionName = yytext();
            }
          case 27: break;
          case 10: 
            { yybegin(ARGS);
            }
          case 28: break;
          case 11: 
            { returnValues.add(yytext());
            }
          case 29: break;
          case 12: 
            { argsValues.add(yytext());
            }
          case 30: break;
          case 13: 
            { return 0;
            }
          case 31: break;
          case 14: 
            { yybegin(FUNNAME);
            }
          case 32: break;
          case 15: 
            { MatchingBlockScanner.MatchingPositions pos = matchBlock.getMatchingBlock(start + yychar + yylength(), false);
				   if (pos != null) {
				      try {
				      	 String match = doc.getText(pos.secondB, pos.secondE - pos.secondB);
				      	 if (match.equals("function")) {
					    return ScilabDocument.ScilabLeafElement.ENDFUN;
					 }
				      } catch (BadLocationException e) { }
				   }
            }
          case 33: break;
          case 16: 
            { return ScilabDocument.ScilabLeafElement.BROKEN;
            }
          case 34: break;
          case 17: 
            { yybegin(FUNCTION);
            }
          case 35: break;
          case 18: 
            { return ScilabDocument.ScilabLeafElement.ENDFUN;
            }
          case 36: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
