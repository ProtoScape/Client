/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;
import java.net.URL;

final class Class88
{
    static int anInt1492;
    static int anInt1493;
    static int anInt1494;
    static int anInt1495;
    static int anInt1496;
    static int anInt1497 = 0;
    static int anInt1498;
    static int anInt1499;
    static boolean aBoolean1500 = false;
    static int anInt1501;
    static int anInt1502;
    Class318_Sub9 aClass318_Sub9_1503 = new Class318_Sub9();
    static int anInt1504;
    private Class318_Sub9 aClass318_Sub9_1505;
    
    final int method840(int i) {
	anInt1496++;
	int i_0_ = i;
	Class318_Sub9 class318_sub9
	    = (((Class318_Sub9) ((Class88) this).aClass318_Sub9_1503)
	       .aClass318_Sub9_6469);
	while (((Class88) this).aClass318_Sub9_1503 != class318_sub9) {
	    class318_sub9
		= ((Class318_Sub9) class318_sub9).aClass318_Sub9_6469;
	    i_0_++;
	}
	return i_0_;
    }
    
    static final Class227[] method841(int i) {
	if (i > -126)
	    method847(null, -66);
	anInt1504++;
	return (new Class227[]
		{ Class191.aClass227_2568, Class100.aClass227_1591,
		  Class6.aClass227_151 });
    }
    
    static final void method842(boolean bool) {
	anInt1501++;
	Class138.aClass46Array1942 = null;
	if (Class59_Sub1.aBoolean5300
	    && (Class348_Sub42_Sub12.method3229() ^ 0xffffffff) != -2)
	    OutputStream_Sub1.method132(106,
					((Class240.anInt4674 ^ 0xffffffff)
					 == -4) || Class240.anInt4674 == 7,
					za_Sub1.method3439(107), 0,
					Class348_Sub44.method3306((byte) -111),
					0);
	int i = 0;
	if (bool != false)
	    method847(null, -110);
	int i_1_ = 0;
	if (Class59_Sub1.aBoolean5300) {
	    i = s_Sub3.method4008((byte) -124);
	    i_1_ = Class16.method260(false);
	}
	Class159.method1252(i_1_, r.anInt9721, i_1_, -1, i,
			    i + Class321.windowWidth,
			    i_1_ - -Class348_Sub42_Sub8_Sub2.windowHeight,
			    (byte) 116, i);
	if (Class138.aClass46Array1942 != null) {
	    Class348_Sub40_Sub7.method3064
		(i, EntryElementLoader.anInt4792, true, Class348_Sub1.anInt6555, i_1_,
		 ((Widget) Class331.aClass46_4130).anInt760,
		 i + Class321.windowWidth, false, Class138.aClass46Array1942,
		 -1412584499, i_1_ - -Class348_Sub42_Sub8_Sub2.windowHeight);
	    Class138.aClass46Array1942 = null;
	}
    }
    
