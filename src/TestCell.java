import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
public class Testcell 
{
	Cell c= new Cell();
	public void testcount() 
	{
		System.out.println("======TEST TWO EXECUTED=======");
		Assertions.assertEquals(2, c.count(5,6));
	}
}
