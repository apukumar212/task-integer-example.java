package com.pack1;

public class Taskinteger 
{
void meth1()
{
	int i=100;
	Integer ival=new Integer(i); //It is depreceated from version 1.9
	System.out.println("Int Primitive DataType value;"+i);
	System.out.println("Integer Wrapper Class Object:"+ival);
}
public static void main(String[] args)
{
	new Taskinteger().meth1();	
}
}
