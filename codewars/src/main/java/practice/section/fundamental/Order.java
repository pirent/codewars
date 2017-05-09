package practice.section.fundamental;

public class Order {

	private static final String DELIMITER = " ";

	public static String order(String words) {
		if (words.isEmpty()) {
			return "";
		}
		final String[] inputAfterSeperated = words.split(DELIMITER);
		final String[] temp = new String[inputAfterSeperated.length];
		
		for (String word : inputAfterSeperated) {
			for (char character : word.toCharArray()) {
				if (Character.isDigit(character)) {
					int value = Character.getNumericValue(character);
					temp[value - 1] = word;
					break;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (String s : temp) {
			sb.append(DELIMITER).append(s);
		}
		
		return sb.toString().replaceFirst(DELIMITER, "");
	}
}
