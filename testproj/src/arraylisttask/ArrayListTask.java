package arraylisttask;

import createdexception.CustomException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ArrayListTask {
	public void nullCheck(Object given) throws CustomException {
		if (Objects.isNull(given)) {
			throw new CustomException("list cannot be null");
		}
	}

	public <T> int getLengthList(List<T> given) throws CustomException {
		nullCheck(given);
		int length = given.size();
		return length;
	}

	public <T> List<T> getAList() {   //swami //resolved
		List<T> list = new ArrayList<>();
		return list;
	}


	public List<String> addStrElement(List<String> given, String... input) throws CustomException {
		nullCheck(given);
		nullCheck(input);
		int n = input.length;
		String element;
		for (int i = 0; i < n; i++) {
			element = input[i];
			given.add(element);
		}
		return given;
	}
	public List<Double> addDoubleElement(List<Double> given, Double... input) throws CustomException {
		nullCheck(given);
		nullCheck(input);
		int n = input.length;
		Double element;
		for (int i = 0; i < n; i++) {
			element = input[i];
			given.add(element);
		}
		return given;
	}
	public List<Long> addLongElement(List<Long> given, Long... input) throws CustomException {
		nullCheck(given);
		nullCheck(input);
		int n = input.length;
		Long element;
		for (int i = 0; i < n; i++) {
			element = input[i];
			given.add(element);
		}
		return given;
	}
	public List<Object> addElement(List<Object> given, Object... input) throws CustomException {
		nullCheck(given);
		nullCheck(input);
		int n = input.length;
		Object element;
		for (int i = 0; i < n; i++) {
			element = input[i];
			given.add(element);
		}
		return given;
	}
	public List<Integer> addIntElement(List<Integer> given, int... input) throws CustomException {
		nullCheck(given);
		nullCheck(input);
		int n = input.length;
		int element;
		for (int i = 0; i < n; i++) {
			element = input[i];
			given.add(element);
		}
		return given;
	}

	public int getIndexOf(List<String> given, String input) throws CustomException {
		nullCheck(given);
		nullCheck(input);
		int index;
		if (given.contains(input)) {
			index = given.indexOf(input);
		} else {
			throw new CustomException("the given arraylist does not contain the entered element");
		}
		return index;
	}

	public void getIterator(List<String> given) throws CustomException {
		nullCheck(given);
		Iterator<String> iter = given.iterator();
		System.out.println("The iterator values of the list are: ");
		while (iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}
	}

	public Object getElement(List<String> given, int index) throws CustomException {
		int length = getLengthList(given);
		if (index < 0 || index > length) {
			throw new CustomException("the entered index is out of bound");
		} else {

			Object element = given.get(index);
			return element;
		}
	}

	public int getLastIndex(List<String> given, String input) throws CustomException {
		nullCheck(given);
		nullCheck(input);     //swami //resolved
		int lastIndex = given.lastIndexOf(input);

		return lastIndex;
	}

	public List addInBet(List<String> given, int index, String input) throws CustomException {
		nullCheck(input);
		int length = getLengthList(given);
		if (index < 0 || index > length) {
			throw new CustomException("the entered index is out of bound");
		} else {
			given.add(index, input);
			return given;
		}
	}

	public List getSubList(List<String> given, int firstIndex, int lastIndex) throws CustomException {
		int length = getLengthList(given);
		List list;
		if (firstIndex < 0 || firstIndex > length - 1 || lastIndex < firstIndex || lastIndex > length - 1) {
			throw new CustomException("the entered indexes are out of bound");
		} else {
			list = given.subList(firstIndex, lastIndex);
		}
		return list;
	}

	public List mergeList(List<String> givenA, List<String> givenB) throws CustomException {
		nullCheck(givenA);
		nullCheck(givenB);
		givenA.addAll(givenB);
		return givenA;
	}

	public List removeElement(List<String> given, String input) throws CustomException {
		nullCheck(given);
		nullCheck(input);

		given.remove(input);

		return given;
	}
	public List<Double> removeDoubleElement(List<Double> given, Double input) throws CustomException {
		nullCheck(given);
		nullCheck(input);

		given.remove(input);

		return given;
	}

	public List<Double> removeElementAtIndex(List<Double> given, int index) throws CustomException {
		int length = getLengthList(given);
		if (index > 0 && index < length - 1) {
			given.remove(index);
		} else {
			throw new CustomException("the entered indexes are out of bound");
		}
		return given;
	}

	public List<Long> removeFromTo(List<Long> given, int firstIndex, int lastIndex) throws CustomException {
		int lengthGiven = getLengthList(given);
		List<Long> input = getLongSubList(given, firstIndex, lastIndex);
		given.removeAll(input);
		return given;
	}

	private List<Long> getLongSubList(List<Long> given, int firstIndex, int lastIndex)throws CustomException {
		int length = getLengthList(given);
		List list;
		if (firstIndex < 0 || firstIndex > length - 1 || lastIndex < firstIndex || lastIndex > length - 1) {
			throw new CustomException("the entered indexes are out of bound");
		} else {
			list = given.subList(firstIndex, lastIndex);
		}
		return list;

	}

	public List removeCommon(List<String> given, List<String> input) throws CustomException {
		nullCheck(given);
		nullCheck(input);
		given.removeAll(input);
		return given;
	}

	public List removeNonCommon(List<String> given, List<String> input) throws CustomException {
		nullCheck(given);
		nullCheck(input);
		given.retainAll(input);
		return given;
	}

	public List<Long> removeAll(List<Long> given) throws CustomException {
		nullCheck(given);
		given.clear();
		return given;
	}

	public boolean checkObject(List<String> given, String input) throws CustomException {
		nullCheck(given);
		nullCheck(input);
		boolean check = given.contains(input);
		return check;
	}
}
