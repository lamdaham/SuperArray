public class SuperArray {
	private String[] data;
	private int size;



	public SuperArray() {
		data = new String[10];
		size = 0;
	}


	public SuperArray(int initialCapacity) {
		data = new String[initialCapacity];
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
		for (int i = 0; i<size; i++) {
			if (data[i].equals(s)) {
				return true;
			}
		}
		return false;
	}


	public String toString() {
		String output = "[";
		for(int i = 0; i<size; i++) {
			if(i==size-1) {
				output += data[i];
				break;
			} 
			output += (data[i]+", ");
		}
		output += "]";
		return output;
	}

	public void add(int index, String element) {
		resize();
		for (int i = size; i>index-1 && i>=1; i--) {
			data[i] = data[i-1];
		}
		size++;
		data[index] = element;
	}

	public String remove(int index) {
		String output = data[index];
		for (int i = index; i<size-2; i++) {
			data[i] = data[i+1];
		}
		size--;
		return output;
	}


	public int indexOf(String s) {
		for(int i = 0; i<size; i++) {
			if (data[i].equals(s)) {
				return i;
			}
		}
		return -1;
	}

	public String[] toArray() {
		String[] output = new String[size];
		for (int i = 0; i<size; i++) {
			output[i] = data[i];
		}
		return output;
	}

}