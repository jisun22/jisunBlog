package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
// lombok 설정 하고 난 후 이렇게 하면 됨 
//@Getter
//@Setter
@Data //getter,setter 모두 사용할 때
@NoArgsConstructor
//@AllArgsConstructor //생성자
public class Member{
		private int id;
		private String username;
		private String password;
		private String email;
		
		@Builder
		public Member(int id, String username, String password, String email) {
			this.id = id;
			this.username = username;
			this.password = password;
			this.email = email;
		}

		
		
}
