 package gvpparalleltesting;

import org.testng.annotations.Test;

public class SmokeTest {
	@Test(groups = {"smoke"})
public void test1() {
	System.out.println("this is the test1");
}
	@Test(groups = {"smoke","sanity"})
public void test2() {
	System.out.println("this is the test2");
}
	@Test(groups = {"regression"})
public void test3() {
	System.out.println("this is the test3");
}
public void test4() {
	System.out.println("this is the test4");
}
}
