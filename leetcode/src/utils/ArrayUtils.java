package utils;

/**
 * Utility Class for Array Operations
 * 
 * @author Anoop Awasthi
 * @since 2021-10-10 20:09:18.042
 * @link
 */
public class ArrayUtils {

	public static void printArray(Object[] objArray) {
		StringBuffer sb = new StringBuffer();
		if (objArray != null) {
			for (Object object : objArray) {
				sb.append(object);
				sb.append(" ");
			}
		}
		System.out.println(sb.toString());
	}

	public static void printArray(int[] objArray) {
		StringBuffer sb = new StringBuffer();
		if (objArray != null) {
			for (Object object : objArray) {
				sb.append(object);
				sb.append(" ");
			}
		}
		System.out.println(sb.toString());
	}

}
