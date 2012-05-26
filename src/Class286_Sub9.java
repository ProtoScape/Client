/* Class286_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class286_Sub9 extends Class286
{
    static int anInt6306;
    static int anInt6307;
    private boolean aBoolean6308;
    static int anInt6309;
    private Class61 aClass61_6310;
    static int anInt6311;
    static int anInt6312;
    static int anInt6313;
    static int anInt6314;
    static int anInt6315;
    private boolean aBoolean6316 = false;
    private Class258_Sub2[] aClass258_Sub2Array6317;
    static int anInt6318;
    static int anInt6319;
    
    static final boolean method2174(byte i, int i_0_, int i_1_) {
	anInt6313++;
	int i_2_ = 52 % ((i - 68) / 41);
	return false;
    }
    
    final void method2133(int i) {
	anInt6318++;
	if (aBoolean6316) {
	    if (!aBoolean6308) {
		((Class286) this).aHa_Sub2_3684.method3738(-15039, 2);
		((Class286) this).aHa_Sub2_3684.method3771((byte) -84, null);
	    }
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
	    ((Class286) this).aHa_Sub2_3684.method3771((byte) -87, null);
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
	    aClass61_6310.method594('\001', 28666);
	    aBoolean6316 = false;
	} else
	    ((Class286) this).aHa_Sub2_3684.method3775(false, 0, 770, 5890);
	if (i < -75)
	    ((Class286) this).aHa_Sub2_3684.method3729(8448, (byte) -75, 8448);
    }
    
    static final int method2175(int i, byte i_3_, int i_4_) {
	anInt6319++;
	if (i_3_ >= -14)
	    return 64;
	if (i_4_ == 1 || i_4_ == 3)
	    return Class348_Sub20.anIntArray6830[i & 0x3];
	return Class84.anIntArray1450[0x3 & i];
    }
    
    final void method2140(Class258 class258, byte i, int i_5_) {
	if (i >= -89)
	    aClass258_Sub2Array6317 = null;
	((Class286) this).aHa_Sub2_3684.method3771((byte) -115, class258);
	anInt6312++;
	((Class286) this).aHa_Sub2_3684.method3761(0, i_5_);
    }
    
    private final void method2176(int i) {
	aClass61_6310 = new Class61(((Class286) this).aHa_Sub2_3684, 2);
	if (i >= -7)
	    method2140(null, (byte) 112, -64);
	anInt6314++;
	aClass61_6310.method595((byte) 105, 0);
	((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
	OpenGL.glTexGeni(8192, 9472, 34065);
	OpenGL.glTexGeni(8193, 9472, 34065);
	OpenGL.glTexGeni(8194, 9472, 34065);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glEnable(3170);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
	OpenGL.glMatrixMode(5888);
	if (!aBoolean6308) {
	    ((Class286) this).aHa_Sub2_3684.method3729(7681, (byte) 126, 8448);
	    ((Class286) this).aHa_Sub2_3684.method3762(34168, 768, (byte) -87,
						       0);
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 2);
	    ((Class286) this).aHa_Sub2_3684.method3729(260, (byte) 124, 7681);
	    ((Class286) this).aHa_Sub2_3684.method3762(34168, 768, (byte) -87,
						       0);
	    ((Class286) this).aHa_Sub2_3684.method3762(34168, 770, (byte) -87,
						       1);
	    ((Class286) this).aHa_Sub2_3684.method3775(false, 0, 770, 34167);
	} else {
	    ((Class286) this).aHa_Sub2_3684.method3729(260, (byte) 104, 7681);
	    ((Class286) this).aHa_Sub2_3684.method3762(5890, 770, (byte) -87,
						       0);
	    ((Class286) this).aHa_Sub2_3684.method3775(false, 0, 770, 34167);
	}
	((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
	aClass61_6310.method591(-1);
	aClass61_6310.method595((byte) 114, 1);
	((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	OpenGL.glDisable(3170);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	if (!aBoolean6308) {
	    ((Class286) this).aHa_Sub2_3684.method3729(8448, (byte) -9, 8448);
	    ((Class286) this).aHa_Sub2_3684.method3762(5890, 768, (byte) -87,
						       0);
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 2);
	    ((Class286) this).aHa_Sub2_3684.method3729(8448, (byte) 92, 8448);
	    ((Class286) this).aHa_Sub2_3684.method3762(5890, 768, (byte) -87,
						       0);
	    ((Class286) this).aHa_Sub2_3684.method3762(34168, 768, (byte) -87,
						       1);
	    ((Class286) this).aHa_Sub2_3684.method3775(false, 0, 770, 5890);
	} else {
	    ((Class286) this).aHa_Sub2_3684.method3729(8448, (byte) 115, 8448);
	    ((Class286) this).aHa_Sub2_3684.method3762(5890, 768, (byte) -87,
						       0);
	    ((Class286) this).aHa_Sub2_3684.method3775(false, 0, 770, 5890);
	}
	((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
	aClass61_6310.method591(-1);
    }
    
    final void method2136(int i, int i_6_, byte i_7_) {
	anInt6307++;
	if (aBoolean6316) {
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
	    ((Class286) this).aHa_Sub2_3684
		.method3771((byte) -91, aClass258_Sub2Array6317[i + -1]);
	    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
	}
	if (i_7_ > -42)
	    method2134(true, true);
    }
    
    final boolean method2137(int i) {
	anInt6315++;
	if (i > -5)
	    return false;
	return true;
    }
    
    final void method2134(boolean bool, boolean bool_8_) {
	if (bool_8_ == false) {
	    anInt6306++;
	    if (aClass61_6310 == null || !bool)
		((Class286) this).aHa_Sub2_3684.method3775(false, 0, 770,
							   34168);
	    else {
		if (!aBoolean6308) {
		    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 2);
		    ((Class286) this).aHa_Sub2_3684.method3771
			((byte) -120,
			 (((OpenGlToolkit) ((Class286) this).aHa_Sub2_3684)
			  .aClass258_Sub3_7827));
		    ((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
		}
		aClass61_6310.method594('\0', 28666);
		aBoolean6316 = true;
	    }
	}
    }
    
    final void method2139(boolean bool, byte i) {
	((Class286) this).aHa_Sub2_3684.method3729(8448, (byte) 121, 7681);
	anInt6309++;
	int i_9_ = 96 / ((i - -60) / 38);
    }
    
    Class286_Sub9(OpenGlToolkit var_ha_Sub2) {
	super(var_ha_Sub2);
	if (((OpenGlToolkit) var_ha_Sub2).aBoolean7863) {
	    aBoolean6308 = ((OpenGlToolkit) var_ha_Sub2).anInt7795 < 3;
	    int i = aBoolean6308 ? 48 : 127;
	    byte[][] is = new byte[6][4096];
	    byte[][] is_10_ = new byte[6][4096];
	    byte[][] is_11_ = new byte[6][4096];
	    int i_12_ = 0;
	    for (int i_13_ = 0; i_13_ < 64; i_13_++) {
		for (int i_14_ = 0; i_14_ < 64; i_14_++) {
		    float f = (float) i_13_ * 2.0F / 64.0F - 1.0F;
		    float f_15_ = -1.0F + 2.0F * (float) i_14_ / 64.0F;
		    float f_16_
			= (float) (1.0
				   / Math.sqrt((double) (f * f
							 + (1.0F
							    + (f_15_
							       * f_15_)))));
		    f_15_ *= f_16_;
		    f *= f_16_;
		    for (int i_17_ = 0; i_17_ < 6; i_17_++) {
			float f_18_;
			if (i_17_ == 0)
			    f_18_ = -f_15_;
			else if (i_17_ == 1)
			    f_18_ = f_15_;
			else if ((i_17_ ^ 0xffffffff) != -3) {
			    if (i_17_ != 3) {
				if ((i_17_ ^ 0xffffffff) != -5)
				    f_18_ = -f_16_;
				else
				    f_18_ = f_16_;
			    } else
				f_18_ = -f;
			} else
			    f_18_ = f;
			int i_19_;
			int i_20_;
			int i_21_;
			if (!(f_18_ > 0.0F))
			    i_19_ = i_20_ = i_21_ = 0;
			else {
			    i_19_ = (int) ((double) i
					   * Math.pow((double) f_18_, 96.0));
			    i_20_ = (int) ((double) i
					   * Math.pow((double) f_18_, 36.0));
			    i_21_ = (int) ((double) i
					   * Math.pow((double) f_18_, 12.0));
			}
			is_10_[i_17_][i_12_] = (byte) i_19_;
			is_11_[i_17_][i_12_] = (byte) i_20_;
			is[i_17_][i_12_] = (byte) i_21_;
		    }
		    i_12_++;
		}
	    }
	    aClass258_Sub2Array6317 = new Class258_Sub2[3];
	    aClass258_Sub2Array6317[0]
		= new Class258_Sub2(((Class286) this).aHa_Sub2_3684, 6406, 64,
				    false, is_10_, 6406);
	    aClass258_Sub2Array6317[1]
		= new Class258_Sub2(((Class286) this).aHa_Sub2_3684, 6406, 64,
				    false, is_11_, 6406);
	    aClass258_Sub2Array6317[2]
		= new Class258_Sub2(((Class286) this).aHa_Sub2_3684, 6406, 64,
				    false, is, 6406);
	    method2176(-88);
	}
    }
    
    static void parseOnscreenPlayerMovement(GameBuffer buffer, int id) {
	anInt6311++;
	boolean doUpdate = ((buffer.getBits(1) ^ 0xffffffff) == -2);
	if (doUpdate)
	    Class18.playerUpdateList[Class101_Sub3.amountUpdatePlayers++] = id;
	int opcode = buffer.getBits(2);
	Player player = ClassicLoadingScreen.onscreenPlayers[id];
	if (opcode == 0) {
	    if (doUpdate)
		((Player) player).isOffscreen = false;
	    else {
		if (id == Class348_Sub42_Sub11.localPlayerId)
		    throw new RuntimeException("s:lr");
		OffscreenPlayer offscreenPlayer = (Class348_Sub17.offscreenPlayers[id] = new OffscreenPlayer());
		((OffscreenPlayer) offscreenPlayer).locationHash = ((Class90.baseRegionY + (((Mob)player).yList[0]) >> 6) + ((((Mob)player).xList[0] + za_Sub2.baseRegionX) >> 6 << 14) + ((player.heightLevel) << 28));
		if ((((Player) player).anInt10524 ^ 0xffffffff) != 0)
		    ((OffscreenPlayer) offscreenPlayer).anInt4423 = ((Player) player).anInt10524;
		else
		    ((OffscreenPlayer) offscreenPlayer).anInt4423 = ((Mob) player).aClass264_10217.method2019((byte) -91);
		((OffscreenPlayer) offscreenPlayer).aBoolean4426 = ((Player) player).aBoolean10554;
		((OffscreenPlayer) offscreenPlayer).anInt4425 = (((Mob) player).anInt10275);
		if (((Player) player).anInt10553 > 0)
		    Class295.method2221(player, -28482);
		ClassicLoadingScreen.onscreenPlayers[id] = null;
		if (buffer.getBits(1) != 0)
		    Class211.parseOffscreenPlayerMovement(buffer, id);
	    }
	} else if ((opcode ^ 0xffffffff) == -2) {
	    int dOpcode = buffer.getBits(3);
	    int x = (((Mob) player).xList[0]);
	    int y = (((Mob) player).yList[0]);
	    if ((dOpcode ^ 0xffffffff) != -1) {
		if (dOpcode != 1) {
		    if ((dOpcode ^ 0xffffffff) != -3) {
			if ((dOpcode ^ 0xffffffff) == -4)
			    x--;
			else if ((dOpcode ^ 0xffffffff) != -5) {
			    if (dOpcode != 5) {
				if (dOpcode != 6) {
				    if (dOpcode == 7) {
					y++;
					x++;
				    }
				} else
				    y++;
			    } else {
				y++;
				x--;
			    }
			} else
			    x++;
		    } else {
			x++;
			y--;
		    }
		} else
		    y--;
	    } else {
		y--;
		x--;
	    }
	    if (!doUpdate)
		player.method2455(y, -26443, (IntegerVarScriptSettingLoader.aByteArray3300[id]), x);
	    else {
		((Player) player).anInt10531 = y;
		((Player) player).isOffscreen = true;
		((Player) player).anInt10549 = x;
	    }
	} else if ((opcode ^ 0xffffffff) == -3) {
	    int dOpcode = buffer.getBits(4);
	    int x = (((Mob) player).xList[0]);
	    int y = (((Mob) player).yList[0]);
	    if (dOpcode == 0) {
		x -= 2;
		y -= 2;
	    } else if ((dOpcode ^ 0xffffffff) != -2) {
		if (dOpcode != 2) {
		    if ((dOpcode ^ 0xffffffff) != -4) {
			if (dOpcode == 4) {
			    x += 2;
			    y -= 2;
			} else if ((dOpcode ^ 0xffffffff) != -6) {
			    if (dOpcode == 6) {
				y--;
				x += 2;
			    } else if ((dOpcode ^ 0xffffffff) == -8)
				x -= 2;
			    else if ((dOpcode ^ 0xffffffff) == -9)
				x += 2;
			    else if (dOpcode == 9) {
				y++;
				x -= 2;
			    } else if ((dOpcode ^ 0xffffffff) != -11) {
				if (dOpcode == 11) {
				    y += 2;
				    x -= 2;
				} else if ((dOpcode ^ 0xffffffff) == -13) {
				    y += 2;
				    x--;
				} else if ((dOpcode ^ 0xffffffff) != -14) {
				    if ((dOpcode ^ 0xffffffff) == -15) {
					y += 2;
					x++;
				    } else if ((dOpcode ^ 0xffffffff) == -16) {
					x += 2;
					y += 2;
				    }
				} else
				    y += 2;
			    } else {
				y++;
				x += 2;
			    }
			} else {
			    x -= 2;
			    y--;
			}
		    } else {
			y -= 2;
			x++;
		    }
		} else
		    y -= 2;
	    } else {
		y -= 2;
		x--;
	    }
	    if (!doUpdate)
		player.method2455(y, -26443, (IntegerVarScriptSettingLoader.aByteArray3300[id]), x);
	    else {
		((Player) player).isOffscreen = true;
		((Player) player).anInt10549 = x;
		((Player) player).anInt10531 = y;
	    }
	} else {
	    int flag = buffer.getBits(1);
	    if ((flag ^ 0xffffffff) == -1) {
		int hash = buffer.getBits(12);
		int zOff = hash >> 10;
		int xOff = 0x1f & hash >> 5;
		if (xOff > 15)
		    xOff -= 32;
		int yOff = 0x1f & hash;
		if (yOff > 15)
		    yOff -= 32;
		int cX = xOff + (((Mob) player).xList[0]);
		int cY = yOff + (((Mob) player).yList[0]);
		if (!doUpdate)
		    player.method2455(cY, -26443, (IntegerVarScriptSettingLoader.aByteArray3300[id]), cX);
		else {
		    ((Player) player).anInt10531 = cY;
		    ((Player) player).anInt10549 = cX;
		    ((Player) player).isOffscreen = true;
		}
		player.heightLevel = player.mapHeightLevel = (byte) (0x3 & player.heightLevel + zOff);
		if (NpcDefinition.isElevatedTile(cX, cY))
		    player.mapHeightLevel++;
		if (Class348_Sub42_Sub11.localPlayerId == id) {
		    if (player.heightLevel != Class355.localHeightLevel)
			Class348_Sub16_Sub2.heightLevelChanged = true;
		    Class355.localHeightLevel= player.heightLevel;
		}
	    } else {
		int hash = buffer.getBits(30);
		int zOff = hash >> 28;
		int xOff = 0x3fff & hash >> 14;
		int yOff = 0x3fff & hash;
		int cX = ((xOff + ((((Mob) player).xList[0]) + za_Sub2.baseRegionX) & 0x3fff) - za_Sub2.baseRegionX);
		int cY = (-Class90.baseRegionY + (0x3fff & (yOff + Class90.baseRegionY + (((Mob) player).yList[0]))));
		if (doUpdate) {
		    ((Player)  player).isOffscreen = true;
		    ((Player) player).anInt10531 = cY;
		    ((Player) player).anInt10549 = cX;
		} else
		    player.method2455(cY, -26443, (IntegerVarScriptSettingLoader.aByteArray3300[id]), cX);
		player.heightLevel = player.mapHeightLevel = (byte) ((player.heightLevel) + zOff & 0x3);
		if (NpcDefinition.isElevatedTile(cX, cY))
		    player.mapHeightLevel++;
		if ((id ^ 0xffffffff) == (Class348_Sub42_Sub11.localPlayerId ^ 0xffffffff))
		    Class355.localHeightLevel = (player.heightLevel);
	    }
	}
    }
}
