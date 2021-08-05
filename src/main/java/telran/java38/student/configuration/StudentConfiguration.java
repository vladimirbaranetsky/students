package telran.java38.student.configuration;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration.AccessLevel;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {
	@Bean
	public ModelMapper getModelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration()
		.setFieldAccessLevel(AccessLevel.PRIVATE)
		.setFieldMatchingEnabled(true)
		.setMatchingStrategy(MatchingStrategies.LOOSE);
		return modelMapper;
	}
}
