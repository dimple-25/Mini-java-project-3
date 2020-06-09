package vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector(1,1,1);
		Vector v2=new Vector(1,1,1);
		System.out.println("First Vector: "+v.i+"i +"+v.j+"j +"+v.k+"k");
		System.out.println("Second Vector: "+v2.i+"i +"+v2.j+"j +"+v2.k+"k");
		Vector v3=new Vector();
		
		v3.addition(v,v2);
		v3.dot(v,v2);
		v3.cross(v,v2);
		v3.scalar(v,4);
		v3.equal(v,v2);
	}

}
