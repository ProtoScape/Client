/* IndexLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class IndexLoader
{
    static int anInt626;
    static int anInt627;
    static int anInt628;
    private IndexTable indexTable = null;
    static int anInt630;
    static int anInt631;
    static int anInt632;
    static int anInt633;
    int unpackSettings;
    static int anInt635;
    static int anInt636;
    static int anInt637;
    static int anInt638;
    static int anInt639;
    static int anInt640;
    static int anInt641;
    static int anInt642;
    static GamePacket gamePacket3 = new GamePacket(3, -1);
    static int anInt644;
    static int anInt645;
    static int anInt646;
    static int anInt647;
    static int anInt648;
    static int anInt649;
    static int anInt650;
    static int anInt651;
    static int anInt652;
    static int anInt653;
    static int anInt654;
    private boolean directlyAllocate;
    private Object[] archiveBuffers;
    static int anInt657;
    static int anInt658;
    private AbtractArchiveLoader archiveLoader;
    static int anInt660;
    static int anInt661;
    static int anInt662;
    static int anInt663;
    private Object[][] childBuffers;
    static int anInt665;
    static int anInt666;
    static long aLong667;
    static int anInt668;
    static int anInt669 = 0;
    static float aFloat670;
    
    final int getChecksum() {
	anInt657++;
	if (!isInitialized())
	    throw new IllegalStateException("");
	return indexTable.checksum;
    }
    
    public static void method390(byte i) {
	gamePacket3 = null;
    }
    
    final byte[] getChildArchive(String archiveName, String childName) {
	try {
	    anInt647++;
	    if (!isInitialized())
		return null;
	    archiveName = archiveName.toLowerCase();
	    childName = childName.toLowerCase();
	    int archiveId = indexTable.archiveHashTable.get(Class281.getArchiveHash(archiveName));
	    if (!isValidArchive(archiveId))
		return null;
	    int childId = (indexTable.childHashTables[archiveId].get(Class281.getArchiveHash(childName)));
	    return getChildArchive(archiveId, childId);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("in.EA("
					     + (archiveName != null ? "{...}"
						: "null")
					     + ','
					     + (childName != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    private final boolean isValidArchive(int id) {
	anInt646++;
	if (!isInitialized())
	    return false;
	if (id < 0 || indexTable.amountChildEntries.length <= id || (indexTable.amountChildEntries[id] == 0)) {
	    if (Class285.aBoolean4741)
		throw new IllegalArgumentException(Integer.toString(id));
	    return false;
	}
	return true;
    }
    
    final byte[] loadArchiveChild(int i, int i_5_, int[] is) {
	anInt639++;
	if (!isValidChild(i, i_5_))
	    return null;
	if (childBuffers[i] == null || childBuffers[i][i_5_] == null) {
	    boolean bool = loadArchive(i, i_5_, is);
	    if (!bool) {
		loadArchive(i);
		bool = loadArchive(i, i_5_, is);
		if (!bool)
		    return null;
	    }
	}
	byte[] is_7_ = Class50_Sub1.getByteArray(childBuffers[i][i_5_]);
	if ((unpackSettings) == 1) {
	    childBuffers[i][i_5_] = null;
	    if ((indexTable.amountChildEntries[i]) == 1)
		childBuffers[i] = null;
	} else if (unpackSettings == 2)
	    childBuffers[i] = null;
	return is_7_;
    }
    
    private boolean loadArchive(int archiveId,int childId, int[] cipherKeys) {
	anInt628++;
	if (!isValidArchive(archiveId))
	    return false;
	if (archiveBuffers[archiveId] == null)
	    return false;
	int amountChildren = indexTable.amountChildren[archiveId];
	int[] activeChildren = indexTable.activeChildren[archiveId];
	if (childBuffers[archiveId] == null)
	    childBuffers[archiveId] = new Object[indexTable.amountChildEntries[archiveId]];
	Object[] buffers = childBuffers[archiveId];
	boolean isLoaded = true;
	for (int i = 0; i < amountChildren; i++) {
	    int id;
	    if (activeChildren == null)
		id = i;
	    else
		id = activeChildren[i];
	    if (buffers[id] == null) {
		isLoaded = false;
		break;
	    }
	}
	if (isLoaded)
	    return true;
	byte[] archiveSrc;
	if (cipherKeys == null || ((cipherKeys[0] ^ 0xffffffff) == -1 && (cipherKeys[1] ^ 0xffffffff) == -1 && (cipherKeys[2] ^ 0xffffffff) == -1 && (cipherKeys[3] ^ 0xffffffff) == -1))
	    archiveSrc = Class50_Sub1.getByteArray(archiveBuffers[archiveId]);
	else {
	    archiveSrc = Class50_Sub1.getByteArray(archiveBuffers[archiveId]);
	    ByteBuffer buffer = new ByteBuffer(archiveSrc);
	    buffer.decipherXtea(cipherKeys, 5, buffer.payload.length);
	}
	byte[] unpackedSrc;
	try {
	    unpackedSrc = Class348_Sub41.unpackArchive(archiveSrc, -120);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("T3 - " + (cipherKeys != null) + "," + archiveId + ","
			+ archiveSrc.length + ","
			+ Class59_Sub1.getChecksum(5126, archiveSrc.length, archiveSrc)
			+ ","
			+ Class59_Sub1.getChecksum(5126, archiveSrc.length - 2, archiveSrc)
			+ "," + indexTable.checksums[archiveId]
			+ "," + indexTable.checksum));
	}
	if (directlyAllocate)
	    archiveBuffers[archiveId] = null;
	if (amountChildren > 1) {
	    if (unpackSettings != 2) {
		int pos = unpackedSrc.length;
		int rounds = 0xff & unpackedSrc[--pos];
		pos -= 4 * amountChildren * rounds;
		ByteBuffer buffer = new ByteBuffer(unpackedSrc);
		int[] childrenSizes = new int[amountChildren];
		buffer.position = pos;
		for (int i_19_ = 0; i_19_ < rounds; i_19_++) {
		    int i_20_ = 0;
		    for (int i_21_ = 0; i_21_ < amountChildren; i_21_++) {
			i_20_ += buffer.getDword();
			childrenSizes[i_21_] += i_20_;
		    }
		}
		byte[][] childrenSrcs = new byte[amountChildren][];
		for (int i = 0; i < amountChildren; i++) {
		    childrenSrcs[i] = new byte[childrenSizes[i]];
		    childrenSizes[i] = 0;
		}
		((ByteBuffer) buffer).position = pos;
		int srcOff = 0;
		for (int i = 0; rounds > i; i++) {
		    int len = 0;
		    for (int j = 0; amountChildren > j; j++) {
			len += buffer.getDword();
			ArrayUtils.arrayCopy(unpackedSrc, srcOff, childrenSrcs[j], childrenSizes[j], len);
			srcOff += len;
			childrenSizes[j] += len;
		    }
		}
		for (int j = 0; amountChildren > j; j++) {
		    int id;
		    if (activeChildren == null)
			id = j;
		    else
			id = activeChildren[j];
		    if (unpackSettings != 0)
			buffers[id] = childrenSrcs[j];
		    else
			buffers[id] = Class179.getDirectByteBuffer(childrenSrcs[j]);
		}
	    } else {
		int pos = unpackedSrc.length;
		int rounds = 0xff & unpackedSrc[--pos];
		pos -= 4 * rounds * amountChildren;
		ByteBuffer buffer = new ByteBuffer(unpackedSrc);
		int destPos = 0;
		int fetchId = 0;
		buffer.position = pos;
		for (int i = 0; rounds > i; i++) {
		    int i_35_ = 0;
		    for (int j = 0; j < amountChildren; j++) {
			i_35_ += buffer.getDword();
			int id;
			if (activeChildren == null)
			    id = j;
			else
			    id = activeChildren[j];
			if (id == childId) {
			    fetchId = id;
			    destPos += i_35_;
			}
		    }
		}
		if (destPos == 0)
		    return true;
		byte[] dest = new byte[destPos];
		buffer.position = pos;
		destPos = 0;
		int srcOff = 0;
		for (int i = 0; i < rounds; i++) {
		    int length = 0;
		    for (int j = 0; j < amountChildren; j++) {
			length += buffer.getDword();
			int id;
			if (activeChildren != null)
			    id = activeChildren[j];
			else
			    id = j;
			if (id == childId) {
			    ArrayUtils.arrayCopy(unpackedSrc, srcOff, dest, destPos, length);
			    destPos += length;
			}
			srcOff += length;
		    }
		}
		buffers[fetchId] = dest;
	    }
	} else {
	    int id;
	    if (activeChildren != null)
		id = activeChildren[0];
	    else
		id = 0;
	    if (unpackSettings != 0)
		buffers[id] = unpackedSrc;
	    else
		buffers[id]  = Class179.getDirectByteBuffer(unpackedSrc);
	}
	return true;
    }
    
    static final void method395(int i) throws ToolkitException {
	if (ByteBuffer.anInt7207 == 1)
	    Class21.aHa326.draw(Class339.anInt4211,
				      Class348_Sub40_Sub8.anInt9157);
	else
	    Class21.aHa326.draw(0, 0);
    }
    
    final int[] getActiveChildren(int id) {
	anInt640++;
	if (!isValidArchive(id))
	    return null;
	int[] activeChildren = indexTable.activeChildren[id];
	if (activeChildren == null) {
	    activeChildren = new int[indexTable.amountChildren[id]];
	    for (int i = 0; i < activeChildren.length; i++)
		activeChildren[i] = i;
	}
	return activeChildren;
    }
    
    final int getArchiveLoadedPerc(String string) {
	anInt633++;
	if (!isInitialized())
	    return 0;
	string = string.toLowerCase();
	int id = indexTable.archiveHashTable.get(Class281.getArchiveHash(string));
	return getArchiveLoadedPerc(id);
    }
    
    final int getChildLoadedPerc() {
	anInt641++;
	if (!isInitialized())
	    return 0;
	int totalPerc = 0;
	int netPerc = 0;
	int i = 0;
	for (/**/; archiveBuffers.length > i; i++) {
	    if (indexTable.amountChildren[i] > 0) {
		netPerc += getArchiveLoadedPerc(i);
		totalPerc += 100;
	    }
	}
	if (totalPerc == 0)
	    return 100;
	int perc = netPerc * 100 / totalPerc;
	return perc;
    }
    
    private boolean isInitialized() {
	anInt652++;
	if (indexTable == null) {
	    indexTable = archiveLoader.getIndexTable();
	    if (indexTable == null)
		return false;
	    archiveBuffers = new Object[indexTable.maximumEntry];
	    childBuffers = new Object[indexTable.maximumEntry][];
	}
	return true;
    }
    
    final boolean containsArchive(String string) {
	anInt635++;
	if (!isInitialized())
	    return false;
	string = string.toLowerCase();
	int index = indexTable.archiveHashTable.get(Class281.getArchiveHash(string));
	if (index < 0)
	    return false;
	return true;
    }
    
    final boolean loadAll() {
	anInt648++;
	if (!isInitialized())
	    return false;
	boolean bool = true;
	for (int i = 0; indexTable.activeArchives.length > i; i++) {
	    int id = indexTable.activeArchives[i];
	    if (archiveBuffers[id] == null) {
		loadArchive(id);
		if (archiveBuffers[id] == null)
		    bool = false;
	    }
	}
	return bool;
    }
    
    private final void method402(byte i, int i_55_) {
	anInt658++;
	if (i < -70)
	    archiveLoader.method2338((byte) -52, i_55_);
    }
    
    private final boolean getChildLoaded(String string, int i, String string_56_) {
	try {
	    anInt626++;
	    if (!isInitialized())
		return false;
	    string = string.toLowerCase();
	    string_56_ = string_56_.toLowerCase();
	    int i_57_ = (indexTable.archiveHashTable.get
			 (Class281.getArchiveHash(string)));
	    if (i != 7195)
		getChildLoaded(null, -20, null);
	    if (!isValidArchive(i_57_))
		return false;
	    int i_58_
		= indexTable.childHashTables[i_57_]
		      .get(Class281.getArchiveHash(string_56_));
	    return isLoaded(i_57_, i_58_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("in.Q("
					     + (string != null ? "{...}"
						: "null")
					     + ',' + i + ','
					     + (string_56_ != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    final void destroy(boolean bool, boolean bool_59_) {
	anInt644++;
	if (isInitialized()) {
	    if (bool_59_) {
		indexTable.nameHashes = null;
		indexTable.archiveHashTable = null;
	    }
	    if (bool) {
		indexTable.anIntArrayArray3735 = null;
		indexTable.childHashTables = null;
	    }
	}
    }
    
    final void removeArchives(int i) {
	anInt650++;
	if (archiveBuffers != null) {
	    for (int i_60_ = 0; i_60_ < archiveBuffers.length; i_60_++)
		archiveBuffers[i_60_] = null;
	}
    }
    
    private final void loadArchive(int i) {
	if (!directlyAllocate)
	    archiveBuffers[i] = Class179.getDirectByteBuffer(archiveLoader.getValidatedArchive(i));
	else
	    archiveBuffers[i] = archiveLoader.getValidatedArchive(i);
	anInt665++;
    }
    
    final int getAmountChildEntries(int i_62_) {
	anInt645++;
	if (!isValidArchive(i_62_))
	    return 0;
	return indexTable.amountChildEntries[i_62_];
    }
    
    final boolean method408(int i_63_) {
	anInt632++;
	if (!isValidArchive(i_63_))
	    return false;
	if (archiveBuffers[i_63_] != null)
	    return true;
	loadArchive(i_63_);
	if (archiveBuffers[i_63_] != null)
	    return true;
	return false;
    }
    
    final void method409(String string, boolean bool) {
	anInt663++;
	if (isInitialized()) {
	    string = string.toLowerCase();
	    int i = indexTable.archiveHashTable.get(Class281.getArchiveHash(string));
	    method402((byte) -86, i);
	}
    }
    
    final byte[] getChildArchive(int i_64_, int i_65_) {
	anInt651++;
	return loadArchiveChild(i_64_, i_65_, null);
    }
    
    final void removeChildren(int i) {
	anInt627++;
	if (isValidArchive(i)) {
	    if (childBuffers != null)
		childBuffers[i] = null;
	}
    }
    
    final void removeChildren() {
	if (childBuffers != null) {
	    for (int i_67_ = 0; childBuffers.length > i_67_; i_67_++)
		childBuffers[i_67_] = null;
	}
	anInt660++;
    }
    
    final boolean getArchiveExists(String string) {
	anInt636++;
	if (!isInitialized())
	    return false;
	string = string.toLowerCase();
	int i_69_ = indexTable.archiveHashTable.get(Class281.getArchiveHash(string));
	return method408(i_69_);
    }
    
    final int getAmountChildren() {
	anInt637++;
	if (!isInitialized())
	    return -1;
	return indexTable.amountChildEntries.length;
    }
    
    final byte[] getArchive(int i_70_) {
	anInt630++;
	if (!isInitialized())
	    return null;
	if (indexTable.amountChildEntries.length == 1)
	    return getChildArchive(0, i_70_);
	if (!isValidArchive(i_70_))
	    return null;
	if ((indexTable.amountChildEntries[i_70_] ^ 0xffffffff) == -2)
	    return getChildArchive(i_70_, 0);
	throw new RuntimeException();
    }
    
    final boolean getArchiveLoaded(String name) {
	anInt631++;
	int id = getArchiveId("");
	if (id != -1)
	    return getChildLoaded("", 7195, name);
	return getChildLoaded(name, 7195, "");
    }
    
    final int getArchiveId(String string) {
	anInt654++;
	if (!isInitialized())
	    return -1;
	string = string.toLowerCase();
	int archiveId = indexTable.archiveHashTable.get(Class281.getArchiveHash(string));
	if (!isValidArchive(archiveId))
	    return -1;
	return archiveId;
    }
    
    private boolean isValidChild(int archiveId, int childId) {
	anInt662++;
	if (!isInitialized())
	    return false;
	if (archiveId < 0 || childId < 0 || archiveId >= indexTable.amountChildEntries.length || childId >= indexTable.amountChildEntries[archiveId]) {
	    if (Class285.aBoolean4741)
		throw new IllegalArgumentException(String.valueOf(archiveId) + "," + childId);
	    return false;
	}
	return true;
    }
    
    private int getArchiveLoadedPerc(int id) {
	anInt653++;
	if (!isValidArchive(id))
	    return 0;
	if (archiveBuffers[id] != null)
	    return 100;
	return archiveLoader.getLoadedPerc(id);
    }
    
    final boolean isLoaded(int archiveId, int childId) {
	anInt638++;
	if (!isValidChild(archiveId, childId))
	    return false;
	if (childBuffers[archiveId] != null && childBuffers[archiveId][childId] != null)
	    return true;
	if (archiveBuffers[archiveId] != null)
	    return true;
	loadArchive(archiveId);
	if (archiveBuffers[archiveId] != null)
	    return true;
	return false;
    }
    
    final boolean getArchiveLoaded(int id) {
	anInt661++;
	if (!isInitialized())
	    return false;
	if (indexTable.amountChildEntries.length == 1)
	    return isLoaded(0, id);
	if (!isValidArchive(id))
	    return false;
	if (indexTable.amountChildEntries[id] == 1)
	    return isLoaded(id, 0);
	throw new RuntimeException();
    }
    
    final boolean containsChild(String archiveName, String childName) {
	try {
	    anInt668++;
	    if (!isInitialized())
		return false;
	    archiveName = archiveName.toLowerCase();
	    childName = childName.toLowerCase();
	    int archiveId = indexTable.archiveHashTable.get(Class281.getArchiveHash(archiveName));
	    if (archiveId < 0)
		return false;
	    int childId = indexTable.childHashTables[archiveId].get(Class281.getArchiveHash(childName));
	    if (childId < 0)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("in.M("
					     + (childName != null ? "{...}"
						: "null")
					     + ','
					     + (archiveName != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    final int getNameHashIndex(int i) {
	anInt649++;
	if (!isInitialized())
	    return -1;
	int i_82_ = indexTable.archiveHashTable.get(i);
	if (!isValidArchive(i_82_))
	    return -1;
	return i_82_;
    }
    
    IndexLoader(AbtractArchiveLoader loader, boolean direct, int unpack) {
	if (unpack < 0 || unpack > 2)
	    throw new IllegalArgumentException("js5: Invalid value " + unpack + " supplied for discardunpacked");
	archiveLoader = loader;
	directlyAllocate = direct;
	unpackSettings = unpack;
    }
    
    static {
	anInt666 = 100;
    }
}
