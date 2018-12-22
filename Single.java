package com.test;

public class Single {
    //饿汉式
	/*private static Single single=new Single();
	
	private Single(){}
	
	public static Single getInstance(){
		return single;
	}
	
	*/
	
	
	
	//懒汉式(测试)
	/*private static Single instance;
	
	private Single(){}
	
	public static   synchronized Single getInstance(){
		if(instance==null){
		   instance=new Single();
		}
		return instance;
	}*/
	
	//双重锁机制，安全且多线程下安全效率高
	private volatile static Single instance;
	
	private Single(){}
	
	public static Single getInstance(){
		if(instance==null){
			synchronized(Single.class){
				//if()
			}
		}
	}
	
	
}
