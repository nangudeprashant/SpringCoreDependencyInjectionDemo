package com.javaLive.beans;

public class RoomConstructor {
	private int roomNumber;
	private Student allotedTo;

	public RoomConstructor(int roomNumber, Student allotedTo) {
		super();
		this.roomNumber = roomNumber;
		this.allotedTo = allotedTo;
	}

	@Override
	public String toString() {
		return "RoomConstructor [roomNumber=" + roomNumber + ", allotedTo=" + allotedTo.getName() + "]";
	}
}
