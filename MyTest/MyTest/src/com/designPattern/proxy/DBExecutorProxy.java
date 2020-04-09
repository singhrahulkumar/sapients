package com.designPattern.proxy;

public class DBExecutorProxy implements DBExecutor {

	boolean isAdmin;
	DBExecutor dbExecutor;

	public DBExecutorProxy(String name, String password) {
		if (name.equals("abhi") && password.equals("abhi")) {
			this.isAdmin = true;
		}
		this.dbExecutor = new DBExecutorImpl();
	}

	@Override
	public void extecuteDB(String query) {
		if (isAdmin) {
			dbExecutor.extecuteDB(query);
		} else {
			if (query.equals("deleteQuery")) {
				System.out.println("Access not granted");
			} else {
				dbExecutor.extecuteDB(query);
			}
		}
	}

}
