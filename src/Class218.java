/* Class218 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class218
{
    static int anInt2849;
    static int anInt2850;
    Class141 aClass141_2851;
    static int anInt2852;
    int anInt2853;
    boolean aBoolean2854 = false;
    static int anInt2855;
    int anInt2856;
    static int anInt2857;
    static int anInt2858;
    static Deque aClass262_2859 = new Deque();
    static ServerPacket aClass114_2860;
    static int anInt2861 = 1401;
    
    static final void method1591(int i, int i_0_, int i_1_, int i_2_, int i_3_,
				 int i_4_, int i_5_, int i_6_, int i_7_) {
	anInt2855++;
	if ((i ^ 0xffffffff) <= -2 && (i_5_ ^ 0xffffffff) <= -2
	    && (i ^ 0xffffffff) >= (-2 + Class367_Sub4.mapSizeX ^ 0xffffffff)
	    && i_5_ <= -2 + Class348_Sub40_Sub3.mapSizeY) {
	    int i_8_ = i_7_;
	    if ((i_8_ ^ 0xffffffff) > -4 && NpcDefinition.isElevatedTile(i, i_5_))
		i_8_++;
	    if ((((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		     .aClass239_Sub27_7261.method1840(-32350) == 0
		 && !Class58.method536(i_5_, false, i, Class167.anInt2204,
				       i_8_))
		|| Message.aClass357ArrayArrayArray2029 == null)
		return;
	    Class338.mMapLoader.method1694((AbstractMouseEvent
						     .aClass361Array7108
						     [i_7_]),
						    i_1_, i_7_,
						    Class348_Sub8.currentToolkit, i,
						    i_5_, (byte) 106);
	    if ((i_3_ ^ 0xffffffff) <= -1) {
		int i_9_ = ((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
			       .aClass239_Sub4_7220.method1737(-32350);
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub4_7220),
		     1);
		Class338.mMapLoader.method1689(i, i_7_, i_3_,
							Class348_Sub8.currentToolkit,
							i_8_, 50, i_4_, i_5_,
							i_2_, i_6_,
							(AbstractMouseEvent
							 .aClass361Array7108
							 [i_7_]));
		BitmapTable.aClass348_Sub51_3959.method3429
		    ((byte) 74,
		     (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
		      .aClass239_Sub4_7220),
		     i_9_);
	    }
	}
	if (i_0_ < 12)
	    aClass262_2859 = null;
    }
    
    static final void method1592
	(byte i, int i_10_, int i_11_, int i_12_,
	 Player class318_sub1_sub3_sub3_sub2) {
	anInt2849++;
	int i_13_ = (((Mob) class318_sub1_sub3_sub3_sub2)
		     .xList[0]);
	int i_14_ = (((Mob) class318_sub1_sub3_sub3_sub2)
		     .yList[0]);
	if (i_13_ >= 0 && Class367_Sub4.mapSizeX > i_13_
	    && (i_14_ ^ 0xffffffff) <= -1
	    && (Class348_Sub40_Sub3.mapSizeY ^ 0xffffffff) < (i_14_
							       ^ 0xffffffff)
	    && ((i_12_ ^ 0xffffffff) <= -1
		&& (Class367_Sub4.mapSizeX ^ 0xffffffff) < (i_12_
							     ^ 0xffffffff)
		&& i_10_ >= 0
		&& (i_10_ ^ 0xffffffff) > (Class348_Sub40_Sub3.mapSizeY
					   ^ 0xffffffff))) {
	    int i_15_
		= (Class59_Sub2_Sub2.method574
		   (i_12_, class318_sub1_sub3_sub3_sub2.method2436((byte) 62),
		    0, Class348_Sub40_Sub11.anIntArray9185, true, (byte) 120,
		    -4, i_13_, i_14_, Class348_Sub42_Sub14.anIntArray9626,
		    i_10_,
		    (AbstractMouseEvent.aClass361Array7108
		     [(((Class318_Sub1) class318_sub1_sub3_sub3_sub2)
		       .heightLevel)]),
		    0, 0, 0));
	    if ((i_15_ ^ 0xffffffff) <= -2) {
		if (i_11_ != 4)
		    aClass262_2859 = null;
		if (i_15_ <= 3) {
		    for (int i_16_ = 0; i_16_ < -1 + i_15_; i_16_++)
			class318_sub1_sub3_sub3_sub2.method2451
			    (i, Class348_Sub42_Sub14.anIntArray9626[i_16_],
			     i_11_ + -29038,
			     Class348_Sub40_Sub11.anIntArray9185[i_16_]);
		}
	    }
	}
    }
    
    public Class218() {
	/* empty */
    }
    
    final boolean method1593(int i) {
	if (i != 106)
	    ((Class218) this).aClass141_2851 = null;
	anInt2858++;
	return ((Class141) ((Class218) this).aClass141_2851).aClass45_1965
		   .getArchiveLoaded(((Class218) this).anInt2853);
    }
    
    public static void method1594(int i) {
	aClass262_2859 = null;
	if (i != -1966608624)
	    aClass262_2859 = null;
	aClass114_2860 = null;
    }
    
    private final void method1595(byte i, int i_17_,
				  ByteBuffer class348_sub49) {
	anInt2852++;
	if (i >= 5) {
	    if ((i_17_ ^ 0xffffffff) == -2)
		((Class218) this).anInt2853
		    = class348_sub49.getShort();
	    else if ((i_17_ ^ 0xffffffff) != -3) {
		if (i_17_ == 3)
		    ((Class218) this).aBoolean2854 = true;
		else if (i_17_ == 4)
		    ((Class218) this).anInt2853 = -1;
	    } else
		((Class218) this).anInt2856 = class348_sub49.getTri();
	}
    }
    
    final RasterToolkit method1596(int i, boolean bool, int i_18_, AbstractToolkit var_ha) {
	anInt2857++;
	if (i_18_ < 51)
	    aClass114_2860 = null;
	long l = (long) (((AbstractToolkit) var_ha).id << -1253962829
			 | (((Class218) this).anInt2853 | i << -1966608624
			    | (!bool ? 0 : 262144)));
	RasterToolkit class105
	    = (RasterToolkit) ((Class141) ((Class218) this).aClass141_2851)
			     .aClass60_1976.method583(l, -87);
	if (class105 != null)
	    return class105;
	if (!((Class141) ((Class218) this).aClass141_2851).aClass45_1965
		 .getArchiveLoaded(((Class218) this).anInt2853))
	    return null;
	ImageSprite class207
	    = ImageSprite.getSprite(((Class141) (((Class218) this)
					       .aClass141_2851)).aClass45_1965,
				  ((Class218) this).anInt2853, 0);
	if (class207 != null) {
	    ((ImageSprite) class207).heightPadding
		= ((ImageSprite) class207).widthOffset
		= ((ImageSprite) class207).widthPadding
		= ((ImageSprite) class207).heightOffset = 0;
	    if (bool)
		class207.reflectX();
	    for (int i_19_ = 0; i_19_ < i; i_19_++)
		class207.rotateCw90();
	}
	class105 = var_ha.createRasterForSprite(class207, true);
	if (class105 != null)
	    ((Class141) ((Class218) this).aClass141_2851).aClass60_1976
		.method582(class105, l, (byte) -101);
	return class105;
    }
    
    final void method1597(byte i, ByteBuffer class348_sub49) {
	anInt2850++;
	for (;;) {
	    int i_20_ = class348_sub49.getUByte();
	    if (i_20_ == 0)
		break;
	    method1595((byte) 61, i_20_, class348_sub49);
	}
	if (i != -114)
	    aClass262_2859 = null;
    }
    
    static {
	aClass114_2860 = new ServerPacket(106, 8);
    }
}
