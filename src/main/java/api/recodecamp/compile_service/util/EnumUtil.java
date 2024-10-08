package api.recodecamp.compile_service.util;

/**
* Utility functions involving enums
* 
* @author Jasmine Anderson
* @version 1.0
*/
public final class EnumUtil {

    private EnumUtil() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    };

    /**
     * Checks if Object represents an enum type
     * @param obj parameter value to be checked
     * @return Indicates whether the parameter Object represents an enum type
     * @see <a href="https://docs.oracle.com/javase/tutorial/reflect/special/enumMembers.html">enumMembers</a>
     */
    public static boolean checkIfEnum(Object obj) {
        return obj.getClass().isEnum();
    };

    /**
     * Checks if Object is null or an empty string
     * @param obj parameter value to be checked
     * @return Indicates whether the parameter value is valid
     */
    public static boolean isNullOrEmpty(Object obj) {
        return obj == null || ((String) obj).isEmpty();
    };

    /**
     * Converts an Enum value to a String value
     * @param obj parameter value to be checked
     * @return Returns the name of this enum constant, as contained in the declaration.
     * @throws NullPointerException exception if obj parameter is null
     * @throws IllegalArgumentException exception if obj parameter is not an Enum
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/Enum.html">Class Enum</a>
     */
    public static String enumToStr(Object obj) throws IllegalArgumentException {
        if(isNullOrEmpty(obj)) {
            throw new NullPointerException("Parameter cannot be null");
        } else if (checkIfEnum(obj)) {
            return obj.toString();
        } else {
            throw new IllegalArgumentException(String.format("Parameter must be an Enum: %s", obj));
        }
    };
}
