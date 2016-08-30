package se.iskjoka.unitConverter.algorithms;

import java.math.BigDecimal;
import java.math.RoundingMode;

import se.iskjoka.unitConverter.unitConverterAlgorithm;

public class FahrenheitToCelsiusConverterAlgorithm implements unitConverterAlgorithm{
	BigDecimal THIRTY_TWO = new BigDecimal( "32.00" );
	BigDecimal FIVE = new BigDecimal( "5.00" );
	BigDecimal NINE = new BigDecimal( "9.00" );

	@Override
	public String convert(String temperature, Integer numberOfDecimals) {
		return calculateTemperature( temperature, numberOfDecimals );
	}

	private String calculateTemperature( String temperature, Integer numberOfDecimals ){
		BigDecimal temp = new BigDecimal( temperature );
		return temp.subtract( THIRTY_TWO )
					.multiply( FIVE )
					.divide( NINE, numberOfDecimals, RoundingMode.HALF_EVEN )
					.toString();
	}
	
}
