package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import count.PaidOut;
import count.PaymentMethod;
import count.SaleStatus;

public class Sales {

	private List<SalesItem> item = new ArrayList<>();
	private Client client;
	private PaidOut paidOut;
	private SaleStatus saleStatus;
	private PaymentMethod paymentMethod;
	private Date    now 		 = new Date();
	private Integer number 	     = null;
	private Integer installment  = null;
	private Double  discount	 = null;
	





}