    static final void method843(byte i) {
	anInt1499++;
	if (Class225.anInt2955 != 0
	    && (Class225.anInt2955 ^ 0xffffffff) != -6) {
	    try {
		int i_2_;
		if (Class318_Sub1_Sub1_Sub2.anInt9971 != 0)
		    i_2_ = 2000;
		else
		    i_2_ = 250;
		if (i_2_ < ++Class11.anInt197) {
		    if (Class348_Sub40_Sub8.gameConnection != null) {
			Class348_Sub40_Sub8.gameConnection
			    .method1700((byte) 36);
			Class348_Sub40_Sub8.gameConnection = null;
		    }
		    if (Class318_Sub1_Sub1_Sub2.anInt9971 >= 3) {
			Class225.anInt2955 = 0;
			Class14_Sub4.method254(-5, (byte) -111);
			return;
		    }
		    if ((Class239_Sub12.anInt5969 ^ 0xffffffff) != -3)
			ItemLoader.lobbyConnectionNode.method1259(0);
		    else
			Class3.currentConnection.method1259(0);
		    Class318_Sub1_Sub1_Sub2.anInt9971++;
		    Class225.anInt2955 = 1;
		    Class11.anInt197 = 0;
		}
		if (Class225.anInt2955 == 1) {
		    if (Class239_Sub12.anInt5969 == 2)
			Class130_Sub1.aClass144_5800
			    = (Class3.currentConnection.method1262
			       (Class348_Sub23_Sub1.signlink,
				(byte) 36));
		    else
			Class130_Sub1.aClass144_5800
			    = (ItemLoader.lobbyConnectionNode.method1262
			       (Class348_Sub23_Sub1.signlink,
				(byte) 36));
		    Class225.anInt2955 = 2;
		}
		if ((Class225.anInt2955 ^ 0xffffffff) == -3) {
		    if (Class130_Sub1.aClass144_5800.state == 2)
			throw new IOException();
		    if (Class130_Sub1.aClass144_5800.state != 1)
			return;
		    Class348_Sub40_Sub8.gameConnection
			= Class348_Sub23_Sub3.createSocketConnection(((Socket)
							  (Class130_Sub1
							   .aClass144_5800
							   .returnObj)),
							 (byte) -118, 7500);
		    Class130_Sub1.aClass144_5800 = null;
		    Class348_Sub3.method2739(0);
		    BufferedPacket class348_sub47 = Class203.method1478(true);
		    ((BufferedPacket) class348_sub47).buffer.putByte(((HandshakePacket) Class178.lobbyPacket).opcode);
		    Class348_Sub42_Sub14.queuePacket(9, class348_sub47);
		    Class239_Sub18.method1802(0);
		    Class225.anInt2955 = 3;
		}
		if ((Class225.anInt2955 ^ 0xffffffff) == -4) {
		    if (!Class348_Sub40_Sub8.gameConnection.method1705(1, 107))
			return;
		    Class348_Sub40_Sub8.gameConnection.read
			(1, 0, (byte) -118,
			 (((ByteBuffer) Class299.gameBuffer)
			  .payload));
		    int i_3_ = ((((ByteBuffer) Class299.gameBuffer).payload[0]) & 0xff);
		    if (i_3_ != 0) {
			Class225.anInt2955 = 0;
			Class14_Sub4.method254(i_3_, (byte) -113);
			Class348_Sub40_Sub8.gameConnection
			    .method1700((byte) 36);
			Class348_Sub40_Sub8.gameConnection = null;
			Class152.method1215((byte) 3);
			return;
		    }
		    ((ByteBuffer) Class299.gameBuffer)
			.position
			= 0;
		    ByteBuffer credentialsBuffer = new ByteBuffer(518);
		    int[] cipherKeys = new int[4];
		    cipherKeys[0] = (int) (Math.random() * 9.9999999E7);
		    cipherKeys[1] = (int) (9.9999999E7 * Math.random());
		    cipherKeys[3] = (int) (9.9999999E7 * Math.random());
		    cipherKeys[2] = (int) (9.9999999E7 * Math.random());
		    credentialsBuffer.putByte(10);
		    credentialsBuffer.putInt(cipherKeys[0]);
		    credentialsBuffer.putInt(cipherKeys[1]);
		    credentialsBuffer.putInt(cipherKeys[2]);
		    credentialsBuffer.putInt(cipherKeys[3]);
		    credentialsBuffer.putLong(0L);
		    credentialsBuffer.putJStr((byte) -5, Class186.playerUsername);
		    credentialsBuffer.putLong(Class348_Sub33.aLong6966);
		    credentialsBuffer.putLong(DummyOutputstream.aLong108);
		    credentialsBuffer.applyRSA((Class318_Sub1_Sub4.aBigInteger8762), AbstractImageFetcher.aBigInteger6921);
		    Class348_Sub3.method2739(0);
		    BufferedPacket class348_sub47 = Class203.method1478(true);
		    GameBuffer buff = (((BufferedPacket) class348_sub47).buffer);
		    if ((Class239_Sub12.anInt5969 ^ 0xffffffff) != -3) {
			buff.putByte(((HandshakePacket) Class178.lobbyCredentialsPacket).opcode);
			buff.putShort(0);
			int startOffset = ((ByteBuffer) buff).position;
			buff.putInt(634);
			buff.putBytes(((ByteBuffer) credentialsBuffer).position, 0, ((ByteBuffer) credentialsBuffer).payload);
			int xteaOffset = ((ByteBuffer) buff).position;
			buff.putJStr((byte) -5, Class64_Sub3.playerPassword);
			buff.putByte(((GameMode) (Class348_Sub42_Sub8_Sub2.gameType)).id);
			buff.putByte(Class348_Sub33.gameLanguage);
			s_Sub2.getClientSignature(buff, (byte) 55);
			buff.putJStr((byte) -5, Class239_Sub12.clientSettings);
			buff.putInt(SocketWorker.affiliateId);
			Class157.method1244(92, buff);
			buff.encipherXtea(cipherKeys, xteaOffset, (((ByteBuffer) buff).position));
			buff.finalizeVarShort(1809639944, -startOffset + (((ByteBuffer) buff).position));
		    } else {
			if (Class240.anInt4674 != 13)
			    buff.putByte
				(((HandshakePacket) Class178.gamePacket).opcode);
			else
			    buff.putByte
				(((HandshakePacket) Class178.aClass29_2344).opcode);
			buff.putShort(0);
			int i_6_
			    = ((ByteBuffer) buff).position;
			buff.putInt(634);
			buff.putBytes
			    (((ByteBuffer) credentialsBuffer).position, 0,
			     ((ByteBuffer) credentialsBuffer).payload);
			int i_7_
			    = ((ByteBuffer) buff).position;
			buff
			    .putJStr((byte) -5, Class64_Sub3.playerPassword);
			buff.putByte((RuntimeException_Sub1
							.anInt4596));
			buff.putByte(Class348_Sub42_Sub12
							   .method3229());
			buff.putShort(Class321.windowWidth);
			buff.putShort
			    (Class348_Sub42_Sub8_Sub2.windowHeight);
			buff.putByte
			    (((Class348_Sub51) BitmapTable.aClass348_Sub51_3959)
				 .aClass239_Sub20_7248.method1808(-32350));
			s_Sub2.getClientSignature(buff, (byte) 55);
			buff
			    .putJStr((byte) -5, Class239_Sub12.clientSettings);
			buff.putInt(SocketWorker.affiliateId);
			ByteBuffer class348_sub49_8_
			    = BitmapTable.aClass348_Sub51_3959.method3427(24);
			buff.putByte((((ByteBuffer)
							 class348_sub49_8_)
							.position));
			buff.putBytes
			    (((ByteBuffer) class348_sub49_8_).position, 0,
			     (((ByteBuffer) class348_sub49_8_)
			      .payload));
			r.aBoolean9719 = true;
			ByteBuffer class348_sub49_9_
			    = new ByteBuffer(Class348_Sub40_Sub20
						     .aClass348_Sub4_9264
						     .method2746((byte) -76));
			Class348_Sub40_Sub20.aClass348_Sub4_9264
			    .method2747(1, class348_sub49_9_);
			buff.putBytes
			    ((((ByteBuffer) class348_sub49_9_)
			      .payload).length,
			     0,
			     (((ByteBuffer) class348_sub49_9_)
			      .payload));
			buff
			    .putShort(Class135_Sub1.anInt4718);
			buff.putLong(TextureLoader.aLong4615);
			buff.putByte
			    (Class14_Sub1.aString8605 == null ? 0 : 1);
			if (Class14_Sub1.aString8605 != null)
			    buff.putJStr((byte) -5,
							   (Class14_Sub1
							    .aString8605));
			buff.putByte
			    ((!Class348_Sub40_Sub31.method3131((byte) 50,
							       "jagtheora")
			      ? 0 : 1));
			Class157.method1244(64, buff);
			buff.encipherXtea(cipherKeys, i_7_,
						       (((ByteBuffer)
							 buff)
							.position));
			buff.finalizeVarShort
			    (1809639944,
			     -i_6_ + (((ByteBuffer) buff)
				      .position));
		    }
		    Class348_Sub42_Sub14.queuePacket(-48, class348_sub47);
		    Class239_Sub18.method1802(0);
		    Class348_Sub23_Sub2.outgoingGameIsaac = new IsaacCipher(cipherKeys);
		    for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -5; i_10_++)
			cipherKeys[i_10_] += 50;
		    Class299.gameBuffer.setEncryption(-111, cipherKeys);
		    Class225.anInt2955 = 4;
		}
		if (Class225.anInt2955 == 4) {
		    if (!Class348_Sub40_Sub8.gameConnection.method1705(1, 94))
			return;
		    Class348_Sub40_Sub8.gameConnection.read
			(1, 0, (byte) -117,
			 (((ByteBuffer) Class299.gameBuffer)
			  .payload));
		    int i_11_ = ((((ByteBuffer)
				   Class299.gameBuffer)
				  .payload[0])
				 & 0xff);
		    if (i_11_ != 21) {
			if (i_11_ == 29)
			    Class225.anInt2955 = 13;
			else {
			    if ((i_11_ ^ 0xffffffff) == -2) {
				Class225.anInt2955 = 5;
				Class14_Sub4.method254(i_11_, (byte) -125);
				return;
			    }
			    if (i_11_ != 2) {
				if ((i_11_ ^ 0xffffffff) != -16) {
				    if ((i_11_ ^ 0xffffffff) == -24
					&& (Class318_Sub1_Sub1_Sub2.anInt9971
					    ^ 0xffffffff) > -4) {
					Class225.anInt2955 = 1;
					Class318_Sub1_Sub1_Sub2.anInt9971++;
					Class11.anInt197 = 0;
					Class348_Sub40_Sub8.gameConnection
					    .method1700((byte) 36);
					Class348_Sub40_Sub8.gameConnection
					    = null;
				    } else {
					Class225.anInt2955 = 0;
					Class14_Sub4.method254(i_11_,
							       (byte) -87);
					Class348_Sub40_Sub8.gameConnection
					    .method1700((byte) 36);
					Class348_Sub40_Sub8.gameConnection
					    = null;
					Class152.method1215((byte) 3);
					return;
				    }
				    return;
				}
				Class225.anInt2955 = 14;
				Class348_Sub40_Sub25.currentPacketSize = -2;
			    } else
				Class225.anInt2955 = 8;
			}
		    } else
			Class225.anInt2955 = 7;
		}
		if ((Class225.anInt2955 ^ 0xffffffff) == -7) {
		    Class348_Sub3.method2739(0);
		    BufferedPacket class348_sub47 = Class203.method1478(true);
		    GameBuffer class348_sub49_sub2
			= (((BufferedPacket) class348_sub47)
			   .buffer);
		    class348_sub49_sub2
			.setEncryption(-18, Class348_Sub23_Sub2.outgoingGameIsaac);
		    class348_sub49_sub2.encipherPacket((((HandshakePacket)
						     Class178.aClass29_2351)
						    .opcode),
						   18676);
		    Class348_Sub42_Sub14.queuePacket(-87, class348_sub47);
		    Class239_Sub18.method1802(0);
		    Class225.anInt2955 = 4;
		} else if (Class225.anInt2955 == 7) {
		    if (Class348_Sub40_Sub8.gameConnection.method1705(1,
								      118)) {
			Class348_Sub40_Sub8.gameConnection.read
			    (1, 0, (byte) -109,
			     (((ByteBuffer)
			       Class299.gameBuffer)
			      .payload));
			int i_12_
			    = 0xff & (((ByteBuffer)
				       Class299.gameBuffer)
				      .payload[0]);
			Class225.anInt2955 = 0;
			Class63.anInt1121 = (3 + i_12_) * 60;
			Class14_Sub4.method254(21, (byte) -95);
			Class348_Sub40_Sub8.gameConnection
			    .method1700((byte) 36);
			Class348_Sub40_Sub8.gameConnection = null;
			Class152.method1215((byte) 3);
		    }
		} else if (Class225.anInt2955 == 13) {
		    if (Class348_Sub40_Sub8.gameConnection.method1705(1,
								      102)) {
			Class348_Sub40_Sub8.gameConnection.read
			    (1, 0, (byte) -128,
			     (((ByteBuffer)
			       Class299.gameBuffer)
			      .payload));
			Class225.anInt2955 = 0;
			Class348_Sub42_Sub7.anInt9541
			    = 0xff & (((ByteBuffer)
				       Class299.gameBuffer)
				      .payload[0]);
			Class14_Sub4.method254(29, (byte) -97);
			Class348_Sub40_Sub8.gameConnection
			    .method1700((byte) 36);
			Class348_Sub40_Sub8.gameConnection = null;
			Class152.method1215((byte) 3);
		    }
		} else if ((Class225.anInt2955 ^ 0xffffffff) == -9) {
		    if (Class348_Sub40_Sub8.gameConnection.method1705(1,
								      107)) {
			Class348_Sub40_Sub8.gameConnection.read
			    (1, 0, (byte) -107,
			     (((ByteBuffer)
			       Class299.gameBuffer)
			      .payload));
			Class76.anInt1288
			    = 0xff & (((ByteBuffer)
				       Class299.gameBuffer)
				      .payload[0]);
			Class225.anInt2955 = 9;
		    }
		} else {
		    if ((Class225.anInt2955 ^ 0xffffffff) == -10) {
			GameBuffer buffer
			    = Class299.gameBuffer;
			if ((Class239_Sub12.anInt5969 ^ 0xffffffff) != -3) {
			    if (!Class348_Sub40_Sub8.gameConnection.method1705(Class76.anInt1288, 107))
				return;
			    Class348_Sub40_Sub8.gameConnection.read(Class76.anInt1288, 0, (byte) 85, (((ByteBuffer) buffer).payload));
			    ((ByteBuffer) buffer).position = 0;
			    Class192.playerRights = buffer.getUByte();
			    Class125.anInt4919 = buffer.getUByte();
			    Class348_Sub40_Sub3.aBoolean9103 = buffer.getUByte() == 1;
			    Class133.aBoolean1915 = buffer.getUByte() == 1;
			    ColorNode.aBoolean4903 = (buffer.getUByte()) == 1;
			    Class116.anInt1758 = buffer.getWord(13638);
			    Class206.aBoolean4888 = (Class116.anInt1758 ^ 0xffffffff) < -1;
			    Class135_Sub1.anInt4716
				= buffer.getShort();
			    Class322.anInt4026
				= buffer.getShort();
			    Class206.anInt4870
				= buffer.getShort();
			    VarpHandler.anInt5065
				= buffer.getDword();
			    Class348_Sub42_Sub6.aClass144_9536
				= Class348_Sub23_Sub1.signlink
				      .method2232(116, VarpHandler.anInt5065);
			    Class216.anInt4976
				= buffer.getUByte();
			    Class130_Sub1.anInt5797
				= buffer.getShort();
			    Class348_Sub6.anInt6632
				= buffer.getShort();
			    Class290.aBoolean3706
				= (buffer.getUByte()
				   ^ 0xffffffff) == -2;
			    ((Player)
			     Class132.localPlayer)
				.aString10544
				= ((Player)
				   Class132.localPlayer)
				      .username
				= s_Sub2.aString8265
				= buffer.getJStr2(-13487);
			    ClientApplet.anInt37
				= buffer.getUByte();
			    Class348_Sub1.anInt6551
				= buffer.getDword();
			    aa_Sub2.aClass161_5199 = new ConnectionMode();
			    ((ConnectionMode) aa_Sub2.aClass161_5199).portOffset
				= buffer.getShort();
			    if ((((ConnectionMode) aa_Sub2.aClass161_5199).portOffset
				 ^ 0xffffffff)
				== -65536)
				((ConnectionMode) aa_Sub2.aClass161_5199).portOffset
				    = -1;
			    ((ConnectionMode) aa_Sub2.aClass161_5199).address
				= buffer.getJStr2(-13487);
			    if (Class55_Sub1.aClass364_5271
				!= Class8.modeWhere) {
				((ConnectionMode) aa_Sub2.aClass161_5199).anInt2138
				    = (50000
				       + (((ConnectionMode) aa_Sub2.aClass161_5199)
					  .portOffset));
				((ConnectionMode) aa_Sub2.aClass161_5199).anInt2148
				    = (40000
				       + (((ConnectionMode) aa_Sub2.aClass161_5199)
					  .portOffset));
			    }
			    if (Class8.modeWhere != Class76.aClass364_1279
				&& ((Class3.currentConnection.method1264
				     ((byte) 94, Class135_Sub2.worldConnectionNode))
				    || (Class3.currentConnection.method1264
					((byte) 112, (Class348_Sub40_Sub35
						      .demoConnectionNode)))))
				Class348_Sub42_Sub20.method3283(114);
			} else {
			    if (!Class348_Sub40_Sub8.gameConnection
				     .method1705(Class76.anInt1288, 93))
				return;
			    Class348_Sub40_Sub8.gameConnection.read
				(Class76.anInt1288, 0, (byte) 60,
				 (((ByteBuffer) buffer)
				  .payload));
			    ((ByteBuffer) buffer).position
				= 0;
			    Class192.playerRights = buffer.getUByte();
			    Class125.anInt4919 = buffer.getUByte();
			    Class348_Sub40_Sub3.aBoolean9103
				= buffer.getUByte() == 1;
			    Class133.aBoolean1915
				= buffer.getUByte() == 1;
			    ColorNode.aBoolean4903 = buffer.getUByte() == 1;
			    Class50_Sub2.isQuickchat
				= (buffer.getUByte()
				   ^ 0xffffffff) == -2;
			    Class348_Sub42_Sub11.localPlayerId
				= buffer.getShort();
			    Class206.aBoolean4888
				= buffer.getUByte() == 1;
			    Class24.anInt359
				= buffer.method3369((byte) 125);
			    Class130.aBoolean1900
				= buffer.getUByte() == 1;
			    Class348_Sub40_Sub12.objectLoader
				.method2004(Class130.aBoolean1900, (byte) 25);
			    ToolkitException.itemLoader
				.method1934((byte) 11, Class130.aBoolean1900);
			    Class189.npcLoader
				.method2072((byte) 88, Class130.aBoolean1900);
			}
			if ((!Class348_Sub40_Sub3.aBoolean9103
			     || ColorNode.aBoolean4903)
			    && !Class206.aBoolean4888) {
			    try {
				Class224.method1617((byte) 125,
						    Class93.loaderApplet,
						    "unzap");
			    } catch (Throwable throwable) {
				/* empty */
			    }
			} else {
			    try {
				Class224.method1617((byte) 125,
						    Class93.loaderApplet,
						    "zap");
			    } catch (Throwable throwable) {
				if (Class318_Sub1_Sub5.aBoolean8773) {
				    try {
					Class93.loaderApplet.getAppletContext
					    ().showDocument
					    (new URL(Class93.loaderApplet
							 .getCodeBase(),
						     "blank.ws"),
					     "tbi");
				    } catch (Exception exception) {
					/* empty */
				    }
				}
			    }
			}
			if (Class8.modeWhere
			    == Class55_Sub1.aClass364_5271) {
			    try {
				Class224.method1617((byte) 125,
						    Class93.loaderApplet,
						    "loggedin");
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
			if ((Class239_Sub12.anInt5969 ^ 0xffffffff) == -3)
			    Class225.anInt2955 = 11;
			else {
			    Class225.anInt2955 = 0;
			    Class14_Sub4.method254(2, (byte) -92);
			    Class239_Sub19.method1804(8839);
			    ByteBuffer.setClientState(2, 7);
			    Class348_Sub3.currentIncomingPacket = null;
			    return;
			}
		    }
		    if (Class225.anInt2955 == 11) {
			if (!Class348_Sub40_Sub8.gameConnection.method1705(3,
									   94))
			    return;
			Class348_Sub40_Sub8.gameConnection.read
			    (3, 0, (byte) 11,
			     (((ByteBuffer)
			       Class299.gameBuffer)
			      .payload));
			Class225.anInt2955 = 12;
		    }
		    if (Class225.anInt2955 == 12) {
			GameBuffer class348_sub49_sub2
			    = Class299.gameBuffer;
			((ByteBuffer) class348_sub49_sub2).position = 0;
			if (class348_sub49_sub2.isLargePacket(-1510)) {
			    if (!Class348_Sub40_Sub8.gameConnection
				     .method1705(1, 110))
				return;
			    Class348_Sub40_Sub8.gameConnection.read
				(1, 3, (byte) -127,
				 (((ByteBuffer) class348_sub49_sub2)
				  .payload));
			}
			Class348_Sub3.currentIncomingPacket
			    = (Class14_Sub3.getIncomingPackets(-11271)
			       [class348_sub49_sub2.decipherPacket(15295)]);
			Class348_Sub40_Sub25.currentPacketSize
			    = class348_sub49_sub2.getShort();
			Class225.anInt2955 = 10;
		    }
		    if ((Class225.anInt2955 ^ 0xffffffff) == -11) {
			if (Class348_Sub40_Sub8.gameConnection.method1705
			    (Class348_Sub40_Sub25.currentPacketSize, 96)) {
			    Class348_Sub40_Sub8.gameConnection.read
				(Class348_Sub40_Sub25.currentPacketSize, 0, (byte) 28,
				 (((ByteBuffer)
				   Class299.gameBuffer)
				  .payload));
			    ((ByteBuffer)
			     Class299.gameBuffer).position
				= 0;
			    Class225.anInt2955 = 0;
			    int i_13_ = Class348_Sub40_Sub25.currentPacketSize;
			    Class14_Sub4.method254(2, (byte) -124);
			    Class130_Sub1.method1135(0);
			    Class239_Sub5.method1741
				(Class299.gameBuffer,
				 (byte) 118);
			    AbstractToolkit.chnkX = -1;
			    if (Class348_Sub3.currentIncomingPacket
				!= ClanChatPlayer.aClass114_304)
				Class348_Sub40_Sub26.parseSetRegionPacket(-92);
			    else
				Class90.method853((byte) 99);
			    if ((((ByteBuffer)
				  Class299.gameBuffer).position
				 ^ 0xffffffff)
				!= (i_13_ ^ 0xffffffff))
				throw new RuntimeException
					  ("lswp pos:"
					   + (((ByteBuffer)
					       (Class299
						.gameBuffer))
					      .position)
					   + " psize:" + i_13_);
			    Class348_Sub3.currentIncomingPacket = null;
			}
		    } else {
			int i_14_ = -128 / (-i / 53);
			if (Class225.anInt2955 == 14) {
			    if ((Class348_Sub40_Sub25.currentPacketSize ^ 0xffffffff)
				== 1) {
				if (!Class348_Sub40_Sub8.gameConnection
					 .method1705(2, 106))
				    return;
				Class348_Sub40_Sub8.gameConnection.read
				    (2, 0, (byte) -128,
				     (((ByteBuffer)
				       Class299.gameBuffer)
				      .payload));
				((ByteBuffer)
				 Class299.gameBuffer).position
				    = 0;
				Class348_Sub40_Sub25.currentPacketSize
				    = Class299.gameBuffer
					  .getShort();
			    }
			    if (Class348_Sub40_Sub8.gameConnection.method1705
				(Class348_Sub40_Sub25.currentPacketSize, 117)) {
				Class348_Sub40_Sub8.gameConnection.read
				    (Class348_Sub40_Sub25.currentPacketSize, 0,
				     (byte) -104,
				     (((ByteBuffer)
				       Class299.gameBuffer)
				      .payload));
				((ByteBuffer)
				 Class299.gameBuffer).position
				    = 0;
				int i_15_ = Class348_Sub40_Sub25.currentPacketSize;
				Class225.anInt2955 = 0;
				Class14_Sub4.method254(15, (byte) -120);
				Class312.method2330((byte) 86);
				Class239_Sub5.method1741
				    (Class299.gameBuffer,
				     (byte) 118);
				if (((((ByteBuffer)
				       Class299.gameBuffer)
				      .position)
				     ^ 0xffffffff)
				    != (i_15_ ^ 0xffffffff))
				    throw new RuntimeException
					      ("lswpr pos:"
					       + (((ByteBuffer)
						   (Class299
						    .gameBuffer))
						  .position)
					       + " psize:" + i_15_);
				Class348_Sub3.currentIncomingPacket = null;
			    }
			}
		    }
		}
	    } catch (IOException ioexception) {
		if (Class348_Sub40_Sub8.gameConnection != null) {
		    Class348_Sub40_Sub8.gameConnection.method1700((byte) 36);
		    Class348_Sub40_Sub8.gameConnection = null;
		}
		if (Class318_Sub1_Sub1_Sub2.anInt9971 >= 3) {
		    Class225.anInt2955 = 0;
		    Class14_Sub4.method254(-4, (byte) -87);
		    Class152.method1215((byte) 3);
		} else {
		    if (Class239_Sub12.anInt5969 != 2)
			ItemLoader.lobbyConnectionNode.method1259(0);
		    else
			Class3.currentConnection.method1259(0);
		    Class318_Sub1_Sub1_Sub2.anInt9971++;
		    Class11.anInt197 = 0;
		    Class225.anInt2955 = 1;
		}
	    }
	}
    }
    
    final void method844(Class318_Sub9 class318_sub9, boolean bool) {
	try {
	    anInt1495++;
	    if (((Class318_Sub9) class318_sub9).aClass318_Sub9_6468 != null)
		class318_sub9.method2514(93);
	    ((Class318_Sub9) class318_sub9).aClass318_Sub9_6469
		= ((Class88) this).aClass318_Sub9_1503;
	    ((Class318_Sub9) class318_sub9).aClass318_Sub9_6468
		= (((Class318_Sub9) ((Class88) this).aClass318_Sub9_1503)
		   .aClass318_Sub9_6468);
	    if (bool != true)
		((Class88) this).aClass318_Sub9_1503 = null;
	    ((Class318_Sub9) (((Class318_Sub9) class318_sub9)
			      .aClass318_Sub9_6468)).aClass318_Sub9_6469
		= class318_sub9;
	    ((Class318_Sub9) (((Class318_Sub9) class318_sub9)
			      .aClass318_Sub9_6469)).aClass318_Sub9_6468
		= class318_sub9;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("lh.A("
					     + (class318_sub9 != null ? "{...}"
						: "null")
					     + ',' + bool + ')'));
	}
    }
    
