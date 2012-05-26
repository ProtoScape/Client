/* Class375 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class375
{
    static int anInt4539;
    static boolean aBoolean4540 = false;
    static int anInt4541;
    static boolean aBoolean4542 = false;
    static Cache aClass60_4543 = new Cache(8);
    static int anInt4544 = -1;
    static int anInt4545 = -1;
    
    static void parsePlayerUpdates(GameBuffer buffer) {
	for (int i = 0; (Class101_Sub3.amountUpdatePlayers ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
	    int id = Class18.playerUpdateList[i];
	    Player player = ClassicLoadingScreen.onscreenPlayers[id];
	    int mask = buffer.getUByte();
	    if ((mask & 0x40) != 0)
		mask += buffer.getUByte() << 8;
	    if ((mask & 0x4000) != 0)
		mask += buffer.getUByte() << 16;
	    Class133.parsePlayerUpdateFlags(buffer, id, mask, 123, player);
	}
	anInt4541++;
    }
    
    public static void method3613(int i) {
	if (i != 64)
	    parsePlayerUpdates(null);
	aClass60_4543 = null;
    }
    
    static final void method3614(int i, int i_3_, int i_4_,
				 BufferedPacket class348_sub47, int i_5_) {
	anInt4539++;
	if (i_5_ != -19692)
	    method3613(10);
	((BufferedPacket) class348_sub47).buffer
	    .putInt(i);
	((BufferedPacket) class348_sub47).buffer
	    .putShort(i_4_);
	((BufferedPacket) class348_sub47).buffer
	    .putShort(i_3_);
    }
}
