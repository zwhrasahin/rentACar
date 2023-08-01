package kodlama.io.rentACar.core.utulities.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModelMapperManager implements ModelMapperService {
    
	private ModelMapper Modelmapper;
	@Override
	public ModelMapper forResponse() {
		this.Modelmapper.getConfiguration()
		.setAmbiguityIgnored(true)
		.setMatchingStrategy(MatchingStrategies.LOOSE);
	
		return this.Modelmapper;
	}

	@Override
	public ModelMapper forRequest() {
		this.Modelmapper.getConfiguration()
		.setAmbiguityIgnored(true)
		.setMatchingStrategy(MatchingStrategies.STANDARD);
	
		return this.Modelmapper;
	}

}