    final void method845(byte i) {
	for (;;) {
	    Class318_Sub9 class318_sub9
		= (((Class318_Sub9) ((Class88) this).aClass318_Sub9_1503)
		   .aClass318_Sub9_6469);
	    if (class318_sub9 == ((Class88) this).aClass318_Sub9_1503)
		break;
	    class318_sub9.method2514(54);
	}
	if (i < 23)
	    aClass318_Sub9_1505 = null;
	anInt1493++;
	aClass318_Sub9_1505 = null;
    }
    
    final Class318_Sub9 method846(byte i) {
	anInt1494++;
	Class318_Sub9 class318_sub9 = aClass318_Sub9_1505;
	if (class318_sub9 == ((Class88) this).aClass318_Sub9_1503) {
	    aClass318_Sub9_1505 = null;
	    return null;
	}
	if (i > -34)
	    aClass318_Sub9_1505 = null;
	aClass318_Sub9_1505
	    = ((Class318_Sub9) class318_sub9).aClass318_Sub9_6469;
	return class318_sub9;
    }
    
    static final void method847(String string, int i) {
	System.out.println("Error: " + Class341.method2680("\n", true, "%0a",
							   string));
	anInt1492++;
	if (i != -5192)
	    method843((byte) 17);
    }
    
    final Class318_Sub9 method848(int i) {
	if (i != 8)
	    return null;
	anInt1502++;
	Class318_Sub9 class318_sub9
	    = (((Class318_Sub9) ((Class88) this).aClass318_Sub9_1503)
	       .aClass318_Sub9_6469);
	if (class318_sub9 == ((Class88) this).aClass318_Sub9_1503) {
	    aClass318_Sub9_1505 = null;
	    return null;
	}
	aClass318_Sub9_1505
	    = ((Class318_Sub9) class318_sub9).aClass318_Sub9_6469;
	return class318_sub9;
    }
    
    public Class88() {
	((Class318_Sub9) ((Class88) this).aClass318_Sub9_1503)
	    .aClass318_Sub9_6468
	    = ((Class88) this).aClass318_Sub9_1503;
	((Class318_Sub9) ((Class88) this).aClass318_Sub9_1503)
	    .aClass318_Sub9_6469
	    = ((Class88) this).aClass318_Sub9_1503;
    }
}
