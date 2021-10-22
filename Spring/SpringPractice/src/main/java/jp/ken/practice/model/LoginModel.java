package jp.ken.practice.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginModel implements Serializable {

		@NotEmpty (message = "ログインIDを入力してください。")
		private String loginId;

		@NotEmpty (message = "パスワードを入力してください。")
		private String password;

		public String getLoginId() {
			return loginId;
		}

		public void setLoginId(String loginId) {
			this.loginId = loginId;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
}
