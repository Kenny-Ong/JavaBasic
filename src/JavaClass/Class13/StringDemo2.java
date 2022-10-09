package JavaClass.Class13;

import JavaClass.Class12.StringUtils;

public class StringDemo2 {

	public static void main(String[] args) {
		String str="Thor love and thunder";
		StringUtils strUtils=new StringUtils();
		strUtils.printAllIndexes(str, 'e');
	}

}
