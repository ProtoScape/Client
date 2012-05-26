/* Class348_Sub40_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub18 extends Class348_Sub40
{
    private int anInt9244;
    static GfxLoader gfxLoader;
    static int anInt9246;
    static int anInt9247;
    static int anInt9248;
    static int[] anIntArray9249
	= { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
    private int anInt9250;
    static int anInt9251;
    private int anInt9252;
    
    static void parsePlayerMovements(GameBuffer buffer) {
	anInt9247++;
	int amountSkip = 0;
	buffer.initiateBitAccess();
	for (int i_1_ = 0; (Class328_Sub1.onscreenGpiOffset ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
	    int id = Class286_Sub7.onscreenGpiList[i_1_];
	    if ((0x1 & Class348_Sub5.gpiFlags[id]) == 0) {
		if (amountSkip > 0) {
		    Class348_Sub5.gpiFlags[id] = (byte) Class273.bitOr(Class348_Sub5.gpiFlags[id], 2);
		    amountSkip--;
		} else {
		    int flag = buffer.getBits(1);
		    if (flag == 0) {
			amountSkip = Entity.getSkipAmount(buffer);
			Class348_Sub5.gpiFlags[id] = (byte) Class273.bitOr((Class348_Sub5.gpiFlags[id]), 2);
		    } else
			Class286_Sub9.parseOnscreenPlayerMovement(buffer, id);
		}
	    }
	}
	buffer.finalizeBitAccess();
	if (amountSkip != 0)
	    throw new RuntimeException("nsn0");
	buffer.initiateBitAccess();
	for (int i_4_ = 0; i_4_ < Class328_Sub1.onscreenGpiOffset; i_4_++) {
	    int id = Class286_Sub7.onscreenGpiList[i_4_];
	    if ((0x1 & Class348_Sub5.gpiFlags[id]) != 0) {
		if (amountSkip > 0) {
		    Class348_Sub5.gpiFlags[id] = (byte) Class273.bitOr((Class348_Sub5.gpiFlags[id]), 2);
		    amountSkip--;
		} else {
		    int flag = buffer.getBits(1);
		    if (flag == 0) {
			amountSkip = Entity.getSkipAmount(buffer);
			Class348_Sub5.gpiFlags[id] = (byte) Class273.bitOr((Class348_Sub5.gpiFlags[id]), 2);
		    } else
			Class286_Sub9.parseOnscreenPlayerMovement(buffer, id);
		}
	    }
	}
	buffer.finalizeBitAccess();
	if (amountSkip != 0)
	    throw new RuntimeException("nsn1");
	buffer.initiateBitAccess();
	for (int i_7_ = 0; ((Class348_Sub42_Sub4.offscreenGpiOffset ^ 0xffffffff) < (i_7_ ^ 0xffffffff)); i_7_++) {
	    int id = Class135_Sub1.offscreenGpiList[i_7_];
	    if ((0x1 & Class348_Sub5.gpiFlags[id]) != 0) {
		if ((amountSkip) > 0) {
		    Class348_Sub5.gpiFlags[id] = (byte) Class273.bitOr((Class348_Sub5.gpiFlags[id]), 2);
		    amountSkip--;
		} else {
		    int flag = buffer.getBits(1);
		    if (flag == 0) {
			amountSkip = Entity.getSkipAmount(buffer);
			Class348_Sub5.gpiFlags[id] = (byte) Class273.bitOr((Class348_Sub5.gpiFlags[id]), 2);
		    } else if (Class211.parseOffscreenPlayerMovement(buffer, id))
			Class348_Sub5.gpiFlags[id] = (byte) Class273.bitOr((Class348_Sub5.gpiFlags[id]), 2);
		}
	    }
	}
	buffer.finalizeBitAccess();
        if (amountSkip != 0)
            throw new RuntimeException("nsn2");
        buffer.initiateBitAccess();
        for (int i_10_ = 0; ((i_10_ ^ 0xffffffff) > (Class348_Sub42_Sub4.offscreenGpiOffset ^ 0xffffffff)); i_10_++) {
            int id = Class135_Sub1.offscreenGpiList[i_10_];
            if ((Class348_Sub5.gpiFlags[id] & 0x1) == 0) {
                if (amountSkip > 0) {
                    Class348_Sub5.gpiFlags[id] = (byte) Class273.bitOr((Class348_Sub5.gpiFlags[id]), 2);
                    amountSkip--;
                } else {
                    int flag = buffer.getBits(1);
                    if (flag == 0) {
                        amountSkip = Entity.getSkipAmount(buffer);
                        Class348_Sub5.gpiFlags[id] = (byte) Class273.bitOr((Class348_Sub5.gpiFlags[id]), 2);
                    } else if (Class211.parseOffscreenPlayerMovement(buffer, id))
                        Class348_Sub5.gpiFlags[id] = (byte) Class273.bitOr((Class348_Sub5.gpiFlags[id]), 2);
                }
            }
        }
        buffer.finalizeBitAccess();
        if (amountSkip != 0)
            throw new RuntimeException("nsn3");
        Class328_Sub1.onscreenGpiOffset = 0;
        Class348_Sub42_Sub4.offscreenGpiOffset = 0;
        for (int id = 1; id < 2048; id++) {
            Class348_Sub5.gpiFlags[id] >>= 1;
            Player player = ClassicLoadingScreen.onscreenPlayers[id];
            if (player == null)
                Class135_Sub1.offscreenGpiList[Class348_Sub42_Sub4.offscreenGpiOffset++] = id;
            else
                Class286_Sub7.onscreenGpiList[Class328_Sub1.onscreenGpiOffset++] = id;
        }
	
    }
    
    private Class348_Sub40_Sub18(int i) {
	super(0, false);
	method3095(-104, i);
    }
    
    final int[][] method3047(int i, int i_14_) {
	anInt9246++;
	int[][] is = ((Class348_Sub40) this).aClass322_7033
			 .method2557(i_14_ ^ 0x5d41e2b0, i);
	if (((Class322) ((Class348_Sub40) this).aClass322_7033).aBoolean4035) {
	    int[] is_15_ = is[0];
	    int[] is_16_ = is[1];
	    int[] is_17_ = is[2];
	    for (int i_18_ = 0; i_18_ < Class348_Sub40_Sub6.anInt9139;
		 i_18_++) {
		is_15_[i_18_] = anInt9244;
		is_16_[i_18_] = anInt9252;
		is_17_[i_18_] = anInt9250;
	    }
	}
	if (i_14_ != -1564599039)
	    method3095(102, 6);
	return is;
    }
    
    private final void method3095(int i, int i_19_) {
	anInt9244 = 0xff0 & i_19_ >> -2106963764;
	anInt9252 = i_19_ >> 1732680260 & 0xff0;
	anInt9248++;
	anInt9250 = (i_19_ & 0xff) << 1427078244;
	if (i >= -54)
	    anInt9250 = -42;
    }
    
    public static void method3096(int i) {
	anIntArray9249 = null;
	gfxLoader = null;
	if (i != 32462)
	    gfxLoader = null;
    }
    
    final void method3049(ByteBuffer class348_sub49, int i, int i_20_) {
	int i_21_ = i;
	if (i_21_ == 0)
	    method3095(-124, class348_sub49.getTri());
	anInt9251++;
	if (i_20_ != 31015)
	    anInt9250 = 105;
    }
    
    public Class348_Sub40_Sub18() {
	this(0);
    }
}
