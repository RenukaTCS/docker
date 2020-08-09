package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StringOpeartion {
	
	@GetMapping("/upper to lower")
	public String UTOL(String a)
	{
		
		return a.toLowerCase();
	}
	
@GetMapping("/reverseString")
		 public  String reverseString(String in) {
				if (in == null)
					return null;
				StringBuilder out = new StringBuilder();

				int length = in.length();

				for (int i = length - 1; i >= 0; i--) {
					out.append(in.charAt(i));
				}

				return out.toString();
			}
@GetMapping("/Discount")
public int discount(int dis,int  MP)
{
	int s=1, amount;
	amount= (s*MP)/100;
	return amount;
}
@GetMapping("/BillPay")
public double CalculateElectricityBill(long units)
{
	double billpay=0;
	
	  if(units==100)
		billpay=units*1.20;
	  
	     return billpay; 
       }
@GetMapping("/replacestring")
public String replacestring(String a)
{
	
	String b= a.replace("h", "o");
	return b;
}

}



