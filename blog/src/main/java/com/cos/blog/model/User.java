package com.cos.blog.model;

import java.sql.Timestamp;

//import java.security.Timestamp;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
//@DynamicInsert // insert 시에 null 인 필드를 제외시켜준다
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@Column(nullable=false,length =20)
	private String username;
	
	@Column(nullable=false,length =100)
	private String password;
	
	@Column(nullable=false,length =50)
	private String email;

	// @ColumnDefault("user")
	// DB 는 RoleType라는게 없다.
	@Enumerated(EnumType.STRING)
	private RoleType role; // Enum을 쓰는게 좋다// admin, user, manager
	
	
	@CreationTimestamp
	private Timestamp createDate;
}
