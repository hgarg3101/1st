package com.capgemini.core;


class B
{
public void message()
{
System.out.println("message from B");
}
}

class Widen extends B
{

public void message()
{
System.out.println("message from W");
}

public static void main(String... ar)
{
Widen w = new Widen();
B b = w;   //reference of a subclass(B) type is widened to the reference of superclass(A) type.
b.message();
}
}