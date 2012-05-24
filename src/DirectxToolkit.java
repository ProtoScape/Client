/* Direct3dToolkit - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;

import jaclib.peer.hb;

import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.GeometryBuffer;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DVertexShader;
import jagdx.PixelBuffer;
import jagdx.fda;
import jagdx.ue;

public final class DirectxToolkit extends NativeToolkit
{
	private boolean[] aBooleanArray9784;
	private int anInt9785 = 0;
	private boolean[] aBooleanArray9786;
	private Class53 aClass53_9787;
	hb aHb9788;
	private D3DLIGHT aD3DLIGHT9789;
	private static int[] anIntArray9790 = { 22, 23 };
	D3DCAPS aD3DCAPS9791;
	boolean aBoolean9792;
	private IDirect3D anIDirect3D9793;
	private IDirect3DVertexShader anIDirect3DVertexShader9794;
	private Class209[] aClass209Array9795;
	private D3DLIGHT aD3DLIGHT9796;
	private static float[] aFloatArray9797 = new float[16];
	boolean aBoolean9798;
	private int anInt9799;
	private D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS9800;
	private boolean aBoolean9801 = false;
	boolean aBoolean9802;
	PixelBuffer aPixelBuffer9803;
	private boolean[] aBooleanArray9804;
	private int[] anIntArray9805;
	private boolean[] aBooleanArray9806;
	private int anInt9807;
	private D3DLIGHT aD3DLIGHT9808;
	private static int[] anIntArray9809 = { 77, 80 };
	IDirect3DDevice anIDirect3DDevice9810;
	GeometryBuffer aGeometryBuffer9811;

	private static final int method3952(Class209 class209, byte i) {
		if (Class71.aClass209_1212 == class209)
			return 2;
		if (Class206.aClass209_4874 == class209)
			return 1;
		if (i <= 57)
			anIntArray9790 = null;
		throw new IllegalArgumentException();
	}

	final void method3928(int i) {
		aD3DLIGHT9789.SetAmbient
		(((DirectxToolkit) this).aFloat8180 * ((DirectxToolkit) this).aFloat8093,
				((DirectxToolkit) this).aFloat8093 * ((DirectxToolkit) this).aFloat8087,
				((DirectxToolkit) this).aFloat8168 * ((DirectxToolkit) this).aFloat8093,
				(float) i);
		aBoolean9801 = false;
	}

	final void method3829(Class70 class70, int i, byte i_0_, boolean bool) {
		if (i_0_ == 80) {
			int i_1_ = 0;
			int i_2_ = i;
			int i_3_;
			while_232_:
				do {
					do {
						if (i_2_ != 1) {
							if (-3 != (i_2_ ^ 0xffffffff))
								break;
						} else {
							i_3_ = 6;
							break while_232_;
						}
						i_3_ = 27;
						break while_232_;
					} while (false);
					i_3_ = 5;
				} while (false);
			if (bool)
				i_1_ |= 0x10;
			((DirectxToolkit) this).anIDirect3DDevice9810.SetTextureStageState
			(((DirectxToolkit) this).anInt8175, i_3_,
					method3961(class70, i_0_ + -78) | i_1_);
		}
	}

	final int[] na(int i, int i_4_, int i_5_, int i_6_) {
		int[] is = null;
		IDirect3DSurface idirect3dsurface
		= ((DirectxToolkit) this).anIDirect3DDevice9810.c(0);
		IDirect3DSurface idirect3dsurface_7_
		= ((DirectxToolkit) this).anIDirect3DDevice9810.a(i_5_, i_6_, 21, 0, 0,
				true);
		if (ue.a((((DirectxToolkit) this).anIDirect3DDevice9810.StretchRect
				(idirect3dsurface, i, i_4_, i_5_, i_6_, idirect3dsurface_7_,
						0, 0, i_5_, i_6_, 0)),
						false)
						&& ue.a(idirect3dsurface_7_.LockRect(0, 0, i_5_, i_6_, 16,
								(((DirectxToolkit) this)
										.aPixelBuffer9803)),
										false)) {
			is = new int[i_6_ * i_5_];
			int i_8_ = ((DirectxToolkit) this).aPixelBuffer9803.getRowPitch();
			if ((4 * i_5_ ^ 0xffffffff) != (i_8_ ^ 0xffffffff)) {
				for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff);
				i_9_++)
					((DirectxToolkit) this).aPixelBuffer9803.b(is, i_9_ * i_5_,
							i_9_ * i_8_, i_5_);
			} else
				((DirectxToolkit) this).aPixelBuffer9803.b(is, 0, 0, i_5_ * i_6_);
			idirect3dsurface_7_.UnlockRect();
		}
		idirect3dsurface.a(9275);
		idirect3dsurface_7_.a(9275);
		return is;
	}

	final void method3868(boolean bool) {
		if (bool)
			method3832(-4, (byte) -39);
	}

	final void method3862(int i, Class130 class130) {
		dxVertexLayout var_dxVertexLayout = (dxVertexLayout) class130;
		((DirectxToolkit) this).anIDirect3DDevice9810.SetVertexDeclaration
		(((dxVertexLayout) var_dxVertexLayout)
				.anIDirect3DVertexDeclaration5803);
		if (i != 0)
			method3910((byte) -110, 113);
	}

	private static final int method3953(Class21 class21, byte i) {
		if (i != -111)
			method3952(null, (byte) -118);
		if (class21 == Class249.aClass21_3217)
			return 2;
		if (Class348_Sub5_Sub1.aClass21_8832 == class21)
			return 3;
		if (Class277.aClass21_3572 == class21)
			return 1;
		if (class21 == Class247.aClass21_3181)
			return 4;
		if (FileRequest.aClass21_9661 == class21)
			return 6;
		if (class21 == s_Sub3.aClass21_8320)
			return 5;
		throw new IllegalArgumentException("");
	}

	final void method3954(int i, Class310_Sub2 class310_sub2) {
		method3956((byte) -56, class310_sub2);
		if (aBooleanArray9786[((DirectxToolkit) this).anInt8175]
		                      == !((Class310_Sub2) class310_sub2).aBoolean6334) {
			((DirectxToolkit) this).anIDirect3DDevice9810.SetSamplerState
			(((DirectxToolkit) this).anInt8175, 1,
					!((Class310_Sub2) class310_sub2).aBoolean6334 ? 3 : 1);
			aBooleanArray9786[((DirectxToolkit) this).anInt8175]
			                  = ((Class310_Sub2) class310_sub2).aBoolean6334;
		}
		if (i == 13700) {
			if (!aBooleanArray9806[((DirectxToolkit) this).anInt8175]
			                       == ((Class310_Sub2) class310_sub2).aBoolean6335) {
				((DirectxToolkit) this).anIDirect3DDevice9810.SetSamplerState
				(((DirectxToolkit) this).anInt8175, 2,
						!((Class310_Sub2) class310_sub2).aBoolean6335 ? 3 : 1);
				aBooleanArray9806[((DirectxToolkit) this).anInt8175]
				                  = ((Class310_Sub2) class310_sub2).aBoolean6335;
			}
		}
	}

	final void method3841(byte i) {
		((DirectxToolkit) this).anIDirect3DDevice9810.a(14, ((((DirectxToolkit) this)
				.aBoolean8124)
				&& (((DirectxToolkit) this)
						.aBoolean8118)));
		if (i != -116)
			method3960(true);
	}

	final void method3698() {
		/* empty */
	}

	final Interface18_Impl1 method3872(int i, int i_10_, Class304 class304,
			boolean bool, int i_11_, byte[] is) {
		if (bool != true)
			return null;
		return new Class310_Sub3(this, class304, i_10_, i_11_, i, is);
	}

	final void method3827(byte i) {
		if (i > -30)
			aClass53_9787 = null;
		((DirectxToolkit) this).anIDirect3DDevice9810.a
		(28,
				(((DirectxToolkit) this).aBoolean8148 && ((DirectxToolkit) this).aBoolean8123
						&& ((DirectxToolkit) this).anInt8091 >= 0));
	}

	final void method3901(byte i) {
		if (!((DirectxToolkit) this).aBoolean8069)
			((DirectxToolkit) this).aClass101_Sub2_8074.method918(aFloatArray9797,
					0);
		else {
			aFloatArray9797[1] = 0.0F;
			aFloatArray9797[2] = 0.0F;
			aFloatArray9797[15] = 1.0F;
			aFloatArray9797[3] = 0.0F;
			aFloatArray9797[9] = 0.0F;
			aFloatArray9797[6] = 0.0F;
			aFloatArray9797[0] = 1.0F;
			aFloatArray9797[7] = 0.0F;
			aFloatArray9797[11] = 0.0F;
			aFloatArray9797[13] = 0.0F;
			aFloatArray9797[10] = 1.0F;
			aFloatArray9797[8] = 0.0F;
			aFloatArray9797[12] = 0.0F;
			aFloatArray9797[5] = 1.0F;
			aFloatArray9797[14] = 0.0F;
			aFloatArray9797[4] = 0.0F;
		}
		if (i < -18)
			((DirectxToolkit) this).anIDirect3DDevice9810
			.SetTransform(256, aFloatArray9797);
	}

	final void method3926(byte i, boolean bool) {
		if (i < 34)
			((DirectxToolkit) this).aBoolean9798 = false;
		((DirectxToolkit) this).anIDirect3DDevice9810.a(161, bool);
	}

	final void method3924(boolean bool, boolean bool_12_, int i,
			Class70 class70, boolean bool_13_) {
		int i_14_ = i;
		int i_15_;
		while_233_:
			do {
				do {
					if (1 != i_14_) {
						if ((i_14_ ^ 0xffffffff) != -3)
							break;
					} else {
						i_15_ = 3;
						break while_233_;
					}
					i_15_ = 26;
					break while_233_;
				} while (false);
				i_15_ = 2;
			} while (false);
		int i_16_ = 0;
		if (bool)
			i_16_ |= 0x20;
		if (bool_12_)
			aD3DPRESENT_PARAMETERS9800 = null;
		if (bool_13_)
			i_16_ |= 0x10;
		((DirectxToolkit) this).anIDirect3DDevice9810.SetTextureStageState
		(((DirectxToolkit) this).anInt8175, i_15_,
				i_16_ | method3961(class70, 2));
	}

	final void method3892(int i) {
		aD3DLIGHT9789.SetDirection(-((DirectxToolkit) this).aFloatArray8170[0],
				-((DirectxToolkit) this).aFloatArray8170[1],
				-((DirectxToolkit) this).aFloatArray8170[2]);
		aD3DLIGHT9796.SetDirection(-((DirectxToolkit) this).aFloatArray8102[i],
				-((DirectxToolkit) this).aFloatArray8102[1],
				-((DirectxToolkit) this).aFloatArray8102[2]);
		aBoolean9801 = false;
	}

	final Interface13 method3624(int i, int i_17_) {
		return null;
	}

	private static final int method3955(int i, Class229 class229) {
		if (Class328_Sub3.aClass229_6519 == class229)
			return 2;
		if (Class167.aClass229_2207 == class229)
			return 4;
		if (OndemandWorker.aClass229_3196 != class229) {
			if (class229 != Class348_Sub23_Sub2.aClass229_9011) {
				if (class229 == Class348_Sub7.aClass229_6644)
					return 10;
			} else
				return 7;
		} else
			return 26;
		if (i <= 16)
			method3955(-116, null);
		throw new IllegalArgumentException();
	}

	final void method3910(byte i, int i_18_) {
		if (i != -26)
			((DirectxToolkit) this).aD3DCAPS9791 = null;
		((DirectxToolkit) this).anIDirect3DDevice9810
		.SetTextureStageState(((DirectxToolkit) this).anInt8175, 11, i_18_);
	}

	static final AbstractToolkit createToolkit(Canvas canvas, d var_d, IndexLoader class45,
			Integer integer) {
		DirectxToolkit class378 = null;
		DirectxToolkit class378_19_;
		try {
			int i = 0;
			int i_20_ = 1;
			hb var_hb = new hb();
			IDirect3D idirect3d = IDirect3D.a(-2147483616, var_hb);
			D3DCAPS d3dcaps = idirect3d.b(i, i_20_);
			if (-1 == (d3dcaps.RasterCaps & 0x1000000 ^ 0xffffffff))
				throw new RuntimeException("");
			if ((d3dcaps.MaxSimultaneousTextures ^ 0xffffffff) > -3)
				throw new RuntimeException("");
			if ((0x2 & d3dcaps.TextureOpCaps ^ 0xffffffff) == -1)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x8 ^ 0xffffffff) == -1)
				throw new RuntimeException("");
			if ((0x40 & d3dcaps.TextureOpCaps) == 0)
				throw new RuntimeException("");
			if (-1 == (0x200 & d3dcaps.TextureOpCaps ^ 0xffffffff))
				throw new RuntimeException("");
			if (-1 == (0x2000000 & d3dcaps.TextureOpCaps ^ 0xffffffff))
				throw new RuntimeException("");
			if (0 == (0x10 & (d3dcaps.DestBlendCaps & d3dcaps.SrcBlendCaps)))
				throw new RuntimeException("");
			if ((d3dcaps.DestBlendCaps & d3dcaps.SrcBlendCaps & 0x20
					^ 0xffffffff)
					== -1)
				throw new RuntimeException("");
			if (0 == (d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2))
				throw new RuntimeException("");
			if (0 < d3dcaps.MaxActiveLights && 2 > d3dcaps.MaxActiveLights)
				throw new RuntimeException("");
			if (-6 < (d3dcaps.MaxStreams ^ 0xffffffff))
				throw new RuntimeException("");
			D3DPRESENT_PARAMETERS d3dpresent_parameters
			= new D3DPRESENT_PARAMETERS(canvas);
			if (!method3964(d3dpresent_parameters, 0, i, idirect3d, i_20_,
					integer.intValue()))
				throw new RuntimeException("");
			d3dpresent_parameters.PresentationInterval = -2147483648;
			d3dpresent_parameters.EnableAutoDepthStencil = true;
			d3dpresent_parameters.Windowed = true;
			int i_21_ = 2;
			if ((0x100000 & d3dcaps.DevCaps ^ 0xffffffff) != -1)
				i_21_ |= 0x10;
			Object object = null;
			IDirect3DDevice idirect3ddevice;
			try {
				idirect3ddevice = idirect3d.a(i, i_20_, canvas, i_21_ | 0x40,
						d3dpresent_parameters);
			} catch (fda var_fda) {
				idirect3ddevice = idirect3d.a(i, i_20_, canvas, i_21_ | 0x20,
						d3dpresent_parameters);
			}
			Class53 class53
			= new Class53(idirect3ddevice.b(0), idirect3ddevice.c());
			class378
			= new DirectxToolkit(i, i_20_, canvas, var_hb, idirect3d,
					idirect3ddevice, class53, d3dpresent_parameters,
					d3dcaps, var_d, class45, integer.intValue());
			class378.method3930((byte) 26);
			class378_19_ = class378;
		} catch (RuntimeException runtimeexception) {
			if (class378 != null)
				class378.method3652();
			throw runtimeexception;
		}
		return class378_19_;
	}

	final void method3911(Canvas canvas, int i, Object object) {
		if (i != 1)
			anIDirect3D9793 = null;
	}

	final void method3956(byte i, Class310 class310) {
		((DirectxToolkit) this).anIDirect3DDevice9810.SetTexture
		(((DirectxToolkit) this).anInt8175, class310.method2314(17723));
		if (i <= -53) {
			if (aClass209Array9795[((DirectxToolkit) this).anInt8175]
			                       == ((Class310) class310).aClass209_3894) {
				if (aBooleanArray9804[((DirectxToolkit) this).anInt8175]
				                      == !((Class310) class310).aBoolean3892) {
					((DirectxToolkit) this).anIDirect3DDevice9810.SetSamplerState
					(((DirectxToolkit) this).anInt8175, 7,
							(((Class310) class310).aBoolean3892
									? method3952(((Class310) class310).aClass209_3894,
											(byte) 86)
											: 0));
					aBooleanArray9804[((DirectxToolkit) this).anInt8175]
					                  = ((Class310) class310).aBoolean3892;
				}
			} else {
				int i_22_ = method3952(((Class310) class310).aClass209_3894,
						(byte) 82);
				((DirectxToolkit) this).anIDirect3DDevice9810
				.SetSamplerState(((DirectxToolkit) this).anInt8175, 6, i_22_);
				((DirectxToolkit) this).anIDirect3DDevice9810
				.SetSamplerState(((DirectxToolkit) this).anInt8175, 5, i_22_);
				aClass209Array9795[((DirectxToolkit) this).anInt8175]
				                   = ((Class310) class310).aClass209_3894;
				if (aBooleanArray9804[((DirectxToolkit) this).anInt8175]
				                      != ((Class310) class310).aBoolean3892) {
					((DirectxToolkit) this).anIDirect3DDevice9810.SetSamplerState
					(((DirectxToolkit) this).anInt8175, 7,
							(!((Class310) class310).aBoolean3892 ? 0
									: method3952(((Class310) class310).aClass209_3894,
											(byte) 68)));
					aBooleanArray9804[((DirectxToolkit) this).anInt8175]
					                  = ((Class310) class310).aBoolean3892;
				}
			}
			if (!aBooleanArray9784[((DirectxToolkit) this).anInt8175]) {
				aBooleanArray9784[((DirectxToolkit) this).anInt8175] = true;
				method3935(-123);
				method3920(10);
			}
		}
	}

	final Interface3$ method3665(int i, int i_23_) {
		return null;
	}

	final void method3813(boolean bool) {
		((DirectxToolkit) this).anIDirect3DDevice9810
		.SetTransform(3, ((DirectxToolkit) this).aFloatArray8135);
		if (bool != true)
			method3963(-7, null);
	}

	final void method3957(IDirect3DVertexShader idirect3dvertexshader,
			byte i) {
		if (i == -89) {
			anIDirect3DVertexShader9794 = idirect3dvertexshader;
			((DirectxToolkit) this).anIDirect3DDevice9810
			.SetVertexShader(idirect3dvertexshader);
			method3940(1);
		}
	}

	final void method3938(Class21 class21, int i,
			Interface5_Impl2 interface5_impl2, int i_24_,
			int i_25_, int i_26_, int i_27_) {
		((DirectxToolkit) this).anIDirect3DDevice9810.SetIndices
		(((Class142) (Class142) interface5_impl2)
				.anIDirect3DIndexBuffer8517);
		((DirectxToolkit) this).anIDirect3DDevice9810.DrawIndexedPrimitive
		(method3953(class21, (byte) -111), 0, i_24_, i_26_, i_25_, i);
		if (i_27_ < 46)
			method3931(true, null, null);
	}

	final AbstractRasterizer method3634(Interface3$ interface3,
			Interface13 interface13) {
		return null;
	}

	final void method3672() {
		/* empty */
	}

	final void method3888(int i) {
		if (i != 6259)
			method3882((byte) -77);
		((DirectxToolkit) this).anIDirect3DDevice9810.SetScissorRect
		(((DirectxToolkit) this).anInt8181 - -((DirectxToolkit) this).anInt8106,
				((DirectxToolkit) this).anInt8109 - -((DirectxToolkit) this).anInt8165,
				((DirectxToolkit) this).anInt8183, ((DirectxToolkit) this).anInt8096);
	}

	final void method3707
	(Rectangle[] rectangles, int i, int i_28_, int i_29_)
	throws ToolkitException {
		draw(i_28_, i_29_);
	}

	final boolean method3931(boolean bool, Class304 class304,
			Class68 class68) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		if (bool != true)
			aBooleanArray9786 = null;
		return (ue.a(anIDirect3D9793.a(anInt9799, d3ddisplaymode), !bool)
				&& ue.a((anIDirect3D9793.CheckDeviceFormat
						(anInt9799, anInt9807, d3ddisplaymode.Format, 0, 4,
								method3958(22, class68, class304))),
								false));
	}

	final void method3881(Object object, byte i, Canvas canvas) {
		if (i == 99)
			aClass53_9787 = (Class53) object;
	}

	final void method3842(boolean bool) {
		float f = (!((DirectxToolkit) this).aBoolean8110 ? 0.0F
				: ((DirectxToolkit) this).aFloat8174);
		float f_30_ = (!((DirectxToolkit) this).aBoolean8110 ? 0.0F
				: -((DirectxToolkit) this).aFloat8186);
		aD3DLIGHT9789.SetDiffuse(f * ((DirectxToolkit) this).aFloat8180,
				((DirectxToolkit) this).aFloat8087 * f,
				f * ((DirectxToolkit) this).aFloat8168, 0.0F);
		if (bool == true) {
			aD3DLIGHT9796.SetDiffuse(((DirectxToolkit) this).aFloat8180 * f_30_,
					((DirectxToolkit) this).aFloat8087 * f_30_,
					((DirectxToolkit) this).aFloat8168 * f_30_,
					0.0F);
			aBoolean9801 = false;
		}
	}

	static final int method3958(int i, Class68 class68, Class304 class304) {
		if (class68 == Class68.aClass68_1183) {
			if (AbstractMouseEvent.aClass304_7103 != class304) {
				if (Class108.aClass304_1662 == class304)
					return 21;
				if (Class348_Sub40_Sub38.aClass304_9471 == class304)
					return 28;
				if (Class348_Sub40_Sub22.aClass304_9303 == class304)
					return 50;
				if (class304 == Class191.aClass304_2571)
					return 51;
				if (class304 == Class318.aClass304_3977)
					return 77;
			} else
				return 22;
		}
		if (i != 22)
			anIntArray9790 = null;
		throw new IllegalArgumentException("");
	}

	final boolean isBloomSupported() {
		return false;
	}

	final void method3633() {
		IDirect3DEventQuery idirect3deventquery
		= ((DirectxToolkit) this).anIDirect3DDevice9810.b();
		if (ue.a(idirect3deventquery.Issue(), false)) {
			for (;;) {
				int i = idirect3deventquery.IsSignaled();
				if (-2 != (i ^ 0xffffffff))
					break;
				Thread.yield();
			}
		}
		idirect3deventquery.a(9275);
	}

	final void F(int i, int i_31_) {
		/* empty */
	}

	final void method3945(int i) {
		((DirectxToolkit) this).anIDirect3DDevice9810
		.SetRenderState(60, ((DirectxToolkit) this).anInt8119);
		if (i > -107)
			((DirectxToolkit) this).aBoolean9802 = false;
	}

	final Class299 method3706(Class299 class299, Class299 class299_32_,
			float f, Class299 class299_33_) {
		return 0.5F > f ? class299 : class299_32_;
	}

	final void method3647(boolean bool) {
		/* empty */
	}

	final void method3823(byte i) {
		int i_34_ = -115 % ((i - -39) / 62);
		int i_35_;
		for (i_35_ = 0;
		(i_35_ ^ 0xffffffff) > (((DirectxToolkit) this).anInt8151 ^ 0xffffffff);
		i_35_++) {
			Class348_Sub1 class348_sub1
			= ((DirectxToolkit) this).aClass348_Sub1Array8132[i_35_];
			int i_36_ = i_35_ - -2;
			int i_37_ = class348_sub1.method2720(-1);
			float f = class348_sub1.method2721(-115) / 255.0F;
			aD3DLIGHT9808.SetPosition((float) class348_sub1.method2724(-1),
					(float) class348_sub1.method2722(123),
					(float) class348_sub1
					.method2717((byte) 115));
			aD3DLIGHT9808.SetDiffuse(f * (float) ((i_37_ & 0xff34ed)
					>> 362112720),
					(float) (0xff & i_37_ >> 1430366856) * f,
					f * (float) (i_37_ & 0xff), 0.0F);
			aD3DLIGHT9808.SetAttenuation
			(0.0F, 0.0F, 1.0F / (float) (class348_sub1.method2723(-1)
					* class348_sub1.method2723(-1)));
			aD3DLIGHT9808.SetRange((float) class348_sub1.method2723(-1));
			((DirectxToolkit) this).anIDirect3DDevice9810.SetLight(i_36_,
					aD3DLIGHT9808);
			((DirectxToolkit) this).anIDirect3DDevice9810.LightEnable(i_36_, true);
		}
		for (/**/;
		(((DirectxToolkit) this).anInt8122 ^ 0xffffffff) < (i_35_ ^ 0xffffffff);
		i_35_++)
			((DirectxToolkit) this).anIDirect3DDevice9810.LightEnable(i_35_ - -2,
					false);
		super.method3823((byte) 57);
	}

	final void method3819(byte i) {
		if (aBooleanArray9784[((DirectxToolkit) this).anInt8175]) {
			aBooleanArray9784[((DirectxToolkit) this).anInt8175] = false;
			((DirectxToolkit) this).anIDirect3DDevice9810
			.SetTexture(((DirectxToolkit) this).anInt8175, null);
			method3935(-110);
			method3920(10);
		}
		if (i >= -19)
			method3855(null, -78, 86, null, false, 82, 55, -34);
	}

	private DirectxToolkit(int i, int i_38_, Canvas canvas, hb var_hb,
			IDirect3D idirect3d, IDirect3DDevice idirect3ddevice,
			Class53 class53,
			D3DPRESENT_PARAMETERS d3dpresent_parameters,
			D3DCAPS d3dcaps, d var_d, IndexLoader class45, int i_39_) {
		super(canvas, class53, var_d, class45, i_39_, 0);
		try {
			((DirectxToolkit) this).aHb9788 = var_hb;
			aD3DPRESENT_PARAMETERS9800 = d3dpresent_parameters;
			anInt9807 = i_38_;
			anIDirect3D9793 = idirect3d;
			anInt9799 = i;
			aClass53_9787 = class53;
			((DirectxToolkit) this).anIDirect3DDevice9810 = idirect3ddevice;
			((DirectxToolkit) this).aD3DCAPS9791 = d3dcaps;
			aD3DLIGHT9789 = new D3DLIGHT(((DirectxToolkit) this).aHb9788);
			aD3DLIGHT9796 = new D3DLIGHT(((DirectxToolkit) this).aHb9788);
			aD3DLIGHT9808 = new D3DLIGHT(((DirectxToolkit) this).aHb9788);
			((DirectxToolkit) this).aPixelBuffer9803
			= new PixelBuffer(((DirectxToolkit) this).aHb9788);
			((DirectxToolkit) this).aGeometryBuffer9811
			= new GeometryBuffer(((DirectxToolkit) this).aHb9788);
			new GeometryBuffer(((DirectxToolkit) this).aHb9788);
			((DirectxToolkit) this).aBoolean8101
			= (0x800 & ((DirectxToolkit) this).aD3DCAPS9791.TextureCaps
					^ 0xffffffff) != -1;
			((DirectxToolkit) this).aBoolean9798
			= (0x4000 & ((DirectxToolkit) this).aD3DCAPS9791.TextureCaps) != 0;
			((DirectxToolkit) this).aBoolean9792
			= -1 == (0x2 & ((DirectxToolkit) this).aD3DCAPS9791.TextureCaps
					^ 0xffffffff);
			((DirectxToolkit) this).aBoolean9802
			= (((DirectxToolkit) this).aD3DCAPS9791.TextureCaps & 0x10000
					^ 0xffffffff) != -1;
			((DirectxToolkit) this).anInt8138
			= (((DirectxToolkit) this).aD3DCAPS9791.MaxActiveLights <= 0 ? 8
					: ((DirectxToolkit) this).aD3DCAPS9791.MaxActiveLights);
			((DirectxToolkit) this).aBoolean8159
			= (((DirectxToolkit) this).aD3DCAPS9791.TextureCaps & 0x2000) != 0;
			((DirectxToolkit) this).anInt8090
			= ((DirectxToolkit) this).aD3DCAPS9791.MaxSimultaneousTextures;
			((DirectxToolkit) this).aBoolean8182
			= ((((DirectxToolkit) this).anInt8117 ^ 0xffffffff) < -1
					|| ((anIDirect3D9793.CheckDeviceMultiSampleType
							(anInt9799, anInt9807,
									aD3DPRESENT_PARAMETERS9800.BackBufferFormat, true, 2))
									== 0));
			aBooleanArray9806 = new boolean[((DirectxToolkit) this).anInt8090];
			aBooleanArray9804 = new boolean[((DirectxToolkit) this).anInt8090];
			aBooleanArray9784 = new boolean[((DirectxToolkit) this).anInt8090];
			aClass209Array9795 = new Class209[((DirectxToolkit) this).anInt8090];
			anIntArray9805 = new int[((DirectxToolkit) this).anInt8090];
			aBooleanArray9786 = new boolean[((DirectxToolkit) this).anInt8090];
			((DirectxToolkit) this).anIDirect3DDevice9810.BeginScene();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			destroy();
			throw new RuntimeException("");
		}
	}

	final void method3898(int i) {
		if (i != 12)
			method3634(null, null);
		if (((DirectxToolkit) this).aClass196_8184.method1450(-32))
			((DirectxToolkit) this).aClass101_Sub2_8083.method918(aFloatArray9797,
					0);
		else {
			aFloatArray9797[1] = 0.0F;
			aFloatArray9797[7] = 0.0F;
			aFloatArray9797[12] = 0.0F;
			aFloatArray9797[0] = 1.0F;
			aFloatArray9797[5] = 1.0F;
			aFloatArray9797[13] = 0.0F;
			aFloatArray9797[2] = 0.0F;
			aFloatArray9797[11] = 0.0F;
			aFloatArray9797[9] = 0.0F;
			aFloatArray9797[10] = 1.0F;
			aFloatArray9797[14] = 0.0F;
			aFloatArray9797[8] = 0.0F;
			aFloatArray9797[4] = 0.0F;
			aFloatArray9797[15] = 1.0F;
			aFloatArray9797[6] = 0.0F;
			aFloatArray9797[3] = 0.0F;
		}
		((DirectxToolkit) this).anIDirect3DDevice9810.SetTransform(2,
				aFloatArray9797);
	}

	final void method3652() {
		((DirectxToolkit) this).aHb9788.a((byte) 13);
		super.method3652();
	}

	final Interface5_Impl2 method3840(int i, boolean bool) {
		if (i != -28633)
			method3937((byte) 102);
		return new Class142(this, Class68.aClass68_1184, bool);
	}

	final void drawScreenOverlay(int i) {
		((DirectxToolkit) this).anIDirect3DDevice9810.Clear(1, i, 0.0F, 0);
	}

	final int getAmountPolygons() {
		return 0;
	}

	final void method3851(int i) {
		((DirectxToolkit) this).aFloat8115
		= (float) (((DirectxToolkit) this).anInt8154
				+ -((DirectxToolkit) this).anInt8105);
		((DirectxToolkit) this).aFloat8173 = ((float) -((DirectxToolkit) this).anInt8091
				+ ((DirectxToolkit) this).aFloat8115);
		if (((DirectxToolkit) this).aFloat8173 < (float) ((DirectxToolkit) this).anInt8095)
			((DirectxToolkit) this).aFloat8173 = (float) ((DirectxToolkit) this).anInt8095;
		((DirectxToolkit) this).anIDirect3DDevice9810
		.a(36, ((DirectxToolkit) this).aFloat8173);
		if (i != 25644)
			aD3DLIGHT9796 = null;
		((DirectxToolkit) this).anIDirect3DDevice9810
		.a(37, ((DirectxToolkit) this).aFloat8115);
		((DirectxToolkit) this).anIDirect3DDevice9810
		.SetRenderState(34, ((DirectxToolkit) this).anInt8144);
	}

	final Interface18_Impl3 method3855(Class304 class304, int i, int i_40_,
			float[] fs, boolean bool, int i_41_,
			int i_42_, int i_43_) {
		if (i_42_ != 2)
			aD3DLIGHT9796 = null;
		return null;
	}

	final void method3884(byte i) {
		if (!aBoolean9801) {
			((DirectxToolkit) this).anIDirect3DDevice9810.LightEnable(0, false);
			((DirectxToolkit) this).anIDirect3DDevice9810.LightEnable(1, false);
			((DirectxToolkit) this).anIDirect3DDevice9810.SetLight(0, aD3DLIGHT9789);
			((DirectxToolkit) this).anIDirect3DDevice9810.SetLight(1, aD3DLIGHT9796);
			((DirectxToolkit) this).anIDirect3DDevice9810.LightEnable(0, true);
			((DirectxToolkit) this).anIDirect3DDevice9810.LightEnable(1, true);
			aBoolean9801 = true;
		}
		if (i != 101)
			anIntArray9805 = null;
	}

	final boolean method3671() {
		return false;
	}

	final void method3937(byte i) {
		if (i != -33)
			method3962(-41, null);
		((DirectxToolkit) this).anIDirect3DDevice9810.SetViewport
		(((DirectxToolkit) this).anInt8181, ((DirectxToolkit) this).anInt8109,
				((DirectxToolkit) this).anInt7931, ((DirectxToolkit) this).anInt7962, 0.0F,
				1.0F);
	}

	final void method3959(int i, Class310_Sub3 class310_sub3) {
		method3956((byte) -73, class310_sub3);
		if (!aBooleanArray9786[((DirectxToolkit) this).anInt8175]) {
			((DirectxToolkit) this).anIDirect3DDevice9810
			.SetSamplerState(((DirectxToolkit) this).anInt8175, 1, 1);
			aBooleanArray9786[((DirectxToolkit) this).anInt8175] = true;
		}
		if (!aBooleanArray9806[((DirectxToolkit) this).anInt8175]) {
			((DirectxToolkit) this).anIDirect3DDevice9810
			.SetSamplerState(((DirectxToolkit) this).anInt8175, 2, 1);
			aBooleanArray9806[((DirectxToolkit) this).anInt8175] = true;
		}
		int i_44_ = 82 % ((i - 44) / 56);
	}

	final void method3899(int i, int i_45_, Class21 class21, boolean bool) {
		((DirectxToolkit) this).anIDirect3DDevice9810
		.DrawPrimitive(method3953(class21, (byte) -111), i_45_, i);
		if (bool != true)
			aClass209Array9795 = null;
	}

	final void method3658(int i, int i_46_, int i_47_, int i_48_) {
		/* empty */
	}

	final void method3818(boolean bool) {
		if (bool != true)
			method3633();
		method3842(bool);
		method3884((byte) 101);
	}

	final void method3673() {
		/* empty */
	}

	final void method3947(int i) {
		if (i == 4)
			((DirectxToolkit) this).anIDirect3DDevice9810
			.a(27, ((DirectxToolkit) this).aBoolean8116);
	}

	final void method3859(int i) {
		((DirectxToolkit) this).anIDirect3DDevice9810
		.a(7, ((DirectxToolkit) this).aBoolean8164);
		if (i != 3)
			method3882((byte) 51);
	}

	final Interface18_Impl3 method3843(int i, int i_49_, int i_50_, int i_51_,
			byte[] is, Class304 class304, int i_52_,
			boolean bool) {
		if (i_52_ != 32)
			anInt9785 = 94;
		return new Class310_Sub2(this, class304, i_50_, i, bool, is, i_49_,
				i_51_);
	}

	final synchronized void method3646(int i) {
		((DirectxToolkit) this).aHb9788.b((byte) -82);
		super.method3646(i);
	}

	final float method3858(boolean bool) {
		if (bool)
			aBoolean9801 = true;
		return -0.5F;
	}

	final Object method3876(int i, Canvas canvas) {
		if (i != -1)
			return null;
		return null;
	}

	private final boolean method3960(boolean bool) {
		int i = ((DirectxToolkit) this).anIDirect3DDevice9810.TestCooperativeLevel();
		if (bool)
			method3880(null, null, (byte) -68);
		if (i == 0 || -2005530519 == i) {
			Class53 class53 = (Class53) ((DirectxToolkit) this).anObject7919;
			method3922(false);
			class53.method496((byte) 84);
			aD3DPRESENT_PARAMETERS9800.BackBufferHeight = 0;
			aD3DPRESENT_PARAMETERS9800.BackBufferWidth = 0;
			if (method3964(aD3DPRESENT_PARAMETERS9800, 0, anInt9799,
					anIDirect3D9793, anInt9807,
					((DirectxToolkit) this).anInt8117)) {
				int i_53_ = ((DirectxToolkit) this).anIDirect3DDevice9810
				.Reset(aD3DPRESENT_PARAMETERS9800);
				if (ue.a(i_53_, false)) {
					class53.method497(((DirectxToolkit) this)
							.anIDirect3DDevice9810.b(0),
							(byte) -107,
							((DirectxToolkit) this)
							.anIDirect3DDevice9810.c());
					method3902((byte) -42);
					method3882((byte) 113);
					return true;
				}
			}
		}
		return false;
	}

	final void method3920(int i) {
		int i_54_ = (aBooleanArray9784[((DirectxToolkit) this).anInt8175]
		                               ? method3955(24, (((DirectxToolkit) this).aClass229Array8086
		                            		   [((DirectxToolkit) this).anInt8175]))
		                            		   : 1);
		if (i != 10)
			getAmountPolygons();
		((DirectxToolkit) this).anIDirect3DDevice9810
		.SetTextureStageState(((DirectxToolkit) this).anInt8175, 1, i_54_);
	}

	final Interface18_Impl3 method3830(int i, int[] is, boolean bool,
			byte i_55_, int i_56_, int i_57_,
			int i_58_) {
		int i_59_ = -31 % ((-21 - i_55_) / 46);
		return new Class310_Sub2(this, i, i_58_, bool, is, i_56_, i_57_);
	}

	final void method3687(AbstractRasterizer interface4) {
		/* empty */
	}

	final Interface18_Impl2 method3900(int[][] is, boolean bool, int i,
			int i_60_) {
		if (i <= 1)
			aFloatArray9797 = null;
		return new Class310_Sub1(this, i_60_, bool, is);
	}

	final void method3939(byte i) {
		((DirectxToolkit) this).anIDirect3DDevice9810
		.a(15, ((DirectxToolkit) this).aBoolean8141);
		if (i != 100)
			anIntArray9805 = null;
	}

	private static final int method3961(Class70 class70, int i) {
		if (i != 2)
			aFloatArray9797 = null;
		if (Class342.aClass70_4247 == class70)
			return 2;
		if (class70 == Class285_Sub2.aClass70_8503)
			return 0;
		if (Class318_Sub1_Sub2.aClass70_8737 != class70) {
			if (Class348_Sub40_Sub39.aClass70_9485 == class70)
				return 3;
		} else
			return 1;
		throw new IllegalArgumentException();
	}

	final Class130 method3812(int i, Class58[] class58s) {
		if (i != 0)
			anInt9807 = 29;
		return new dxVertexLayout(this, class58s);
	}

	final void method3962(int i, IDirect3DPixelShader idirect3dpixelshader) {
		if (i != 22927)
			aFloatArray9797 = null;
		((DirectxToolkit) this).anIDirect3DDevice9810
		.SetPixelShader(idirect3dpixelshader);
	}

	final void method3710() {
		/* empty */
	}

	final Interface5_Impl1 method3889(boolean bool, int i) {
		if (i != 16711680)
			return null;
		return new Class366(this, bool);
	}

	final void method3921(int i) {
		((DirectxToolkit) this).anIDirect3DDevice9810
		.a(174, ((DirectxToolkit) this).aBoolean8209);
		if (i != 1)
			method3858(true);
	}

	final void b(int i, int i_61_, int i_62_, int i_63_, double d) {
		/* empty */
	}

	final Class367 method3832(int i, byte i_64_) {
		if (i_64_ >= -57)
			aClass209Array9795 = null;
		int i_65_ = i;
		while_234_:
			do {
				do {
					if (-4 != (i_65_ ^ 0xffffffff)) {
						if ((i_65_ ^ 0xffffffff) != -5) {
							if (8 == i_65_)
								break;
							break while_234_;
						}
					} else
						return new Class367_Sub5(this,
								((DirectxToolkit) this).aClass45_8039);
					return new Class367_Sub6(this, ((DirectxToolkit) this).aClass45_8039,
							((DirectxToolkit) this).aClass269_7937);
				} while (false);
				return new Class367_Sub7(this, ((DirectxToolkit) this).aClass45_8039,
						((DirectxToolkit) this).aClass269_7937);
			} while (false);
		return super.method3832(i, (byte) -74);
	}

	final void method3700(float f, float f_66_, float f_67_) {
		/* empty */
	}

	private static final int method3963(int i, Class251 class251) {
		if (i != 594)
			return 7;
		if (class251 == Class135_Sub2.aClass251_4835)
			return 1;
		if (class251 != Class239_Sub18.aClass251_6030) {
			if (class251 != Class348_Sub40_Sub38.aClass251_9477) {
				if (Class57.aClass251_1051 == class251)
					return 4;
				if (class251 == Class239_Sub14.aClass251_5989)
					return 256;
			} else
				return 3;
		} else
			return 2;
		return 0;
	}

	final void method3871(Class113 class113, int i) {
		int i_68_ = i;
		if (Class31.aClass113_430 == class113)
			i_68_ = 65536;
		else if (za_Sub1.aClass113_9773 == class113)
			i_68_ = 131072;
		else if (class113 == Class261.aClass113_3314)
			i_68_ = 196608;
		((DirectxToolkit) this).anIDirect3DDevice9810.SetTextureStageState
		(((DirectxToolkit) this).anInt8175, 11,
				((DirectxToolkit) this).anInt8175 | i_68_);
	}

	final boolean method3880(Class68 class68, Class304 class304, byte i) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		int i_69_ = 96 / ((i - 85) / 37);
		return (ue.a(anIDirect3D9793.a(anInt9799, d3ddisplaymode), false)
				&& ue.a((anIDirect3D9793.CheckDeviceFormat
						(anInt9799, anInt9807, d3ddisplaymode.Format, 0, 3,
								method3958(22, class68, class304))),
								false));
	}

	final void method3882(byte i) {
		for (int i_70_ = 0; i_70_ < ((DirectxToolkit) this).anInt8090; i_70_++) {
			((DirectxToolkit) this).anIDirect3DDevice9810.SetSamplerState(i_70_, 7,
					0);
			((DirectxToolkit) this).anIDirect3DDevice9810.SetSamplerState(i_70_, 6,
					2);
			((DirectxToolkit) this).anIDirect3DDevice9810.SetSamplerState(i_70_, 5,
					2);
			((DirectxToolkit) this).anIDirect3DDevice9810.SetSamplerState(i_70_, 1,
					1);
			((DirectxToolkit) this).anIDirect3DDevice9810.SetSamplerState(i_70_, 2,
					1);
			aClass209Array9795[i_70_] = Class71.aClass209_1212;
			aBooleanArray9786[i_70_] = aBooleanArray9806[i_70_] = true;
			aBooleanArray9804[i_70_] = false;
			anIntArray9805[i_70_] = 0;
		}
		((DirectxToolkit) this).anIDirect3DDevice9810.SetTextureStageState(0, 6, 1);
		((DirectxToolkit) this).anIDirect3DDevice9810.SetRenderState(9, 2);
		((DirectxToolkit) this).anIDirect3DDevice9810.SetRenderState(23, 4);
		((DirectxToolkit) this).anIDirect3DDevice9810.SetRenderState(25, 5);
		if (i <= 45)
			method3861(109, (byte) -95, -59, null, null);
		((DirectxToolkit) this).anIDirect3DDevice9810.SetRenderState(24, 0);
		((DirectxToolkit) this).anIDirect3DDevice9810.SetRenderState(22, 2);
		((DirectxToolkit) this).anIDirect3DDevice9810.SetRenderState(147, 1);
		((DirectxToolkit) this).anIDirect3DDevice9810.SetRenderState(145, 1);
		((DirectxToolkit) this).anIDirect3DDevice9810.a(38, 0.95F);
		((DirectxToolkit) this).anIDirect3DDevice9810.SetRenderState(140, 3);
		aD3DLIGHT9789.SetType(3);
		aD3DLIGHT9796.SetType(3);
		aD3DLIGHT9808.SetType(1);
		aBoolean9801 = false;
		super.method3882((byte) 63);
	}

	final ToolkitInfo getToolkitInfo() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier
		= anIDirect3D9793.a(anInt9799, 0);
		return new ToolkitInfo(d3dadapter_identifier.VendorID, "Direct3D", 9,
				d3dadapter_identifier.Description,
				d3dadapter_identifier.DriverVersion);
	}

	final void method3935(int i) {
		if (i <= -99) {
			int i_71_ = (aBooleanArray9784[((DirectxToolkit) this).anInt8175]
			                               ? method3955(50, (((DirectxToolkit) this).aClass229Array8092
			                            		   [((DirectxToolkit) this).anInt8175]))
			                            		   : 1);
			((DirectxToolkit) this).anIDirect3DDevice9810
			.SetTextureStageState(((DirectxToolkit) this).anInt8175, 4, i_71_);
		}
	}

	final void method3940(int i) {
		if (anIDirect3DVertexShader9794 == null
				&& ((((DirectxToolkit) this).aClass251Array8113
						[((DirectxToolkit) this).anInt8175])
						!= Class348_Sub42_Sub18.aClass251_9685)) {
			if (Class239_Sub18.aClass251_6030
					== (((DirectxToolkit) this).aClass251Array8113
							[((DirectxToolkit) this).anInt8175]))
				((DirectxToolkit) this).anIDirect3DDevice9810.SetTransform
				(((DirectxToolkit) this).anInt8175 + 16,
						((DirectxToolkit) this).aClass101_Sub2Array8131
						[((DirectxToolkit) this).anInt8175]
						 .method928(aFloatArray9797, i ^ 0x0));
			else
				((DirectxToolkit) this).anIDirect3DDevice9810.SetTransform
				(16 - -((DirectxToolkit) this).anInt8175,
						((DirectxToolkit) this).aClass101_Sub2Array8131
						[((DirectxToolkit) this).anInt8175]
						 .method918(aFloatArray9797, i ^ 0x1));
			int i_72_ = method3963(594, (((DirectxToolkit) this).aClass251Array8113
					[((DirectxToolkit) this).anInt8175]));
			if ((i_72_ ^ 0xffffffff)
					!= (anIntArray9805[((DirectxToolkit) this).anInt8175]
					                   ^ 0xffffffff)) {
				((DirectxToolkit) this).anIDirect3DDevice9810.SetTextureStageState
				(((DirectxToolkit) this).anInt8175, 24, i_72_);
				anIntArray9805[((DirectxToolkit) this).anInt8175] = i_72_;
			}
		} else {
			((DirectxToolkit) this).anIDirect3DDevice9810
			.SetTextureStageState(((DirectxToolkit) this).anInt8175, 24, 0);
			anIntArray9805[((DirectxToolkit) this).anInt8175] = 0;
		}
		if (i != 1)
			aBoolean9801 = true;
	}

	final Interface18_Impl3 method3861(int i, byte i_73_, int i_74_,
			Class68 class68, Class304 class304) {
		if (i_73_ != -84)
			return null;
		return new Class310_Sub2(this, class304, class68, i_74_, i);
	}

	final void method3844(int i, Canvas canvas, Object object) {
		if (canvas == ((DirectxToolkit) this).aCanvas7925) {
			Dimension dimension = canvas.getSize();
			if (-1 > (dimension.width ^ 0xffffffff) && 0 < dimension.height) {
				((DirectxToolkit) this).anIDirect3DDevice9810.EndScene();
				method3960(false);
				((DirectxToolkit) this).anIDirect3DDevice9810.BeginScene();
			}
		}
		if (i != 12727)
			method3953(null, (byte) 28);
	}

	private static final boolean method3964(D3DPRESENT_PARAMETERS d3dpresent_parameters, int i, int j, IDirect3D idirect3d, int k, int l)
	{
		try {
			int i1;
			int j1;
			int k1;
			i1 = 0;
			j1 = 0;
			k1 = i;
			D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if(ue.a((byte)97, idirect3d.a(j, d3ddisplaymode)))
				return false;
			label0:
				for(; -1 >= ~l; l--)
				{
					if(1 == l)
						continue;
					k1 = l + 0;
					label1:
						for(int l1 = 0; l1 < anIntArray9790.length; l1++)
						{
							if(-1 != ~idirect3d.CheckDeviceType(j, k, d3ddisplaymode.Format, anIntArray9790[l1], true) || -1 != ~idirect3d.CheckDeviceFormat(j, k, d3ddisplaymode.Format, 1, 1, anIntArray9790[l1]) || l != 0 && ~idirect3d.CheckDeviceMultiSampleType(j, k, anIntArray9790[l1], true, k1) != -1)
								continue;
							int i2 = 0;
							do
							{
								if(anIntArray9809.length <= i2)
									continue label1;
								if(~idirect3d.CheckDeviceFormat(j, k, d3ddisplaymode.Format, 2, 1, anIntArray9809[i2]) == -1 && ~idirect3d.CheckDepthStencilMatch(j, k, d3ddisplaymode.Format, anIntArray9790[l1], anIntArray9809[i2]) == -1 && (~l == -1 || -1 == ~idirect3d.CheckDeviceMultiSampleType(j, k, anIntArray9809[l1], true, k1)))
								{
									i1 = anIntArray9809[i2];
									j1 = anIntArray9790[l1];
									break label0;
								}
								i2++;
							} while(true);
						}

				}

			if(l < 0 || -1 == ~j1 || -1 == ~i1)
				return false;
			d3dpresent_parameters.MultiSampleType = k1;
			d3dpresent_parameters.AutoDepthStencilFormat = i1;
			d3dpresent_parameters.MultiSampleQuality = 0;
			d3dpresent_parameters.BackBufferFormat = j1;
			return true;
		} catch (Throwable t) {
			return false;
		}
	}

	final void method3883(int i) {
		int i_87_ = 60 % ((i - 20) / 36);
		((DirectxToolkit) this).anIDirect3DDevice9810.a(137, ((((DirectxToolkit) this)
				.aBoolean8145)
				&& !(((DirectxToolkit) this)
						.aBoolean8149)));
	}

	final void method3950(int i) {
		if (i != 0)
			anIntArray9809 = null;
		if (Class348_Sub4.aClass173_6602 != ((DirectxToolkit) this).aClass173_8163) {
			if (((DirectxToolkit) this).aClass173_8163 == ElementLoaderNode.aClass173_1201) {
				((DirectxToolkit) this).anIDirect3DDevice9810.SetRenderState(19, 2);
				((DirectxToolkit) this).anIDirect3DDevice9810.SetRenderState(20, 2);
			} else if (Class273.aClass173_5169
					== ((DirectxToolkit) this).aClass173_8163) {
				((DirectxToolkit) this).anIDirect3DDevice9810.SetRenderState(19, 9);
				((DirectxToolkit) this).anIDirect3DDevice9810.SetRenderState(20, 2);
			}
		} else {
			((DirectxToolkit) this).anIDirect3DDevice9810.SetRenderState(19, 5);
			((DirectxToolkit) this).anIDirect3DDevice9810.SetRenderState(20, 6);
		}
	}

	final void draw(int i, int i_88_) throws ToolkitException {
		((DirectxToolkit) this).anIDirect3DDevice9810.EndScene();
		if (!aClass53_9787.method498(-107)) {
			if (50 < ++anInt9785)
				throw new ToolkitException();
			method3960(false);
		} else {
			anInt9785 = 0;
			if (ue.a((byte) 97, aClass53_9787.method495((byte) 91, 0)))
				method3960(false);
		}
		((DirectxToolkit) this).anIDirect3DDevice9810.BeginScene();
	}

	final void method3925(int i, Interface5_Impl1 interface5_impl1,
			int i_89_) {
		int i_90_ = -112 % ((i - -26) / 39);
		Class366 class366 = (Class366) interface5_impl1;
		((DirectxToolkit) this).anIDirect3DDevice9810.SetStreamSource
		(i_89_, ((Class366) class366).anIDirect3DVertexBuffer8511, 0,
				class366.method3519(3545));
	}

	final void ya() {
		method3946(-32, true);
		((DirectxToolkit) this).anIDirect3DDevice9810.Clear(2, 0, 1.0F, 0);
	}
}
