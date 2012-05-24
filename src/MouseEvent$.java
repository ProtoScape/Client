/* MouseFunctionEvent - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class MouseEvent$ extends AbstractMouseEvent
{
    int anInt9725;
    long aLong9726;
    int anInt9727;
    int anInt9728;
    int anInt9729;
    
    final int getType(int i) {
	return ((MouseEvent$) this).anInt9728;
    }
    
    final long method3312(byte i) {
	if (i > -79)
	    method3308((byte) -8);
	return ((MouseEvent$) this).aLong9726;
    }
    
    final int method3311(int i) {
	return ((MouseEvent$) this).anInt9725;
    }
    
    final int getClickCount(int i) {
	return ((MouseEvent$) this).anInt9727;
    }
    
    final int method3308(byte i) {
	return ((MouseEvent$) this).anInt9729;
    }
}
