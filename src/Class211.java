/* Class211 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class211
{
    int anInt2731;
    static int anInt2732;
    static int anInt2733;
    int anInt2734;
    private int anInt2735;
    static int anInt2736;
    boolean aBoolean2737;
    private int anInt2738;
    private int anInt2739;
    private int anInt2740;
    static int anInt2741;
    short[] aShortArray2742;
    private int anInt2743;
    static int[] anIntArray2744 = new int[2];
    Class348_Sub1 aClass348_Sub1_2745;
    static int anInt2746;
    static int anInt2747;
    static int anInt2748;
    boolean aBoolean2749;
    
    static boolean parseOffscreenPlayerMovement(GameBuffer buffer, int id) {
	anInt2732++;
	int opcode = buffer.getBits(2);
	if (opcode == 0) {
	    if (buffer.getBits(1) != 0)
		parseOffscreenPlayerMovement(buffer, id);
	    int xOff = buffer.getBits(6);
	    int yOff = buffer.getBits(6);
	    boolean doUpdate = (buffer.getBits(1) == 1);
	    if (doUpdate)
		Class18.playerUpdateList[Class101_Sub3.amountUpdatePlayers++] = id;
	    if (ClassicLoadingScreen.onscreenPlayers[id] != null)
		throw new RuntimeException("hr:lr");
	    OffscreenPlayer offscreenPlayer = Class348_Sub17.offscreenPlayers[id];
	    Player player = (ClassicLoadingScreen.onscreenPlayers[id] = new Player());
	    ((Mob) player).localId = id;
	    if (Class154.aClass348_Sub49Array2105[id] != null)
		player.method2452 ((byte) 84, Class154.aClass348_Sub49Array2105[id]);
	    player.method2435((byte) -108, (offscreenPlayer.anInt4423), true);
	    ((Mob) player).anInt10275 = offscreenPlayer.anInt4425;
	    int hash = offscreenPlayer.locationHash;
	    int z = hash >> 28;
	    int rX = (0x3fcd8e & hash) >> 14;
	    int rY = 0xff & hash;
	    int cX = xOff + (rX << 6) - za_Sub2.baseRegionX;
	    player.aBoolean10554 = offscreenPlayer.aBoolean4426;
	    int cY = yOff + (rY << 6) - Class90.baseRegionY;
	    ((Mob) player).aByteArray10321[0] = IntegerVarScriptSettingLoader.aByteArray3300[id];
	    ((Class318_Sub1) player).heightLevel = ((Class318_Sub1) player).mapHeightLevel = (byte) z;
	    if (NpcDefinition.isElevatedTile(cX, cY))
		((Class318_Sub1) player).mapHeightLevel++;
	    player.setLocalCoords(cY, cX);
	    player.isOffscreen = false;
	    Class348_Sub17.offscreenPlayers[id] = null;
	    return true;
	}
	if (opcode == 1) {
	    int zOff = buffer.getBits(2);
	    int hash = ((OffscreenPlayer) Class348_Sub17.offscreenPlayers[id]).locationHash;
	    ((OffscreenPlayer) Class348_Sub17.offscreenPlayers[id]).locationHash = (0xfffffff & hash) + (((hash >> 28) + zOff & 0x3) << 28);
	    return false;
	}
	if (opcode == 2) {
	    int hash = buffer.getBits(5);
	    int zOff = hash >> 3;
	    int dOpcode = 0x7 & hash;
	    int locationHash = ((OffscreenPlayer) Class348_Sub17.offscreenPlayers[id]).locationHash;
	    int newZ = 0x3 & zOff + (locationHash >> 28);
	    int rX = (locationHash & 0x3fd366) >> 14;
	    int rY = 0xff & locationHash;
	    if ((dOpcode) == 0) {
		rX--;
		rY--;
	    }
	    if (dOpcode == 1)
		rY--;
	    if ((dOpcode) == 2) {
		rY--;
		rX++;
	    }
	    if (dOpcode == 3)
		rX--;
	    if ((dOpcode ^ 0xffffffff) == -5)
		rX++;
	    if (dOpcode == 5) {
		rX--;
		rY++;
	    }
	    if (dOpcode == 6)
		rY++;
	    if ((dOpcode ^ 0xffffffff) == -8) {
		rX++;
		rY++;
	    }
	    ((OffscreenPlayer) Class348_Sub17.offscreenPlayers[id]).locationHash = rY + ((newZ << 28) + (rX << 14));
	    return false;
	}
	int hash = buffer.getBits(18);
	int zOff = hash >> 16;
	int xOff = 0xff & hash >> 8;
	int yOff = 0xff & hash;
	int locationHash = ((OffscreenPlayer) Class348_Sub17.offscreenPlayers[id]).locationHash;
	int newZ = 0x3 & (locationHash >> 28) + zOff;
	int newX = xOff + (locationHash >> 14) & 0xff;
	int newY = 0xff & locationHash + yOff;
	((OffscreenPlayer) Class348_Sub17.offscreenPlayers[id]).locationHash  = newY + (newZ << 28) + (newX << 14);
	return false;
    }
    
    final void method1539(int i, byte i_27_, int i_28_, int i_29_, int i_30_) {
	anInt2741++;
	if (i_27_ <= 114)
	    parseOffscreenPlayerMovement(null, -108);
	anInt2735 = i_28_;
	anInt2738 = i;
	anInt2743 = i_30_;
	anInt2740 = i_29_;
    }
    
    static final void method1540(int i, int i_31_, int i_32_) {
	anInt2746++;
	WidgetVariable class348_sub42_sub15
	    = Class318_Sub9_Sub1.method2516(i_31_, (byte) 105, 13);
	class348_sub42_sub15.method3246(-25490);
	((WidgetVariable) class348_sub42_sub15).intArg = i_32_;
	if (i >= -84)
	    anIntArray2744 = null;
    }
    
    private final void method1541(int i, AbstractToolkit var_ha, int i_33_, int i_34_,
				  int i_35_, int i_36_, int i_37_) {
	anInt2736++;
	if (i_35_ == 3)
	    ((Class211) this).aClass348_Sub1_2745
		= var_ha.method3690(i_34_, i, i_33_, i_37_, i_36_, 1.0F);
    }
    
    private final void method1542(int i) {
	int i_38_ = ((Class211) this).anInt2734;
    while_70_:
	do {
	while_69_:
	    do {
	    while_68_:
		do {
		while_67_:
		    do {
		    while_66_:
			do {
			while_65_:
			    do {
			    while_64_:
				do {
				while_63_:
				    do {
				    while_62_:
					do {
					while_61_:
					    do {
					    while_60_:
						do {
						while_59_:
						    do {
						    while_58_:
							do {
							while_57_:
							    do {
								do {
								    if (i_38_
									!= 2) {
									if ((i_38_
									     ^ 0xffffffff)
									    != -4) {
									    if (i_38_ != 4) {
										if ((i_38_ ^ 0xffffffff) != -6) {
										    if ((i_38_ ^ 0xffffffff) != -13) {
											if ((i_38_ ^ 0xffffffff) != -14) {
											    if (i_38_ != 10) {
												if ((i_38_ ^ 0xffffffff) != -12) {
												    if ((i_38_ ^ 0xffffffff) != -7) {
													if (i_38_ != 7) {
													    if ((i_38_ ^ 0xffffffff) != -9) {
														if ((i_38_ ^ 0xffffffff) != -10) {
														    if ((i_38_ ^ 0xffffffff) != -15) {
															if (i_38_ != 15) {
															    if (i_38_ == 16)
																break while_68_;
															    break while_69_;
															}
														    } else
															break while_66_;
														    break while_67_;
														}
													    } else
														break while_64_;
													    break while_65_;
													}
												    } else
													break while_62_;
												    break while_63_;
												}
											    } else
												break while_60_;
											    break while_61_;
											}
										    } else
											break while_58_;
										    break while_59_;
										}
									    } else
										break;
									    break while_57_;
									}
								    } else {
									anInt2743
									    = 2048;
									anInt2738
									    = 0;
									anInt2735
									    = 2048;
									anInt2740
									    = 1;
									break while_70_;
								    }
								    anInt2738
									= 0;
								    anInt2743
									= 2048;
								    anInt2740
									= 1;
								    anInt2735
									= 4096;
								    break while_70_;
								} while (false);
								anInt2738 = 0;
								anInt2740 = 4;
								anInt2743
								    = 2048;
								anInt2735
								    = 2048;
								break while_70_;
							    } while (false);
							    anInt2735 = 8192;
							    anInt2740 = 4;
							    anInt2743 = 2048;
							    anInt2738 = 0;
							    break while_70_;
							} while (false);
							anInt2735 = 2048;
							anInt2740 = 2;
							anInt2738 = 0;
							anInt2743 = 2048;
							break while_70_;
						    } while (false);
						    anInt2743 = 2048;
						    anInt2738 = 0;
						    anInt2740 = 2;
						    anInt2735 = 8192;
						    break while_70_;
						} while (false);
						anInt2743 = 512;
						anInt2740 = 3;
						anInt2738 = 1536;
						anInt2735 = 2048;
						break while_70_;
					    } while (false);
					    anInt2740 = 3;
					    anInt2743 = 512;
					    anInt2738 = 1536;
					    anInt2735 = 4096;
					    break while_70_;
					} while (false);
					anInt2738 = 1280;
					anInt2740 = 3;
					anInt2743 = 768;
					anInt2735 = 2048;
					break while_70_;
				    } while (false);
				    anInt2738 = 1280;
				    anInt2740 = 3;
				    anInt2735 = 4096;
				    anInt2743 = 768;
				    break while_70_;
				} while (false);
				anInt2738 = 1024;
				anInt2735 = 2048;
				anInt2743 = 1024;
				anInt2740 = 3;
				break while_70_;
			    } while (false);
			    anInt2743 = 1024;
			    anInt2735 = 4096;
			    anInt2740 = 3;
			    anInt2738 = 1024;
			    break while_70_;
			} while (false);
			anInt2740 = 1;
			anInt2738 = 1280;
			anInt2735 = 2048;
			anInt2743 = 768;
			break while_70_;
		    } while (false);
		    anInt2735 = 4096;
		    anInt2743 = 512;
		    anInt2740 = 1;
		    anInt2738 = 1536;
		    break while_70_;
		} while (false);
		anInt2735 = 8192;
		anInt2740 = 1;
		anInt2743 = 256;
		anInt2738 = 1792;
		break while_70_;
	    } while (false);
	    anInt2735 = 2048;
	    anInt2743 = 2048;
	    anInt2738 = 0;
	    anInt2740 = 0;
	} while (false);
	if (i == 32402)
	    anInt2748++;
    }
    
    public static void method1543(int i) {
	anIntArray2744 = null;
	if (i != -4524)
	    anInt2747 = 24;
    }
    
    final void method1544(int i, boolean bool, int i_39_) {
	if (i != 8688)
	    method1544(86, false, 92);
	anInt2733++;
	int i_40_;
    while_74_:
	do {
	    if (bool)
		i_40_ = 2048;
	    else {
		int i_41_ = 0x7ff & anInt2735 * i_39_ / 50 + anInt2739;
		int i_42_ = anInt2740;
	    while_73_:
		do {
		while_72_:
		    do {
		    while_71_:
			do {
			    do {
				if (i_42_ != 1) {
				    if ((i_42_ ^ 0xffffffff) != -4) {
					if (i_42_ != 4) {
					    if ((i_42_ ^ 0xffffffff) != -3) {
						if (i_42_ == 5)
						    break while_72_;
						break while_73_;
					    }
					} else
					    break;
					break while_71_;
				    }
				} else {
				    i_40_ = ((Class70.sineTable
					      [i_41_ << 680948963])
					     >> 2080897156) + 1024;
				    break while_74_;
				}
				i_40_ = (IndexTable.anIntArray3726[i_41_]
					 >> -813205215);
				break while_74_;
			    } while (false);
			    i_40_ = i_41_ >> -294230678 << 611113515;
			    break while_74_;
			} while (false);
			i_40_ = i_41_;
			break while_74_;
		    } while (false);
		    i_40_ = ((i_41_ ^ 0xffffffff) <= -1025 ? -i_41_ + 2048
			     : i_41_) << -203822847;
		    break while_74_;
		} while (false);
		i_40_ = 2048;
	    }
	} while (false);
	((Class211) this).aClass348_Sub1_2745.method2716
	    (-1, ((float) ((anInt2743 * i_40_ >> -1367360181) + anInt2738)
		  / 2048.0F));
    }
    
    protected Class211() {
	if (IndexTable.anIntArray3726 == null)
	    Class141.method1177((byte) 122);
	method1542(32402);
    }
    
    Class211(AbstractToolkit var_ha, ByteBuffer class348_sub49, int i) {
	try {
	    if (IndexTable.anIntArray3726 == null)
		Class141.method1177((byte) 122);
	    ((Class211) this).anInt2731 = class348_sub49.getUByte();
	    ((Class211) this).aBoolean2737
		= (0x8 & ((Class211) this).anInt2731) != 0;
	    ((Class211) this).aBoolean2749
		= (((Class211) this).anInt2731 & 0x10 ^ 0xffffffff) != -1;
	    ((Class211) this).anInt2731 = 0x7 & ((Class211) this).anInt2731;
	    int i_43_ = class348_sub49.getShort() << i;
	    int i_44_ = class348_sub49.getShort() << i;
	    int i_45_ = class348_sub49.getShort() << i;
	    int i_46_ = class348_sub49.getUByte();
	    int i_47_ = 1 + i_46_ * 2;
	    ((Class211) this).aShortArray2742 = new short[i_47_];
	    for (int i_48_ = 0;
		 ((((Class211) this).aShortArray2742.length ^ 0xffffffff)
		  < (i_48_ ^ 0xffffffff));
		 i_48_++) {
		int i_49_ = (short) class348_sub49.getShort();
		int i_50_ = i_49_ >>> 1797513576;
		if ((i_50_ ^ 0xffffffff) <= (i_47_ ^ 0xffffffff))
		    i_50_ = i_47_ - 1;
		int i_51_ = 0xff & i_49_;
		if (-i_50_ + i_47_ < i_51_)
		    i_51_ = i_47_ - i_50_;
		((Class211) this).aShortArray2742[i_48_]
		    = (short) Class273.bitOr(i_51_, i_50_ << 775681064);
	    }
	    i_46_ = ((i_46_ << Class362.anInt4459)
		     + Class348_Sub23_Sub2.anInt9037);
	    int i_52_
		= (Class10.anIntArray179 == null
		   ? (Class126.hslColorTable
		      [Class25.method303(class348_sub49.getShort(),
					 30) & 0xffff])
		   : (Class10.anIntArray179
		      [class348_sub49.getShort()]));
	    int i_53_ = class348_sub49.getUByte();
	    anInt2739 = (0xe0 & i_53_) << -607684957;
	    ((Class211) this).anInt2734 = 0x1f & i_53_;
	    if (((Class211) this).anInt2734 != 31)
		method1542(32402);
	    method1541(i_45_, var_ha, i_44_, i_43_, 3, i_52_, i_46_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("ro.<init>("
					     + (var_ha != null ? "{...}"
						: "null")
					     + ','
					     + (class348_sub49 != null
						? "{...}" : "null")
					     + ',' + i + ')'));
	}
    }
}
