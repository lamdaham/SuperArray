public class SuperArray {
	private String[] data;
	private int size;

	public SuperArray() {
		data = new String[10];
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean add(String element) {
		if (size<data.length) {
			data[size] = element;
			size++;
			return true;
		} else if (size==data.length) {
			resize();
			data[size] = element;
			size++;
			return true;
		}
		return false;
	}


	public String get(int index) {
		return data[index];
	}


	public String set(int index, String element) {
		String output = data[index];
		data[index] = element;
		return output;
	}


	private void resize() {
		String[] newArray = new String[data.length+1];
		for (int i = 0;i<data.length;i++) {
			newArray[i] = data[i];
		}
		data = newArray;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public void clear() {
		data = new String[10];
		size = 0;
	}


	public boolean contains(String s) {
		for (String element:data) {
			if (s.equals(element)) {
				return true;
			}
		}
		return false;
	}


	public String toString() {
		String output = "[";
		for(int i = 0; i<data.length; i++) {
			if(i==data.length-1) {
				output += data[i];
				break;
			} 
			output += (data[i]+", ");
		}
		output += "]";
		return output;
	}
}