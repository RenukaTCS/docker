package com;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.runners.JUnit4;

@ExtendWith(SpringExtension.class)
@SpringBootTest

@RunWith(JUnit4.class)

public class testservice {

	StringOpeartion s=new StringOpeartion();
	@org.junit.Test
	public void testUTOL()
	{
		Assertions.assertEquals("hello",s.UTOL("HELLO"));
				
	}
	@org.junit.Test
	public void testUTOL1()
	{
		Assertions.assertNotEquals("h", s.UTOL("HELLO"));
				
	}
	@org.junit.Test
	public void testreversestring()
	{
		Assertions.assertEquals("1", s.reverseString("1"));
		
	}
	@org.junit.Test
	public void testreversestring1()
	{
		Assertions.assertNotEquals("2", s.reverseString("1"));
		
	}
	@org.junit.Test
	public void testDiscount()
	{
		Assertions.assertEquals(1, s.discount(1, 100));
	}
	@org.junit.Test
	public void testDiscount1()
	{
		Assertions.assertNotEquals(2, s.discount(1, 100));
	}
	@org.junit.Test
	public void testbillpay()
	{
		Assertions.assertEquals(0, s.CalculateElectricityBill(0));
	}
	@org.junit.Test
	public void testbillpay1()
	{
		Assertions.assertNotEquals(1, s.CalculateElectricityBill(0));
	}
	@org.junit.Test
	public void testreplace()
	{
		Assertions.assertEquals("oello", s.replacestring("hello"));
	}
	@org.junit.Test
	public void testreplace1()
	{
		Assertions.assertNotEquals("iello", s.replacestring("hello"));
	}
	
}
