/* The following code was generated by JFlex 1.4.3 on 27/11/24 21:33 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 27/11/24 21:33 from the specification file
 * <tt>C:/Users/yei-1/Dropbox/PC/Desktop/College/2024-Semestre-2/Compiladores-e-Interpretes/Proyectos/Parte3-Semantico/Compilador/src/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\2\1\35\2\64\1\65\22\0\1\2\1\56\1\34\1\41"+
    "\1\0\1\56\1\63\1\37\1\54\1\54\1\53\1\55\1\2\1\51"+
    "\1\47\1\52\1\40\7\44\2\33\1\54\1\54\1\61\1\57\1\60"+
    "\1\54\1\0\4\46\1\50\1\46\5\1\1\43\10\1\1\42\2\1"+
    "\1\45\2\1\1\54\1\36\1\54\1\56\1\1\1\0\1\3\1\7"+
    "\1\13\1\20\1\11\1\21\1\25\1\15\1\17\1\1\1\12\1\22"+
    "\1\23\1\16\1\6\1\31\1\1\1\10\1\14\1\5\1\4\1\32"+
    "\1\27\1\24\1\30\1\26\1\54\1\62\1\54\1\54\6\0\1\64"+
    "\u1fa2\0\2\64\udfd6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\17\2\1\4\1\1\1\5"+
    "\1\6\1\4\1\1\12\7\17\2\2\10\6\2\1\0"+
    "\1\11\3\4\1\1\2\0\1\12\1\13\1\0\1\6"+
    "\2\0\1\11\1\0\1\14\1\15\1\16\1\0\1\3"+
    "\1\0\30\2\2\0\3\11\6\4\1\1\1\17\1\20"+
    "\1\0\1\6\1\0\1\21\3\22\1\0\3\14\1\0"+
    "\16\2\1\0\1\1\1\0\1\11\1\17\2\0\1\22"+
    "\3\14\1\23\1\0\7\2\1\0\1\24\2\0\1\24"+
    "\2\11\1\25\1\0\1\25\1\0\2\22\2\2\1\26";

  private static int [] zzUnpackAction() {
    int [] result = new int[180];
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
    "\0\0\0\66\0\154\0\242\0\330\0\u010e\0\u0144\0\u017a"+
    "\0\u01b0\0\u01e6\0\u021c\0\u0252\0\u0288\0\u02be\0\u02f4\0\u032a"+
    "\0\u0360\0\u0396\0\u03cc\0\u0402\0\u0438\0\66\0\u046e\0\u04a4"+
    "\0\u04da\0\u0510\0\u0546\0\u057c\0\u05b2\0\66\0\u05e8\0\u061e"+
    "\0\u0654\0\u068a\0\u06c0\0\u06f6\0\u072c\0\u0762\0\u0798\0\u07ce"+
    "\0\u0804\0\u083a\0\u0870\0\u08a6\0\u08dc\0\u0912\0\u0948\0\u097e"+
    "\0\u09b4\0\u09ea\0\154\0\u0a20\0\u0a56\0\u0a8c\0\u0ac2\0\u0af8"+
    "\0\u0b2e\0\u0b64\0\u0b9a\0\u0bd0\0\u0c06\0\u0c3c\0\u0c72\0\u0ca8"+
    "\0\u0438\0\u0cde\0\66\0\u0d14\0\u0d4a\0\u0d80\0\u0db6\0\u0dec"+
    "\0\u0e22\0\u0e58\0\u0e8e\0\u04da\0\u0510\0\u0ec4\0\u0efa\0\u0f30"+
    "\0\u0f66\0\u0f9c\0\u0fd2\0\u1008\0\u103e\0\u1074\0\u10aa\0\u10e0"+
    "\0\u1116\0\u114c\0\u1182\0\u11b8\0\u11ee\0\u1224\0\u125a\0\u1290"+
    "\0\u12c6\0\u12fc\0\u1332\0\u1368\0\u139e\0\u13d4\0\u140a\0\u1440"+
    "\0\u1476\0\u14ac\0\u14e2\0\u1518\0\u154e\0\u1584\0\u14e2\0\u15ba"+
    "\0\u15f0\0\u1626\0\u165c\0\u1692\0\u16c8\0\66\0\u0d14\0\u16fe"+
    "\0\u1734\0\66\0\u176a\0\u17a0\0\u17d6\0\u180c\0\u1842\0\u1878"+
    "\0\u18ae\0\u18e4\0\u191a\0\u1950\0\u1986\0\u19bc\0\u19f2\0\u1a28"+
    "\0\u1a5e\0\u1a94\0\u1aca\0\u1b00\0\u1b36\0\u1b6c\0\u1ba2\0\u1bd8"+
    "\0\u1c0e\0\u1c44\0\u1c7a\0\u1cb0\0\u1ce6\0\u1d1c\0\u1d52\0\u1d88"+
    "\0\u1dbe\0\u14e2\0\u1df4\0\66\0\u1e2a\0\u1e60\0\u1e96\0\u1ecc"+
    "\0\u1f02\0\u1f38\0\u1f6e\0\u1fa4\0\u1fda\0\66\0\u2010\0\u2046"+
    "\0\u207c\0\u20b2\0\u20e8\0\u211e\0\u211e\0\u2154\0\u218a\0\u21c0"+
    "\0\u21f6\0\u222c\0\u2262\0\66";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[180];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\3\1\10"+
    "\1\11\1\12\1\3\1\13\1\14\2\3\1\15\1\16"+
    "\1\17\1\20\2\3\1\21\1\3\1\22\2\3\1\23"+
    "\1\24\1\25\1\26\1\2\1\27\1\30\1\31\2\3"+
    "\1\24\2\3\1\32\1\3\1\33\1\34\1\35\1\36"+
    "\1\37\2\35\1\40\1\41\1\42\1\43\1\2\1\4"+
    "\67\0\1\3\1\0\31\3\4\0\1\3\1\0\5\3"+
    "\1\0\1\3\17\0\1\4\62\0\1\4\1\0\1\3"+
    "\1\0\1\3\1\44\27\3\4\0\1\3\1\0\5\3"+
    "\1\0\1\3\16\0\1\3\1\0\13\3\1\45\15\3"+
    "\4\0\1\3\1\0\5\3\1\0\1\3\16\0\1\3"+
    "\1\0\25\3\1\46\3\3\4\0\1\3\1\0\5\3"+
    "\1\0\1\3\16\0\1\3\1\0\5\3\1\47\23\3"+
    "\4\0\1\3\1\0\5\3\1\0\1\3\16\0\1\3"+
    "\1\0\6\3\1\50\22\3\4\0\1\3\1\0\5\3"+
    "\1\0\1\3\16\0\1\3\1\0\13\3\1\51\3\3"+
    "\1\52\1\3\1\53\7\3\4\0\1\3\1\0\5\3"+
    "\1\0\1\3\16\0\1\3\1\0\1\52\2\3\1\54"+
    "\6\3\1\55\16\3\4\0\1\3\1\0\5\3\1\0"+
    "\1\3\16\0\1\3\1\0\2\3\1\56\7\3\1\57"+
    "\1\3\1\60\7\3\1\61\4\3\4\0\1\3\1\0"+
    "\5\3\1\0\1\3\16\0\1\3\1\0\13\3\1\62"+
    "\2\3\1\63\12\3\4\0\1\3\1\0\5\3\1\0"+
    "\1\3\16\0\1\3\1\0\3\3\1\64\2\3\1\65"+
    "\22\3\4\0\1\3\1\0\5\3\1\0\1\3\16\0"+
    "\1\3\1\0\3\3\1\66\13\3\1\67\11\3\4\0"+
    "\1\3\1\0\5\3\1\0\1\3\16\0\1\3\1\0"+
    "\3\3\1\70\25\3\4\0\1\3\1\0\5\3\1\0"+
    "\1\3\16\0\1\3\1\0\3\3\1\44\25\3\4\0"+
    "\1\3\1\0\5\3\1\0\1\3\16\0\1\3\1\0"+
    "\12\3\1\71\16\3\4\0\1\3\1\0\5\3\1\0"+
    "\1\3\16\0\1\3\1\0\3\3\1\72\25\3\4\0"+
    "\1\3\1\0\5\3\1\0\1\3\15\0\1\73\1\74"+
    "\1\73\1\74\1\75\15\74\1\76\10\74\1\77\1\73"+
    "\1\0\2\73\1\77\1\73\1\75\1\76\1\77\2\74"+
    "\1\100\1\74\15\73\16\101\1\102\15\101\1\103\1\104"+
    "\1\105\27\101\16\106\1\107\17\106\1\110\1\0\26\106"+
    "\1\73\1\74\1\73\1\74\1\75\15\74\1\76\1\74"+
    "\1\111\6\74\1\112\1\73\1\0\2\73\1\113\1\73"+
    "\1\75\1\76\1\113\1\111\1\74\1\100\1\74\15\73"+
    "\33\0\1\114\4\0\1\114\3\0\1\114\54\0\1\115"+
    "\4\0\1\115\3\0\1\115\54\0\1\116\4\0\1\116"+
    "\3\0\1\116\4\0\1\36\5\0\2\36\57\0\1\117"+
    "\1\120\3\0\1\36\65\0\1\36\63\0\1\36\1\0"+
    "\1\36\65\0\1\36\1\35\64\0\1\36\1\0\1\35"+
    "\63\0\1\36\2\0\1\36\62\0\1\36\3\0\1\36"+
    "\3\0\1\3\1\0\2\3\1\121\26\3\4\0\1\3"+
    "\1\0\5\3\1\0\1\3\16\0\1\3\1\0\11\3"+
    "\1\122\2\3\1\123\14\3\4\0\1\3\1\0\5\3"+
    "\1\0\1\3\16\0\1\3\1\0\26\3\1\124\2\3"+
    "\4\0\1\3\1\0\5\3\1\0\1\3\16\0\1\3"+
    "\1\0\6\3\1\125\22\3\4\0\1\3\1\0\5\3"+
    "\1\0\1\3\16\0\1\3\1\0\2\3\1\126\17\3"+
    "\1\127\6\3\4\0\1\3\1\0\5\3\1\0\1\3"+
    "\16\0\1\3\1\0\1\3\1\130\27\3\4\0\1\3"+
    "\1\0\5\3\1\0\1\3\16\0\1\3\1\0\11\3"+
    "\1\131\17\3\4\0\1\3\1\0\5\3\1\0\1\3"+
    "\16\0\1\3\1\0\2\3\1\132\26\3\4\0\1\3"+
    "\1\0\5\3\1\0\1\3\16\0\1\3\1\0\13\3"+
    "\1\133\15\3\4\0\1\3\1\0\5\3\1\0\1\3"+
    "\16\0\1\3\1\0\1\66\30\3\4\0\1\3\1\0"+
    "\5\3\1\0\1\3\16\0\1\3\1\0\1\134\4\3"+
    "\1\135\23\3\4\0\1\3\1\0\5\3\1\0\1\3"+
    "\16\0\1\3\1\0\3\3\1\136\25\3\4\0\1\3"+
    "\1\0\5\3\1\0\1\3\16\0\1\3\1\0\22\3"+
    "\1\137\1\140\5\3\4\0\1\3\1\0\5\3\1\0"+
    "\1\3\16\0\1\3\1\0\14\3\1\141\14\3\4\0"+
    "\1\3\1\0\5\3\1\0\1\3\16\0\1\3\1\0"+
    "\2\3\1\63\26\3\4\0\1\3\1\0\5\3\1\0"+
    "\1\3\16\0\1\3\1\0\1\3\1\142\27\3\4\0"+
    "\1\3\1\0\5\3\1\0\1\3\16\0\1\3\1\0"+
    "\16\3\1\143\12\3\4\0\1\3\1\0\5\3\1\0"+
    "\1\3\16\0\1\3\1\0\5\3\1\63\23\3\4\0"+
    "\1\3\1\0\5\3\1\0\1\3\16\0\1\3\1\0"+
    "\3\3\1\144\25\3\4\0\1\3\1\0\5\3\1\0"+
    "\1\3\16\0\1\3\1\0\13\3\1\145\15\3\4\0"+
    "\1\3\1\0\5\3\1\0\1\3\16\0\1\3\1\0"+
    "\14\3\1\146\14\3\4\0\1\3\1\0\5\3\1\0"+
    "\1\3\16\0\1\3\1\0\14\3\1\147\2\3\1\150"+
    "\11\3\4\0\1\3\1\0\5\3\1\0\1\3\50\0"+
    "\1\151\4\0\1\151\3\0\1\151\3\0\1\152\16\0"+
    "\1\153\1\0\30\153\1\154\4\0\1\154\1\0\2\153"+
    "\1\154\2\153\1\0\1\155\16\0\1\153\1\0\17\153"+
    "\1\156\10\153\1\154\4\0\1\154\1\0\1\153\1\156"+
    "\1\154\2\153\1\0\1\155\16\0\1\153\1\0\1\153"+
    "\1\157\15\153\1\160\10\153\1\154\4\0\1\154\1\0"+
    "\1\157\1\160\1\154\2\153\1\0\1\155\16\0\1\153"+
    "\1\0\1\153\1\161\15\153\1\162\10\153\1\163\4\0"+
    "\1\163\1\0\1\161\1\162\1\163\2\153\1\164\1\155"+
    "\50\0\1\165\4\0\1\165\3\0\1\165\3\0\1\152"+
    "\15\0\34\102\1\103\1\166\1\105\27\102\16\167\1\0"+
    "\15\167\1\0\1\104\1\0\27\167\35\102\1\0\30\102"+
    "\16\170\1\0\17\170\1\171\1\172\26\170\37\0\1\172"+
    "\26\0\5\170\1\107\2\170\1\107\5\170\1\107\17\170"+
    "\2\106\1\107\25\170\1\0\1\153\1\0\1\173\3\153"+
    "\1\173\1\153\1\173\1\153\1\173\4\153\2\173\11\153"+
    "\1\174\4\0\1\174\1\0\2\153\1\174\1\153\1\173"+
    "\1\0\1\175\16\0\1\153\1\0\30\153\1\176\4\0"+
    "\1\176\1\0\2\153\1\176\2\153\1\164\1\155\16\0"+
    "\1\153\1\0\1\153\1\177\15\153\1\200\10\153\1\176"+
    "\4\0\1\201\1\0\1\177\1\200\1\201\2\153\1\164"+
    "\1\155\15\0\35\73\1\0\30\73\35\117\1\0\30\117"+
    "\53\120\1\202\12\120\1\0\1\3\1\0\3\3\1\63"+
    "\25\3\4\0\1\3\1\0\5\3\1\0\1\3\16\0"+
    "\1\3\1\0\14\3\1\203\14\3\4\0\1\3\1\0"+
    "\5\3\1\0\1\3\16\0\1\3\1\0\3\3\1\204"+
    "\25\3\4\0\1\3\1\0\5\3\1\0\1\3\16\0"+
    "\1\3\1\0\6\3\1\205\22\3\4\0\1\3\1\0"+
    "\5\3\1\0\1\3\16\0\1\3\1\0\1\206\30\3"+
    "\4\0\1\3\1\0\5\3\1\0\1\3\16\0\1\3"+
    "\1\0\1\3\1\207\27\3\4\0\1\3\1\0\5\3"+
    "\1\0\1\3\16\0\1\3\1\0\14\3\1\210\14\3"+
    "\4\0\1\3\1\0\5\3\1\0\1\3\16\0\1\3"+
    "\1\0\20\3\1\63\10\3\4\0\1\3\1\0\5\3"+
    "\1\0\1\3\16\0\1\3\1\0\6\3\1\63\22\3"+
    "\4\0\1\3\1\0\5\3\1\0\1\3\16\0\1\3"+
    "\1\0\6\3\1\207\22\3\4\0\1\3\1\0\5\3"+
    "\1\0\1\3\16\0\1\3\1\0\2\3\1\211\6\3"+
    "\1\62\17\3\4\0\1\3\1\0\5\3\1\0\1\3"+
    "\16\0\1\3\1\0\2\3\1\212\26\3\4\0\1\3"+
    "\1\0\5\3\1\0\1\3\16\0\1\3\1\0\1\3"+
    "\1\213\27\3\4\0\1\3\1\0\5\3\1\0\1\3"+
    "\16\0\1\3\1\0\5\3\1\62\23\3\4\0\1\3"+
    "\1\0\5\3\1\0\1\3\16\0\1\3\1\0\13\3"+
    "\1\214\15\3\4\0\1\3\1\0\5\3\1\0\1\3"+
    "\16\0\1\3\1\0\6\3\1\215\22\3\4\0\1\3"+
    "\1\0\5\3\1\0\1\3\16\0\1\3\1\0\2\3"+
    "\1\216\26\3\4\0\1\3\1\0\5\3\1\0\1\3"+
    "\16\0\1\3\1\0\4\3\1\146\24\3\4\0\1\3"+
    "\1\0\5\3\1\0\1\3\16\0\1\3\1\0\1\217"+
    "\30\3\4\0\1\3\1\0\5\3\1\0\1\3\16\0"+
    "\1\3\1\0\1\62\30\3\4\0\1\3\1\0\5\3"+
    "\1\0\1\3\16\0\1\3\1\0\22\3\1\63\6\3"+
    "\4\0\1\3\1\0\5\3\1\0\1\3\16\0\1\3"+
    "\1\0\17\3\1\131\11\3\4\0\1\3\1\0\5\3"+
    "\1\0\1\3\16\0\1\3\1\0\15\3\1\63\13\3"+
    "\4\0\1\3\1\0\5\3\1\0\1\3\16\0\1\3"+
    "\1\0\1\220\30\3\4\0\1\3\1\0\5\3\1\0"+
    "\1\3\50\0\1\151\4\0\1\151\3\0\1\151\3\0"+
    "\1\221\50\0\1\222\10\0\1\222\4\0\1\223\15\0"+
    "\1\153\1\0\31\153\4\0\1\153\1\0\5\153\1\0"+
    "\1\153\16\0\1\153\1\0\30\153\1\154\4\0\1\154"+
    "\1\0\2\153\1\154\2\153\1\0\1\224\16\0\1\153"+
    "\1\0\31\153\4\0\1\153\1\0\5\153\1\0\1\153"+
    "\1\223\15\0\1\153\1\0\17\153\1\157\11\153\4\0"+
    "\1\153\1\0\1\153\1\157\3\153\1\0\1\153\16\0"+
    "\1\153\1\0\1\153\1\157\27\153\4\0\1\153\1\0"+
    "\1\157\4\153\1\0\1\153\16\0\1\153\1\0\17\153"+
    "\1\156\11\153\4\0\1\153\1\0\1\153\1\156\3\153"+
    "\1\0\1\153\16\0\1\153\1\0\1\153\1\157\15\153"+
    "\1\160\11\153\4\0\1\153\1\0\1\157\1\160\3\153"+
    "\1\0\1\153\16\0\1\153\1\0\1\153\1\161\15\153"+
    "\1\162\10\153\1\163\4\0\1\163\1\0\1\161\1\162"+
    "\1\163\2\153\1\164\1\224\50\0\1\225\4\0\1\225"+
    "\3\0\1\225\32\0\1\226\21\0\1\165\4\0\1\165"+
    "\3\0\1\165\3\0\1\227\15\0\16\170\1\0\17\170"+
    "\1\171\1\0\33\170\1\0\2\170\1\0\5\170\1\0"+
    "\21\170\1\0\25\170\1\0\1\153\1\0\1\173\3\153"+
    "\1\173\1\153\1\173\1\153\1\173\4\153\2\173\11\153"+
    "\1\173\4\0\1\173\1\0\2\153\1\173\1\153\1\173"+
    "\1\0\1\173\16\0\1\153\1\0\1\173\3\153\1\173"+
    "\1\153\1\173\1\153\1\173\4\153\2\173\11\153\1\174"+
    "\4\0\1\174\1\0\2\153\1\174\1\153\1\173\1\0"+
    "\1\230\16\0\1\153\1\0\1\173\3\153\1\173\1\153"+
    "\1\173\1\153\1\173\4\153\2\173\11\153\1\173\4\0"+
    "\1\173\1\0\2\153\1\173\1\153\1\173\1\0\1\173"+
    "\1\223\15\0\1\153\1\0\30\153\1\176\4\0\1\176"+
    "\1\0\2\153\1\176\2\153\1\164\1\224\16\0\1\153"+
    "\1\0\17\153\1\231\11\153\4\0\1\153\1\0\1\153"+
    "\1\231\3\153\1\0\1\153\16\0\1\153\1\0\1\153"+
    "\1\232\15\153\1\233\11\153\4\0\1\153\1\0\1\232"+
    "\1\233\3\153\1\0\1\153\16\0\1\153\1\0\1\153"+
    "\1\177\15\153\1\200\10\153\1\176\4\0\1\201\1\0"+
    "\1\177\1\200\1\201\2\153\1\164\1\224\15\0\52\120"+
    "\1\234\1\235\12\120\1\0\1\3\1\0\22\3\1\137"+
    "\6\3\4\0\1\3\1\0\5\3\1\0\1\3\16\0"+
    "\1\3\1\0\13\3\1\63\15\3\4\0\1\3\1\0"+
    "\5\3\1\0\1\3\16\0\1\3\1\0\15\3\1\236"+
    "\13\3\4\0\1\3\1\0\5\3\1\0\1\3\16\0"+
    "\1\3\1\0\7\3\1\63\21\3\4\0\1\3\1\0"+
    "\5\3\1\0\1\3\16\0\1\3\1\0\5\3\1\204"+
    "\23\3\4\0\1\3\1\0\5\3\1\0\1\3\16\0"+
    "\1\3\1\0\11\3\1\237\17\3\4\0\1\3\1\0"+
    "\5\3\1\0\1\3\16\0\1\3\1\0\14\3\1\240"+
    "\14\3\4\0\1\3\1\0\5\3\1\0\1\3\16\0"+
    "\1\3\1\0\14\3\1\241\14\3\4\0\1\3\1\0"+
    "\5\3\1\0\1\3\16\0\1\3\1\0\10\3\1\62"+
    "\20\3\4\0\1\3\1\0\5\3\1\0\1\3\16\0"+
    "\1\3\1\0\6\3\1\147\22\3\4\0\1\3\1\0"+
    "\5\3\1\0\1\3\16\0\1\3\1\0\3\3\1\242"+
    "\25\3\4\0\1\3\1\0\5\3\1\0\1\3\16\0"+
    "\1\3\1\0\10\3\1\243\20\3\4\0\1\3\1\0"+
    "\5\3\1\0\1\3\16\0\1\3\1\0\1\3\1\244"+
    "\27\3\4\0\1\3\1\0\5\3\1\0\1\3\16\0"+
    "\1\3\1\0\2\3\1\71\26\3\4\0\1\3\1\0"+
    "\5\3\1\0\1\3\50\0\1\245\1\0\1\246\6\0"+
    "\1\245\3\0\1\247\1\250\12\0\1\246\1\251\33\0"+
    "\1\222\4\0\1\222\3\0\1\222\54\0\1\222\10\0"+
    "\1\222\22\0\1\153\1\0\30\153\1\252\1\0\1\246"+
    "\2\0\1\153\1\0\2\153\1\252\2\153\1\0\1\253"+
    "\1\250\12\0\1\246\1\251\11\0\1\226\21\0\1\225"+
    "\4\0\1\225\3\0\1\225\3\0\1\226\50\0\1\254"+
    "\4\0\1\254\3\0\1\254\4\0\1\255\3\0\1\255"+
    "\43\0\1\256\1\0\1\246\2\0\1\254\3\0\1\256"+
    "\3\0\1\247\1\257\3\0\1\255\6\0\1\246\1\251"+
    "\1\0\1\153\1\0\1\173\3\153\1\173\1\153\1\173"+
    "\1\153\1\173\4\153\2\173\11\153\1\260\1\0\1\246"+
    "\2\0\1\173\1\0\2\153\1\260\1\153\1\173\1\0"+
    "\1\261\1\250\12\0\1\246\1\251\1\0\1\153\1\0"+
    "\17\153\1\232\11\153\4\0\1\153\1\0\1\153\1\232"+
    "\3\153\1\0\1\153\16\0\1\153\1\0\1\153\1\232"+
    "\27\153\4\0\1\153\1\0\1\232\4\153\1\0\1\153"+
    "\15\0\52\120\1\0\1\235\12\120\1\0\1\3\1\0"+
    "\6\3\1\242\22\3\4\0\1\3\1\0\5\3\1\0"+
    "\1\3\16\0\1\3\1\0\2\3\1\262\26\3\4\0"+
    "\1\3\1\0\5\3\1\0\1\3\16\0\1\3\1\0"+
    "\13\3\1\263\15\3\4\0\1\3\1\0\5\3\1\0"+
    "\1\3\16\0\1\3\1\0\10\3\1\63\20\3\4\0"+
    "\1\3\1\0\5\3\1\0\1\3\16\0\1\3\1\0"+
    "\16\3\1\63\12\3\4\0\1\3\1\0\5\3\1\0"+
    "\1\3\16\0\1\3\1\0\12\3\1\63\16\3\4\0"+
    "\1\3\1\0\5\3\1\0\1\3\16\0\1\3\1\0"+
    "\17\3\1\62\11\3\4\0\1\3\1\0\5\3\1\0"+
    "\1\3\64\0\1\222\53\0\1\246\12\0\1\247\13\0"+
    "\1\246\1\251\33\0\1\245\10\0\1\245\56\0\1\264"+
    "\31\0\1\153\1\0\31\153\4\0\1\153\1\0\5\153"+
    "\1\222\1\153\16\0\1\153\1\0\31\153\1\0\1\246"+
    "\2\0\1\153\1\0\5\153\1\0\1\253\13\0\1\246"+
    "\1\251\33\0\1\254\4\0\1\254\3\0\1\254\54\0"+
    "\1\254\4\0\1\254\3\0\1\254\2\0\1\222\51\0"+
    "\1\256\4\0\1\254\3\0\1\256\22\0\1\153\1\0"+
    "\1\173\3\153\1\173\1\153\1\173\1\153\1\173\4\153"+
    "\2\173\11\153\1\173\4\0\1\173\1\0\2\153\1\173"+
    "\1\153\1\173\1\222\1\173\16\0\1\153\1\0\1\173"+
    "\3\153\1\173\1\153\1\173\1\153\1\173\4\153\2\173"+
    "\11\153\1\173\1\0\1\246\2\0\1\173\1\0\2\153"+
    "\1\173\1\153\1\173\1\0\1\261\13\0\1\246\1\251"+
    "\1\0\1\3\1\0\6\3\1\66\22\3\4\0\1\3"+
    "\1\0\5\3\1\0\1\3\16\0\1\3\1\0\1\3"+
    "\1\131\27\3\4\0\1\3\1\0\5\3\1\0\1\3"+
    "\15\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8856];
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
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\23\1\1\11\7\1\1\11\34\1\1\0"+
    "\5\1\2\0\1\11\1\1\1\0\1\1\2\0\1\1"+
    "\1\0\3\1\1\0\1\1\1\0\30\1\2\0\13\1"+
    "\1\11\1\0\1\1\1\0\1\11\3\1\1\0\3\1"+
    "\1\0\16\1\1\0\1\1\1\0\2\1\2\0\4\1"+
    "\1\11\1\0\7\1\1\0\1\11\2\0\4\1\1\0"+
    "\1\1\1\0\4\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[180];
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

  /* user code: */
    public String lexeme;
     // Variable para llevar la cuenta de las líneas
    private int lineNumber = 1;

    // Método para obtener el número de línea actual
    public int getLineNumber() {
        return lineNumber;
    }



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 166) {
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
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
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
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public Tokens yylex() throws java.io.IOException {
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

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 16: 
          { lexeme = yytext(); return Tokens.ERROR_SALTO_LINEA;
          }
        case 23: break;
        case 4: 
          { lexeme=yytext(); return Tokens.Decimales;
          }
        case 24: break;
        case 2: 
          { lexeme=yytext(); return Tokens.Identificadores;
          }
        case 25: break;
        case 21: 
          { lexeme=yytext(); return Tokens.FlotantesExpenciales;
          }
        case 26: break;
        case 6: 
          { lexeme = yytext(); return Tokens.ERROR_CARACTER_NO_CERRADO;
          }
        case 27: break;
        case 11: 
          { lexeme = yytext(); return Tokens.ERROR_STRING_NO_CERRADO;
          }
        case 28: break;
        case 19: 
          { lineNumber += (yytext().split("\n").length - 1); /*Ignore*/
          }
        case 29: break;
        case 7: 
          { lexeme=yytext(); return Tokens.Operadores;
          }
        case 30: break;
        case 17: 
          { lexeme=yytext(); return Tokens.Caracteres;
          }
        case 31: break;
        case 10: 
          { lexeme=yytext(); return Tokens.Strings;
          }
        case 32: break;
        case 12: 
          { lexeme=yytext(); return Tokens.Octales;
          }
        case 33: break;
        case 15: 
          { lexeme=yytext(); return Tokens.Flotantes;
          }
        case 34: break;
        case 9: 
          { lexeme = yytext(); return Tokens.ERROR_IDENTIFICADOR_INVALIDO;
          }
        case 35: break;
        case 22: 
          // lookahead expression with fixed lookahead length
          yypushback(2);
          { lexeme=yytext(); return Tokens.ERROR;
          }
        case 36: break;
        case 20: 
          // lookahead expression with fixed lookahead length
          yypushback(1);
          { lexeme=yytext(); return Tokens.ERROR;
          }
        case 37: break;
        case 13: 
          { lexeme=yytext(); return Tokens.CaracteresNumericos;
          }
        case 38: break;
        case 1: 
          { lexeme=yytext(); return Tokens.ERROR;
          }
        case 39: break;
        case 18: 
          { lexeme=yytext(); return Tokens.Hexadecimales;
          }
        case 40: break;
        case 3: 
          { /*Ignore*/
          }
        case 41: break;
        case 8: 
          { lexeme=yytext(); return Tokens.Reservadas;
          }
        case 42: break;
        case 14: 
          { lexeme = yytext(); return Tokens.ERROR_NUMERO_MAL_FORMADO;
          }
        case 43: break;
        case 5: 
          { lineNumber++;
          }
        case 44: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
