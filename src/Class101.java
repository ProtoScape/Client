/* Class101 - Decompiled by JODE

 * Visit http://jode.sourceforge.net/
 */

abstract class Class101
{
    static int[] anIntArray1593 = new int[1];
    static int anInt1594;
    static int anInt1595;
    static int anInt1596;
    static int anInt1597 = 0;
    static int anInt1598;
    static int anInt1599;
    
    abstract void method890(int[] is);
    
    abstract void method891(int i, int i_0_, int i_1_);
    
    public Class101() {
	/* empty */
    }
    
    abstract void method892(int i, int i_2_, int i_3_, int[] is);
    
    static final void method893() {
	Class348_Sub40_Sub22.setMapSize(((Class348_Sub51) BitmapTable.aClass348_Sub51_3959).aClass239_Sub6_7226.getMapSizeId(-32350));
	anInt1595++;
	int chunkX = ((Class286_Sub4.anInt6246 >> 239567308) + (za_Sub2.baseRegionX >> 515880227));
	int chunkY = ((Class90.baseRegionY >> 591146499) + (Class59_Sub2_Sub2.anInt8685 >> 1861651468));
	Class355.anInt4372 = ((Class318_Sub1) Class132.localPlayer).aByte6381 = (byte) 0;
	Class132.localPlayer.setLocationUnkn(8, 8);
	int i = 18;
	Class322.nArchiveids = new int[i];
	StringNode.nArchiveSrcs = new byte[i][];
	Class239_Sub6.lCipherKeys = new int[i][4];
	aa_Sub1.mArchiveids = new int[i];
	Class14_Sub4.lArchiveSrcs = new byte[i][];
	Class348_Sub23_Sub3.regionHashes = new int[i];
	r.ulArchiveids = new int[i];
	Class295.umArchiveids = new int[i];
	Class347.mArchiveSrcs = new byte[i][];
	ClientApplet.lArchiveids = new int[i];
	Class348_Sub23_Sub1.ulArchiveSrcs = new byte[i][];
	Class129.umArchiveSrcs = new byte[i][];
	i = 0;
	for (int rX = (chunkX - (Class367_Sub4.mapSizeX >> 1284666244)) / 8; (chunkX + (Class367_Sub4.mapSizeX >> 21179204)) / 8 >= rX; rX++) {
	    for (int rY = (chunkY - (Class348_Sub40_Sub3.mapSizeY >> 1754847652)) / 8; ((chunkY + (Class348_Sub40_Sub3.mapSizeY >> -1988934620)) / 8 >= rY); rY++) {
		int i_9_ = rY + (rX << 8);
		Class348_Sub23_Sub3.regionHashes[i] = i_9_;
		aa_Sub1.mArchiveids[i] = Class367_Sub10.indexLoader5.getArchiveId("m" + rX + "_" + rY);
		ClientApplet.lArchiveids[i] = Class367_Sub10.indexLoader5.getArchiveId("l" + rX + "_" + rY);
		Class322.nArchiveids[i] = Class367_Sub10.indexLoader5.getArchiveId("n" + rX + "_" + rY);
		Class295.umArchiveids[i] = Class367_Sub10.indexLoader5.getArchiveId("um" + rX + "_" + rY);
		r.ulArchiveids[i] = (Class367_Sub10.indexLoader5.getArchiveId("ul" + rX + "_" + rY));
		if (Class322.nArchiveids[i] == -1) {
		    aa_Sub1.mArchiveids[i] = -1;
		    ClientApplet.lArchiveids[i] = -1;
		    Class295.umArchiveids[i] = -1;
		    r.ulArchiveids[i] = -1;
		}
		i++;
	    }
	}
	for (int i_10_ = i; Class322.nArchiveids.length > i_10_;
	     i_10_++) {
	    Class322.nArchiveids[i_10_] = -1;
	    aa_Sub1.mArchiveids[i_10_] = -1;
	    ClientApplet.lArchiveids[i_10_] = -1;
	    Class295.umArchiveids[i_10_] = -1;
	    r.ulArchiveids[i_10_] = -1;
	}
	int clientStage;
	if (Class240.anInt4674 != 3)
	    clientStage = 8;
	else
	    clientStage = 4;
	Class348_Sub41.updateLocation(chunkX, chunkY, clientStage, false);
    }
    
    abstract void method894(int i, int i_12_, int i_13_);
    
    abstract void method895(int i);
    
