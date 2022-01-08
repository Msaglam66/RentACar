package com.etiya.RentACarSpringProject.business.dtos.forCar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarImageDto {

	private int carImageId;

	private String imagePath;

}
