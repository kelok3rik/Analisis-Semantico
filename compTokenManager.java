/* Generated By:JavaCC: Do not edit this line. compTokenManager.java */
import java.io.*;

/** Token Manager. */
public class compTokenManager implements compConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0xf00003ffff00L) != 0L)
         {
            jjmatchedKind = 49;
            return 1;
         }
         if ((active0 & 0x800000000L) != 0L)
            return 3;
         return -1;
      case 1:
         if ((active0 & 0x440000L) != 0L)
            return 1;
         if ((active0 & 0xf00003bbff00L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 49;
               jjmatchedPos = 1;
            }
            return 1;
         }
         return -1;
      case 2:
         if ((active0 & 0x14000L) != 0L)
            return 1;
         if ((active0 & 0xf00003bebf00L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 49;
               jjmatchedPos = 2;
            }
            return 1;
         }
         return -1;
      case 3:
         if ((active0 & 0xf00000000800L) != 0L)
            return 1;
         if ((active0 & 0x3beb700L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 3;
            return 1;
         }
         return -1;
      case 4:
         if ((active0 & 0x2008000L) != 0L)
            return 1;
         if ((active0 & 0x1be3700L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 4;
            return 1;
         }
         return -1;
      case 5:
         if ((active0 & 0x1be3200L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 5;
            return 1;
         }
         if ((active0 & 0x500L) != 0L)
            return 1;
         return -1;
      case 6:
         if ((active0 & 0x1162000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 6;
            return 1;
         }
         if ((active0 & 0xa80200L) != 0L)
            return 1;
         if ((active0 & 0x1000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 49;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0x1040000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 7;
            return 1;
         }
         if ((active0 & 0x122000L) != 0L)
            return 1;
         if ((active0 & 0x1000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 49;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 8;
            return 1;
         }
         if ((active0 & 0x1000000L) != 0L)
            return 1;
         return -1;
      case 9:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 9;
            return 1;
         }
         return -1;
      case 10:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 10;
            return 1;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 13:
         jjmatchedKind = 56;
         return jjMoveStringLiteralDfa1_0(0x200000000000000L);
      case 33:
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 34:
         return jjStartNfaWithStates_0(0, 35, 3);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 40:
         return jjStopAtPos(0, 26);
      case 41:
         return jjStopAtPos(0, 27);
      case 42:
         return jjStopAtPos(0, 4);
      case 43:
         jjmatchedKind = 2;
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 44:
         return jjStopAtPos(0, 33);
      case 45:
         jjmatchedKind = 3;
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 46:
         return jjStopAtPos(0, 34);
      case 47:
         return jjStopAtPos(0, 5);
      case 58:
         return jjStopAtPos(0, 53);
      case 59:
         return jjStopAtPos(0, 32);
      case 60:
         jjmatchedKind = 38;
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 61:
         jjmatchedKind = 1;
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 62:
         jjmatchedKind = 40;
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 91:
         return jjStopAtPos(0, 30);
      case 93:
         return jjStopAtPos(0, 31);
      case 105:
         return jjMoveStringLiteralDfa1_0(0xf00003ffd000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x300L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 123:
         return jjStopAtPos(0, 28);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 125:
         return jjStopAtPos(0, 29);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x200000000000000L) != 0L)
            return jjStopAtPos(1, 57);
         break;
      case 38:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStopAtPos(1, 43);
         break;
      case 43:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 45:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      case 61:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(1, 39);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         break;
      case 97:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000000L);
      case 100:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x1814000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000001000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x88800L);
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x22200L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x100400L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 124:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(1, 42);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x200002120000L);
      case 104:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x1a00L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 110:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x1800000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000008000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 99:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 45, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x1081000L);
      case 100:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 1);
         break;
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x2200000L);
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 109:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 44, 1);
         break;
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x820000L);
      case 114:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 46, 1);
         else if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 47, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x108000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x40400L);
      case 118:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x860000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x81500L);
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 111:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 114:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(4, 25, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x1002000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000L);
      case 99:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(5, 8, 1);
         else if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(5, 10, 1);
         break;
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x1100000L);
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0x81000L);
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x840000L);
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x30200L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 40:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000L);
      case 97:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(6, 23, 1);
         break;
      case 98:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000L);
      case 101:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(6, 9, 1);
         break;
      case 102:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(6, 21, 1);
         break;
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000L);
      case 109:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000L);
      case 110:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(6, 19, 1);
         return jjMoveStringLiteralDfa7_0(active0, 0x140000L);
      case 114:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 41:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(7, 12);
         break;
      case 97:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(7, 13, 1);
         else if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(7, 20, 1);
         return jjMoveStringLiteralDfa8_0(active0, 0x40000L);
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000000L);
      case 111:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(7, 16);
         break;
      case 114:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(7, 17, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 114:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(8, 24, 1);
         break;
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa10_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 118:
         return jjMoveStringLiteralDfa11_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(11, 18, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   //int[] nextStates; // not used
   int startsAt = 0;
   jjnewStateCnt = 14;
   int i = 1;
   jjstateSet[0] = startState;
   //int j; // not used
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
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 48)
                        kind = 48;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 49)
                     kind = 49;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if ((0x3ff000100000000L & l) != 0L)
                     jjCheckNAddTwoStates(4, 5);
                  break;
               case 4:
                  if ((0xfff400100000000L & l) != 0L)
                     jjCheckNAddTwoStates(4, 5);
                  break;
               case 5:
                  if (curChar == 34 && kind > 51)
                     kind = 51;
                  break;
               case 6:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if (curChar == 39 && kind > 52)
                     kind = 52;
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjCheckNAddStates(0, 2);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjCheckNAdd(10);
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(11, 12);
                  break;
               case 12:
                  if (curChar == 46)
                     jjCheckNAdd(13);
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  jjCheckNAdd(13);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 49)
                     kind = 49;
                  jjCheckNAdd(1);
                  break;
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 49)
                     kind = 49;
                  jjCheckNAdd(1);
                  break;
               case 3:
               case 4:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(4, 5);
                  break;
               case 7:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
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
      if ((i = jjnewStateCnt) == (startsAt = 14 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   10, 11, 12, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\75", "\53", "\55", "\52", "\57", "\53\53", "\55\55", 
"\160\165\142\154\151\143", "\160\162\151\166\141\164\145", "\163\164\141\164\151\143", 
"\166\157\151\144", "\151\156\151\143\151\157\50\51", "\120\162\157\147\162\141\155\141", 
"\151\145\156", "\151\157\164\162\157", "\151\145\156\40\157\164\162\157", 
"\151\162\145\160\145\164\151\162", "\151\141\154\164\145\162\156\141\164\151\166\141", 
"\151\157\160\143\151\157\156", "\151\164\145\162\155\151\156\141", "\151\160\162\145\144\145\146", 
"\151\141", "\151\145\163\160\145\162\141", "\151\145\163\143\162\151\142\151\162", 
"\151\154\145\145\162", "\50", "\51", "\173", "\175", "\133", "\135", "\73", "\54", "\56", "\42", 
"\75\75", "\74\75", "\74", "\76\75", "\76", "\41\75", "\174\174", "\46\46", 
"\151\156\165\155", "\151\144\145\143", "\151\143\150\162", "\151\163\164\162", null, null, null, 
null, null, "\72", null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x3fffffffffffffL, 
};
static final long[] jjtoSkip = {
   0x7c0000000000000L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[14];
static private final int[] jjstateSet = new int[28];
static protected char curChar;
/** Constructor. */
public compTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public compTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
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
   for (i = 14; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String tokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   tokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, tokenImage);

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

/** Get the next Token. */
public static Token getNextToken() 
{
  //int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100000600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
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
