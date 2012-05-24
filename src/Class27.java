/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class27
{
    static int anInt387;
    static int anInt388 = 0;
    static HashTable aClass356_389 = new HashTable(4);
    static int anInt390;
    static int anInt391;
    static int anInt392;
    static int anInt393;
    static int anInt394;
    static GamePacket aClass351_395 = new GamePacket(49, 6);
    static int anInt396 = -1;
    static int anInt397;
    static GamePacket aClass351_398 = new GamePacket(23, 8);
    static Class341 aClass341_399 = new Class341();
    
    static final void method312(int i, byte i_0_) {
	Class48.anInt859 = -1;
	if (i != 37) {
	    if ((i ^ 0xffffffff) != -51) {
		if (i != 75) {
		    if (i != 100) {
			if ((i ^ 0xffffffff) == -201)
			    Class75.aFloat1249 = 16.0F;
		    } else
			Class75.aFloat1249 = 8.0F;
		} else
		    Class75.aFloat1249 = 6.0F;
	    } else
		Class75.aFloat1249 = 4.0F;
	} else
	    Class75.aFloat1249 = 3.0F;
	anInt397++;
	Class48.anInt859 = -1;
	if (i_0_ != 56)
	    anInt394 = 32;
    }
    
    static final String method313(long l, int i) {
	try {
	    anInt392++;
	    if (l <= 0L || (l ^ 0xffffffffffffffffL) <= -6582952005840035282L)
		return null;
	    if (l % 37L == 0L)
		return null;
	    int i_1_ = 0;
	    for (long l_2_ = l; (l_2_ ^ 0xffffffffffffffffL) != -1L;
		 l_2_ /= 37L)
		i_1_++;
	    if (i >= -82)
		anInt396 = -58;
	    StringBuffer stringbuffer = new StringBuffer(i_1_);
	    while ((l ^ 0xffffffffffffffffL) != -1L) {
		long l_3_ = l;
		l /= 37L;
		stringbuffer.append(Class48.aCharArray852[(int) (-(37L * l)
								 + l_3_)]);
	    }
	    return stringbuffer.reverse().toString();
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "ht.A(" + l + ',' + i + ')');
	}
    }
    
    static final void method314(byte i, int i_4_) {
	if (i >= -31)
	    anInt394 = -128;
	Class34.anInt481 = i_4_;
	Class367_Sub9.anInt7379 = 3;
	anInt390++;
	Class164.anInt2173 = 100;
	Class348_Sub40_Sub30.anInt9399 = -1;
    }
    
    static final int method315(byte i, String string) {
	anInt393++;
	int i_5_ = 0;
	if (i <= 70)
	    return -84;
	for (/**/; i_5_ < Class59_Sub2.aStringArray5305.length; i_5_++) {
	    if (Class59_Sub2.aStringArray5305[i_5_].equalsIgnoreCase(string))
		return i_5_;
	}
	return -1;
    }
    
    public static void method316(byte i) {
	aClass356_389 = null;
	aClass351_398 = null;
	aClass341_399 = null;
	if (i != -94)
	    method313(98L, -24);
	aClass351_395 = null;
    }
    
    static final void addToIgnoreList(String string, boolean bool) {
	anInt391++;
	if (string != null) {
	    if ((Class348_Sub42_Sub12.ignoreListLength) >= 100)
		Class59.method544((GameText.ignoreListFullGameText.getLanguageText (Class348_Sub33.gameLanguage)), false, 4);
	    else {
		String usernam = Class285_Sub1.unformatUsername(string);
		if (usernam != null) {
                        for (int i_7_ = 0; Class348_Sub42_Sub12.ignoreListLength > i_7_; i_7_++) {
                            String username = Class285_Sub1.unformatUsername((ObjectDefinition.ignoreListUsernames[i_7_]));
                            if (username != null && username.equals(usernam)) {
                                Class59.method544((string + (GameText.ignoreAlreadyExistsGameText.getLanguageText(Class348_Sub33.gameLanguage))), false, 4);
                                return;
                            }
                            if (Class348_Sub40_Sub21.ignoreListGamenames[i_7_] != null) {
                                String string_9_ = (Class285_Sub1.unformatUsername((Class348_Sub40_Sub21.ignoreListGamenames[i_7_])));
                                if (string_9_ != null && string_9_.equals(usernam)) {
                                    Class59.method544(string + (GameText.ignoreAlreadyExistsGameText.getLanguageText((Class348_Sub33.gameLanguage))), false, 4);
                                    return;
                                }
                            }
                        }
			for (int i_10_ = 0; i_10_ < Class348_Sub40_Sub30.friendListLength; i_10_++) {
			    String friendUsername = Class285_Sub1.unformatUsername((Class83.friendListUsernames[i_10_]));
			    if (friendUsername != null && friendUsername.equals(usernam)) {
				Class59.method544(((GameText.pleaseRemoveIgnoreGameText.getLanguageText (Class348_Sub33.gameLanguage)) + string + (GameText.pleaseRemoveFriendGameText.getLanguageText (Class348_Sub33.gameLanguage))), false, 4);
				return;
			    }
			    if (Class286_Sub2.friendListGamenames[i_10_] != null) {
				String string_12_  = (Class285_Sub1.unformatUsername((Class286_Sub2.friendListGamenames[i_10_])));
				if (string_12_ != null && string_12_.equals(usernam)) {
				    Class59.method544(((GameText.pleaseRemoveIgnoreGameText.getLanguageText(Class348_Sub33.gameLanguage))  + string + (GameText.pleaseRemoveFriendGameText.getLanguageText(Class348_Sub33.gameLanguage))), false, 4);
				    return;
				}
			    }
			}
			if (Class285_Sub1.unformatUsername((((Player) Class132.localPlayer).aString10544)).equals(usernam))
			    Class59.method544((GameText.selfAddIngoreGameText.getLanguageText(Class348_Sub33.gameLanguage)), false, 4);
			else {
			    Class5.anInt4628++;
			    BufferedPacket class348_sub47
				= (Class286_Sub3.createBufferedPacket
				   (ClientScript.aClass351_9687,
				    Class348_Sub23_Sub2.outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer.putByte
				(Class239_Sub6.getStringLength(string, -65) - -1);
			    ((BufferedPacket) class348_sub47)
				.buffer
				.putJStr((byte) -5, string);
			    ((BufferedPacket) class348_sub47)
				.buffer
				.putByte(!bool ? 0 : 1);
			    Class348_Sub42_Sub14.queuePacket(-116,
							    class348_sub47);
			}
		    
		}
	    }
	}
    }
}
