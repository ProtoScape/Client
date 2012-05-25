/* Sprite - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ImageSprite
{
    byte[] alphaIndex;
    int indexHeight;
    int[] colors;
    int widthPadding;
    byte[] colorIndex;
    int heightOffset;
    int heightPadding;
    int indexWidth;
    int widthOffset;
    
    final int getSpriteWidth() {
	return (((ImageSprite) this).indexWidth + ((ImageSprite) this).widthOffset + ((ImageSprite) this).widthPadding);
    }
    
    final void method1511(int color) {
	int i_0_ = -1;
	if (((ImageSprite) this).colors.length < 255) {
	    for (int i_1_ = 0; i_1_ < ((ImageSprite) this).colors.length; i_1_++) {
		if (((ImageSprite) this).colors[i_1_] == color) {
		    i_0_ = i_1_;
		    break;
		}
	    }
	    if (i_0_ == -1) {
		i_0_ = ((ImageSprite) this).colors.length;
		int[] is
		    = new int[((ImageSprite) this).colors.length + 1];
		ArrayUtils.arrayCopy(((ImageSprite) this).colors, 0, is, 0, ((ImageSprite) this).colors.length);
		((ImageSprite) this).colors = is;
		is[i_0_] = color;
	    }
	} else {
	    int i_2_ = 2147483647;
	    int i_3_ = color >> 16 & 0xff;
	    int i_4_ = color >> 8 & 0xff;
	    int i_5_ = color & 0xff;
	    for (int i_6_ = 0; i_6_ < ((ImageSprite) this).colors.length;
		 i_6_++) {
		int i_7_ = ((ImageSprite) this).colors[i_6_];
		int i_8_ = i_7_ >> 16 & 0xff;
		int i_9_ = i_7_ >> 8 & 0xff;
		int i_10_ = i_7_ & 0xff;
		int i_11_ = i_3_ - i_8_;
		if (i_11_ < 0)
		    i_11_ = -i_11_;
		int i_12_ = i_4_ - i_9_;
		if (i_12_ < 0)
		    i_12_ = -i_12_;
		int i_13_ = i_5_ - i_10_;
		if (i_13_ < 0)
		    i_13_ = -i_13_;
		int i_14_ = i_11_ + i_12_ + i_13_;
		if (i_14_ < i_2_) {
		    i_2_ = i_14_;
		    i_0_ = i_6_;
		}
	    }
	}
	for (int i_15_ = ((ImageSprite) this).indexHeight - 1; i_15_ > 0; i_15_--) {
	    int i_16_ = i_15_ * ((ImageSprite) this).indexWidth;
	    for (int i_17_ = ((ImageSprite) this).indexWidth - 1; i_17_ > 0;
		 i_17_--) {
		if (((((ImageSprite) this).colors
		      [((ImageSprite) this).colorIndex[i_17_ + i_16_] & 0xff])
		     == 0)
		    && (((ImageSprite) this).colors
			[((((ImageSprite) this).colorIndex
			   [i_17_ + i_16_ - 1 - ((ImageSprite) this).indexWidth])
			  & 0xff)]) != 0)
		    ((ImageSprite) this).colorIndex[i_17_ + i_16_]
			= (byte) i_0_;
	    }
	}
    }
    
    static ImageSprite getSprite(IndexLoader loader, int id) {
	byte[] payload = loader.getArchive(id);
	if (payload == null)
	    return null;
	return unpack(payload)[0];
    }
    
    final void unpack(int i) {
	int i_18_ = getSpriteWidth();
	int i_19_ = getIndexHeightTotal();
	if (((ImageSprite) this).indexWidth != i_18_
	    || ((ImageSprite) this).indexHeight != i_19_) {
	    int i_20_ = i;
	    if (i_20_ > ((ImageSprite) this).widthOffset)
		i_20_ = ((ImageSprite) this).widthOffset;
	    int i_21_ = i;
	    if ((i_21_ + ((ImageSprite) this).widthOffset
		 + ((ImageSprite) this).indexWidth)
		> i_18_)
		i_21_ = (i_18_ - ((ImageSprite) this).widthOffset
			 - ((ImageSprite) this).indexWidth);
	    int i_22_ = i;
	    if (i_22_ > ((ImageSprite) this).heightOffset)
		i_22_ = ((ImageSprite) this).heightOffset;
	    int i_23_ = i;
	    if ((i_23_ + ((ImageSprite) this).heightOffset
		 + ((ImageSprite) this).indexHeight)
		> i_19_)
		i_23_ = (i_19_ - ((ImageSprite) this).heightOffset
			 - ((ImageSprite) this).indexHeight);
	    int i_24_ = ((ImageSprite) this).indexWidth + i_20_ + i_21_;
	    int i_25_ = ((ImageSprite) this).indexHeight + i_22_ + i_23_;
	    byte[] is = new byte[i_24_ * i_25_];
	    if (((ImageSprite) this).alphaIndex == null) {
		for (int i_26_ = 0; i_26_ < ((ImageSprite) this).indexHeight;
		     i_26_++) {
		    int i_27_ = i_26_ * ((ImageSprite) this).indexWidth;
		    int i_28_ = (i_26_ + i_22_) * i_24_ + i_20_;
		    for (int i_29_ = 0; i_29_ < ((ImageSprite) this).indexWidth;
			 i_29_++)
			is[i_28_++]
			    = ((ImageSprite) this).colorIndex[i_27_++];
		}
	    } else {
		byte[] is_30_ = new byte[i_24_ * i_25_];
		for (int i_31_ = 0; i_31_ < ((ImageSprite) this).indexHeight;
		     i_31_++) {
		    int i_32_ = i_31_ * ((ImageSprite) this).indexWidth;
		    int i_33_ = (i_31_ + i_22_) * i_24_ + i_20_;
		    for (int i_34_ = 0; i_34_ < ((ImageSprite) this).indexWidth;
			 i_34_++) {
			is_30_[i_33_]
			    = ((ImageSprite) this).alphaIndex[i_32_];
			is[i_33_++]
			    = ((ImageSprite) this).colorIndex[i_32_++];
		    }
		}
		((ImageSprite) this).alphaIndex = is_30_;
	    }
	    ((ImageSprite) this).widthOffset -= i_20_;
	    ((ImageSprite) this).heightOffset -= i_22_;
	    ((ImageSprite) this).widthPadding -= i_21_;
	    ((ImageSprite) this).heightPadding -= i_23_;
	    ((ImageSprite) this).indexWidth = i_24_;
	    ((ImageSprite) this).indexHeight = i_25_;
	    ((ImageSprite) this).colorIndex = is;
	}
    }
    
    final void reflectX() {
	byte[] is = ((ImageSprite) this).colorIndex;
	if (((ImageSprite) this).alphaIndex == null) {
	    for (int i = (((ImageSprite) this).indexHeight >> 1) - 1; i >= 0; i--) {
		int i_35_ = i * ((ImageSprite) this).indexWidth;
		int i_36_ = ((((ImageSprite) this).indexHeight - i - 1)
			     * ((ImageSprite) this).indexWidth);
		for (int i_37_ = -((ImageSprite) this).indexWidth; i_37_ < 0;
		     i_37_++) {
		    byte i_38_ = is[i_35_];
		    is[i_35_] = is[i_36_];
		    is[i_36_] = i_38_;
		    i_35_++;
		    i_36_++;
		}
	    }
	} else {
	    byte[] is_39_ = ((ImageSprite) this).alphaIndex;
	    for (int i = (((ImageSprite) this).indexHeight >> 1) - 1; i >= 0; i--) {
		int i_40_ = i * ((ImageSprite) this).indexWidth;
		int i_41_ = ((((ImageSprite) this).indexHeight - i - 1)
			     * ((ImageSprite) this).indexWidth);
		for (int i_42_ = -((ImageSprite) this).indexWidth; i_42_ < 0;
		     i_42_++) {
		    byte i_43_ = is[i_40_];
		    is[i_40_] = is[i_41_];
		    is[i_41_] = i_43_;
		    i_43_ = is_39_[i_40_];
		    is_39_[i_40_] = is_39_[i_41_];
		    is_39_[i_41_] = i_43_;
		    i_40_++;
		    i_41_++;
		}
	    }
	}
	int i = ((ImageSprite) this).heightOffset;
	((ImageSprite) this).heightOffset = ((ImageSprite) this).heightPadding;
	((ImageSprite) this).heightPadding = i;
    }
    
    final void replaceSomething(int color) {
	int index = -1;
	if (((ImageSprite) this).colors.length < 255) {
	    for (int j = 0; j < ((ImageSprite) this).colors.length; j++) {
		if (((ImageSprite) this).colors[j] == color) {
		    index = j;
		    break;
		}
	    }
	    if (index == -1) {
		index = ((ImageSprite) this).colors.length;
		int[] is = new int[((ImageSprite) this).colors.length + 1];
		ArrayUtils.arrayCopy(((ImageSprite) this).colors, 0, is, 0, ((ImageSprite) this).colors.length);
		((ImageSprite) this).colors = is;
		is[index] = color;
	    }
	} else {
	    int cc = 2147483647;
	    int r = color >> 16 & 0xff;
	    int g = color >> 8 & 0xff;
	    int b = color & 0xff;
	    for (int i = 0; i < ((ImageSprite) this).colors.length; i++) {
		int c = ((ImageSprite) this).colors[i];
		int rc = c >> 16 & 0xff;
		int gc = c >> 8 & 0xff;
		int bc = c & 0xff;
		int dr = r - rc;
		if (dr < 0)
		    dr = -dr;
		int dg = g - gc;
		if (dg < 0)
		    dg = -dg;
		int db = b - bc;
		if (db < 0)
		    db = -db;
		int sum = dr + dg + db;
		if (sum < cc) {
		    cc = sum;
		    index = i;
		}
	    }
	}
	int i_59_ = 0;
	byte[] replacementColors = (new byte[((ImageSprite) this).indexWidth * ((ImageSprite) this).indexHeight]);
	for (int y = 0; y < ((ImageSprite) this).indexHeight; y++) {
	    for (int x = 0; x < ((ImageSprite) this).indexWidth; x++) {
		int ci = ((ImageSprite) this).colorIndex[i_59_] & 0xff;
		if (((ImageSprite) this).colors[ci] == 0) {
		    if (x > 0 && (((ImageSprite) this).colors[(((ImageSprite) this).colorIndex[i_59_ - 1] & 0xff)]) != 0)
			ci = index;
		    else if (y > 0
			     && (((ImageSprite) this).colors
				 [((((ImageSprite) this).colorIndex
				    [i_59_ - ((ImageSprite) this).indexWidth])
				   & 0xff)]) != 0)
			ci = index;
		    else if (x < ((ImageSprite) this).indexWidth - 1
			     && (((ImageSprite) this).colors
				 [(((ImageSprite) this).colorIndex[i_59_ + 1]
				   & 0xff)]) != 0)
			ci = index;
		    else if (y < ((ImageSprite) this).indexHeight - 1
			     && (((ImageSprite) this).colors
				 [((((ImageSprite) this).colorIndex
				    [i_59_ + ((ImageSprite) this).indexWidth])
				   & 0xff)]) != 0)
			ci = index;
		}
		replacementColors[i_59_++] = (byte) ci;
	    }
	}
	((ImageSprite) this).colorIndex = replacementColors;
    }
    
    final int[] toPixelArray() {
	int widthTotal = getSpriteWidth();
	int[] pixels = new int[widthTotal * getIndexHeightTotal()];
	if (((ImageSprite) this).alphaIndex != null) {
	    for (int y = 0; y < ((ImageSprite) this).indexHeight; y++) {
		int srcOff = y * ((ImageSprite) this).indexWidth;
		int destOff = (((ImageSprite) this).widthOffset + (y + ((ImageSprite) this).heightOffset) * widthTotal);
		for (int i_66_ = 0; i_66_ < ((ImageSprite) this).indexWidth; i_66_++) {
		    pixels[destOff++] = (((ImageSprite) this).alphaIndex[srcOff] << 24 | (((ImageSprite) this).colors[(((ImageSprite) this).colorIndex[srcOff] & 0xff)]));
		    srcOff++;
		}
	    }
	} else {
	    for (int i_67_ = 0; i_67_ < ((ImageSprite) this).indexHeight; i_67_++) {
		int i_68_ = i_67_ * ((ImageSprite) this).indexWidth;
		int i_69_ = (((ImageSprite) this).widthOffset
			     + (i_67_ + ((ImageSprite) this).heightOffset) * widthTotal);
		for (int i_70_ = 0; i_70_ < ((ImageSprite) this).indexWidth;
		     i_70_++) {
		    int i_71_
			= (((ImageSprite) this).colors
			   [((ImageSprite) this).colorIndex[i_68_++] & 0xff]);
		    if (i_71_ != 0)
			pixels[i_69_++] = ~0xffffff | i_71_;
		    else
			pixels[i_69_++] = 0;
		}
	    }
	}
	return pixels;
    }
    
    private static final ImageSprite[] unpack(byte[] payload) {
	ByteBuffer buffer = new ByteBuffer(payload);
	((ByteBuffer) buffer).position = payload.length - 2;
	int amountChildren = buffer.getShort();
	ImageSprite[] sprites = new ImageSprite[amountChildren];
	for (int i = 0; i < amountChildren; i++)
	    sprites[i] = new ImageSprite();
	((ByteBuffer) buffer).position = payload.length - 7 - amountChildren * 8;
	int width = buffer.getShort();
	int height = buffer.getShort();
	int amountColors = (buffer.getUByte() & 0xff) + 1;
	for (int i = 0; i < amountChildren; i++)
	    ((ImageSprite) sprites[i]).widthOffset = buffer.getShort();
	for (int i = 0; i < amountChildren; i++)
	    ((ImageSprite) sprites[i]).heightOffset
		= buffer.getShort();
	for (int i_78_ = 0; i_78_ < amountChildren; i_78_++)
	    ((ImageSprite) sprites[i_78_]).indexWidth = buffer.getShort();
	for (int i_79_ = 0; i_79_ < amountChildren; i_79_++)
	    ((ImageSprite) sprites[i_79_]).indexHeight = buffer.getShort();
	for (int i_80_ = 0; i_80_ < amountChildren; i_80_++) {
	    ImageSprite class207 = sprites[i_80_];
	    ((ImageSprite) class207).widthPadding = (width - ((ImageSprite) class207).indexWidth - ((ImageSprite) class207).widthOffset);
	    ((ImageSprite) class207).heightPadding = (height - ((ImageSprite) class207).indexHeight - ((ImageSprite) class207).heightOffset);
	}
	((ByteBuffer) buffer).position = payload.length - 7 - amountChildren * 8 - (amountColors - 1) * 3;
	int[] colors = new int[amountColors];
	for (int i = 1; i < amountColors; i++) {
	    colors[i] = buffer.getTri();
	    if (colors[i] == 0)
		colors[i] = 1;
	}
	for (int i_83_ = 0; i_83_ < amountChildren; i_83_++)
	    ((ImageSprite) sprites[i_83_]).colors = colors;
	((ByteBuffer) buffer).position = 0;
	for (int i = 0; i < amountChildren; i++) {
	    ImageSprite sprite = sprites[i];
	    int area = (((ImageSprite) sprite).indexWidth * ((ImageSprite) sprite).indexHeight);
	    ((ImageSprite) sprite).colorIndex = new byte[area];
	    int flags = buffer.getUByte();
	    if ((flags & 0x2) == 0) {
		if ((flags & 0x1) == 0) {
		    for (int j = 0; j < area; j++)
			((ImageSprite) sprite).colorIndex[j] = buffer.getByte();
		} else {
		    for (int x = 0; x < ((ImageSprite) sprite).indexWidth; x++) {
			for (int y = 0; y < ((ImageSprite) sprite).indexHeight; y++)
			    ((ImageSprite) sprite).colorIndex[(x + y * ((ImageSprite) sprite).indexWidth)] = buffer.getByte();
		    }
		}
	    } else {
		boolean hasAlpha = false;
		((ImageSprite) sprite).alphaIndex = new byte[area];
		if ((flags & 0x1) == 0) {
		    for (int i_90_ = 0; i_90_ < area; i_90_++)
			((ImageSprite) sprite).colorIndex[i_90_] = buffer.getByte();
		    for (int i_91_ = 0; i_91_ < area; i_91_++) {
			byte alpha = (((ImageSprite) sprite).alphaIndex[i_91_] = buffer.getByte());
			hasAlpha = hasAlpha | alpha != -1;
		    }
		} else {
		    for (int x = 0; x < ((ImageSprite) sprite).indexWidth; x++) {
			for (int y = 0; y < ((ImageSprite) sprite).indexHeight; y++)
			    ((ImageSprite) sprite).colorIndex[(x + y * ((ImageSprite) sprite).indexWidth)] = buffer.getByte();
		    }
		    for (int i_95_ = 0; i_95_ < ((ImageSprite) sprite).indexWidth; i_95_++) {
			for (int i_96_ = 0; i_96_ < ((ImageSprite) sprite).indexHeight; i_96_++) {
			    byte alpha = (((ImageSprite) sprite).alphaIndex[i_95_ + i_96_ * (((ImageSprite) sprite).indexWidth)] = buffer.getByte());
			    hasAlpha = hasAlpha | alpha != -1;
			}
		    }
		}
		if (!hasAlpha)
		    ((ImageSprite) sprite).alphaIndex = null;
	    }
	}
	return sprites;
    }
    
    final void reflectY() {
	byte[] is = ((ImageSprite) this).colorIndex;
	if (((ImageSprite) this).alphaIndex == null) {
	    for (int i = ((ImageSprite) this).indexHeight - 1; i >= 0; i--) {
		int i_98_ = i * ((ImageSprite) this).indexWidth;
		for (int i_99_ = (i + 1) * ((ImageSprite) this).indexWidth;
		     i_98_ < i_99_; i_98_++) {
		    i_99_--;
		    byte i_100_ = is[i_98_];
		    is[i_98_] = is[i_99_];
		    is[i_99_] = i_100_;
		}
	    }
	} else {
	    byte[] is_101_ = ((ImageSprite) this).alphaIndex;
	    for (int i = ((ImageSprite) this).indexHeight - 1; i >= 0; i--) {
		int i_102_ = i * ((ImageSprite) this).indexWidth;
		for (int i_103_ = (i + 1) * ((ImageSprite) this).indexWidth;
		     i_102_ < i_103_; i_102_++) {
		    i_103_--;
		    byte i_104_ = is[i_102_];
		    is[i_102_] = is[i_103_];
		    is[i_103_] = i_104_;
		    i_104_ = is_101_[i_102_];
		    is_101_[i_102_] = is_101_[i_103_];
		    is_101_[i_103_] = i_104_;
		}
	    }
	}
	int i = ((ImageSprite) this).widthOffset;
	((ImageSprite) this).widthOffset = ((ImageSprite) this).widthPadding;
	((ImageSprite) this).widthPadding = i;
    }
    
    static final ImageSprite[] loadSprites(IndexLoader class45, int i, int i_105_) {
	byte[] is = class45.getChildArchive(i, i_105_);
	if (is == null)
	    return null;
	return unpack(is);
    }
    
    final void rotateCw90() {
	byte[] is
	    = (new byte
	       [((ImageSprite) this).indexWidth * ((ImageSprite) this).indexHeight]);
	int i = 0;
	if (((ImageSprite) this).alphaIndex == null) {
	    for (int i_106_ = 0; i_106_ < ((ImageSprite) this).indexWidth;
		 i_106_++) {
		for (int i_107_ = ((ImageSprite) this).indexHeight - 1; i_107_ >= 0;
		     i_107_--)
		    is[i++]
			= (((ImageSprite) this).colorIndex
			   [i_106_ + i_107_ * ((ImageSprite) this).indexWidth]);
	    }
	    ((ImageSprite) this).colorIndex = is;
	} else {
	    byte[] is_108_ = new byte[(((ImageSprite) this).indexWidth
				       * ((ImageSprite) this).indexHeight)];
	    for (int i_109_ = 0; i_109_ < ((ImageSprite) this).indexWidth;
		 i_109_++) {
		for (int i_110_ = ((ImageSprite) this).indexHeight - 1; i_110_ >= 0;
		     i_110_--) {
		    is[i] = (((ImageSprite) this).colorIndex
			     [i_109_ + i_110_ * ((ImageSprite) this).indexWidth]);
		    is_108_[i++]
			= (((ImageSprite) this).alphaIndex
			   [i_109_ + i_110_ * ((ImageSprite) this).indexWidth]);
		}
	    }
	    ((ImageSprite) this).colorIndex = is;
	    ((ImageSprite) this).alphaIndex = is_108_;
	}
	int i_111_ = ((ImageSprite) this).heightOffset;
	((ImageSprite) this).heightOffset = ((ImageSprite) this).widthOffset;
	((ImageSprite) this).widthOffset = ((ImageSprite) this).heightPadding;
	((ImageSprite) this).heightPadding = ((ImageSprite) this).widthPadding;
	((ImageSprite) this).widthPadding = ((ImageSprite) this).heightOffset;
	i_111_ = ((ImageSprite) this).indexHeight;
	((ImageSprite) this).indexHeight = ((ImageSprite) this).indexWidth;
	((ImageSprite) this).indexWidth = i_111_;
    }
    
    public ImageSprite() {
	/* empty */
    }
    
    static final ImageSprite getSprite(IndexLoader class45, int i, int i_112_) {
	byte[] is = class45.getChildArchive(i, i_112_);
	if (is == null)
	    return null;
	return unpack(is)[0];
    }
    
    final int getIndexHeightTotal() {
	return (((ImageSprite) this).indexHeight + ((ImageSprite) this).heightOffset + ((ImageSprite) this).heightPadding);
    }
    
    static final ImageSprite[] getSprites(IndexLoader class45, int i) {
	byte[] is = class45.getArchive(i);
	if (is == null)
	    return null;
	return unpack(is);
    }
    
    final void method1524() {
	int i = getSpriteWidth();
	int i_113_ = getIndexHeightTotal();
	if (((ImageSprite) this).indexWidth != i
	    || ((ImageSprite) this).indexHeight != i_113_) {
	    byte[] is = new byte[i * i_113_];
	    if (((ImageSprite) this).alphaIndex != null) {
		byte[] is_114_ = new byte[i * i_113_];
		for (int i_115_ = 0; i_115_ < ((ImageSprite) this).indexHeight;
		     i_115_++) {
		    int i_116_ = i_115_ * ((ImageSprite) this).indexWidth;
		    int i_117_ = ((i_115_ + ((ImageSprite) this).heightOffset) * i
				  + ((ImageSprite) this).widthOffset);
		    for (int i_118_ = 0; i_118_ < ((ImageSprite) this).indexWidth;
			 i_118_++) {
			is[i_117_] = ((ImageSprite) this).colorIndex[i_116_];
			is_114_[i_117_++]
			    = ((ImageSprite) this).alphaIndex[i_116_++];
		    }
		}
		((ImageSprite) this).alphaIndex = is_114_;
	    } else {
		for (int i_119_ = 0; i_119_ < ((ImageSprite) this).indexHeight;
		     i_119_++) {
		    int i_120_ = i_119_ * ((ImageSprite) this).indexWidth;
		    int i_121_ = ((i_119_ + ((ImageSprite) this).heightOffset) * i
				  + ((ImageSprite) this).widthOffset);
		    for (int i_122_ = 0; i_122_ < ((ImageSprite) this).indexWidth;
			 i_122_++)
			is[i_121_++]
			    = ((ImageSprite) this).colorIndex[i_120_++];
		}
	    }
	    ((ImageSprite) this).widthOffset = ((ImageSprite) this).widthPadding
		= ((ImageSprite) this).heightOffset = ((ImageSprite) this).heightPadding
		= 0;
	    ((ImageSprite) this).indexWidth = i;
	    ((ImageSprite) this).indexHeight = i_113_;
	    ((ImageSprite) this).colorIndex = is;
	}
    }
}
