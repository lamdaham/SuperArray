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
		int largest =0;
		if (a.size()<=b.size()) {
			for (int i = 0; i<a.size(); i++) {
				output.add(a.get(i));
				output.add(b.get(i));
			}
			for (int i = a.size(); i<b.size(); i++) {
				output.add(b.get(i));
			}
		} else {
			for (int i = 0; i<b.size(); i++) {
				output.add(a.get(i));
				output.add(b.get(i));
			}
			for (int i = b.size(); i<a.size(); i++) {
				output.add(a.get(i));
			}
		}
		
		
		return output;
	}

	public static void main(String[] args) {
		//SuperArray list = new SuperArray(-1000);
	}
} 