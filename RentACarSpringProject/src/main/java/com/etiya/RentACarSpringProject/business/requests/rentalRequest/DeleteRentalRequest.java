package com.etiya.RentACarSpringProject.business.requests.rentalRequest;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeleteRentalRequest {
	
	@NotNull
	private int rentalId;

}
