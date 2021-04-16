package com.landonhotel.eventsapp.domain;

import java.util.Date;

public class QuoteRequest {
	
	private Customer customer;
	private String eventType;  // social, corporate
	private Date eventDate;
	private String eventStartTime;
	private String eventEndTime;
	private int expectedAttendeeCount;
	private String seatingStyle;
	private String mealStyle;
	private boolean needsAudioVisual;
	private boolean needsStage;
	private boolean needsDanceFloor;
	private boolean needsRoomBlock;
	private boolean needsKidsClub;
	private boolean needsDedicatedPlanner;
	private boolean needsCustomFurniture;
	private boolean needsCustomFloralDesign;
	private boolean needsCustomDecor;
	
	private int budget;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventStartTime() {
		return eventStartTime;
	}

	public void setEventStartTime(String eventStartTime) {
		this.eventStartTime = eventStartTime;
	}

	public String getEventEndTime() {
		return eventEndTime;
	}

	public void setEventEndTime(String eventEndTime) {
		this.eventEndTime = eventEndTime;
	}

	public int getExpectedAttendeeCount() {
		return expectedAttendeeCount;
	}

	public void setExpectedAttendeeCount(int expectedAttendeeCount) {
		this.expectedAttendeeCount = expectedAttendeeCount;
	}

	public String getSeatingStyle() {
		return seatingStyle;
	}

	public void setSeatingStyle(String seatingStyle) {
		this.seatingStyle = seatingStyle;
	}

	public String getMealStyle() {
		return mealStyle;
	}

	public void setMealStyle(String mealStyle) {
		this.mealStyle = mealStyle;
	}

	public boolean isNeedsAudioVisual() {
		return needsAudioVisual;
	}

	public void setNeedsAudioVisual(boolean needsAudioVisual) {
		this.needsAudioVisual = needsAudioVisual;
	}

	public boolean isNeedsStage() {
		return needsStage;
	}

	public void setNeedsStage(boolean needsStage) {
		this.needsStage = needsStage;
	}

	public boolean isNeedsDanceFloor() {
		return needsDanceFloor;
	}

	public void setNeedsDanceFloor(boolean needsDanceFloor) {
		this.needsDanceFloor = needsDanceFloor;
	}

	public boolean isNeedsRoomBlock() {
		return needsRoomBlock;
	}

	public void setNeedsRoomBlock(boolean needsRoomBlock) {
		this.needsRoomBlock = needsRoomBlock;
	}

	public boolean isNeedsKidsClub() {
		return needsKidsClub;
	}

	public void setNeedsKidsClub(boolean needsKidsClub) {
		this.needsKidsClub = needsKidsClub;
	}

	public boolean isNeedsDedicatedPlanner() {
		return needsDedicatedPlanner;
	}

	public void setNeedsDedicatedPlanner(boolean needsDedicatedPlanner) {
		this.needsDedicatedPlanner = needsDedicatedPlanner;
	}

	public boolean isNeedsCustomFurniture() {
		return needsCustomFurniture;
	}

	public void setNeedsCustomFurniture(boolean needsCustomFurniture) {
		this.needsCustomFurniture = needsCustomFurniture;
	}

	public boolean isNeedsCustomFloralDesign() {
		return needsCustomFloralDesign;
	}

	public void setNeedsCustomFloralDesign(boolean needsCustomFloralDesign) {
		this.needsCustomFloralDesign = needsCustomFloralDesign;
	}

	public boolean isNeedsCustomDecor() {
		return needsCustomDecor;
	}

	public void setNeedsCustomDecor(boolean needsCustomDecor) {
		this.needsCustomDecor = needsCustomDecor;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	
}
