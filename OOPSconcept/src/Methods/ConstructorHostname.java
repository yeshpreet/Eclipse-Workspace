package Methods;

import variables.HostnameExample;

public class ConstructorHostname {
	String h;
	String u;
	String p;
	String db;
	
	public  ConstructorHostname() {
	h="Localhost";
	u="root";
	p="123";
	db="dBase";
	}

	public static void main(String[] args) {
		ConstructorHostname obj= new ConstructorHostname();
		 
		System.out.println("Hostname= "+obj.h);
		System.out.println("Username= "+obj.u);
		System.out.println("Password= "+obj.p);
		System.out.println("DbName= "+obj.db);
	

	}

}
