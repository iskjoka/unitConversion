package se.iskjoka.unitConverter;

public class unitConverterImpl implements unitConverter {
	private unitConverterAlgorithm algorithm;
	
	private unitConverterImpl(unitConverterAlgorithm algorithm) {
		this.algorithm = algorithm;
	}

	@Override
	public String convert( String temperature, Integer numberOfDecimals ) {
		return algorithm.convert(temperature, numberOfDecimals );
	}	
	
	public static class UnitConverterBuilder {
		private unitConverterAlgorithm algorithm;
		
		public UnitConverterBuilder algorithm( unitConverterAlgorithm algorithm ) {
			this.algorithm = algorithm;
			return this;
		}
		
		public unitConverter build(){
			return new unitConverterImpl( algorithm );	
		}
	}
}
