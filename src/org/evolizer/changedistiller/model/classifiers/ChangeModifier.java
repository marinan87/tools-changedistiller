package org.evolizer.changedistiller.model.classifiers;

/**
 * Modifier representation used by ChangeDistiller.
 * <p>
 * Defined modifiers: <code>final</code>, <code>public</code>, <code>private</code>, <code>protected</code>
 * 
 * @author zubi
 */
public final class ChangeModifier {

    /**
     * The <code>int</code> value representing the <code>final</code> modifier.
     */
    public static final int FINAL = 0x0001;

    /**
     * The <code>int</code> value representing the <code>private</code> modifier.
     */
    public static final int PRIVATE = 0x0004;

    /**
     * The <code>int</code> value representing the <code>protected</code> modifier.
     */
    public static final int PROTECTED = 0x0008;

    /**
     * The <code>int</code> value representing the <code>public</code> modifier.
     */
    public static final int PUBLIC = 0x0002;

    private ChangeModifier() {}

    /**
     * Returns whether the given flag includes the <code>final</code> modifier or not.
     * 
     * @param flag
     *            modifier flag
     * @return <code>true</code> if the flag contains the <code>final</code> modifier, <code>false</code> otherwise.
     */
    public static boolean isFinal(int flag) {
        return (flag & FINAL) != 0;
    }

    /**
     * Returns whether the given flag includes the <code>private</code> modifier or not.
     * 
     * @param flag
     *            modifier flag
     * @return <code>true</code> if the flag contains the <code>private</code> modifier, <code>false</code> otherwise.
     */
    public static boolean isPrivate(int flag) {
        return (flag & PRIVATE) != 0;
    }

    /**
     * Returns whether the given flag includes the <code>protected</code> modifier or not.
     * 
     * @param flag
     *            modifier flag
     * @return <code>true</code> if the flag contains the <code>protected</code> modifier, <code>false</code> otherwise.
     */
    public static boolean isProtected(int flag) {
        return (flag & PROTECTED) != 0;
    }

    /**
     * Returns whether the given flag includes the <code>public</code> modifier or not.
     * 
     * @param flag
     *            modifier flag
     * @return <code>true</code> if the flag contains the <code>public</code> modifier, <code>false</code> otherwise.
     */
    public static boolean isPublic(int flag) {
        return (flag & PUBLIC) != 0;
    }

}
