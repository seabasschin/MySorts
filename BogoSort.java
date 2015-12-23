public class BogoSort {
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
		ArrayList<Integer> retAL = new ArrayList<Integer>();
		while( size > 0 ) {
	   		//     offset + rand int on interval [lo,hi]
	    	retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    	size--;
		}
		return retAL;
    }

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
		int randomIndex;
    	for( int i = al.size()-1; i > 0; i-- ) {
    		//pick an index at random
    		randomIndex = (int)( (i+1) * Math.random() );
    		//swap the values at position i and randomIndex
        	al.set( i, al.set( randomIndex, al.get(i) ) );
    	}
    	
    	public static Bogo
    }
