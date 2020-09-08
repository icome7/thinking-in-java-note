package com.iseven.thinkjava.chapter06.conn;

public class ConnectionManager {
	
	private static Connection[] cs = {new Connection(), new Connection(), new Connection()};
	
	public static Connection getConnection() {
		for(int i=0; i<cs.length; i++) {
			Connection c = cs[i];
			if(c != null) {
				cs[i] = null;
				return c;
			}
		}
		return null;
	}
}

