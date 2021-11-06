package com.abc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@Data
public class Product {
	@NonNull
	private Integer id;
	@NonNull 
	private String name;
	@NonNull
	private Integer price;
}
