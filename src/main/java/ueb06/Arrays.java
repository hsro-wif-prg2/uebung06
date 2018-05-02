package ueb06;

class Arrays {
	/**
	 * Gibt eine Stringrepraesentation des Arrays zurueck, z.B. [] oder [1, 2, 3]
	 */
	static <T> String toString(T[] array) {

		if (array.length == 0) {
            return "[ ]";
        } else
      return "[ " + toString(array,0) + " ]" ;}

    static <T> String toString(T[] array, int a){
        		if(a == array.length - 1)
            			return array[a].toString();
        	else
        			return array[a].toString() + ", " + toString(array, a +1);
    }
	/**
	 * Gib zurück, ob ein Objekt in dem Array enthalten ist; verwendet `equals`
	 */
	static <T> boolean contains(T[] array, T object) {

	    return contains(array,object);
	}

	static <T> boolean contains(T[] array,T object,int a){
	    if (a == array.length)
            return false;
	    else if(array[a].equals(object))
	        return true;
	    else
	        return contains(array,object,a+1);
	}
}
