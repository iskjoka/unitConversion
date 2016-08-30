package se.iskjoka.unitConverter.test;

import org.junit.Test;

import org.junit.Assert;

import se.iskjoka.unitConverter.unitConverter;
import se.iskjoka.unitConverter.unitConverterImpl;
import se.iskjoka.unitConverter.algorithms.CelsiusToFahrenheitConverterAlgorithm;

public class CelsiusToFahrenheitConverterTest {
	private static final String CELSIUS_ZERO = "0.00";
	private static final String CELSIUS_ZERO_0000 = "0.0000";
	private static final String CELSIUS_37_78 = "37.78";
	private static final String CELSIUS_37_77778 = "37.77778";
	private static final String FAHRENHEIT_32 = "32.00";
	private static final String FAHRENHEIT_32_000 = "32.000";
	private static final String FAHRENHEIT_100 = "100.00";
	private static final String FAHRENHEIT_100_000 = "100.000";
	private static final int THREE_DECIMALS = 3;
	private static final int TWO_DECIMALS = 2;
	
	@Test
	public void shouldReturn_32(){
		unitConverter converter = new unitConverterImpl.UnitConverterBuilder()
																	.algorithm( new CelsiusToFahrenheitConverterAlgorithm() )
																	.build();
		String convertedTemperature = converter.convert( CELSIUS_ZERO, TWO_DECIMALS );
		Assert.assertEquals( FAHRENHEIT_32, convertedTemperature );
	}
	
	@Test
	public void shouldReturn_32_000(){
		unitConverter converter = new unitConverterImpl.UnitConverterBuilder()
																	.algorithm( new CelsiusToFahrenheitConverterAlgorithm() )
																	.build();
		String convertedTemperature = converter.convert( CELSIUS_ZERO_0000, THREE_DECIMALS );
		Assert.assertEquals( FAHRENHEIT_32_000, convertedTemperature );
	}	
	
	@Test
	public void shouldReturn_100(){
		unitConverter converter = new unitConverterImpl.UnitConverterBuilder()
																	.algorithm( new CelsiusToFahrenheitConverterAlgorithm() )
																	.build();
		String convertedTemperature = converter.convert( CELSIUS_37_78, TWO_DECIMALS );
		Assert.assertEquals( FAHRENHEIT_100, convertedTemperature );
	}
	
	@Test
	public void shouldReturn_100_000(){
		unitConverter converter = new unitConverterImpl.UnitConverterBuilder()
																	.algorithm( new CelsiusToFahrenheitConverterAlgorithm() )
																	.build();
		String convertedTemperature = converter.convert( CELSIUS_37_77778, THREE_DECIMALS );
		Assert.assertEquals( FAHRENHEIT_100_000, convertedTemperature );
	}		
}
