package vector;

public class Vector {
int i,j,k;

Vector(){}
Vector(int a,int b,int c)
{
	i=a;
	j=b;
	k=c;
}

public void addition(Vector a,Vector b)
{
	Vector c=new Vector();
	c.i=a.i+b.i;
	c.j=a.j+b.j;
	c.k=a.k+b.k;
	System.out.println("Addition of the vectors: "+c.i+"i+"+c.j+"j+"+c.k+"k");
}

public void dot(Vector a,Vector b)
{
	Vector c=new Vector();
	c.i=a.i*b.i;
	c.j=a.j*b.j;
	c.k=a.k*b.k;
	int x=c.i+c.j+c.k;
	System.out.println("Dot Product :"+x);
}

public void cross(Vector a,Vector b)
{
	Vector c=new Vector();
	c.i=(a.j*b.k)-(a.k*b.j);
	c.j=(a.i*b.k)-(a.k*b.i);
	c.k=(a.i*b.j)-(a.j*b.i);
	System.out.println("Cross Product :"+c.i+"i+"+c.j+"j+"+c.k+"k");
	
}

public void scalar(Vector a,int b)
{
	Vector c=new Vector();
	c.i=a.i*b;
	c.j=a.j*b;
	c.k=a.k*b;
	
	System.out.println("Scalar :"+c.i+"i+"+c.j+"j+"+c.k+"k");
	
}

public void equal(Vector a,Vector b)
{
	if(a.i==b.i && a.j==b.j&& a.k==b.k)
	{
		System.out.println("Vectore are equal");
	}
	else
	{
		System.out.println("Vectore are not equal");
	}
}
}
