/* Class281 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class281
{
    static GamePacket aClass351_3644 = new GamePacket(42, 8);
    static int anInt3645;
    static int anInt3646;
    static int anInt3647;
    static GamePacket aClass351_3648 = new GamePacket(55, 4);
    static BitmapFont aClass143_3649;
    static int anInt3650;
    
    static final void method2106(String string, int i) {
	anInt3645++;
	BufferedPacket class348_sub47 = Class203.method1478(true);
	((BufferedPacket) class348_sub47).buffer
	    .putByte(((HandshakePacket) Class178.aClass29_2353).opcode);
	((BufferedPacket) class348_sub47).buffer
	    .putShort(0);
	int i_0_ = (((ByteBuffer) (((BufferedPacket) class348_sub47)
				       .buffer))
		    .position);
	((BufferedPacket) class348_sub47).buffer
	    .putShort(634);
	int[] is = Class50_Sub1.method463(class348_sub47, false);
	int i_1_ = (((ByteBuffer) (((BufferedPacket) class348_sub47)
				       .buffer))
		    .position);
	((BufferedPacket) class348_sub47).buffer
	    .putJStr((byte) -5, string);
	((BufferedPacket) class348_sub47).buffer
	    .putByte(Class348_Sub33.gameLanguage);
	((ByteBuffer)
	 ((BufferedPacket) class348_sub47).buffer).position
	    += 7;
	((BufferedPacket) class348_sub47).buffer.encipherXtea
	    (is, i_1_,
	     ((ByteBuffer) (((BufferedPacket) class348_sub47)
				.buffer)).position);
	((BufferedPacket) class348_sub47).buffer.finalizeVarShort
	    (1809639944,
	     -i_0_ + (((ByteBuffer) (((BufferedPacket) class348_sub47)
					 .buffer))
		      .position));
	Class348_Sub42_Sub14.queuePacket(118, class348_sub47);
	if (i <= 99)
	    getArchiveHash(null);
	Class367_Sub2.anInt7297 = 1;
	GameFont.connectionOpcode = -3;
	Class169.anInt2264 = 0;
	NativeRaster.anInt8398 = 0;
    }
    
    public static void method2107(byte i) {
	aClass351_3648 = null;
	aClass143_3649 = null;
	aClass351_3644 = null;
	if (i != 77)
	    method2107((byte) -107);
    }
    
    static int getArchiveHash(String string) {
	anInt3646++;
	int length = string.length();
	int hash = 0;
	for (int i = 0; i < length; i++)
	    hash = (Class354.charToByte(string.charAt(i)) + ((hash << 5) - hash));
	return hash;
    }
}
