/* The following code was generated by JFlex 1.4.1 on 19.02.13 15:30 */

/*
 * Copyright 2000-2009 Red Shark Technology
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.plugins.clojure.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import java.util.*;
import java.io.CharArrayReader;
import org.jetbrains.annotations.NotNull;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 19.02.13 15:30 from the specification file
 * <tt>src/org/jetbrains/plugins/clojure/lexer/clojure.flex</tt>
 */
public class _ClojureLexer implements ClojureTokenTypes, FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int SYMBOL = 1;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\1\1\0\1\3\1\1\22\0\1\2\1\53\1\50"+
    "\1\35\1\47\1\37\1\40\1\33\1\25\1\26\1\53\1\17\1\4"+
    "\1\17\1\23\1\24\1\20\2\6\1\6\1\6\2\6\1\6\2\6"+
    "\1\54\1\52\1\53\1\53\1\53\1\53\1\42\3\5\1\5\1\16"+
    "\1\5\2\13\1\13\2\13\1\13\1\10\1\7\11\13\1\21\2\13"+
    "\1\27\1\43\1\30\1\36\1\47\1\34\1\55\1\5\1\5\1\5"+
    "\1\15\1\11\2\13\1\14\2\13\1\12\1\13\1\45\3\13\1\22"+
    "\1\56\1\46\1\51\2\13\1\21\2\13\1\31\1\0\1\32\1\41"+
    "\43\0\4\44\4\0\1\44\12\0\1\44\4\0\1\44\5\0\27\44"+
    "\1\0\37\44\1\0\u013f\44\31\0\162\44\4\0\14\44\16\0\5\44"+
    "\11\0\1\44\213\0\1\44\13\0\1\44\1\0\3\44\1\0\1\44"+
    "\1\0\24\44\1\0\54\44\1\0\46\44\1\0\5\44\4\0\202\44"+
    "\10\0\105\44\1\0\46\44\2\0\2\44\6\0\20\44\41\0\46\44"+
    "\2\0\1\44\7\0\47\44\110\0\33\44\5\0\3\44\56\0\32\44"+
    "\5\0\13\44\43\0\2\44\1\0\143\44\1\0\1\44\17\0\2\44"+
    "\7\0\2\44\12\0\3\44\2\0\1\44\20\0\1\44\1\0\36\44"+
    "\35\0\3\44\60\0\46\44\13\0\1\44\u0152\0\66\44\3\0\1\44"+
    "\22\0\1\44\7\0\12\44\43\0\10\44\2\0\2\44\2\0\26\44"+
    "\1\0\7\44\1\0\1\44\3\0\4\44\3\0\1\44\36\0\2\44"+
    "\1\0\3\44\16\0\4\44\21\0\6\44\4\0\2\44\2\0\26\44"+
    "\1\0\7\44\1\0\2\44\1\0\2\44\1\0\2\44\37\0\4\44"+
    "\1\0\1\44\23\0\3\44\20\0\11\44\1\0\3\44\1\0\26\44"+
    "\1\0\7\44\1\0\2\44\1\0\5\44\3\0\1\44\22\0\1\44"+
    "\17\0\2\44\17\0\1\44\23\0\10\44\2\0\2\44\2\0\26\44"+
    "\1\0\7\44\1\0\2\44\1\0\5\44\3\0\1\44\36\0\2\44"+
    "\1\0\3\44\17\0\1\44\21\0\1\44\1\0\6\44\3\0\3\44"+
    "\1\0\4\44\3\0\2\44\1\0\1\44\1\0\2\44\3\0\2\44"+
    "\3\0\3\44\3\0\10\44\1\0\3\44\77\0\1\44\13\0\10\44"+
    "\1\0\3\44\1\0\27\44\1\0\12\44\1\0\5\44\46\0\2\44"+
    "\43\0\10\44\1\0\3\44\1\0\27\44\1\0\12\44\1\0\5\44"+
    "\3\0\1\44\40\0\1\44\1\0\2\44\43\0\10\44\1\0\3\44"+
    "\1\0\27\44\1\0\20\44\46\0\2\44\43\0\22\44\3\0\30\44"+
    "\1\0\11\44\1\0\1\44\2\0\7\44\72\0\60\44\1\0\2\44"+
    "\13\0\10\44\72\0\2\44\1\0\1\44\2\0\2\44\1\0\1\44"+
    "\2\0\1\44\6\0\4\44\1\0\7\44\1\0\3\44\1\0\1\44"+
    "\1\0\1\44\2\0\2\44\1\0\4\44\1\0\2\44\11\0\1\44"+
    "\2\0\5\44\1\0\1\44\25\0\2\44\42\0\1\44\77\0\10\44"+
    "\1\0\42\44\35\0\4\44\164\0\42\44\1\0\5\44\1\0\2\44"+
    "\45\0\6\44\112\0\46\44\12\0\51\44\7\0\132\44\5\0\104\44"+
    "\5\0\122\44\6\0\7\44\1\0\77\44\1\0\1\44\1\0\4\44"+
    "\2\0\7\44\1\0\1\44\1\0\4\44\2\0\47\44\1\0\1\44"+
    "\1\0\4\44\2\0\37\44\1\0\1\44\1\0\4\44\2\0\7\44"+
    "\1\0\1\44\1\0\4\44\2\0\7\44\1\0\7\44\1\0\27\44"+
    "\1\0\37\44\1\0\1\44\1\0\4\44\2\0\7\44\1\0\47\44"+
    "\1\0\23\44\105\0\125\44\14\0\u026c\44\2\0\10\44\12\0\32\44"+
    "\5\0\113\44\3\0\3\44\17\0\15\44\1\0\4\44\16\0\22\44"+
    "\16\0\22\44\16\0\15\44\1\0\3\44\17\0\64\44\43\0\1\44"+
    "\3\0\2\44\103\0\130\44\10\0\51\44\127\0\35\44\63\0\36\44"+
    "\2\0\5\44\u038b\0\154\44\224\0\234\44\4\0\132\44\6\0\26\44"+
    "\2\0\6\44\2\0\46\44\2\0\6\44\2\0\10\44\1\0\1\44"+
    "\1\0\1\44\1\0\1\44\1\0\37\44\2\0\65\44\1\0\7\44"+
    "\1\0\1\44\3\0\3\44\1\0\7\44\3\0\4\44\2\0\6\44"+
    "\4\0\15\44\5\0\3\44\1\0\7\44\102\0\2\44\23\0\1\44"+
    "\34\0\1\44\15\0\1\44\40\0\22\44\120\0\1\44\4\0\1\44"+
    "\2\0\12\44\1\0\1\44\3\0\5\44\6\0\1\44\1\0\1\44"+
    "\1\0\1\44\1\0\4\44\1\0\3\44\1\0\7\44\3\0\3\44"+
    "\5\0\5\44\26\0\44\44\u0e81\0\3\44\31\0\11\44\7\0\5\44"+
    "\2\0\5\44\4\0\126\44\6\0\3\44\1\0\137\44\5\0\50\44"+
    "\4\0\136\44\21\0\30\44\70\0\20\44\u0200\0\u19b6\44\112\0\u51a6\44"+
    "\132\0\u048d\44\u0773\0\u2ba4\44\u215c\0\u012e\44\2\0\73\44\225\0\7\44"+
    "\14\0\5\44\5\0\1\44\1\0\12\44\1\0\15\44\1\0\5\44"+
    "\1\0\1\44\1\0\2\44\1\0\2\44\1\0\154\44\41\0\u016b\44"+
    "\22\0\100\44\2\0\66\44\50\0\15\44\66\0\2\44\30\0\3\44"+
    "\31\0\1\44\6\0\5\44\1\0\207\44\7\0\1\44\34\0\32\44"+
    "\4\0\1\44\1\0\32\44\12\0\132\44\3\0\6\44\2\0\6\44"+
    "\2\0\6\44\2\0\3\44\3\0\2\44\3\0\2\44\31\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\4\1\5"+
    "\1\4\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\1"+
    "\2\4\1\24\1\25\1\1\1\26\1\6\1\27\1\30"+
    "\1\31\1\32\1\33\2\0\1\34\1\0\1\4\1\0"+
    "\1\6\1\35\2\21\1\36\2\37\2\4\1\0\1\40"+
    "\1\41\1\0\1\34\1\0\1\5\2\42\1\4\1\5"+
    "\1\43\1\4\1\0\1\5\2\0\1\4\1\5\1\44"+
    "\1\41\2\42\1\45";

  private static int [] zzUnpackAction() {
    int [] result = new int[76];
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
    "\0\0\0\57\0\136\0\215\0\136\0\274\0\353\0\u011a"+
    "\0\u0149\0\u0178\0\274\0\136\0\136\0\136\0\136\0\136"+
    "\0\136\0\136\0\136\0\u01a7\0\136\0\u01d6\0\u0205\0\136"+
    "\0\u0234\0\u0263\0\u0292\0\u02c1\0\u02f0\0\u031f\0\136\0\u034e"+
    "\0\136\0\136\0\136\0\136\0\136\0\u037d\0\u03ac\0\u03db"+
    "\0\u040a\0\u0439\0\u0468\0\u0497\0\136\0\u04c6\0\136\0\136"+
    "\0\136\0\u04f5\0\u0524\0\u0553\0\u0582\0\136\0\u05b1\0\u05e0"+
    "\0\u060f\0\u063e\0\u066d\0\u069c\0\u06cb\0\u06fa\0\u0729\0\274"+
    "\0\u0758\0\u0787\0\u07b6\0\u07e5\0\u0814\0\u0843\0\u0872\0\274"+
    "\0\u08a1\0\u07e5\0\u0814\0\274";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[76];
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
    "\1\3\3\4\1\5\1\6\1\7\2\6\1\10\6\6"+
    "\1\11\2\6\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\6"+
    "\1\27\1\30\1\31\1\3\1\32\1\33\1\6\1\34"+
    "\1\6\1\35\1\6\1\36\2\6\5\37\16\40\1\41"+
    "\1\42\10\37\1\43\2\37\1\40\4\37\3\40\1\37"+
    "\1\40\1\37\4\40\60\0\3\4\60\0\16\6\1\13"+
    "\1\6\10\0\1\6\2\0\1\6\4\0\3\6\1\0"+
    "\1\6\1\0\1\6\1\0\2\6\6\0\1\7\1\44"+
    "\1\45\4\0\2\46\1\0\1\7\1\0\1\47\1\50"+
    "\1\51\37\0\16\6\1\13\1\6\10\0\1\6\2\0"+
    "\1\6\4\0\3\6\1\0\1\6\1\0\1\6\1\0"+
    "\1\52\1\6\6\0\1\7\1\44\1\45\4\0\2\46"+
    "\1\0\1\7\1\53\1\47\1\50\1\51\37\0\1\54"+
    "\1\6\11\54\1\6\4\54\10\0\1\6\2\0\1\54"+
    "\4\0\3\54\1\0\1\54\1\0\1\54\1\0\2\54"+
    "\36\0\1\55\26\0\1\56\11\0\1\56\17\0\1\57"+
    "\60\0\1\60\14\0\1\61\2\0\2\61\1\62\1\61"+
    "\10\62\2\61\2\62\21\61\4\62\1\61\1\62\3\61"+
    "\2\62\5\0\7\6\1\63\6\6\1\13\1\6\10\0"+
    "\1\6\2\0\1\6\4\0\3\6\1\0\1\6\1\0"+
    "\1\6\1\0\2\6\5\0\15\6\1\64\1\13\1\6"+
    "\10\0\1\6\2\0\1\6\4\0\3\6\1\0\1\6"+
    "\1\0\1\6\1\0\2\6\43\34\1\65\4\34\1\66"+
    "\6\34\1\35\1\0\55\35\1\67\3\0\20\67\1\70"+
    "\10\0\1\67\2\0\1\67\3\0\4\67\1\0\1\67"+
    "\1\0\4\67\5\0\16\40\12\0\1\43\2\0\1\40"+
    "\4\0\3\40\1\0\1\40\1\0\4\40\6\0\1\71"+
    "\10\0\1\72\1\71\43\0\12\73\1\0\3\73\22\0"+
    "\2\73\2\0\1\73\3\0\2\73\6\0\1\50\1\0"+
    "\1\45\4\0\2\46\1\0\1\50\44\0\1\74\11\0"+
    "\1\75\43\0\5\6\1\76\10\6\1\13\1\6\10\0"+
    "\1\6\2\0\1\6\4\0\3\6\1\0\1\6\1\0"+
    "\1\6\1\0\2\6\5\0\2\77\2\0\1\77\3\0"+
    "\2\77\1\0\1\77\34\0\1\77\6\0\20\54\10\0"+
    "\1\54\2\0\1\54\4\0\3\54\1\0\1\54\1\0"+
    "\1\54\1\0\2\54\6\0\1\56\11\0\1\56\43\0"+
    "\1\62\1\0\10\62\2\0\2\62\21\0\4\62\1\0"+
    "\1\62\3\0\2\62\5\0\5\6\1\100\10\6\1\13"+
    "\1\6\10\0\1\6\2\0\1\6\4\0\3\6\1\0"+
    "\1\6\1\0\1\6\1\0\2\6\5\0\16\6\1\13"+
    "\1\6\10\0\1\6\2\0\1\6\4\0\3\6\1\0"+
    "\1\101\1\0\1\6\1\0\2\6\2\34\1\0\54\34"+
    "\1\67\3\0\20\67\1\102\10\0\1\67\2\0\1\67"+
    "\3\0\4\67\1\0\1\67\1\0\4\67\1\70\3\0"+
    "\20\70\1\102\10\0\1\70\2\0\1\70\3\0\4\70"+
    "\1\0\1\70\1\0\4\70\6\0\1\71\1\0\1\45"+
    "\7\0\1\71\44\0\1\71\11\0\1\71\43\0\10\73"+
    "\2\103\1\0\3\73\1\50\1\51\20\0\2\73\2\0"+
    "\1\73\3\0\2\73\6\0\1\74\11\0\1\74\1\0"+
    "\1\104\42\0\1\74\11\0\1\74\1\105\1\104\41\0"+
    "\16\6\1\13\1\6\10\0\1\6\2\0\1\6\4\0"+
    "\3\6\1\0\1\6\1\0\1\6\1\0\1\6\1\106"+
    "\5\0\2\77\1\44\1\45\1\77\3\0\2\107\1\0"+
    "\1\77\2\0\1\50\1\51\30\0\1\77\6\0\10\6"+
    "\1\110\5\6\1\13\1\6\10\0\1\6\2\0\1\6"+
    "\4\0\3\6\1\0\1\6\1\0\1\6\1\0\2\6"+
    "\1\67\3\111\2\67\1\70\11\67\1\70\3\67\1\102"+
    "\10\111\1\67\2\111\1\67\3\111\4\67\1\111\1\67"+
    "\1\111\4\67\5\0\10\73\2\103\1\72\3\73\1\50"+
    "\1\51\20\0\2\73\2\0\1\73\3\0\2\73\5\0"+
    "\12\112\1\0\3\112\22\0\2\112\2\0\1\112\3\0"+
    "\2\112\5\0\2\113\2\0\1\113\3\0\2\113\1\0"+
    "\1\113\34\0\1\113\6\0\10\6\1\114\5\6\1\13"+
    "\1\6\10\0\1\6\2\0\1\6\4\0\3\6\1\0"+
    "\1\6\1\0\1\6\1\0\2\6\5\0\2\77\1\44"+
    "\1\45\1\77\3\0\2\107\1\72\1\77\2\0\1\50"+
    "\1\51\30\0\1\77\1\0\1\111\3\0\20\111\11\0"+
    "\1\111\2\0\1\111\3\0\4\111\1\0\1\111\1\0"+
    "\4\111";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2256];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

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
    "\2\0\1\11\1\1\1\11\6\1\10\11\1\1\1\11"+
    "\2\1\1\11\6\1\1\11\1\1\5\11\2\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\11\1\1\3\11\3\1"+
    "\1\0\1\11\1\1\1\0\1\1\1\0\7\1\1\0"+
    "\1\1\2\0\7\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[76];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  /*
  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState) {
    char [] buf = buffer.toString().substring(start,end).toCharArray();
    yyreset( new CharArrayReader( buf ) );
    yybegin(initialState);
  }
  
  public void reset(CharSequence buffer, int initialState){
    reset(buffer, 0, buffer.length(), initialState);
  }
  */


  public _ClojureLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _ClojureLexer(java.io.InputStream in) {
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
    while (i < 1318) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  // For Demetra compatibility
  public void reset(CharSequence buffer, int initialState){
    zzBuffer = buffer;
    zzBufferArray = null;
    zzCurrentPos = zzMarkedPos = zzStartRead = 0;
    zzPushbackPos = 0;
    zzAtEOF = false;
    zzAtBOL = true;
    zzEndRead = buffer.length();
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
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
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = zzLexicalState;


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
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
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
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
        case 29: 
          { return SHARPUP;
          }
        case 38: break;
        case 12: 
          { return RIGHT_CURLY;
          }
        case 39: break;
        case 17: 
          { return symIMPLICIT_ARG;
          }
        case 40: break;
        case 15: 
          { return SHARP;
          }
        case 41: break;
        case 33: 
          { return COLON_SYMBOL;
          }
        case 42: break;
        case 5: 
          { return LONG_LITERAL;
          }
        case 43: break;
        case 23: 
          { return symDOT;
          }
        case 44: break;
        case 27: 
          { return BIG_DECIMAL_LITERAL;
          }
        case 45: break;
        case 14: 
          { return BACKQUOTE;
          }
        case 46: break;
        case 25: 
          { yybegin(YYINITIAL); return symATOM;
          }
        case 47: break;
        case 37: 
          { return FALSE;
          }
        case 48: break;
        case 7: 
          { return LEFT_PAREN;
          }
        case 49: break;
        case 6: 
          { return symATOM;
          }
        case 50: break;
        case 22: 
          { yypushback(yytext().length()); yybegin(YYINITIAL);
          }
        case 51: break;
        case 3: 
          { return COMMA;
          }
        case 52: break;
        case 16: 
          { return UP;
          }
        case 53: break;
        case 19: 
          { return AT;
          }
        case 54: break;
        case 20: 
          { return WRONG_STRING_LITERAL;
          }
        case 55: break;
        case 18: 
          { return TILDA;
          }
        case 56: break;
        case 32: 
          { return STRING_LITERAL;
          }
        case 57: break;
        case 30: 
          { return TILDAAT;
          }
        case 58: break;
        case 26: 
          { return BIG_INT_LITERAL;
          }
        case 59: break;
        case 10: 
          { return RIGHT_SQUARE;
          }
        case 60: break;
        case 2: 
          { return WHITESPACE;
          }
        case 61: break;
        case 21: 
          { return LINE_COMMENT;
          }
        case 62: break;
        case 13: 
          { return QUOTE;
          }
        case 63: break;
        case 28: 
          { return DOUBLE_LITERAL;
          }
        case 64: break;
        case 8: 
          { return RIGHT_PAREN;
          }
        case 65: break;
        case 34: 
          { return RATIO;
          }
        case 66: break;
        case 24: 
          { return symNS_SEP;
          }
        case 67: break;
        case 11: 
          { return LEFT_CURLY;
          }
        case 68: break;
        case 31: 
          { return CHAR_LITERAL;
          }
        case 69: break;
        case 35: 
          { return NIL;
          }
        case 70: break;
        case 36: 
          { return TRUE;
          }
        case 71: break;
        case 1: 
          { return BAD_CHARACTER;
          }
        case 72: break;
        case 9: 
          { return LEFT_SQUARE;
          }
        case 73: break;
        case 4: 
          { yypushback(yytext().length()); yybegin(SYMBOL);
          }
        case 74: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
