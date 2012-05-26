/* Class239_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub5 extends Class239
{
    static int anInt5884;
    static int anInt5885;
    static int anInt5886;
    static int anInt5887;
    static int anInt5888;
    static int anInt5889;
    static int anInt5890;
    static int anInt5891 = 0;
    static int anInt5892;
    static int anInt5893;
    
    final int method1710(int i) {
	anInt5892++;
	if (i != 20014)
	    return 98;
	return 1;
    }
    
    final void method1712(int i, int i_0_) {
	((Class239) this).anInt3138 = i_0_;
	int i_1_ = 57 / ((i - 82) / 35);
	anInt5887++;
    }
    
    final int method1739(int i) {
	anInt5889++;
	if (i != -32350)
	    anInt5886 = -17;
	return ((Class239) this).anInt3138;
    }
    
    Class239_Sub5(Class348_Sub51 class348_sub51) {
	super(class348_sub51);
    }
    
    static final boolean method1740(int i, int i_2_, boolean bool) {
	if (bool != false)
	    return true;
	anInt5890++;
	if (!Class239_Sub26.method1833((byte) -128, i_2_, i)
	    && !Class348_Sub42_Sub8_Sub2.method3200(i_2_, i, (byte) 96))
	    return false;
	return true;
    }
    
    static void parseGpiInitiate(GameBuffer buffer, byte i) {
	anInt5893++;
	buffer.initiateBitAccess();
	int localId = Class348_Sub42_Sub11.localPlayerId;
	Player player = (Class132.localPlayer = ClassicLoadingScreen.onscreenPlayers[localId] = new Player());
	((Mob) player).localId = localId;
	int hash = buffer.getBits(30);
	byte z = (byte) (hash >> 28);
	int cX = hash >> 14 & 0x3fff;
	((Mob) player).xList[0] = cX - za_Sub2.baseRegionX;
	int cY = 0x3fff & hash;
	((Class318_Sub1) player).xHash = (((((Mob) player).xList[0]) << 9) + (player.method2436((byte) 91) << 8));
	((Mob) player).yList[0] = cY - Class90.baseRegionY;
	((Class318_Sub1) player).anInt6388 = (((((Mob) player).yList[0]) << -77668919) - -(player.method2436((byte) 85) << -1331342872));
	Class355.localHeightLevel = ((Class318_Sub1) player).heightLevel = ((Class318_Sub1) player).mapHeightLevel = z;
	if (NpcDefinition.isElevatedTile((((Mob) player).xList[0]), (((Mob)player).yList[0])))
	    ((Class318_Sub1) player).mapHeightLevel++;
	if (Class154.aClass348_Sub49Array2105[localId] != null)
	    player.method2452((byte) 84, (Class154.aClass348_Sub49Array2105[localId]));
	Class328_Sub1.onscreenGpiOffset = 0;
	Class286_Sub7.onscreenGpiList[Class328_Sub1.onscreenGpiOffset++] = localId;
	Class348_Sub5.gpiFlags[localId] = (byte) 0;
	Class348_Sub42_Sub4.offscreenGpiOffset = 0;
	for (int id = 1; (id ^ 0xffffffff) > -2049; id++) {
	    if ((localId ^ 0xffffffff) != (id ^ 0xffffffff)) {
		int i_9_ = buffer.getBits(18);
		int i_10_ = i_9_ >> -916532240;
		int i_11_ = (i_9_ & 0xff78) >> 1563982568;
		int i_12_ = i_9_ & 0xff;
		OffscreenPlayer offscreenPlayer  = Class348_Sub17.offscreenPlayers[id] = new OffscreenPlayer();
		((OffscreenPlayer) offscreenPlayer).aBoolean4426 = false;
		((OffscreenPlayer) offscreenPlayer).locationHash = (i_11_ << -1517233394) + ((i_10_ << 913818428) + i_12_);
		((OffscreenPlayer) offscreenPlayer).anInt4423 = 0;
		((OffscreenPlayer) offscreenPlayer).anInt4425 = -1;
		Class135_Sub1.offscreenGpiList[Class348_Sub42_Sub4.offscreenGpiOffset++] = id;
		Class348_Sub5.gpiFlags[id] = (byte) 0;
	    }
	}
	buffer.finalizeBitAccess();
    }
    
    Class239_Sub5(int i, Class348_Sub51 class348_sub51) {
	super(i, class348_sub51);
    }
    
    static final LobbyWorld getLobbyWorld(int i) {
	anInt5885++;
	if (!ModernLoadingScreen.aBoolean5013 || Class318_Sub1_Sub2.minimumWorldId > i || (i ^ 0xffffffff) < (Class239_Sub29.maximumWorldId ^ 0xffffffff))
	    return null;
	return (OutputStream_Sub1.lobbyWorlds[i - Class318_Sub1_Sub2.minimumWorldId]);
    }
    
    final int method1714(int i, int i_13_) {
	if (i != 3)
	    anInt5891 = -34;
	anInt5884++;
	return 1;
    }
    
    final void method1716(boolean bool) {
	anInt5888++;
	if (bool != false)
	    method1710(-110);
	if ((((Class239) this).anInt3138 ^ 0xffffffff) != -2
	    && (((Class239) this).anInt3138 ^ 0xffffffff) != -1)
	    ((Class239) this).anInt3138 = method1710(20014);
    }
}
