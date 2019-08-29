package variables;

public class HostnameExample {
	String h;
	String u;
	String p;
	String db;
	
	public  HostnameExample() {
	h="Localhost";
	u="root";
	p="123";
	db="dBase";
	}

	public static void main(String[] args) {
		 HostnameExample obj= new HostnameExample();
		 
		System.out.println("Hostname= "+obj.h);
		System.out.println("Username= "+obj.u);
		System.out.println("Password= "+obj.p);
		System.out.println("DbName= "+obj.db);
	

	}

}
