import java.util.*;
public class SettingData {
	private String city;
    private String country;
    private String gender;
    private String currency;
    private Double amount;
    private Double amountInDollars;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getAmountInDollars() {
		return amountInDollars;
	}
	public void setAmountInDollars(Double amountInDollars) {
		this.amountInDollars = amountInDollars;
    }
    public ans()
    {}
    public String cal_avg() {
		
		
		double res=0.0;
		
		if(currency.toString().contains("INR")) {
			
			res= (double)Integer.parseInt(Amount)/66;
			
		}else if(currency.toString().contains("GBP")) {
			res=Integer.parseInt(Amount)/0.67;
			
		}else if(currency.toString().contains("SGD")) {
			
			res=Integer.parseInt(Amount)/1.5;
		}else if(currency.toString().contains("HKD")) {
			
			 res=(double)Integer.parseInt(Amount)/8;
		}else {
		 res=Integer.parseInt(Amount);
		 }
		
		
		res=Math.round(res*10.0)/10.0;
		return Double.toString(res) ;
	}
}