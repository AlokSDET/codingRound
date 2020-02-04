package restTemplate;

import java.io.Serializable;

public class OrderDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private int id;
	private int petId;
	
	private int quantity;
	
	private boolean complete;
	
	private String status;
	
	private String shipDate;
	
	public OrderDetails(int id, int petId, int quantity, boolean complete, String status, String shipDate) {
		super();
		this.id = id;
		this.petId = petId;
		this.quantity = quantity;
		this.complete = complete;
		this.status = status;
		this.shipDate = shipDate;
	}
	
	public OrderDetails() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getShipDate() {
		return shipDate;
	}

	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}
	
	
}
