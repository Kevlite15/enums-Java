package edu.albany.hw2.stock;

public class Stock {
		
	public enum Symbol 
	{
		//declare constants of enum type
		AAPL("Apple"),
		GOOGL("Google"),
		MSFT("Microsoft"),
		AMZN("Amazon"),
		T("AT&T");
		
		//instance fields
		private final String company; //company name
		
		//enum constructor
		
		Symbol(String company){
			this.company = company;
		}
		
		//accessor for field title
		public String getCompany()
		{
			return company;
		}

		
	}
	
	//Vars
	private double perviousClosingPrice = 0.00;
	private double currentPrice = 0.00;
	
	public Stock(Symbol symbol, String name) {
		// TODO Auto-generated constructor stub
	}
	
	//accessor functions for data fields
	public double getPerviousClosingPrice()
	{
		return perviousClosingPrice;
	}
	
	public double getCurrentPrice()
	{
		return currentPrice;
	}
	
	//mutators functions for  previousClosingPrice and currentPrice
	
	public void setPerviousClosingPrice(double val)
	{
		this.perviousClosingPrice = val;
	}
	
	public void setCurrentPrice(double val)
	{
		setPerviousClosingPrice(this.currentPrice);
		this.currentPrice = val;
	}
	//Function: That returns the percentage changed from previousClosingPrice to currentPrice

	public double getChangePercent()
	{
		return ((this.perviousClosingPrice - this.currentPrice)/this.currentPrice)*100;
	}

}
