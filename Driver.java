public class Driver{
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
	public static void main(String[] args) {
		/*
		SuperArray words = new SuperArray();
    	//grouped to save vertical space
    	words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");     
    	words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    	words.add("una");    words.add("ebi");     words.add("toro"); 

    	System.out.println(words);
    	removeDuplicates(words);
    	System.out.println(words);  
		*/
		SuperArray q = new SuperArray();
		q.add("9");   q.add("1");     q.add("2");     q.add("2");     
    	q.add("3");    q.add("4");
		SuperArray w = new SuperArray();
		w.add("0");   w.add("4");     w.add("2");     w.add("2");     
    	w.add("9");

    	System.out.println(findOverlap(q,w));
    	System.out.println(q);
    	System.out.println(q.lastIndexOf("2"));
    	System.out.println(q.equals(w));


	}
} 