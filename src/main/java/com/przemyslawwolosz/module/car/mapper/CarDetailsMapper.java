package com.przemyslawwolosz.module.car.mapper;

import com.przemyslawwolosz.module.car.dto.CarDetailsDto;
import com.przemyslawwolosz.module.car.entity.CarDetailsEntity;

public class CarDetailsMapper {

	public static CarDetailsDto map(CarDetailsEntity details) {
		if (details == null) {
			return new CarDetailsDto();
		}
		return new CarDetailsDto()
				.setFirstName(details.getFirstName())
				.setLastName(details.getLastName());
	}
}

