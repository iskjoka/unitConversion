package se.iskjoka.unitConverter.test;

import org.junit.Test;

import org.junit.Assert;

import se.iskjoka.unitConverter.unitConverter;
import se.iskjoka.unitConverter.unitConverterImpl;
import se.iskjoka.unitConverter.algorithms.FahrenheitToCelsiusConverterAlgorithm;

public class FahrenheitToCelsiusConverterTest {
	private static final String CELSIUS_ZERO = "0.00";
	private static final String CELSIUS_ZERO_NO_DECIMALS = "0";
	private static final String CELSIUS_37_78 = "37.78";
	private static final String CELSIUS_37_778 = "37.778";
	private static final String FAHRENHEIT_32 = "32.00";
	private static final String FAHRENHEIT_100 = "100.00";
	private static final String FAHRENHEIT_100_000 = "100.000";
	private static final int TWO_DECIMALS = 2;
	private static final int THREE_DECIMALS = 3;
	private static final int NO_DECIMALS = 0;
	
	@Test
	public void shouldReturnZero(){
		unitConverter converter = new unitConverterImpl.UnitConverterBuilder()
																.algorithm(  new FahrenheitToCelsiusConverterAlgorithm() )
																.build();
		
		String convertedTemperature = converter.convert( FAHRENHEIT_32, TWO_DECIMALS );
		Assert.assertEquals( CELSIUS_ZERO, convertedTemperature );
	}

	@Test
	public void shouldReturnZero_WithoutDecimals(){
		unitConverter converter = new unitConverterImpl.UnitConverterBuilder()
																.algorithm(  new FahrenheitToCelsiusConverterAlgorithm() )
																.build();
		
		String convertedTemperature = converter.convert( FAHRENHEIT_32, NO_DECIMALS );
		Assert.assertEquals( CELSIUS_ZERO_NO_DECIMALS, convertedTemperature );
	}	
	
	@Test
	public void shouldReturn37_78(){
		unitConverter converter = new unitConverterImpl.UnitConverterBuilder()
																.algorithm(  new FahrenheitToCelsiusConverterAlgorithm() )
																.build();
		
		String convertedTemperature = converter.convert( FAHRENHEIT_100, TWO_DECIMALS );
		Assert.assertEquals( CELSIUS_37_78, convertedTemperature );
	}
	
	@Test
	public void shouldReturn37_778(){
		unitConverter converter = new unitConverterImpl.UnitConverterBuilder()
																.algorithm(  new FahrenheitToCelsiusConverterAlgorithm() )
																.build();
		
		String convertedTemperature = converter.convert( FAHRENHEIT_100_000, THREE_DECIMALS );
		Assert.assertEquals( CELSIUS_37_778, convertedTemperature );
	}	
}
