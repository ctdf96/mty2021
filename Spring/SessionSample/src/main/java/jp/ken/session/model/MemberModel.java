package jp.ken.session.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class MemberModel implements Serializable {

		@NotEmpty (message = "会員氏名を省略することはできません。")
		private String name;
		private String gender = "woman";
		@NotEmpty (message = "メールアドレスを省略することはできません。")
		@Email(message = "メールアドレスとして判断できません。")
		private String mail;


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
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		}
