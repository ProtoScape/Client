/* Class348_Sub40_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub26 extends Class348_Sub40
{
    private int anInt9344 = 4096;
    static int anInt9345;
    static int anInt9346 = 0;
    private int anInt9347 = 4096;
    static int anInt9348;
    static int anInt9349;
    static int anInt9350;
    static boolean[] activeToolkits;
    static boolean aBoolean9352 = true;
    static int anInt9353;
    private int anInt9354 = 4096;
    static int anInt9355;
    
    public static void method3118(byte i) {
	activeToolkits = null;
	int i_0_ = 37 / ((28 - i) / 61);
    }
    
    static final boolean method3119(int i, int i_1_, int i_2_) {
	if (i_1_ <= 39)
	    method3119(-106, 118, -21);
	anInt9355++;
	if ((i & 0xc580 ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    final int[][] method3047(int i, int i_3_) {
	if (i_3_ != -1564599039)
	    return null;
	anInt9353++;
	int[][] is = ((Class348_Sub40) this).aClass322_7033
			 .method2557(i_3_ + 1564598957, i);
	if (((Class322) ((Class348_Sub40) this).aClass322_7033).aBoolean4035) {
	    int[][] is_4_ = this.method3039((byte) -60, i, 0);
	    int[] is_5_ = is_4_[0];
	    int[] is_6_ = is_4_[1];
	    int[] is_7_ = is_4_[2];
	    int[] is_8_ = is[0];
	    int[] is_9_ = is[1];
	    int[] is_10_ = is[2];
	    for (int i_11_ = 0; ((Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff)
				 < (i_11_ ^ 0xffffffff)); i_11_++) {
		int i_12_ = is_5_[i_11_];
		int i_13_ = is_7_[i_11_];
		int i_14_ = is_6_[i_11_];
		if (i_13_ != i_12_
		    || (i_14_ ^ 0xffffffff) != (i_13_ ^ 0xffffffff)) {
		    is_8_[i_11_] = anInt9344;
		    is_9_[i_11_] = anInt9354;
		    is_10_[i_11_] = anInt9347;
		} else {
		    is_8_[i_11_] = i_12_ * anInt9344 >> -1822350100;
		    is_9_[i_11_] = anInt9354 * i_13_ >> 1973584748;
		    is_10_[i_11_] = anInt9347 * i_14_ >> -2011567156;
		}
	    }
	}
	return is;
    }
    
    static void parseSetRegionPacket(int i) {
	Class312.anInt3931 = 0;
	anInt9345++;
	int sizeId = Class299.gameBuffer.method3342();
	int chnkY = Class299.gameBuffer.getWordLE128(-117);
	int chnkX = Class299.gameBuffer.readLEShort(false);
	boolean force = ((Class299.gameBuffer.method3329((byte) 21) ^ 0xffffffff)
	       == -2);
	Class322.method2554((byte) -45);
	Class348_Sub40_Sub22.setMapSize(sizeId);
	int i_18_
	    = (-((ByteBuffer) Class299.gameBuffer).position
	       + Class348_Sub40_Sub25.currentPacketSize) / 16;
	Class239_Sub6.lCipherKeys = new int[i_18_][4];
	for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
	    for (int i_20_ = 0; i_20_ < 4; i_20_++)
		Class239_Sub6.lCipherKeys[i_19_][i_20_]
		    = Class299.gameBuffer
			  .getDword();
	}
	Class348_Sub23_Sub1.ulArchiveSrcs = new byte[i_18_][];
	Class129.umArchiveSrcs = new byte[i_18_][];
	aa_Sub1.mArchiveids = new int[i_18_];
	Class14_Sub4.lArchiveSrcs = new byte[i_18_][];
	ClientApplet.lArchiveids = new int[i_18_];
	StringNode.nArchiveSrcs = null;
	r.ulArchiveids = new int[i_18_];
	Class322.nArchiveids = null;
	Class347.mArchiveSrcs = new byte[i_18_][];
	if (i >= -47)
	    anInt9349 = -54;
	Class295.umArchiveids = new int[i_18_];
	Class348_Sub23_Sub3.regionHashes = new int[i_18_];
	i_18_ = 0;
	for (int i_21_
		 = (-(Class367_Sub4.mapSizeX >> -647938396) + chnkX) / 8;
	     i_21_ <= (chnkX + (Class367_Sub4.mapSizeX >> -1293697276)) / 8;
	     i_21_++) {
	    for (int i_22_ = (chnkY - (Class348_Sub40_Sub3.mapSizeY
				       >> -1689129020)) / 8;
		 ((((Class348_Sub40_Sub3.mapSizeY >> -163377948) + chnkY) / 8
		   ^ 0xffffffff)
		  <= (i_22_ ^ 0xffffffff));
		 i_22_++) {
		Class348_Sub23_Sub3.regionHashes[i_18_]
		    = i_22_ + (i_21_ << -209519576);
		aa_Sub1.mArchiveids[i_18_]
		    = Class367_Sub10.indexLoader5
			  .getArchiveId("m" + i_21_ + "_" + i_22_);
		ClientApplet.lArchiveids[i_18_]
		    = Class367_Sub10.indexLoader5
			  .getArchiveId("l" + i_21_ + "_" + i_22_);
		Class295.umArchiveids[i_18_]
		    = Class367_Sub10.indexLoader5
			  .getArchiveId("um" + i_21_ + "_" + i_22_);
		r.ulArchiveids[i_18_]
		    = Class367_Sub10.indexLoader5
			  .getArchiveId("ul" + i_21_ + "_" + i_22_);
		i_18_++;
	    }
	}
	Class348_Sub41.updateLocation(chnkX, chnkY, 11, force);
    }
    
    final void method3049(ByteBuffer class348_sub49, int i, int i_23_) {
	do {
	    try {
		int i_24_ = i;
	    while_201_:
		do {
		    do {
			if (i_24_ != 0) {
			    if (i_24_ != 1) {
				if ((i_24_ ^ 0xffffffff) == -3)
				    break;
				break while_201_;
			    }
			} else {
			    anInt9344
				= class348_sub49.getShort();
			    break while_201_;
			}
			anInt9354 = class348_sub49.getShort();
			break while_201_;
		    } while (false);
		    anInt9347 = class348_sub49.getShort();
		} while (false);
		anInt9350++;
		if (i_23_ == 31015)
		    break;
		method3118((byte) 96);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("uf.F("
						 + (class348_sub49 != null
						    ? "{...}" : "null")
						 + ',' + i + ',' + i_23_
						 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public Class348_Sub40_Sub26() {
	super(1, false);
    }
    
    static {
	activeToolkits = new boolean[8];
    }
}
