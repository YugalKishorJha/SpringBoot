package com.example.crudpractice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="empRecords")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Employee  {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	int id;
	@NotNull@NotBlank
	String name;
	int sal;
	@Pattern(regexp ="^\\d{10}$",message = "provide valid phone no")
	String mobileNo;
	@Email
	String email;
	@Min(18)
	@Max(99)
	int age;
	@NotBlank
	String nationality;

}