    abstract void method896(int i);
    
    abstract void method897(int i, int i_14_, int i_15_, int[] is);
    
    abstract void method898(Class101 class101_16_);
    
    abstract void method899(int i);
    
    abstract void method900(int i);
    
    static final void method901(RasterToolkit[] class105s, int i) {
	try {
	    anInt1599++;
	    Class239_Sub1.anInt5850 = class105s.length;
	    Class175.anIntArray2330 = new int[Class239_Sub1.anInt5850 + 10];
	    Class341.aClass105Array4234 = new RasterToolkit[Class239_Sub1.anInt5850 + 10];
	    ArrayUtils.arrayCopy(class105s, 0, Class341.aClass105Array4234, 0,
				Class239_Sub1.anInt5850);
	    for (int i_17_ = 0;
		 (i_17_ ^ 0xffffffff) > (Class239_Sub1.anInt5850 ^ 0xffffffff);
		 i_17_++)
		Class175.anIntArray2330[i_17_]
		    = Class341.aClass105Array4234[i_17_].method980();
	    if (i != 515880227)
		anInt1597 = 49;
	    for (int i_18_ = Class239_Sub1.anInt5850;
		 ((Class341.aClass105Array4234.length ^ 0xffffffff)
		  < (i_18_ ^ 0xffffffff));
		 i_18_++)
		Class175.anIntArray2330[i_18_] = 12;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("bca.RA("
					     + (class105s != null ? "{...}"
						: "null")
					     + ',' + i + ')'));
	}
    }
    
    abstract void method902(int i);
    
    abstract void method903(int i, int i_19_, int i_20_, int i_21_, int i_22_,
			    int i_23_);
    
    static final Class258_Sub3_Sub1 method904
	(int i, OpenGlToolkit var_ha_Sub2, int i_24_, int i_25_, int i_26_) {
	try {
	    anInt1594++;
	    if (i <= 42)
		method906(123);
	    if (((OpenGlToolkit) var_ha_Sub2).aBoolean7793
		|| (Class192.method1436(82, i_25_)
		    && Class192.method1436(81, i_26_)))
		return new Class258_Sub3_Sub1(var_ha_Sub2, 3553, i_24_, i_25_,
					      i_26_);
	    if (((OpenGlToolkit) var_ha_Sub2).aBoolean7837)
		return new Class258_Sub3_Sub1(var_ha_Sub2, 34037, i_24_, i_25_,
					      i_26_);
	    return new Class258_Sub3_Sub1(var_ha_Sub2, i_24_, i_25_, i_26_,
					  Class33.method340(i_25_, (byte) 108),
					  Class33.method340(i_26_,
							    (byte) 108));
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("bca.TA(" + i + ','
					     + (var_ha_Sub2 != null ? "{...}"
						: "null")
					     + ',' + i_24_ + ',' + i_25_ + ','
					     + i_26_ + ')'));
	}
    }
    
    abstract void method905(int i, int i_27_, int i_28_, int[] is);
    
    public static void method906(int i) {
	anIntArray1593 = null;
	if (i != -31777)
	    method901(null, -89);
    }
    
    abstract Class101 method907();
    
    abstract void method908(int i);
    
    static final void method909(int i) {
	anInt1598++;
	if (Class348_Sub40_Sub30.aBoolean9403 && i == 3553) {
	    while ((Class65.lobbyWorlds.length ^ 0xffffffff)
		   < (Class215.anInt2834 ^ 0xffffffff)) {
		LobbyWorld class110_sub1
		    = Class65.lobbyWorlds[Class215.anInt2834];
		if (class110_sub1 == null
		    || ((LobbyWorld) class110_sub1).anInt5788 != -1)
		    Class215.anInt2834++;
		else {
		    if (Class176.aClass348_Sub26_2332 == null)
			Class176.aClass348_Sub26_2332
			    = (Class76.aClass169_1286.method1302
			       (i ^ ~0x1967,
				((LobbyWorld) class110_sub1).ipAddress));
		    int i_29_
			= (((Class348_Sub26) Class176.aClass348_Sub26_2332)
			   .anInt6887);
		    if (i_29_ == -1)
			break;
		    ((LobbyWorld) class110_sub1).anInt5788 = i_29_;
		    Class215.anInt2834++;
		    Class176.aClass348_Sub26_2332 = null;
		}
	    }
	}
    }
    
    abstract void method910();
}
