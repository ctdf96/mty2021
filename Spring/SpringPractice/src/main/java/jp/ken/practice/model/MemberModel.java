package jp.ken.practice.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

import jp.ken.practice.annotation.DateFormat;

public class MemberModel implements Serializable {
	@NotEmpty (message = "会員IDを入力してください")
	private String memberId;
	@NotEmpty (message = "氏名を入力してください")
	private String name;
	private String gender = "man";

	@DateFormat(message = "誕生日を（YYYY/MM/DD）の形式で入力してください")
	private String age;

	private String address;

	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


}
