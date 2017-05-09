package practice.section.fundamental;

/**
 * You need to return a string that displays a diamond shape on the screen using
 * asterisk ("*") characters. Please see provided test cases for exact output
 * format.
 * 
 * The shape that will be returned from print method resembles a diamond, where
 * the number provided as input represents the number of *’s printed on the
 * middle line. The line above and below will be centered and will have 2 less
 * *’s than the middle line. This reduction by 2 *’s for each line continues
 * until a line with a single * is printed at the top and bottom of the figure.
 * 
 * Return null if input is even number or negative (as it is not possible to
 * print diamond with even number or negative number).
 * 
 * @author pirent
 *
 */
public class Diamond {
	private static final Character SPACE = ' ';
	private static final Character DIAMOND = '*';
	private static final Character LINE_FEED = '\n';

	public static String print(int noDiamonds) {
		if (noDiamonds % 2 == 0 || noDiamonds < 0) {
			return null;
		}

		StringBuilder sb = new StringBuilder();
		int noDiamondToPrint = 1;
		while (noDiamondToPrint <= noDiamonds) {
			int noOfSpaceInOneSide = (noDiamonds - noDiamondToPrint) / 2;
			addLine(sb, noOfSpaceInOneSide, noDiamondToPrint);
			noDiamondToPrint += 2;
		}

		noDiamondToPrint = noDiamonds - 2;
		while (noDiamondToPrint >= 1) {
			int noOfSpaceInOneSide = (noDiamonds - noDiamondToPrint) / 2;
			addLine(sb, noOfSpaceInOneSide, noDiamondToPrint);
			noDiamondToPrint -= 2;
		}

		return sb.toString();
	}

	private static String createRepeatedCharactersString(int noOfRepeat,
			Character charToPrint) {
		StringBuilder sb = new StringBuilder();
		while (noOfRepeat > 0) {
			sb.append(charToPrint);
			noOfRepeat--;
		}
		return sb.toString();
	}
	
	private static void addLine(StringBuilder sb, int noSpace, int noDiamond) {
		sb.append(createRepeatedCharactersString(noSpace, SPACE));
		sb.append(createRepeatedCharactersString(noDiamond, DIAMOND));
		sb.append(LINE_FEED);
	}
}
