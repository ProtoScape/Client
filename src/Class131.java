/* Class131 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class131
{
    static ServerPacket aClass114_1901 = new ServerPacket(38, -1);
    static int anInt1902;
    static char[] aCharArray1903 = { '[', ']', '#' };
    static GamePacket aClass351_1904;
    
    public static void method1136(byte i) {
	aCharArray1903 = null;
	if (i == -98) {
	    aClass114_1901 = null;
	    aClass351_1904 = null;
	}
    }
    
    static {
	anInt1902 = 0;
	aClass351_1904 = new GamePacket(61, 11);
    }
}
