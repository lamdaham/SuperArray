public class Demo{
	public static void removeDuplicates(SuperArray s) {
		for (int i = s.size()-1; i>=0; i--) {
			if(i!=s.indexOf(s.get(i))) {
				s.remove(i);
			}
		}

	}


	public static SuperArray findOverlap(SuperArray a, SuperArray b) {
		SuperArray output = new SuperArray();
		for(int i = 0; i<a.size(); i++){
			if(b.contains(a.get(i))) {
				output.add(a.get(i));
			}
		}
		removeDuplicates(output);
		return output;
	}


	public static SuperArray zip(SuperArray a, SuperArray b) {
		SuperArray output = new SuperArray();
		int max = 0;
		if (a.size()>=b.size()) {
			max = a.size();
		} else {
			max = b.size();
		}
		for (int i = 0; i<max; i++) {
			output.add(a.get(i));
			output.add(b.get(i));
		}
		return output;
	}
	public static void main(String[] args) {
		//SuperArray list = new SuperArray(-1000);
	}
} 