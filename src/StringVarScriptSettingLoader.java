/* StringVarScriptSettingLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.FileOutputStream;

import jagex3.jagmisc.jagmisc;

final class StringVarScriptSettingLoader
{
    static IndexLoader indexLoader25;
    static int headiconsArchiveId;
    private IndexLoader aClass45_1436;
    static int anInt1437;
    static int anInt1438;
    int amountScriptGlobalStrs;
    
    public static void method811(byte i) {
	if (i > -109)
	    headiconsArchiveId = 69;
	indexLoader25 = null;
    }
    
    static final void method812(String string, boolean bool, boolean bool_0_,
				byte i) {
	do {
	    try {
		if (i != -79)
		    method814((byte) -79, 126L);
		anInt1437++;
		try {
		    if (string.equalsIgnoreCase("commands")
			|| string.equalsIgnoreCase("help")) {
			ClientApplet.addConsoleMessage("commands - This command");
			ClientApplet.addConsoleMessage("cls - Clear console");
			ClientApplet.addConsoleMessage
			    ("displayfps - Toggle FPS and other information");
			ClientApplet.addConsoleMessage
			    ("renderer - Print graphics renderer information");
			ClientApplet.addConsoleMessage
			    ("heap - Print java memory information");
			break;
		    }
		    if (string.equalsIgnoreCase("cls")) {
			Class284.anInt3676 = 0;
			Class369_Sub2.anInt8587 = 0;
			break;
		    }
		    if (string.equalsIgnoreCase("displayfps")) {
			Class298.aBoolean3811 = !Class298.aBoolean3811;
			if (Class298.aBoolean3811)
			    ClientApplet.addConsoleMessage("FPS on");
			else {
			    ClientApplet.addConsoleMessage("FPS off");
			    break;
			}
			break;
		    }
		    if (string.equals("renderer")) {
			ToolkitInfo class365 = Class348_Sub8.currentToolkit.getToolkitInfo();
			ClientApplet.addConsoleMessage("Vendor: " + ((ToolkitInfo)
							   class365).vendor);
			ClientApplet.addConsoleMessage("Name: " + (((ToolkitInfo) class365)
							 .name));
			ClientApplet.addConsoleMessage(("Version: "
					      + (((ToolkitInfo) class365)
						 .version)));
			ClientApplet.addConsoleMessage(("Device: "
					      + (((ToolkitInfo) class365)
						 .device)));
			ClientApplet.addConsoleMessage(("Driver Version: "
					      + (((ToolkitInfo) class365)
						 .driverVersion)));
			break;
		    }
		    if (string.equals("heap")) {
			ClientApplet.addConsoleMessage(("Heap: " + Class226.anInt2964
					      + "MB"));
			break;
		    }
		} catch (Exception exception) {
		    ClientApplet.addConsoleMessage((GameText.aClass274_3485.getLanguageText
					  (Class348_Sub33.gameLanguage)));
		    break;
		}
		if (Class8.modeWhere != Class55_Sub1.aClass364_5271
		    || (Class192.playerRights ^ 0xffffffff) <= -3) {
		    if (string.equalsIgnoreCase("errortest"))
			throw new RuntimeException();
		    if (string.equals("nativememerror"))
			throw new OutOfMemoryError("native(MPR");
		    try {
			if (string.equalsIgnoreCase("printfps")) {
			    ClientApplet.addConsoleMessage(("FPS: "
						  + Class239_Sub5.anInt5891));
			    break;
			}
			if (string.equalsIgnoreCase("occlude")) {
			    Class348_Sub40_Sub23.aBoolean9307
				= !Class348_Sub40_Sub23.aBoolean9307;
			    if (!Class348_Sub40_Sub23.aBoolean9307)
				ClientApplet.addConsoleMessage("Occlsion now off!");
			    else {
				ClientApplet.addConsoleMessage("Occlsion now on!");
				break;
			    }
			    break;
			}
			if (string.equalsIgnoreCase("fpson")) {
			    Class298.aBoolean3811 = true;
			    ClientApplet.addConsoleMessage("fps debug enabled");
			    break;
			}
			if (string.equalsIgnoreCase("fpsoff")) {
			    Class298.aBoolean3811 = false;
			    ClientApplet.addConsoleMessage("fps debug disabled");
			    break;
			}
			if (string.equals("systemmem")) {
			    try {
				ClientApplet.addConsoleMessage
				    (("System memory: "
				      + (jagmisc.getAvailablePhysicalMemory()
					 / 1048576L)
				      + "/"
				      + ((Class348_Sub4)
					 (Class348_Sub40_Sub20
					  .aClass348_Sub4_9264)).anInt6609
				      + "Mb"));
			    } catch (Throwable throwable) {
				/* empty */
			    }
			    break;
			}
			if (string.equalsIgnoreCase("cleartext")) {
			    Class225.aClass243_2957.method1876((byte) -45);
			    ClientApplet.addConsoleMessage("Text coords cleared");
			    break;
			}
			if (string.equalsIgnoreCase("gc")) {
			    Widget.method427(i + 180);
			    for (int i_1_ = 0; i_1_ < 10; i_1_++)
				System.gc();
			    Runtime runtime = Runtime.getRuntime();
			    int i_2_ = (int) ((runtime.totalMemory()
					       + -runtime.freeMemory())
					      / 1024L);
			    ClientApplet.addConsoleMessage("mem=" + i_2_ + "k");
			    break;
			}
			if (string.equalsIgnoreCase("compact")) {
			    Widget.method427(-41);
			    for (int i_3_ = 0; i_3_ < 10; i_3_++)
				System.gc();
			    Runtime runtime = Runtime.getRuntime();
			    int i_4_ = (int) ((runtime.totalMemory()
					       + -runtime.freeMemory())
					      / 1024L);
			    ClientApplet.addConsoleMessage(("Memory before cleanup="
						  + i_4_ + "k"));
			    Class299_Sub2_Sub1.method2271(31268);
			    Widget.method427(96);
			    for (int i_5_ = 0; i_5_ < 10; i_5_++)
				System.gc();
			    i_4_ = (int) ((runtime.totalMemory()
					   + -runtime.freeMemory())
					  / 1024L);
			    ClientApplet.addConsoleMessage(("Memory after cleanup="
						  + i_4_ + "k"));
			    break;
			}
			if (string.equalsIgnoreCase("unloadnatives")) {
			    ClientApplet.addConsoleMessage
				((Class228.method1629(true)
				  ? "Libraries unloaded"
				  : "Library unloading failed!"));
			    break;
			}
			if (string.equalsIgnoreCase("clientdrop")) {
			    ClientApplet.addConsoleMessage("Dropped client connection");
			    if ((Class240.anInt4674 ^ 0xffffffff) == -11)
				Class272.method2049(105);
			    else {
				if ((Class240.anInt4674 ^ 0xffffffff) == -12)
				    AbstractWorld.aBoolean1712 = true;
				break;
			    }
			    break;
			}
			if (string.equalsIgnoreCase("rotateconnectmethods")) {
			    Class3.currentConnection.method1259(0);
			    ClientApplet.addConsoleMessage("Rotated connection methods");
			    break;
			}
			if (string.equalsIgnoreCase("clientjs5drop")) {
			    Class348_Sub4.ondemandWorker.resetSocket(-83);
			    ClientApplet.addConsoleMessage
				("Dropped client js5 net queue");
			    break;
			}
			if (string.equalsIgnoreCase("serverjs5drop")) {
			    Class348_Sub4.ondemandWorker.writeDisconnectRequest();
			    ClientApplet.addConsoleMessage
				("Dropped server js5 net queue");
			    break;
			}
			if (string.equalsIgnoreCase("breakcon")) {
			    Class348_Sub23_Sub1.signlink.method2239(-95);
			    Class348_Sub40_Sub8.gameConnection
				.method1702(i + 123);
			    Class348_Sub4.ondemandWorker.initializeSocketWorkers(true);
			    ClientApplet.addConsoleMessage
				("Breaking new connections for 5 seconds");
			    break;
			}
			if (string.equalsIgnoreCase("rebuild")) {
			    Class348_Sub20.method2953((byte) -117);
			    Class50_Sub2.method464(-1);
			    ClientApplet.addConsoleMessage("Rebuilding map");
			    break;
			}
			if (string.equalsIgnoreCase("rebuildprofile")) {
			    Class90.aLong1516 = Class62.getCurrentTimeMillis();
			    Class258_Sub4.doMapProfile = true;
			    Class348_Sub20.method2953((byte) -114);
			    Class50_Sub2.method464(-1);
			    ClientApplet.addConsoleMessage("Rebuilding map (with profiling)");
			    break;
			}
			if (string.equalsIgnoreCase("wm1")) {
			    Whirlpool.method830(1, -1, (byte) 102, false, -1);
			    if (Class348_Sub42_Sub12.method3229() != 1)
				ClientApplet.addConsoleMessage("wm1 failed");
			    else {
				ClientApplet.addConsoleMessage("wm1 succeeded");
				break;
			    }
			    break;
			}
			if (string.equalsIgnoreCase("wm2")) {
			    Whirlpool.method830(2, -1, (byte) 102, false, -1);
			    if (Class348_Sub42_Sub12.method3229() == 2)
				ClientApplet.addConsoleMessage("wm2 succeeded");
			    else {
				ClientApplet.addConsoleMessage("wm2 failed");
				break;
			    }
			    break;
			}
			if (string.equalsIgnoreCase("wm3")) {
			    Whirlpool.method830(3, 1024, (byte) 102, false, 768);
			    if (Class348_Sub42_Sub12.method3229() == 3)
				ClientApplet.addConsoleMessage("wm3 succeeded");
			    else {
				ClientApplet.addConsoleMessage("wm3 failed");
				break;
			    }
			    break;
			}
			if (string.equalsIgnoreCase("tk0")) {
			    Class367_Sub10.method3553(false, (byte) 104, 0);
			    if ((((Class348_Sub51)
				  BitmapTable.aClass348_Sub51_3959)
				     .aClass239_Sub25_7271.method1829(-32350)
				 ^ 0xffffffff)
				!= -1)
				ClientApplet.addConsoleMessage("Failed to enter tk0");
			    else {
				ClientApplet.addConsoleMessage("Entered tk0");
				BitmapTable.aClass348_Sub51_3959.method3429
				    ((byte) 74,
				     (((Class348_Sub51)
				       BitmapTable.aClass348_Sub51_3959)
				      .aClass239_Sub25_7251),
				     0);
				Class14_Sub2.method243(37);
				r.aBoolean9719 = false;
				break;
			    }
			    break;
			}
			if (string.equalsIgnoreCase("tk1")) {
			    Class367_Sub10.method3553(false, (byte) 109, 1);
			    if ((((Class348_Sub51)
				  BitmapTable.aClass348_Sub51_3959)
				     .aClass239_Sub25_7271.method1829(-32350)
				 ^ 0xffffffff)
				!= -2)
				ClientApplet.addConsoleMessage("Failed to enter tk1");
			    else {
				ClientApplet.addConsoleMessage("Entered tk1");
				BitmapTable.aClass348_Sub51_3959.method3429
				    ((byte) 74,
				     (((Class348_Sub51)
				       BitmapTable.aClass348_Sub51_3959)
				      .aClass239_Sub25_7251),
				     1);
				Class14_Sub2.method243(i ^ ~0x6b);
				r.aBoolean9719 = false;
				break;
			    }
			    break;
			}
			if (string.equalsIgnoreCase("tk2")) {
			    Class367_Sub10.method3553(false, (byte) 115, 2);
			    if (((Class348_Sub51)
				 BitmapTable.aClass348_Sub51_3959)
				    .aClass239_Sub25_7271.method1829(-32350)
				== 2) {
				ClientApplet.addConsoleMessage("Entered tk2");
				BitmapTable.aClass348_Sub51_3959.method3429
				    ((byte) 74,
				     (((Class348_Sub51)
				       BitmapTable.aClass348_Sub51_3959)
				      .aClass239_Sub25_7251),
				     2);
				Class14_Sub2.method243(37);
				r.aBoolean9719 = false;
			    } else {
				ClientApplet.addConsoleMessage("Failed to enter tk2");
				break;
			    }
			    break;
			}
			if (string.equalsIgnoreCase("tk3")) {
			    Class367_Sub10.method3553(false, (byte) 107, 3);
			    if ((((Class348_Sub51)
				  BitmapTable.aClass348_Sub51_3959)
				     .aClass239_Sub25_7271.method1829(-32350)
				 ^ 0xffffffff)
				!= -4)
				ClientApplet.addConsoleMessage("Failed to enter tk3");
			    else {
				ClientApplet.addConsoleMessage("Entered tk3");
				BitmapTable.aClass348_Sub51_3959.method3429
				    ((byte) 74,
				     (((Class348_Sub51)
				       BitmapTable.aClass348_Sub51_3959)
				      .aClass239_Sub25_7251),
				     3);
				Class14_Sub2.method243(37);
				r.aBoolean9719 = false;
				break;
			    }
			    break;
			}
			if (string.equalsIgnoreCase("tk5")) {
			    Class367_Sub10.method3553(false, (byte) 113, 5);
			    if (((Class348_Sub51)
				 BitmapTable.aClass348_Sub51_3959)
				    .aClass239_Sub25_7271
				    .method1829(i ^ 0x7e13)
				== 5) {
				ClientApplet.addConsoleMessage("Entered tk5");
				BitmapTable.aClass348_Sub51_3959.method3429
				    ((byte) 74,
				     (((Class348_Sub51)
				       BitmapTable.aClass348_Sub51_3959)
				      .aClass239_Sub25_7251),
				     5);
				Class14_Sub2.method243(37);
				r.aBoolean9719 = false;
			    } else {
				ClientApplet.addConsoleMessage("Failed to enter tk5");
				break;
			    }
			    break;
			}
			if (string.startsWith("setba")) {
			    if ((string.length() ^ 0xffffffff) > -7)
				ClientApplet.addConsoleMessage("Invalid buildarea value");
			    else {
				int i_6_ = (Class348_Sub41.method3156
					    (true, string.substring(6)));
				if ((i_6_ ^ 0xffffffff) > -1
				    || (Node.method2710(-126,
							    Class226.anInt2964)
					< i_6_))
				    ClientApplet.addConsoleMessage
					("Invalid buildarea value");
				else {
				    BitmapTable.aClass348_Sub51_3959.method3429
					((byte) 74,
					 (((Class348_Sub51)
					   BitmapTable.aClass348_Sub51_3959)
					  .aClass239_Sub6_7226),
					 i_6_);
				    Class14_Sub2.method243(37);
				    r.aBoolean9719 = false;
				    ClientApplet.addConsoleMessage
					(("maxbuildarea="
					  + ((Class348_Sub51)
					     BitmapTable.aClass348_Sub51_3959)
						.aClass239_Sub6_7226
						.getMapSizeId(-32350)));
				    break;
				}
				break;
			    }
			    break;
			}
			if (string.startsWith("rect_debug")) {
			    if ((string.length() ^ 0xffffffff) > -11)
				ClientApplet
				    .addConsoleMessage("Invalid rect_debug value");
			    else {
				NativeToolkit.anInt8045
				    = Class348_Sub41.method3156(true,
								string
								    .substring
								    (10)
								    .trim());
				ClientApplet.addConsoleMessage(("rect_debug="
						      + NativeToolkit.anInt8045));
				break;
			    }
			    break;
			}
			if (string.equalsIgnoreCase("qa_op_test")) {
			    Class299_Sub2.aBoolean6327 = true;
			    ClientApplet.addConsoleMessage(("qa_op_test="
						  + (Class299_Sub2
						     .aBoolean6327)));
			    break;
			}
			if (string.equalsIgnoreCase("clipcomponents")) {
			    Class318_Sub1_Sub3_Sub2.aBoolean10046
				= !Class318_Sub1_Sub3_Sub2.aBoolean10046;
			    ClientApplet.addConsoleMessage(("clipcomponents="
						  + (Class318_Sub1_Sub3_Sub2
						     .aBoolean10046)));
			    break;
			}
			if (string.startsWith("bloom")) {
			    boolean bool_7_ = Class348_Sub8.currentToolkit.isBloomSupported();
			    if (!Class348_Sub40_Sub33.method3137(!bool_7_,
								 (byte) -24))
				ClientApplet.addConsoleMessage("Failed to enable bloom");
			    else {
				if (!bool_7_)
				    ClientApplet.addConsoleMessage("Bloom enabled");
				else {
				    ClientApplet.addConsoleMessage("Bloom disabled");
				    break;
				}
				break;
			    }
			    break;
			}
			if (string.equalsIgnoreCase("tween")) {
			    if (!Class28.forcedTween) {
				Class28.forcedTween = true;
				ClientApplet
				    .addConsoleMessage("Forced tweening ENABLED!");
			    } else {
				Class28.forcedTween = false;
				ClientApplet.addConsoleMessage
				    ("Forced tweening disabled.");
				break;
			    }
			    break;
			}
			if (string.equalsIgnoreCase("shiftclick")) {
			    if (Class116.aBoolean1759) {
				ClientApplet.addConsoleMessage("Shift-click disabled.");
				Class116.aBoolean1759 = false;
			    } else {
				ClientApplet.addConsoleMessage("Shift-click ENABLED!");
				Class116.aBoolean1759 = true;
				break;
			    }
			    break;
			}
			if (string.equalsIgnoreCase("getcgcoord")) {
			    ClientApplet.addConsoleMessage
				(("x:"
				  + ((((Class318_Sub1)
				       (Class132
					.localPlayer))
				      .xHash)
				     >> 875117673)
				  + " z:"
				  + ((((Class318_Sub1)
				       (Class132
					.localPlayer))
				      .anInt6388)
				     >> -984153847)));
			    break;
			}
			if (string.equalsIgnoreCase("getheight")) {
			    ClientApplet.addConsoleMessage
				(("Height: "
				  + (aa_Sub1.aSArray5191
					 [(((Class318_Sub1)
					    (Class132
					     .localPlayer))
					   .heightLevel)]
					 .method3982
				     ((byte) -86,
				      (((Class318_Sub1)
					(Class132
					 .localPlayer))
				       .anInt6388) >> -1801480663,
				      (((Class318_Sub1)
					(Class132
					 .localPlayer))
				       .xHash) >> -1239792887))));
			    break;
			}
			if (string.equalsIgnoreCase("resetminimap")) {
			    Class21.indexLoader8.removeArchives(i ^ ~0x4e);
			    Class21.indexLoader8.removeChildren();
			    Class2.aClass141_117.method1175((byte) 125);
			    Class348_Sub23_Sub2.aClass153_9031.method1219(7851);
			    Class50_Sub2.method464(-1);
			    ClientApplet.addConsoleMessage("Minimap reset");
			    break;
			}
			if (string.startsWith("mc")) {
			    if (Class348_Sub8.currentToolkit.supportsMultipleCores()) {
				int cores = Integer.parseInt(string.substring(3));
				if (cores >= 1) {
				    if ((cores ^ 0xffffffff) < -5)
					cores = 4;
				} else
				    cores = 1;
				Class239_Sub16.renderCores = cores;
				Class348_Sub20.method2953((byte) -128);
				ClientApplet.addConsoleMessage(("Render cores now: "
						      + (Class239_Sub16
							 .renderCores)));
			    } else {
				ClientApplet.addConsoleMessage
				    ("Current toolkit doesn't support multiple cores");
				break;
			    }
			    break;
			}
			if (string.startsWith("cachespace")) {
			    ClientApplet.addConsoleMessage(("I(s): "
						  + GamePacket.widgetRasters
							.method581(-18529)
						  + "/"
						  + GamePacket.widgetRasters
							.method577(-4)));
			    ClientApplet.addConsoleMessage(("I(m): "
						  + Class358.aClass60_4417
							.method581(-18529)
						  + "/"
						  + Class358.aClass60_4417
							.method577(i ^ 0x4d)));
			    ClientApplet.addConsoleMessage
				(("O(s): "
				  + ((ItemLoader) ToolkitException.itemLoader)
					.aClass175_3288.method1350((byte) 126)
				  + "/"
				  + ((ItemLoader) ToolkitException.itemLoader)
					.aClass175_3288.method1339(100)));
			    break;
			}
			if (string.equalsIgnoreCase("getcamerapos")) {
			    ClientApplet.addConsoleMessage
				(("Pos: "
				  + (((Class318_Sub1)
				      (Class132
				       .localPlayer))
				     .heightLevel)
				  + ","
				  + (((Class286_Sub4.anInt6246 >> 701891721)
				      - -za_Sub2.baseRegionX)
				     >> -56573050)
				  + ","
				  + ((Class59_Sub2_Sub2.anInt8685
				      >> 551964745) + Class90.baseRegionY
				     >> -1492367802)
				  + ","
				  + (((Class286_Sub4.anInt6246 >> 1523938025)
				      - -za_Sub2.baseRegionX)
				     & 0x3f)
				  + ","
				  + ((Class59_Sub2_Sub2.anInt8685
				      >> 580244777) - -Class90.baseRegionY
				     & 0x3f)
				  + " Height: "
				  + ((Class275.method2064
				      (Class286_Sub4.anInt6246,
				       (((Class318_Sub1)
					 (Class132
					  .localPlayer))
					.heightLevel),
				       11219, Class59_Sub2_Sub2.anInt8685))
				     - Class305.anInt3855)));
			    ClientApplet.addConsoleMessage
				(("Look: "
				  + (((Class318_Sub1)
				      (Class132
				       .localPlayer))
				     .heightLevel)
				  + ","
				  + (GameFont.anInt4336 - -za_Sub2.baseRegionX
				     >> -576384442)
				  + ","
				  + (Class90.baseRegionY + Class281.anInt3647
				     >> -1550298426)
				  + ","
				  + (0x3f
				     & GameFont.anInt4336 - -za_Sub2.baseRegionX)
				  + ","
				  + (0x3f
				     & Class281.anInt3647 - -Class90.baseRegionY)
				  + " Height: "
				  + ((Class275.method2064
				      (GameFont.anInt4336,
				       (((Class318_Sub1)
					 (Class132
					  .localPlayer))
					.heightLevel),
				       11219, Class281.anInt3647))
				     - Class121.anInt1797)));
			    break;
			}
			if (string.equals("renderprofile")
			    || string.equals("rp")) {
			    Class188.doRenderProfile = !Class188.doRenderProfile;
			    Class348_Sub8.currentToolkit
				.method3647(Class188.doRenderProfile);
			    LobbyWorld.method1042((byte) 23);
			    ClientApplet.addConsoleMessage(("showprofiling="
						  + Class188.doRenderProfile));
			    break;
			}
			if (string.startsWith("performancetest")) {
			    int i_9_ = -1;
			    int i_10_ = 1000;
			    if (string.length() > 15) {
				String[] strings
				    = Class348_Sub40_Sub23
					  .split(' ', string);
				try {
				    if (strings.length > 1)
					i_10_ = Integer.parseInt(strings[1]);
				} catch (Throwable throwable) {
				    /* empty */
				}
				try {
				    if (strings.length > 2)
					i_9_ = Integer.parseInt(strings[2]);
				} catch (Throwable throwable) {
				    /* empty */
				}
			    }
			    if (i_9_ != -1)
				ClientApplet.addConsoleMessage
				    (("Performance: "
				      + Class239_Sub14.method1781(i_9_, -69,
								  i_10_)));
			    else {
				ClientApplet.addConsoleMessage
				    (("Java toolkit: "
				      + Class239_Sub14.method1781(0, -85,
								  i_10_)));
				ClientApplet.addConsoleMessage
				    (("SSE toolkit:  "
				      + Class239_Sub14.method1781(2, -73,
								  i_10_)));
				ClientApplet.addConsoleMessage
				    (("D3D toolkit:  "
				      + Class239_Sub14.method1781(3, i + -24,
								  i_10_)));
				ClientApplet.addConsoleMessage
				    (("GL toolkit:   "
				      + Class239_Sub14.method1781(1, -84,
								  i_10_)));
				ClientApplet.addConsoleMessage
				    (("GLX toolkit:  "
				      + Class239_Sub14.method1781(5, -77,
								  i_10_)));
				break;
			    }
			    break;
			}
			if (string.equals("nonpcs")) {
			    MouseMovementListener.aBoolean7444
				= !MouseMovementListener.aBoolean7444;
			    ClientApplet.addConsoleMessage("nonpcs=" + (MouseMovementListener
							      .aBoolean7444));
			    break;
			}
			if (string.equals("autoworld")) {
			    Class348_Sub42_Sub20.method3283(127);
			    ClientApplet.addConsoleMessage("auto world selected");
			    break;
			}
			if (string.startsWith("switchworld")) {
			    int i_11_ = Integer.parseInt(string.substring(12));
			    Class348_Sub23_Sub1.method2972
				((((LobbyWorld)
				   Class239_Sub5.getLobbyWorld(i_11_))
				  .ipAddress),
				 i_11_, -93);
			    ClientApplet.addConsoleMessage("switched");
			    break;
			}
			if (string.equals("getworld")) {
			    ClientApplet.addConsoleMessage(("w: "
						  + (((ConnectionMode)
						      Class3.currentConnection)
						     .portOffset)));
			    break;
			}
			if (string.startsWith("pc")) {
			    BufferedPacket class348_sub47
				= (Class286_Sub3.createBufferedPacket
				   (Class348_Sub40_Sub22.aClass351_9304,
				    Class348_Sub23_Sub2.outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.putByte(0);
			    int i_12_ = (((ByteBuffer)
					  (((BufferedPacket) class348_sub47)
					   .buffer))
					 .position);
			    int i_13_ = string.indexOf(" ", 4);
			    ((BufferedPacket) class348_sub47)
				.buffer.putJStr
				((byte) -5, string.substring(3, i_13_));
			    Class367_Sub4.method3544
				((((BufferedPacket) class348_sub47)
				  .buffer),
				 i + -12, string.substring(i_13_));
			    ((BufferedPacket) class348_sub47)
				.buffer.method3339
				(114, (((ByteBuffer)
					(((BufferedPacket) class348_sub47)
					 .buffer)).position
				       + -i_12_));
			    Class348_Sub42_Sub14.queuePacket(i ^ ~0x49,
							    class348_sub47);
			    break;
			}
			if (string.equals("savevarcs")) {
			    Class318_Sub1_Sub2.writeScriptSettings(119);
			    ClientApplet.addConsoleMessage("perm varcs saved");
			    break;
			}
			if (string.equals("scramblevarcs")) {
			    for (int i_14_ = 0;
				 ((IsaacCipher.globalScriptIntVars.length ^ 0xffffffff)
				  < (i_14_ ^ 0xffffffff));
				 i_14_++) {
				if (Class286_Sub6.isCsVariableActive[i_14_]) {
				    IsaacCipher.globalScriptIntVars[i_14_]
					= (int) (Math.random() * 99999.0);
				    if (Math.random() > 0.5)
					IsaacCipher.globalScriptIntVars[i_14_] *= -1;
				}
			    }
			    Class318_Sub1_Sub2.writeScriptSettings(-61);
			    ClientApplet.addConsoleMessage("perm varcs scrambled");
			    break;
			}
			if (string.equals("showcolmap")) {
			    Class375.aBoolean4542 = true;
			    Class50_Sub2.method464(-1);
			    ClientApplet.addConsoleMessage("colmap is shown");
			    break;
			}
			if (string.equals("hidecolmap")) {
			    Class375.aBoolean4542 = false;
			    Class50_Sub2.method464(i ^ 0x4e);
			    ClientApplet.addConsoleMessage("colmap is hidden");
			    break;
			}
			if (string.equals("resetcache")) {
			    Class348_Sub18.method2938((byte) 122);
			    ClientApplet.addConsoleMessage("Caches reset");
			    break;
			}
			if (string.equals("profilecpu")) {
			    ClientApplet.addConsoleMessage
				((String.valueOf(Class284.method2116(-26584))
				  + "ms"));
			    break;
			}
			if (string.startsWith("getclientvarpbit")) {
			    int i_15_ = Integer.parseInt(string.substring(17));
			    ClientApplet.addConsoleMessage
				("varpbit=" + Mob
						  .varbitHandler
						  .getSetting(i_15_));
			    break;
			}
			if (string.startsWith("getclientvarp")) {
			    int i_16_ = Integer.parseInt(string.substring(14));
			    ClientApplet.addConsoleMessage
				("varp=" + Mob
					       .varbitHandler
					       .getRawConfig(i_16_));
			    break;
			}
			if (string.startsWith("directlogin")) {
			    String[] strings
				= (Class348_Sub40_Sub23.split
				   (' ', string.substring(12)));
			    if ((strings.length ^ 0xffffffff) <= -3) {
				int i_17_
				    = (strings.length > 2
				       ? Integer.parseInt(strings[2]) : 0);
				Class253.method1922(strings[1], i_17_,
						    strings[0], true);
				break;
			    }
			}
			if (string.startsWith("csprofileclear")) {
			    ScriptExecutor.method706();
			    break;
			}
			if (string.startsWith("csprofileoutputc")) {
			    ScriptExecutor.method715(100, false);
			    break;
			}
			if (string.startsWith("csprofileoutputt")) {
			    ScriptExecutor.method715(10, true);
			    break;
			}
			if (string.startsWith("texsize")) {
			    int i_18_ = Integer.parseInt(string.substring(8));
			    Class348_Sub8.currentToolkit.method3696(i_18_);
			    break;
			}
			if (string.equals("soundstreamcount")) {
			    ClientApplet.addConsoleMessage
				(("Active streams: "
				  + Class348_Sub43
					.aClass348_Sub16_Sub4_7065
					.method2887()));
			    break;
			}
			if (string.equals("autosetup")) {
			    Class318_Sub1_Sub4.method2478(1000);
			    ClientApplet.addConsoleMessage
				(("Complete. Toolkit now: "
				  + ((Class348_Sub51)
				     BitmapTable.aClass348_Sub51_3959)
					.aClass239_Sub25_7271
					.method1829(i + -32271)));
			    break;
			}
			if (string.equals("errormessage")) {
			    ClientApplet.addConsoleMessage(NpcDefinition.aClient1367
						     .getErrorMessage((byte) 102));
			    break;
			}
			if (string.equals("heapdump")) {
			    if (!Signlink.osName.startsWith("win"))
				Class158.method1247(new File("/tmp/heap.dump"),
						    false, false);
			    else
				Class158.method1247
				    (new File("C:\\Temp\\heap.dump"), false,
				     false);
			    ClientApplet.addConsoleMessage("Done");
			    break;
			}
			if (string.equals("os")) {
			    ClientApplet
				.addConsoleMessage("Name: " + Signlink.osName);
			    ClientApplet.addConsoleMessage(("Arch: "
						  + Signlink.osArch));
			    ClientApplet
				.addConsoleMessage("Ver: " + Signlink.osVersion);
			    break;
			}
			if (string.startsWith("w2debug")) {
			    int i_19_
				= Integer.parseInt(string.substring(8, 9));
			    Class318_Sub1_Sub4_Sub2.anInt10096 = i_19_;
			    Class348_Sub20.method2953((byte) -103);
			    ClientApplet.addConsoleMessage("Toggled!");
			    break;
			}
			if (string.startsWith("ortho ")) {
			    int i_20_ = string.indexOf(' ');
			    if ((i_20_ ^ 0xffffffff) > -1)
				ClientApplet.addConsoleMessage("Syntax: ortho <n>");
			    else {
				int i_21_
				    = (Class348_Sub41.method3156
				       (true, string.substring(1 + i_20_)));
				BitmapTable.aClass348_Sub51_3959.method3429
				    ((byte) 74,
				     (((Class348_Sub51)
				       BitmapTable.aClass348_Sub51_3959)
				      .aClass239_Sub3_7222),
				     i_21_);
				Class14_Sub2.method243(37);
				r.aBoolean9719 = false;
				Class348_Sub42_Sub3.method3179(i + 79);
				if (((Class348_Sub51)
				     BitmapTable.aClass348_Sub51_3959)
					.aClass239_Sub3_7222.method1727(-32350)
				    != i_21_)
				    ClientApplet.addConsoleMessage
					("Failed to change ortho mode");
				else {
				    ClientApplet.addConsoleMessage
					("Successfully changed ortho mode");
				    break;
				}
				break;
			    }
			    break;
			}
			if (string.startsWith("orthozoom ")) {
			    if ((((Class348_Sub51)
				  BitmapTable.aClass348_Sub51_3959)
				     .aClass239_Sub3_7222
				     .method1727(i + -32271)
				 ^ 0xffffffff)
				== -1)
				ClientApplet.addConsoleMessage
				    ("enable ortho mode first (use 'ortho <n>')");
			    else {
				int i_22_
				    = (Class348_Sub41.method3156
				       (true,
					string.substring(string.indexOf(' ')
							 - -1)));
				Class132.anInt1911 = i_22_;
				ClientApplet.addConsoleMessage(("orthozoom="
						      + Class132.anInt1911));
				break;
			    }
			    break;
			}
			if (string.startsWith("orthotilesize ")) {
			    int i_23_
				= (Class348_Sub41.method3156
				   (true,
				    string
					.substring(1 + string.indexOf(' '))));
			    Class186_Sub1.anInt5812 = IndexLoader.anInt666 = i_23_;
			    ClientApplet.addConsoleMessage("ortho tile size=" + i_23_);
			    Class348_Sub42_Sub3.method3179(0);
			    break;
			}
			if (string.equals("orthocamlock")) {
			    FloatBuffer.aBoolean9746
				= !FloatBuffer.aBoolean9746;
			    ClientApplet.addConsoleMessage(("ortho camera lock is "
						  + (!(FloatBuffer
						       .aBoolean9746)
						     ? "off" : "on")));
			    break;
			}
			if (string.startsWith("setoutput ")) {
			    File file = new File(string.substring(10));
			    if (file.exists()) {
				file = new File(string.substring(10) + "."
						+ Class62.getCurrentTimeMillis()
						+ ".log");
				if (file.exists()) {
				    ClientApplet
					.addConsoleMessage("file already exists!");
				    break;
				}
			    }
			    if (Class299_Sub1.consoleOutputStream != null) {
				Class299_Sub1.consoleOutputStream.close();
				Class299_Sub1.consoleOutputStream = null;
			    }
			    try {
				Class299_Sub1.consoleOutputStream
				    = new FileOutputStream(file);
			    } catch (java.io.FileNotFoundException filenotfoundexception) {
				ClientApplet.addConsoleMessage(("Could not create "
						      + file.getName()));
			    } catch (SecurityException securityexception) {
				ClientApplet.addConsoleMessage(("Cannot write to "
						      + file.getName()));
			    }
			    break;
			}
			if (string.equals("closeoutput")) {
			    if (Class299_Sub1.consoleOutputStream != null)
				Class299_Sub1.consoleOutputStream.close();
			    Class299_Sub1.consoleOutputStream = null;
			    break;
			}
			if (string.startsWith("runscript ")) {
			    File file = new File(string.substring(10));
			    if (!file.exists()) {
				ClientApplet.addConsoleMessage("No such file");
				break;
			    }
			    byte[] is
				= Class239_Sub24.loadFile(i ^ 0x41, file);
			    if (is == null) {
				ClientApplet.addConsoleMessage("Failed to read file");
				break;
			    }
			    String[] strings
				= (Class348_Sub40_Sub23.split
				   ('\n',
				    (Class261.method1981
				     (Class239_Sub17.method1795(is, true),
				      (byte) -89, '\r', ""))));
			    Class348_Sub42_Sub6.method3189(0, strings);
			}
			if (string.startsWith("zoom ")) {
			    short i_24_
				= (short) (Class348_Sub41.method3156
					   (true, string.substring(5)));
			    if (i_24_ > 0)
				Class320.zoom = i_24_;
			    break;
			}
			if (Class240.anInt4674 == 10) {
			    FileIndexTracker.anInt4799++;
			    BufferedPacket class348_sub47
				= Class286_Sub3.createBufferedPacket((Class101_Sub2
							    .aClass351_5699),
							   (Class348_Sub23_Sub2
							    .outgoingGameIsaac));
			    ((BufferedPacket) class348_sub47)
				.buffer
				.putByte(string.length() + 3);
			    ((BufferedPacket) class348_sub47)
				.buffer
				.putByte(bool ? 1 : 0);
			    ((BufferedPacket) class348_sub47)
				.buffer
				.putByte(bool_0_ ? 1 : 0);
			    ((BufferedPacket) class348_sub47)
				.buffer
				.putJStr((byte) -5, string);
			    Class348_Sub42_Sub14.queuePacket(120,
							    class348_sub47);
			}
			if (string.startsWith("fps ")
			    && (Class8.modeWhere
				!= Class55_Sub1.aClass364_5271)) {
			    Class295.method2222((Class348_Sub41.method3156
						 (true, string.substring(4))),
						(byte) -124);
			    break;
			}
		    } catch (Exception exception) {
			ClientApplet.addConsoleMessage
			    (GameText.aClass274_3485
				 .getLanguageText(Class348_Sub33.gameLanguage));
			break;
		    }
		}
		if ((Class240.anInt4674 ^ 0xffffffff) == -11)
		    break;
		ClientApplet.addConsoleMessage
		    (GameText.unknwnDeveloperCommandGameText
			 .getLanguageText(Class348_Sub33.gameLanguage) + string);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("lba.B("
						 + (string != null ? "{...}"
						    : "null")
						 + ',' + bool + ',' + bool_0_
						 + ',' + i + ')'));
	    }
	    break;
	} while (false);
    }
    
    static final Class318_Sub1_Sub4 method813(int i, int i_25_, int i_26_) {
	Class357 class357
	    = Message.aClass357ArrayArrayArray2029[i][i_25_][i_26_];
	if (class357 == null)
	    return null;
	return ((Class357) class357).aClass318_Sub1_Sub4_4403;
    }
    
    static final void method814(byte i, long l) {
	try {
	    anInt1438++;
	    int i_27_ = Class348_Sub6.anInt6633;
	    if (i > 106) {
		if (Class130_Sub1.anInt5799 != i_27_) {
		    int i_28_ = i_27_ - Class130_Sub1.anInt5799;
		    int i_29_ = (int) ((long) i_28_ * l / 320L);
		    if ((i_28_ ^ 0xffffffff) >= -1) {
			if (i_29_ != 0) {
			    if ((i_28_ ^ 0xffffffff) < (i_29_ ^ 0xffffffff))
				i_29_ = i_28_;
			} else
			    i_29_ = -1;
		    } else if ((i_29_ ^ 0xffffffff) == -1)
			i_29_ = 1;
		    else if ((i_29_ ^ 0xffffffff) < (i_28_ ^ 0xffffffff))
			i_29_ = i_28_;
		    Class130_Sub1.anInt5799 += i_29_;
		}
		int i_30_ = Class348_Sub7.anInt6652;
		Class76.aFloat1287
		    += Class348_Sub27.aFloat6898 * (float) l / 40.0F * 8.0F;
		AbtractArchiveLoader.aFloat3938
		    += Class205.aFloat2687 * (float) l / 40.0F * 8.0F;
		if (Class192.anInt2578 != i_30_) {
		    int i_31_ = -Class192.anInt2578 + i_30_;
		    int i_32_ = (int) (l * (long) i_31_ / 320L);
		    if ((i_31_ ^ 0xffffffff) >= -1) {
			if (i_32_ == 0)
			    i_32_ = -1;
			else if (i_32_ < i_31_)
			    i_32_ = i_31_;
		    } else if ((i_32_ ^ 0xffffffff) != -1) {
			if (i_31_ < i_32_)
			    i_32_ = i_31_;
		    } else
			i_32_ = 1;
		    Class192.anInt2578 += i_32_;
		}
		Class239_Sub2.method1725(262144);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "lba.A(" + i + ',' + l + ')');
	}
    }
    
    StringVarScriptSettingLoader(GameMode class230, int i, IndexLoader class45) {
	try {
	    aClass45_1436 = class45;
	    ((StringVarScriptSettingLoader) this).amountScriptGlobalStrs = aClass45_1436.getAmountChildEntries(15);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("lba.<init>("
					     + (class230 != null ? "{...}"
						: "null")
					     + ',' + i + ','
					     + (class45 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
}
