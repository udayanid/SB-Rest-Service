package com.udayan.request;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * @author user
 *
 */
@XmlRootElement
public class TicketInfoResponse {
	private String name;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date dob;
	private String gender;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date doj;
	private String from;
	private String to;
	private int trainNumber;
	private String status;
	private float price;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TicketInfoResponse [name=");
		builder.append(name);
		builder.append(", dob=");
		builder.append(dob);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", doj=");
		builder.append(doj);
		builder.append(", from=");
		builder.append(from);
		builder.append(", to=");
		builder.append(to);
		builder.append(", trainNumber=");
		builder.append(trainNumber);
		builder.append(", status=");
		builder.append(status);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

}
