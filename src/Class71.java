/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class71
{
    static Class76 aClass76_1208;
    static int anInt1209;
    static Class76 aClass76_1210;
    static boolean aBoolean1211 = false;
    static Class209 aClass209_1212;
    static Class138 aClass138_1213;
    static boolean[] aBooleanArray1214;
    
    public static void method728(boolean bool) {
	aClass209_1212 = null;
	aClass76_1208 = null;
	aClass76_1210 = null;
	aBooleanArray1214 = null;
	if (bool != true)
	    aClass209_1212 = null;
	aClass138_1213 = null;
    }
    
    static final void method729
	(int i, int i_0_, byte i_1_,
	 Mob class318_sub1_sub3_sub3, int i_2_) {
	if (i_1_ < 60)
	    method728(true);
	anInt1209++;
	Class225 class225 = class318_sub1_sub3_sub3.method2422((byte) 72);
	int i_3_
	    = 0x3fff & ((((Mob) class318_sub1_sub3_sub3)
			 .anInt10282)
			- ((Class264)
			   (((Mob) class318_sub1_sub3_sub3)
			    .aClass264_10217)).anInt3370);
	if (i != -1) {
	    if ((((Mob) class318_sub1_sub3_sub3).anInt10275
		 == -1)
		|| ((i_3_ ^ 0xffffffff) > -10241
		    && (i_3_ ^ 0xffffffff) < -2049)) {
		if (i_3_ == 0
		    && (((Mob) class318_sub1_sub3_sub3)
			.anInt10247) <= 25) {
		    if (i == 2 && ((Class225) class225).anInt2919 != -1)
			((Mob) class318_sub1_sub3_sub3)
			    .anInt10268
			    = ((Class225) class225).anInt2919;
		    else if (i != 0 || ((Class225) class225).anInt2940 == -1)
			((Mob) class318_sub1_sub3_sub3)
			    .anInt10268
			    = ((Class225) class225).anInt2951;
		    else
			((Mob) class318_sub1_sub3_sub3)
			    .anInt10268
			    = ((Class225) class225).anInt2940;
		    ((Mob) class318_sub1_sub3_sub3)
			.aBoolean10213
			= false;
		} else {
		    if (i != 2 || (((Class225) class225).anInt2919
				   ^ 0xffffffff) == 0) {
			if ((i ^ 0xffffffff) != -1
			    || ((Class225) class225).anInt2940 == -1) {
			    if ((i_0_ ^ 0xffffffff) > -1
				&& (((Class225) class225).anInt2934
				    ^ 0xffffffff) != 0)
				((Mob)
				 class318_sub1_sub3_sub3).anInt10268
				    = ((Class225) class225).anInt2934;
			    else if ((i_0_ ^ 0xffffffff) >= -1
				     || ((Class225) class225).anInt2953 == -1)
				((Mob)
				 class318_sub1_sub3_sub3).anInt10268
				    = ((Class225) class225).anInt2951;
			    else
				((Mob)
				 class318_sub1_sub3_sub3).anInt10268
				    = ((Class225) class225).anInt2953;
			} else if ((i_0_ ^ 0xffffffff) > -1
				   && ((Class225) class225).anInt2908 != -1)
			    ((Mob) class318_sub1_sub3_sub3)
				.anInt10268
				= ((Class225) class225).anInt2908;
			else if ((i_0_ ^ 0xffffffff) < -1
				 && (((Class225) class225).anInt2927
				     ^ 0xffffffff) != 0)
			    ((Mob) class318_sub1_sub3_sub3)
				.anInt10268
				= ((Class225) class225).anInt2927;
			else
			    ((Mob) class318_sub1_sub3_sub3)
				.anInt10268
				= ((Class225) class225).anInt2940;
		    } else if (i_0_ >= 0 || (((Class225) class225).anInt2905
					     ^ 0xffffffff) == 0) {
			if ((i_0_ ^ 0xffffffff) >= -1
			    || ((Class225) class225).anInt2911 == -1)
			    ((Mob) class318_sub1_sub3_sub3)
				.anInt10268
				= ((Class225) class225).anInt2919;
			else
			    ((Mob) class318_sub1_sub3_sub3)
				.anInt10268
				= ((Class225) class225).anInt2911;
		    } else
			((Mob) class318_sub1_sub3_sub3)
			    .anInt10268
			    = ((Class225) class225).anInt2905;
		    ((Mob) class318_sub1_sub3_sub3)
			.aBoolean10213
			= false;
		}
	    } else {
		int i_4_
		    = 0x3fff & (Class10.anIntArray187[i_2_]
				- ((Class264) (((Mob)
						class318_sub1_sub3_sub3)
					       .aClass264_10217)).anInt3370);
		if ((i ^ 0xffffffff) != -3
		    || ((Class225) class225).anInt2919 == -1) {
		    if ((i ^ 0xffffffff) == -1
			&& ((((Class225) class225).anInt2940 ^ 0xffffffff)
			    != 0)) {
			if (i_4_ <= 2048 || i_4_ > 6144
			    || ((Class225) class225).anInt2947 == -1) {
			    if (i_4_ >= 10240 && (i_4_ ^ 0xffffffff) > -14337
				&& ((Class225) class225).anInt2958 != -1)
				((Mob)
				 class318_sub1_sub3_sub3).anInt10268
				    = ((Class225) class225).anInt2958;
			    else if ((i_4_ ^ 0xffffffff) < -6145
				     && i_4_ < 10240
				     && (((Class225) class225).anInt2924
					 ^ 0xffffffff) != 0)
				((Mob)
				 class318_sub1_sub3_sub3).anInt10268
				    = ((Class225) class225).anInt2924;
			    else
				((Mob)
				 class318_sub1_sub3_sub3).anInt10268
				    = ((Class225) class225).anInt2940;
			} else
			    ((Mob) class318_sub1_sub3_sub3)
				.anInt10268
				= ((Class225) class225).anInt2947;
		    } else if ((i_4_ ^ 0xffffffff) < -2049 && i_4_ <= 6144
			       && (((Class225) class225).anInt2954
				   ^ 0xffffffff) != 0)
			((Mob) class318_sub1_sub3_sub3)
			    .anInt10268
			    = ((Class225) class225).anInt2954;
		    else if (i_4_ >= 10240 && (i_4_ ^ 0xffffffff) > -14337
			     && ((((Class225) class225).anInt2937 ^ 0xffffffff)
				 != 0))
			((Mob) class318_sub1_sub3_sub3)
			    .anInt10268
			    = ((Class225) class225).anInt2937;
		    else if ((i_4_ ^ 0xffffffff) < -6145
			     && (i_4_ ^ 0xffffffff) > -10241
			     && ((Class225) class225).anInt2938 != -1)
			((Mob) class318_sub1_sub3_sub3)
			    .anInt10268
			    = ((Class225) class225).anInt2938;
		    else
			((Mob) class318_sub1_sub3_sub3)
			    .anInt10268
			    = ((Class225) class225).anInt2951;
		} else if ((i_4_ ^ 0xffffffff) < -2049 && i_4_ <= 6144
			   && ((((Class225) class225).anInt2949 ^ 0xffffffff)
			       != 0))
		    ((Mob) class318_sub1_sub3_sub3)
			.anInt10268
			= ((Class225) class225).anInt2949;
		else if ((i_4_ ^ 0xffffffff) > -10241 || i_4_ >= 14336
			 || ((Class225) class225).anInt2914 == -1) {
		    if ((i_4_ ^ 0xffffffff) >= -6145
			|| (i_4_ ^ 0xffffffff) <= -10241
			|| (((Class225) class225).anInt2920 ^ 0xffffffff) == 0)
			((Mob) class318_sub1_sub3_sub3)
			    .anInt10268
			    = ((Class225) class225).anInt2919;
		    else
			((Mob) class318_sub1_sub3_sub3)
			    .anInt10268
			    = ((Class225) class225).anInt2920;
		} else
		    ((Mob) class318_sub1_sub3_sub3)
			.anInt10268
			= ((Class225) class225).anInt2914;
		((Mob) class318_sub1_sub3_sub3)
		    .aBoolean10213
		    = false;
	    }
	} else if ((i_3_ ^ 0xffffffff) != -1
		   || (((Mob) class318_sub1_sub3_sub3)
		       .anInt10247) > 25) {
	    if ((i_0_ ^ 0xffffffff) <= -1
		|| (((Class225) class225).anInt2916 ^ 0xffffffff) == 0) {
		if ((i_0_ ^ 0xffffffff) >= -1
		    || ((Class225) class225).anInt2922 == -1)
		    ((Mob) class318_sub1_sub3_sub3)
			.anInt10268
			= ((Class225) class225).anInt2951;
		else
		    ((Mob) class318_sub1_sub3_sub3)
			.anInt10268
			= ((Class225) class225).anInt2922;
	    } else {
		((Mob) class318_sub1_sub3_sub3)
		    .aBoolean10213
		    = false;
		((Mob) class318_sub1_sub3_sub3).anInt10268
		    = ((Class225) class225).anInt2916;
	    }
	    ((Mob) class318_sub1_sub3_sub3).aBoolean10213
		= false;
	} else if (!(((Mob) class318_sub1_sub3_sub3)
		     .aBoolean10213)
		   || !class225.method1623((((Mob)
					     class318_sub1_sub3_sub3)
					    .anInt10268),
					   -118)) {
	    ((Mob) class318_sub1_sub3_sub3).anInt10268
		= class225.method1621((byte) 37);
	    ((Mob) class318_sub1_sub3_sub3).aBoolean10213
		= ((((Mob) class318_sub1_sub3_sub3)
		    .anInt10268)
		   ^ 0xffffffff) != 0;
	}
    }
    
    static {
	aClass76_1208 = aClass76_1210 = new Class76(false);
	aClass209_1212 = new Class209();
	aClass138_1213 = new Class138(11, 0, 1, 2);
	aBooleanArray1214 = new boolean[8];
    }
}
