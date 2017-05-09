package practice.section.fundamental;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.toUpperCase;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class WhereIsMyParent {
	static String findChildren(final String text) {
		final Map<Character, StringBuilder> parentToChildren = new TreeMap<>();
		
		for (Character c : text.toCharArray()) {
			if (isUpperCase(c)) {
				if (!parentToChildren.containsKey(c)) {
					parentToChildren.put(c, new StringBuilder());
				}
			}
			else {
				char parentOfThisChild = toUpperCase(c);
				StringBuilder children = parentToChildren.get(parentOfThisChild);
				if (children == null) {
					children = new StringBuilder();
					parentToChildren.put(parentOfThisChild, children);
				}
				children.append(c);
			}
		}
		
		StringBuilder result = new StringBuilder();
		for (Entry<Character, StringBuilder> e : parentToChildren.entrySet()) {
			result.append(e.getKey()).append(e.getValue().toString());
		}
		return result.toString();
	}
}
