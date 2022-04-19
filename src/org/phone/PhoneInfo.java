package org.phone;

public class PhoneInfo {

	private void phoneName() {
		System.out.println("Phone Number - 99999999");

	}
	
	private void phoneMieiNum() {
		System.out.println("Phone Miei Mumber - xxxxxxx");

	}
	
	private void Camera() {
		System.out.println("Camera - 88pxl");

	}
	private void storage() {
		System.out.println("Storage - xxx");

	}
	private void osName() {
		System.out.println("OS Name - Andriod");

	}
	
	public static void main(String[] args) {
		
		PhoneInfo p=new PhoneInfo();
		
		p.phoneName();
		p.phoneMieiNum();
		p.Camera();
		p.storage();
		p.osName();
		
	}
	
}
