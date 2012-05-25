/* Class348_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub1_Sub1 extends Class348_Sub1
{
    static s[] aSArray8801;
    static int anInt8802;
    static int anInt8803;
    static int anInt8804;
    static boolean aBoolean8805 = false;
    static int anInt8806;
    static Cache aClass60_8807;
    static int anInt8808 = 0;
    static int anInt8809;
    
    Class348_Sub1_Sub1(int i, int i_0_, int i_1_, int i_2_, int i_3_,
		       float f) {
	super(i, i_0_, i_1_, i_2_, i_3_, f);
    }
    
    final void method2725(int i, byte i_4_, int i_5_, int i_6_) {
	((Class348_Sub1) this).anInt6553 = i_5_;
	((Class348_Sub1) this).anInt6548 = i_6_;
	if (i_4_ == 70) {
	    anInt8809++;
	    ((Class348_Sub1) this).anInt6562 = i;
	}
    }
    
    static final int method2726(int i, int i_7_, int i_8_) {
	if ((i_7_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff)) {
	    int i_9_ = i_7_;
	    i_7_ = i_8_;
	    i_8_ = i_9_;
	}
	if (i != -21806)
	    parseMapArchives((byte) -128, null, null);
	anInt8804++;
	int i_10_;
	for (/**/; i_8_ != 0; i_8_ = i_10_) {
	    i_10_ = i_7_ % i_8_;
	    i_7_ = i_8_;
	}
	return i_7_;
    }
    
    static void parseMapArchives(byte i, Class237_Sub1 class237_sub1, byte[][] srcs) {
	try {
	    anInt8802++;
	    int[] is_11_ = { -1, 0, 0, 0, 0 };
	    int i_13_ = srcs.length;
	    for (int i_14_ = 0; i_13_ > i_14_; i_14_++) {
		byte[] src = srcs[i_14_];
		if (src != null) {
		    ByteBuffer buffer = new ByteBuffer(src);
		    int rX = Class348_Sub23_Sub3.regionHashes[i_14_] >> 8;
		    int rY = 0xff & Class348_Sub23_Sub3.regionHashes[i_14_];
		    int mX = rX * 64 - za_Sub2.baseRegionX;
		    int mY = rY * 64 - Class90.baseRegionY;
		    Class369_Sub1.method3570(false);
		    class237_sub1.parseMapArchive(buffer, mX, mY, za_Sub2.baseRegionX, Class90.baseRegionY, AbstractMouseEvent.aClass361Array7108);
		    class237_sub1.method1691(mY, Class348_Sub8.currentToolkit, buffer, is_11_, mX, (byte) -126);
		    if (!((MapLoader) class237_sub1).aBoolean3109 && rX == AbstractToolkit.chnkX / 8 && ((Class327.chnkY / 8 ^ 0xffffffff) == (rY ^ 0xffffffff)) && (is_11_[0] ^ 0xffffffff) != 0) {
			IntegerVarScriptSettingLoader.aClass305_3304 = Class30.aClass84_413.method823(is_11_[2], is_11_[3], is_11_[1], -66, (Class123.aClass25_1813),is_11_[0]);
			Class185.anInt2481 = is_11_[4];
		    }
		}
	    }
	    for (int i_20_ = 0; (i_13_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff); i_20_++) {
		int mX = ((Class348_Sub23_Sub3.regionHashes[i_20_] >> 8) * 64 - za_Sub2.baseRegionX);
		int mY = (((0xff & Class348_Sub23_Sub3.regionHashes[i_20_]) * 64) - Class90.baseRegionY);
		byte[] src = srcs[i_20_];
		if (src == null && Class327.chnkY < 800) {
		    Class369_Sub1.method3570(false);
		    class237_sub1.method1688(mY, 64, 64, 125, mX);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("bg.E(" + i + ','
					     + (class237_sub1 != null ? "{...}"
						: "null")
					     + ','
					     + (srcs != null ? "{...}" : "null")
					     + ')'));
	}
    }
    
    public static void method2728(byte i) {
	if (i != 9)
	    aClass60_8807 = null;
	aClass60_8807 = null;
	aSArray8801 = null;
    }
    
    final void method2716(int i, float f) {
	((Class348_Sub1) this).aFloat6550 = f;
	if (i != -1)
	    aClass60_8807 = null;
	anInt8803++;
    }
    
    static {
	aClass60_8807 = new Cache(8);
    }
}
