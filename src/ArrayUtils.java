/* Class214 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ArrayUtils
{
    static void populateArray(int[] dest, int off, int len) {
	len = off + len - 7;
	while (off < len) {
	    dest[off++] = 0;
	    dest[off++] = 0;
	    dest[off++] = 0;
	    dest[off++] = 0;
	    dest[off++] = 0;
	    dest[off++] = 0;
	    dest[off++] = 0;
	    dest[off++] = 0;
	}
	len += 7;
	while (off < len)
	    dest[off++] = 0;
    }
    
    static final void arrayCopy(float[] src, int srcOff, float[] dest, int destff, int len) {
	if (src == dest) {
	    if (srcOff == destff)
		return;
	    if (destff > srcOff && destff < srcOff + len) {
		len--;
		srcOff += len;
		destff += len;
		len = srcOff - len;
		len += 7;
		while (srcOff >= len) {
		    dest[destff--] = src[srcOff--];
		    dest[destff--] = src[srcOff--];
		    dest[destff--] = src[srcOff--];
		    dest[destff--] = src[srcOff--];
		    dest[destff--] = src[srcOff--];
		    dest[destff--] = src[srcOff--];
		    dest[destff--] = src[srcOff--];
		    dest[destff--] = src[srcOff--];
		}
		len -= 7;
		while (srcOff >= len)
		    dest[destff--] = src[srcOff--];
		return;
	    }
	}
	len += srcOff;
	len -= 7;
	while (srcOff < len) {
	    dest[destff++] = src[srcOff++];
	    dest[destff++] = src[srcOff++];
	    dest[destff++] = src[srcOff++];
	    dest[destff++] = src[srcOff++];
	    dest[destff++] = src[srcOff++];
	    dest[destff++] = src[srcOff++];
	    dest[destff++] = src[srcOff++];
	    dest[destff++] = src[srcOff++];
	}
	len += 7;
	while (srcOff < len)
	    dest[destff++] = src[srcOff++];
    }
    
    static void arrayCopy(Object[] src, int srcOff, Object[] dest, int destOff, int len) {
	if (src == dest) {
	    if (srcOff == destOff)
		return;
	    if (destOff > srcOff && destOff < srcOff + len) {
		len--;
		srcOff += len;
		destOff += len;
		len = srcOff - len;
		len += 7;
		while (srcOff >= len) {
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		}
		len -= 7;
		while (srcOff >= len)
		    dest[destOff--] = src[srcOff--];
		return;
	    }
	}
	len += srcOff;
	len -= 7;
	while (srcOff < len) {
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	}
	len += 7;
	while (srcOff < len)
	    dest[destOff++] = src[srcOff++];
    }
    
    static final void arrayCopy(short[] src, int srcOff, short[] dest, int destOff, int len) {
	if (src == dest) {
	    if (srcOff == destOff)
		return;
	    if (destOff > srcOff && destOff < srcOff + len) {
		len--;
		srcOff += len;
		destOff += len;
		len = srcOff - len;
		len += 7;
		while (srcOff >= len) {
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		}
		len -= 7;
		while (srcOff >= len)
		    dest[destOff--] = src[srcOff--];
		return;
	    }
	}
	len += srcOff;
	len -= 7;
	while (srcOff < len) {
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	}
	len += 7;
	while (srcOff < len)
	    dest[destOff++] = src[srcOff++];
    }
    
    static void arrayCopy(byte[] src, int srcOff, byte[] dest, int destOff, int len) {
	if (src == dest) {
	    if (srcOff == destOff)
		return;
	    if (destOff > srcOff && destOff < srcOff + len) {
		len--;
		srcOff += len;
		destOff += len;
		len = srcOff - len;
		len += 7;
		while (srcOff >= len) {
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		}
		len -= 7;
		while (srcOff >= len)
		    dest[destOff--] = src[srcOff--];
		return;
	    }
	}
	len += srcOff;
	len -= 7;
	while (srcOff < len) {
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	}
	len += 7;
	while (srcOff < len)
	    dest[destOff++] = src[srcOff++];
    }
    
    static void arrayCopy(int[] src, int srcOff, int[] dest, int destOff, int len) {
	if (src == dest) {
	    if (srcOff == destOff)
		return;
	    if (destOff > srcOff && destOff < srcOff + len) {
		len--;
		srcOff += len;
		destOff += len;
		len = srcOff - len;
		len += 7;
		while (srcOff >= len) {
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		    dest[destOff--] = src[srcOff--];
		}
		len -= 7;
		while (srcOff >= len)
		    dest[destOff--] = src[srcOff--];
		return;
	    }
	}
	len += srcOff;
	len -= 7;
	while (srcOff < len) {
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	    dest[destOff++] = src[srcOff++];
	}
	len += 7;
	while (srcOff < len)
	    dest[destOff++] = src[srcOff++];
    }
    
    static void populateArray(int[] dest, int off, int len, int value) {
	len = off + len - 7;
	while (off < len) {
	    dest[off++] = value;
	    dest[off++] = value;
	    dest[off++] = value;
	    dest[off++] = value;
	    dest[off++] = value;
	    dest[off++] = value;
	    dest[off++] = value;
	    dest[off++] = value;
	}
	len += 7;
	while (off < len)
	    dest[off++] = value;
    }
}
