/* Class172 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class172
{
    static int anInt2277;
    static int anInt2278;
    static ServerPacket serverPacket60 = new ServerPacket(60, 0);
    static int[] clanChatRanking = new int[200];
    static int anInt2281;
    
    public static void method1325(int i) {
	clanChatRanking = null;
	if (i <= -123)
	    serverPacket60 = null;
    }
    
    static final Class348_Sub16_Sub3 method1326
	(Class348_Sub16_Sub3 class348_sub16_sub3, int i) {
	anInt2278++;
	Class348_Sub16_Sub3 class348_sub16_sub3_0_
	    = (class348_sub16_sub3 == null ? new Class348_Sub16_Sub3()
	       : new Class348_Sub16_Sub3(class348_sub16_sub3));
	class348_sub16_sub3_0_.method2841(i, -94, 128);
	return class348_sub16_sub3_0_;
    }
    
    static final int method1327(int i) {
	if (i <= 17)
	    clanChatRanking = null;
	anInt2277++;
	return AbstractImageFetcher.anInt6924;
    }
    
    static final void method1328(int i) {
	if (i != -26162)
	    clanChatRanking = null;
	GamePacket.widgetRasters.method587(-118);
	anInt2281++;
	Class358.aClass60_4417.method587(-89);
	Class239_Sub24.aClass60_6096.method587(-87);
	Class348_Sub40_Sub9.aClass60_9171.method587(-95);
    }
}
