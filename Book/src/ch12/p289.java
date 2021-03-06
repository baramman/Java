package ch12;

class Hash {
	int value;
	Hash(int value) {
		this.value = value;
	}

	public boolean equlas(Object obj) {
		if (obj instanceof Hash) {
			Hash v = (Hash)obj;
			return value == v.value;
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return value;
	}
	
}

public class p289 {
	public static void main(String[] args) {
		
		Hash v1 = new Hash(20);
		Hash v2 = new Hash(20);
		
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println("v1 객체 진짜 해쉬값 :"+System.identityHashCode(v1));
		System.out.println("v2 객체 진짜 해쉬값 :"+System.identityHashCode(v2));
		
	}
}
