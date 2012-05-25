/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class90
{
    static Class273 aClass273_1512 = new Class273("", 15);
    static int anInt1513;
    static int anInt1514;
    static int anInt1515;
    static long aLong1516;
    static int baseRegionY;
    static int[] anIntArray1518 = new int[14];
    
    public static void method852(int i) {
	aClass273_1512 = null;
	if (i != 6)
	    aLong1516 = 20L;
	anIntArray1518 = null;
    }
    
    static final void method853(byte i) {
	anInt1515++;
	int sizeId = Class299.gameBuffer.getUByte();
	int chnkY = Class299.gameBuffer.getWordLE128(-121);
	boolean force = Class299.gameBuffer.getUByte() == 1;
	int chnkX = Class299.gameBuffer.method3355(i + -172);
	Class312.anInt3931 = Class299.gameBuffer.method3393((byte) -112);
	Class322.method2554((byte) -45);
	Class348_Sub40_Sub22.setMapSize(sizeId);
	Class299.gameBuffer.initiateBitAccess(-122);
	for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -5; i_3_++) {
	    for (int i_4_ = 0;
		 ((i_4_ ^ 0xffffffff)
		  > (Class367_Sub4.mapSizeX >> 615048547 ^ 0xffffffff));
		 i_4_++) {
		for (int i_5_ = 0;
		     ((Class348_Sub40_Sub3.mapSizeY >> -410724637
		       ^ 0xffffffff)
		      < (i_5_ ^ 0xffffffff));
		     i_5_++) {
		    int i_6_ = Class299.gameBuffer
				   .getBits(1);
		    if ((i_6_ ^ 0xffffffff) != -2)
			Class62.anIntArrayArrayArray1116[i_3_][i_4_][i_5_]
			    = -1;
		    else
			Class62.anIntArrayArrayArray1116[i_3_][i_4_][i_5_]
			    = Class299.gameBuffer
				  .getBits(26);
		}
	    }
	}
	Class299.gameBuffer.finalizeBitAccess(false);
	int i_7_
	    = (-((ByteBuffer) Class299.gameBuffer).position
	       + Class348_Sub40_Sub25.currentPacketSize) / 16;
	Class239_Sub6.lCipherKeys = new int[i_7_][4];
	int i_8_ = 0;
	if (i != 99)
	    method852(-55);
	for (/**/; (i_7_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
	    for (int i_9_ = 0; i_9_ < 4; i_9_++)
		Class239_Sub6.lCipherKeys[i_8_][i_9_]
		    = Class299.gameBuffer
			  .getDword();
	}
	Class322.nArchiveids = null;
	ClientApplet.lArchiveids = new int[i_7_];
	r.ulArchiveids = new int[i_7_];
	aa_Sub1.mArchiveids = new int[i_7_];
	Class348_Sub23_Sub3.regionHashes = new int[i_7_];
	Class295.umArchiveids = new int[i_7_];
	StringNode.nArchiveSrcs = null;
	Class348_Sub23_Sub1.ulArchiveSrcs = new byte[i_7_][];
	Class129.umArchiveSrcs = new byte[i_7_][];
	Class14_Sub4.lArchiveSrcs = new byte[i_7_][];
	Class347.mArchiveSrcs = new byte[i_7_][];
	i_7_ = 0;
	for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -5; i_10_++) {
	    for (int i_11_ = 0;
		 ((i_11_ ^ 0xffffffff)
		  > (Class367_Sub4.mapSizeX >> -1281045661 ^ 0xffffffff));
		 i_11_++) {
		for (int i_12_ = 0;
		     i_12_ < Class348_Sub40_Sub3.mapSizeY >> -192444093;
		     i_12_++) {
		    int i_13_ = (Class62.anIntArrayArrayArray1116[i_10_][i_11_]
				 [i_12_]);
		    if (i_13_ != -1) {
			int i_14_ = i_13_ >> -1268148658 & 0x3ff;
			int i_15_ = (i_13_ & 0x3ff9) >> -1151168317;
			int i_16_ = i_15_ / 8 + (i_14_ / 8 << -498087576);
			for (int i_17_ = 0;
			     (i_17_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff);
			     i_17_++) {
			    if ((Class348_Sub23_Sub3.regionHashes[i_17_]
				 ^ 0xffffffff)
				== (i_16_ ^ 0xffffffff)) {
				i_16_ = -1;
				break;
			    }
			}
			if ((i_16_ ^ 0xffffffff) != 0) {
			    Class348_Sub23_Sub3.regionHashes[i_7_] = i_16_;
			    int i_18_ = 0xff & i_16_ >> 1924313768;
			    int i_19_ = 0xff & i_16_;
			    aa_Sub1.mArchiveids[i_7_]
				= (Class367_Sub10.indexLoader5.getArchiveId
				   ("m" + i_18_ + "_" + i_19_));
			    ClientApplet.lArchiveids[i_7_]
				= Class367_Sub10.indexLoader5
				      .getArchiveId("l" + i_18_ + "_" + i_19_);
			    Class295.umArchiveids[i_7_]
				= (Class367_Sub10.indexLoader5.getArchiveId
				   ("um" + i_18_ + "_" + i_19_));
			    r.ulArchiveids[i_7_]
				= (Class367_Sub10.indexLoader5.getArchiveId
				   ("ul" + i_18_ + "_" + i_19_));
			    i_7_++;
			}
		    }
		}
	    }
	}
	Class348_Sub41.updateLocation(chnkX, chnkY, 11, force);
    }
    
    public Class90() {
	/* empty */
    }
    
    static final void method854(byte i) {
	anInt1513++;
	if (Class225.anInt2955 == 5 && i < -48)
	    Class225.anInt2955 = 6;
    }
}
