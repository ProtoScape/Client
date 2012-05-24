/* AbstractBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class AbstractBuffer
{
    static GamePacket aClass351_4262 = new GamePacket(34, 15);
    static int anInt4263 = 2;
    static GamePacket aClass351_4264 = new GamePacket(40, 12);
    static int anInt4265 = 0;
    static GamePacket aClass351_4266 = new GamePacket(72, 16);
    static int anInt4267;
    
    abstract byte[] get(int i_0_, int i_1_);
    
    public static void method2690(int i) {
	aClass351_4266 = null;
	aClass351_4264 = null;
	aClass351_4262 = null;
	int i_2_ = -29 / ((i - -54) / 45);
    }
    
    abstract void put(byte[] is);
    
    abstract byte[] getPayload();
}
