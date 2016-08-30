package se.iskjoka.unitConverter.algorithms;

import java.math.BigDecimal;
import java.math.RoundingMode;

import se.iskjoka.unitConverter.unitConverterAlgorithm;

public class CelsiusToFahrenheitConverterAlgorithm implements unitConverterAlgorithm {
	BigDecimal THIRTY_TWO = new BigDecimal( "32" );
	BigDecimal FIVE = new BigDecimal( "5" );
	BigDecimal NINE = new BigDecimal( "9" );

	@Override
	public String convert(String temperature, Integer numberOfDecimals) {
		return calculateTemperature(temperature, numberOfDecimals);
	}

	private String calculateTemperature( String temperature, Integer numberOfDecimals ){
		BigDecimal temp = new BigDecimal( temperature );
		return temp.multiply( NINE )
					.divide( FIVE, numberOfDecimals, RoundingMode.HALF_EVEN )
					.add( THIRTY_TWO )
					.toString();
	}
	
}
